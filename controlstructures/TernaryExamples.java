package controlstructures;

public class TernaryExamples {

    public static void main(String[] args) {

        int price= 0;
        //apple 10 orange 5
        String fruit = "apple";

//        if(fruit == "apple"){
//            price = 10;
//        }
//        else{
//            price = 5;
//        }

        price =  (fruit == "apple") ? 10 : 5;
        System.out.println("price is " + price);

        int num = 53;
        boolean isOdd;
        isOdd = num % 2 == 0 ? false : true;
        System.out.println(isOdd);
    }
}
