package ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {

        //reader
        try {
            FileReader reader = new FileReader("suraj.txt");

            int c;
            while ( (c = reader.read()) != -1){
                System.out.print((char) c);
            }


            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
