package ios;

import java.io.*;

public class BufferedIOExample {

    public static void main(String[] args) throws IOException {

        //character reader and writer
        //buffer memory
        //buffered  cllases
        //BufferedReader BufferedWriter
        //BufferedInputStream BufferedOutputStream

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String s = br.readLine();
        while ( s != null){
            System.out.println(s);
            s = br.readLine();
        }


        BufferedWriter bw = new BufferedWriter(new FileWriter("test4.txt"));
        bw.write("Hello from buffered writer");
        bw.flush();


        //Input Stream and Output Stream
        //Raw Byte -- binary

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test4.txt"));
        System.out.println(bis.read());

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("test6.txt"));
        bos.write(45);
        bos.flush();


    }
}
