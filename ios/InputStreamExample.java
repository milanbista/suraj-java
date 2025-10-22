package ios;

import java.io.*;

public class InputStreamExample {

    public static void main(String[] args) {
        //input stream
        //output stream

        //file read and write

        try {
            FileInputStream fs = new FileInputStream("suraj.txt");
            System.out.println((char)fs.read());

            OutputStream os = new FileOutputStream("test2.txt");
            os.write(104);
            os.write("Hello how are you".getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
