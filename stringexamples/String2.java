package stringexamples;

public class String2 {

    public static void main(String[] args) {

        String name = "Rihard, aashish";

        //methods
        //length
        int a = name.length();
        System.out.println(a);

        //equal
        name.equals("Richard");

        String capName = name.toUpperCase();
        String lowName = name.toLowerCase();
        System.out.println(capName);
        System.out.println(lowName);

        //contains
        boolean con = name.contains("Ri");
        System.out.println(con);


        // character at index
        //get a character at given index
        char c = name.charAt(1);
        System.out.println(c);

        //substring, replace, split, ignorecases

        System.out.println( name.substring(1,3) );

        String result =  name.replace('a', 'o');
        System.out.println(result);


        //string is immutable
        System.out.println(name);

        int[] nums = {2,4,5};
        System.out.println(nums);

        String[] arr =  name.split(",");
        System.out.println(arr);
        for (String r: arr){
            System.out.println(r);
        }



        String s1 = "ram";
        String s2 = "Ram";

        System.out.println(s1.equals(s2));
        System.out.println( s1.equalsIgnoreCase(s2));

        System.out.println(s1.indexOf('K'));

        char[] chars =  s1.toCharArray();
        System.out.println(chars.length);
        for (int i = 0; i<chars.length; i++){
            System.out.println("each character " + chars[i]);
        }


    }
}
