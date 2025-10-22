package controlstructures;

public class SwitchExamples {

    public static void main(String[] args) {
        int day = 1;

        switch (day){
            default:
                System.out.println("No Day");

            case 1:
                System.out.println("Sunday");
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
        }
    }
}
