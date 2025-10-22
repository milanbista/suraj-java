package controlstructures;

public class IfExamples2 {

    public static void main(String[] args) {
        //control structures
        //if else
        // task 1 
        // task 2
        // task 3
        
        //if else 
        // asking yes or no question

        //declaration
        String a = "rainings";

        if( a == "raining"){
            System.out.println("bring umbrella");
            //
        }
        else{
            System.out.println("dont bring umbrella");
        }



        int age1 = 18;
        if (age1 >= 18){
            System.out.println("allowed to vote");
        }
        else {
            System.out.println("Not allowed");
        }

        // if else
        //if else if ... else

        int age = 25;


        //child 1-19
        //adult 20 - 45
        //old 45 - 100
        if(age <= 19){
            //child
            System.out.println("child");
        }
        else if( age >= 20 && age<=45 ){
            // adult
            System.out.println("adult");
        }
        
        else if( age > 46 && age <50){
            System.out.println("dad age");
        }

        else{
            //old
            System.out.println("old");
        }



    }
}
