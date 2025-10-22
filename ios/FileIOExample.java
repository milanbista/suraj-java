package ios;

import java.io.File;

public class FileIOExample {
    public static void main(String[] args) {

        //file descriptor
        File file = new File("test12.txt");

       try{
           file.createNewFile();
       }
       catch (Exception e){
           System.out.println("e occured");
       }

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());

        file.delete();

    }
}
