package methodss;

public class Example5 {

    public static void main(String[] args) {

        //pass by value or pass by reference
        int num = 5;

        //string is immutable
        String name = "Ram";
        String name2 = new String("Hari");
        StringBuilder sb = new StringBuilder("Richard");
        sb.append(" Hi");
        System.out.println(sb);

        helper(num, sb);

        System.out.println(num);
        System.out.println(sb);

    }

    static void helper(int num, StringBuilder name){
        num = num + 10;
        name.append(" Suraj");
    }


}
