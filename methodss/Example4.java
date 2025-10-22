package methodss;

public class Example4 {

    public static void main(String[] args) {

        //sum of numbers
        sum(1,2,4,3);

    }

    //variable arguments
    static int sum(int... nums){

        for (int s: nums){
            System.out.println(s);
        }

        return 0;
    }


}
