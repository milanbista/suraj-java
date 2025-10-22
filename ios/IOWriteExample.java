package ios;

import java.io.File;
import java.io.FileWriter;

public class IOWriteExample {

    public static void main(String[] args) {

        //write to a file
        File file = new File("suraj.txt");

        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write("hello this is suraj learning io again");
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
