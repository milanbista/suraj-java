package controlstructures;

public class LoopsExamples {


    public static void main(String[] args) {

//        System.out.println(5*1);
//        System.out.println(5*2);
//        System.out.println(5*3);

        int a = 5, b = 10;

        //for loop
        for(int i=6; i<7 ; i++){
            System.out.println(5 * i);
        }

        System.out.println("end");

        for(int i = 0, j = 0; (j<10 && i<10); i++,j++){
            System.out.println(i + " " + j);
        }


        //while loop
        int i = 1;

        while (i<=10){
            System.out.println(2 * ++i);
        }



    }
}
