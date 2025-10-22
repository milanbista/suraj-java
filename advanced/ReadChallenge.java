package advanced;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class ReadChallenge {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        String fileName = "./measurements.txt";
//        buffereReaderTest("./measurements.txt");
//        parellelStreamTest(fileName);
//        memoryMappedTest(fileName);
//    memoryMappedUltraFast(fileName);
        countLines(fileName);
        long end = System.currentTimeMillis();
        System.out.println(" total time: " + (end-start) + "ms");
    }

    public static void buffereReaderTest(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = 0;
        while (br.readLine() != null){
            count++;
        }

        System.out.println("count is " + count);
    }

    public static void parellelStreamTest(String fileName) throws IOException {

        Stream<String> lines  = Files.lines(Paths.get(fileName));

        long count = lines.parallel().count();
        System.out.println("count is " + count);

    }

    public static void memoryMappedTest(String fileName) throws IOException, ExecutionException, InterruptedException {
        RandomAccessFile rf = new RandomAccessFile(fileName, "r");
        FileChannel fc = rf.getChannel();
        long fileSize = fc.size();
        long maxChunkSize = Integer.MAX_VALUE;

        // Split into large chunks
        List<long[]> chunks = new ArrayList<>();
        long position = 0;
        while (position < fileSize) {
            long size = Math.min(maxChunkSize, fileSize - position);
            chunks.add(new long[]{position, size});
            position += size;
        }

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> futures = new ArrayList<>();

        for (long[] chunk : chunks) {
            futures.add(executor.submit(() -> {
                long count = 0;
                MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, chunk[0], chunk[1]);
                int limit = buffer.limit();
                int i = 0;

                // Loop unrolling: 8 bytes per iteration
                for (; i <= limit - 8; i += 8) {
                    count += (buffer.get(i) == '\n' ? 1 : 0)
                            + (buffer.get(i+1) == '\n' ? 1 : 0)
                            + (buffer.get(i+2) == '\n' ? 1 : 0)
                            + (buffer.get(i+3) == '\n' ? 1 : 0)
                            + (buffer.get(i+4) == '\n' ? 1 : 0)
                            + (buffer.get(i+5) == '\n' ? 1 : 0)
                            + (buffer.get(i+6) == '\n' ? 1 : 0)
                            + (buffer.get(i+7) == '\n' ? 1 : 0);
                }

                for (; i < limit; i++) {
                    if (buffer.get(i) == '\n') count++;
                }

                return count;
            }));
        }

        long total = 0;
        for (Future<Long> f : futures) total += f.get();

        executor.shutdown();
        fc.close();
        rf.close();

        // Add last line if file doesn't end with '\n'
        if (fileSize > 0) {
            RandomAccessFile check = new RandomAccessFile(fileName, "r");
            check.seek(fileSize - 1);
            if (check.readByte() != '\n') total++;
            check.close();
        }

        System.out.println("Total lines: " + total);
    }

    public static void memoryMappedUltraFast(String fileName) throws IOException, ExecutionException, InterruptedException {
        RandomAccessFile rf = new RandomAccessFile(fileName, "r");
        FileChannel fc = rf.getChannel();
        long fileSize = fc.size();
        long maxChunkSize = Integer.MAX_VALUE;

        List<long[]> chunks = new ArrayList<>();
        long position = 0;
        while (position < fileSize) {
            long size = Math.min(maxChunkSize, fileSize - position);
            chunks.add(new long[]{position, size});
            position += size;
        }

        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<Long>> futures = new ArrayList<>();

        for (long[] chunk : chunks) {
            futures.add(executor.submit(() -> {
                long count = 0;
                MappedByteBuffer buffer = fc.map(FileChannel.MapMode.READ_ONLY, chunk[0], chunk[1]);
                int limit = buffer.limit();
                int i = 0;

                // Aggressive loop unrolling: 16 bytes per iteration
                for (; i <= limit - 16; i += 16) {
                    for (int j = 0; j < 16; j++) {
                        if (buffer.get(i + j) == '\n') count++;
                    }
                }

                // Remaining bytes
                for (; i < limit; i++) {
                    if (buffer.get(i) == '\n') count++;
                }

                return count;
            }));
        }

        long total = 0;
        for (Future<Long> f : futures) total += f.get();

        executor.shutdown();
        fc.close();
        rf.close();

        // Handle last line if it doesn't end with '\n'
        if (fileSize > 0) {
            RandomAccessFile check = new RandomAccessFile(fileName, "r");
            check.seek(fileSize - 1);
            if (check.readByte() != '\n') total++;
            check.close();
        }

        System.out.println("Total lines: " + total);
    }


    public static void countLines(String fileName) throws IOException, ExecutionException, InterruptedException {
        RandomAccessFile rf = new RandomAccessFile(fileName, "r");
        FileChannel fc = rf.getChannel();
        long fileSize = fc.size();
        long maxChunk = Integer.MAX_VALUE;

        // Split into large chunks
        List<long[]> chunks = new ArrayList<>();
        long pos = 0;
        while (pos < fileSize) {
            long size = Math.min(maxChunk, fileSize - pos);
            chunks.add(new long[]{pos, size});
            pos += size;
        }

        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(cores);
        List<Future<Long>> futures = new ArrayList<>();

        for (long[] chunk : chunks) {
            futures.add(pool.submit(() -> {
                long count = 0;
                MappedByteBuffer buf = fc.map(FileChannel.MapMode.READ_ONLY, chunk[0], chunk[1]);
                int limit = buf.limit();
                int i = 0;

                // Unrolled scanning 16 bytes at a time
                for (; i <= limit - 16; i += 16) {
                    for (int j = 0; j < 16; j++)
                        if (buf.get(i + j) == '\n') count++;
                }
                for (; i < limit; i++)
                    if (buf.get(i) == '\n') count++;

                return count;
            }));
        }

        long total = 0;
        for (Future<Long> f : futures) total += f.get();

        pool.shutdown();
        fc.close();
        rf.close();

        // Last line check
        if (fileSize > 0) {
            RandomAccessFile check = new RandomAccessFile(fileName, "r");
            check.seek(fileSize - 1);
            if (check.readByte() != '\n') total++;
            check.close();
        }

        System.out.println(total);
    }
}
