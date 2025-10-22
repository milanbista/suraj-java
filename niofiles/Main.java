package niofiles;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader(new File("./input.txt"));
        fr.read();

        FileInputStream fis = new FileInputStream("./input.txt");
        int n = fis.read();
        while(n !=-1) {
            System.out.print((char) n);
            n = fis.read();
        }

        System.out.println();
        RandomAccessFile rf = new RandomAccessFile("./input.txt", "rw");
        FileChannel channel = rf.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(1024);

        int byteRead = channel.read(bb);

        while (byteRead != -1){
            bb.flip();
            while (bb.hasRemaining()){
                System.out.println((char) bb.get());
            }
            bb.flip();
            byteRead = channel.read(bb);
        }

    }
}


// [1,2,4,5,6,2]
// average

// [2,4,5,5,1,2,3,4]
// unique array

//api fetch
//instaggram -- screen


//array ==== log time stamp, vulnerability
//javascript
// ui


// search == apple  list
