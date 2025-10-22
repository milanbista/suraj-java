package casting;

public class Casting1 {

    public static void main(String[] args) {
        //casting
        //convert from one type to another
        //two types of casting
        // widening ( automatic )
        // narrowing ( manual )

        //widening
        //convert from smaller to bigger
        // byte -> short -> int - long - float - double  == number
        int a = 5;
        double d = a; //automatic
        System.out.println(a);
        System.out.println(d);

        //narrowing
        double b = 5.8;
        int c = (int) b; // manual might cause data loss
        System.out.println(b);
        System.out.println(c);

        char c1 = 'a'; // 16
        int b1 = c1;   // 32

        char c2 = (char) b1;



    }
}
