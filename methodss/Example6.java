package methodss;

public class Example6 {

    public static void main(String[] args) {

        int[] nums = {4,5,6,1};

        printArray(nums);
    }

    static void printArray(int[] arr){
        for (int n: arr){
            System.out.println(n);
        }
    }
}
