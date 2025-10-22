package exceptions;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = s.nextInt();
        }
        catch (Exception e){
            System.out.println("Exception occured");
        }
        finally{
            s.close();
        }


        //try with resource
        try( CustomScanner cs = new CustomScanner()){
            System.out.println("entered animal try block");
        }
        catch (Exception e){
            System.out.println("Exception");
        }

    }
}

class Animal implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("animal close");
    }
}

class CustomScanner implements Closeable {
    Scanner s;
    CustomScanner(){
        this.s = new Scanner(System.in);
    }

    String takeUserInput(){
        return  this.s.nextLine();
    }

    @Override
    public void close() throws IOException {
        this.s.close();
    }
}
