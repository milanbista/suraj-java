package controlstructures;

public class ArrayLoopsExamples {

    public static void main(String[] args) {

        //grades
        int[] grades = {2,3,4,5,6,7,8,9,1};
        int mahesh = grades[2];

        System.out.println(mahesh);
        System.out.println(grades.length);
        System.out.println(grades[0]);
        System.out.println(grades[1]);

//        for (int i = 0; i < grades.length; i++){
//
//            System.out.println(grades[i]);
//        }

        int sum = 0;

        for (int i = 0; i < grades.length; i++){
           //int n =  grades[i];
           sum = sum + grades[i];
        }
        System.out.println("sum of array is " + sum);



    }
}
