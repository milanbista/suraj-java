package controlstructures;

public class IfElseExamples {

    public static void main(String[] args) {

        //if else
        int age = 10;

        boolean isGreater = age >= 18;

        if(age >= 18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you can not vote");
        }


        // if else if -- else if else if -- else

        int time =  23; //24

        if(time >= 12 && time < 16){
            System.out.println("afternoon");
        }
        else if(time < 12){
            System.out.println("morning");
        }

        else {
            System.out.println("night");
        }


        //nested if else

        String food1 = "rice";
        String food2 = "masu";
//        String food3 = "saag";

        if(food1 == "rice"){

            //nested
            if(food2 == "masu"){
                System.out.println("thapi thapi khanxu");
            }
            else {
                System.out.println("pugyo");
            }
        }

        else{
            System.out.println("not hungry");
        }

        // new if
        int a = 3;
        if(a >3)
            System.out.println("hello");
        else
            System.out.println("hi");


    }
}
