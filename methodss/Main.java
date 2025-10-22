package methodss;

public class Main {

    public static void main(String[] args) {
        int a = 5, b= 10;

        sumAndPrint(a,b);

        int sum = sum(a+5, b);
        System.out.println(sum);

        String name = "ram";
    }

    static void sumAndPrint(int a, int b){
        System.out.println("sum is " + (a +b));
    }

    static int sum(int ram, int hari){
     return ram + hari;
    }


}
