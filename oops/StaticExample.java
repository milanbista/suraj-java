package oops;

public class StaticExample {

    public static void main(String[] args) {

        System.out.println(MathFunction.number);

        MathFunction f1 = new MathFunction();
        MathFunction f2 = new MathFunction();

        System.out.println(f1.number);
        f1.number = 20;
        f1.num2 = 100;

        System.out.println(f2.number);
        System.out.println(f2.num2);

    }
}

class MathFunction{
    static  int number = 10;
    int num2 = 9;


}

 class AB{
     int h;

    AB(){
        this.h = 10;
    }
    
    AB(int c){
        this.h = 30;
    }
    
    
 }




