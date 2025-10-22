package controlstructures;

public class LoopExamples2 {

    public static void main(String[] args) {


        //loop
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(1);
//        System.out.println(10);

        int[] nums = {2,6,1,23};

        for( int x = 0; x < nums.length;  x++ ){
            //code
            System.out.println( nums[x] );
        }


        //print numbers from 1 -100
        // divisible by 5;
        // 5 10 15.....100

        // step 1:  1 - 100 loop
        // step 2 // i divisible by 5 check
        // step 3: print

        for(int i = 1; i <= 100; i++ ){
            //code
            if ( i % 5 == 0){
                System.out.println(i);
            }
        }


        for (int i = 5; i<=100; i+=5){

            System.out.println(i);
        }



        //american airlines
        //ticket book
        //plane 4

        boolean[] bookArray = {false, false, true, true};

        int seatNum = 3;

        if( bookArray[seatNum -1] ){
            System.out.println("seat is already booked book another seat");
        }
        else{
            System.out.println("seat booked");
            bookArray[seatNum-1] = true;
        }

        //instagram
        // stories
        //
        String[] stories = {};


        for( int i = 0; i< stories.length ; i++){
            //display screen
            // circle
        }







    }
}
