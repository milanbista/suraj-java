package collections;

public class FactorialExample {
    public static void main(String[] args) {
        int a = 5;
        //factorial
        System.out.println(fact(5));

    }

    static int fact(int n){
        if(n == 1) return  1;
        return n * fact(n-1);
    }
}




