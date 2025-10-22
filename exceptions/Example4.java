package exceptions;

public class Example4 {

    public static void main(String[] args) {

        //throw
        //throws

        //logically unsatisfied -- manually throw exception
        //throw

        try{
            checkBar(10);
        }
       catch (Exception e){
            e.printStackTrace();
       }
        System.out.println("end of main");

    }

    static void checkBar(int age) throws SurajException{
        //voting allow -- print
        if(age >= 18) {
            System.out.println("Allowed");
        }
        //voting not allow - throw exception
        else{
           throw new SurajException("age must be 18 at least");
        }

    }
}

class SurajException extends Exception{

    public SurajException(String message){
        super(message);
    }
}
