package exceptions;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {


        //cook rice
        System.out.println("rice cooked " + 10/2);
        System.out.println("clean rice pot");

        try {

            //chicken
            System.out.println(10/0);
        }
        catch (Exception e){
            //chicken burnt
            System.out.println("chicken burnt");
        }
        finally {
            System.out.println("finally do clean chicken pot");
        }

        //do dishes
        System.out.println("serve");


        Scanner s = new Scanner(System.in);

        try{

            int a = s.nextInt();

        }
        catch (Exception e){

        }
        finally {
            s.close();
        }



    }
}
