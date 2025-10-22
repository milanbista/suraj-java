package ios;

import java.io.*;

public class CatExample {

    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("cat.jpg");
            OutputStream os = new FileOutputStream("suraj.jpg");

            int r;
            while( (r = is.read()) != -1){
                os.write(r);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
