package ios;

import java.io.*;

public class Example2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("test6.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("test7.txt"), 12);

        String r ;
        while ((r = br.readLine()) != null){
            bw.write(r);
            bw.newLine();
        }
        bw.flush();
    }
}
