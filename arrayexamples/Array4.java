package arrayexamples;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array4 {

    public static void main(String[] args) {

        //chase bank
        int[] salaries = {25,10, 100};
        

        //find out highest salary
        //while

        int i = 0;
        int highest = 0;

        while( i < salaries.length ){
            if(salaries[i] > highest) {
                highest = salaries[i];
            }
            i++;
        }

        System.out.println(highest);

    }
}
