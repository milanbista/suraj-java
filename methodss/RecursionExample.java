package methodss;

public class RecursionExample {

    public static void main(String[] args) {
        
        //factorial of 5 == 5 * 4 * 3 * 2 * 1
        System.out.println(factorial(5));

    }
    
    static int factorial(int num){
       if(num == 1) return 1;
       return num * factorial(num-1);
    }
    
}
