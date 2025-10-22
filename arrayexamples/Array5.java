package arrayexamples;

public class Array5 {

    public static void main(String[] args) {

        //break and continue
        //break == break the loop;
        //continue == continue to next iteration


        //print first number from 8 to 100 which is
        //divisible by 11

        int count = 0;
        for (int i = 8; i<=100; i++){
            if( i % 11 == 0 ){
                System.out.println(i);
                break;
            }
        }




    }
}
