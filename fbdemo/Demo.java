package fbdemo;

public class Demo {

    static A a = new A();
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.num);
        a1.num = 30;
        System.out.println(a1.num);
        A a2 = new A();
        a2.b = 200;

        System.out.println(a2.num);

        System.out.println(a.b);


    }

}



class A{
   static int num = 10;
   int b = 10;
}
