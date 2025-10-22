package arrayexamples;

public class Array2 {

    public static void main(String[] args) {

        // apple banana, orange

        //initialize
        String[] fruits = new String[3];

        //assignment
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        //print/access last element of fruits

       String fruit =  fruits[ fruits.length -1];
        System.out.println(fruit);



    }
}
