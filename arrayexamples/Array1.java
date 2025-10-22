package arrayexamples;

public class Array1 {

    public static void main(String[] args) {

        // student management
        int student1 = 90;
        int student2 = 40;
        int student3 = 45;


        //array initialization
        // 1st way
        int[]  students = {90,45,30,70,80,100};

        //2nd way
        //empty array initialization
        int[] nums = new int[8];

        //3rd way initialization
        int[] scores = new int[5];

        //access
        System.out.println(nums[2]);
        System.out.println( students[3] );

        //length
        System.out.println(scores.length);

        //update // assignment
        scores[2] = 92;
        scores[3] = 80;
        scores[2] = 0;

        System.out.println( scores[1] );
        System.out.println( scores[2]);

    }
}
