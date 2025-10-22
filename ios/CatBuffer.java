package ios;

import java.io.*;

public class CatBuffer {

    public static void main(String[] args) throws IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("cat.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cat2.jpg"), 12);

        int r = bis.read();
        while ( r != -1){
            bos.write(r);
            r = bis.read();
        }
        bos.flush();
    }
}
