package controlstructures;

public class LoopControlExamples {

    public static void main(String[] args) {



//        for (int i = 0; i<10; i++){
//
//            if(i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //print 1 to 10
        // skip if number is divisible by 3

        for (int i = 1; i<= 10; i++){
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 1 2 3
        //print 1 2

        int a = 4;
        int b = 1;

        while(a++ <= 4){
            System.out.println(b--);
            if(b == 2){
                System.out.println(a);
                break;
            }
        }
        //suraj 4 3 2
        //kiran 4 3 2
        //riya  4 3 2

        int num = 2;
        while(true){
            System.out.println(num++);
            if(num == 10){
                break;
            }
        }
    }
}
