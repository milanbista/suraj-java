package polymorphismpackage;

public class Poly1 {

    public static void main(String[] args) {

        //morphs == different forms
        //polymorphism == multiple forms
        // entity - method, object multiple forms

        //two types
        //compile time -- method overloading
        // run time -- method overriding

        MathUtil mu = new MathUtil();
        double result = mu.sum(2.0,4.0);

    }
}

class MathUtil{

    //overload
    int sum(int a, int b){
        return a +  b;
    }

    double sum( double a, double b){
        return a + b;
    }

    double sum(int a, int b, int c){
        return a + b + c;
    }
}



