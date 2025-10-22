package controlstructures;

public class LoopExample {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++){

            int m = i == 5? i % 5 +1: i%5;

            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // i = 1,2,3,4,5,6,7,8,9,10
        // m = i  % 5 + 1
    }
}
