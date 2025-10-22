package ios;

import java.io.*;
import java.util.List;

public class Exam2 {

    public static void main(String[] args) {

        //read one file and output to another file
        try {
            InputStream is = new FileInputStream("test2.txt");
            OutputStream os = new FileOutputStream("test3.txt");
            int data;
            byte[] br = {4,5,2};

            while ((data = is.read()) !=-1){
                os.write(data);
                os.write(br);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //buffered
        //bufferedfilereader bufferedfilewriter
        //bufferedinputstream bufferedoutputstream

    }
}
