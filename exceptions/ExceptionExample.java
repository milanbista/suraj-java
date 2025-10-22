package exceptions;

public class ExceptionExample {
    public static void main(String[] args) {

        // line
        // line
        // line



        try{

           // int b = 10/0;


            int[] arr = new int[2];
           // arr = null;

           // arr[0] = 1;

            arr[10] = 10;



        }
        catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
        }
        catch (ArithmeticException e){
                e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
            //send email // logger
            // error payload:  //kafka qeueue.
            // error message

        }


        System.out.println("end of program");

    }
}


