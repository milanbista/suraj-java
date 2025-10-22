package stringexamples;

public class String4 {
    public static void main(String[] args) {
        String a = "Ram";
        StringBuilder b = new StringBuilder("Ram");
        stringHelper(a, b);

        System.out.println(a + b);

    }

    static void stringHelper(String a, StringBuilder b){
        a = "Hari";
        b.setLength(0);
        b.append("Hari");

        System.out.println(sum(1,2,3,4));


    }

    int hello(){
        return 0;
    }

    static int sum(int... sums){
        int sum = 0;
        for(int s: sums){
            sum +=s;
        }

        return sum;
    }



}
