package controlstructures;

public class Operators {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);

        //assignment operators
        int num = 10;
        num += 10;
        num = num + 10;
        num -= num -3;

        num = 10;
        num %= 3;
        System.out.println(num);


        int age1 = 4;
        int age2 = 5;
        System.out.println(age1 >= age2);


        System.out.println( !(age2 == 5));

        int grade = 90;
        System.out.println(grade--);
        System.out.println(grade);
        System.out.println(--grade);

        a = 4;
        b = 2;
        int c = 3;
        System.out.println(a* (b+c));

        System.out.println(a/(b*c));

        //bitwise operators
        //&
        System.out.println(2&4);

        //OR
        System.out.println(4|3);

        //XOR
        System.out.println(4^7);

        System.out.println(~3);

        System.out.println(5 << 2);
        System.out.println(5 >> 2);


        int i = 3, j=4;
        int result = i++ * --j + (i +=2);
        System.out.println(result);

    }
}
