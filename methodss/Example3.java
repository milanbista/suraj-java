package methodss;

public class Example3 {

    public static void main(String[] args) {
        //method overloading
        int s = sum(4,6);
        System.out.println(s);

        sum(1.2, 3.4);

    }

    static int sum(int a, int b){
        return a +b;
    }

    static double sum( double a, double b){
        return a + b;
    }
}
