package stringexamples;

public class String3 {

    public static void main(String[] args) {

        String name = "Hari Gopal";

        //to char array
        //for loop
        for (char a: name.toCharArray()){
            System.out.println(a);
        }

        char[] arr = name.toCharArray();
        for(char c: arr){
            System.out.println(c);
        }

     

    }
}
