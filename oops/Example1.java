package oops;

public class Example1 {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);

    }
}

class A {
    protected int a;

    public void setA(int a){

    }
}

class B extends  A{

}
