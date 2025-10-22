package controlstructures;

public class ArrayExamples {

    public static void main(String[] args) {

        //variables
        int student1 = 80;
        int student2 = 40;
        int student3 = 90;


        //array
        //variable container that hold one value
        //array container that hold many values
        // value must be of same type
        //array is of fixed size

        //syntax
        int[] scores = new int[6];

        // array assignment
        scores[2] = 5;
        scores[1] = 10;
        scores[0] = 19;

        //array read
        int num =  scores[1];
        System.out.println(num);

        System.out.println( scores[1] );


        String[] names = new String[6];

        System.out.println(names[0]);

        names[5] = "Mahesh";
        names[4] = "Suraj";

        System.out.println(names[4]);
        System.out.println("names length: " + names.length);


        // 3 2 4 1 2
        int[] grades = {3,2,4,1,2, 0, 0};
        grades[grades.length-1] = 50;
        grades[7-1] = 50;


        System.out.println(grades[6]);

        //human
        //properties
        // name height age, hair color, photography skills
        //length
        System.out.println("length is : " + grades.length);

        grades[grades.length - 1] = 20;


        boolean isRaining = true;
        boolean[] stocks = new boolean[4];
        stocks[0] = false;
        System.out.println(stocks.length);
        stocks[stocks.length - 1] = true;
        System.out.println(stocks[stocks.length - 1]);






    }
}
