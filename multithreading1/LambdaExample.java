package multithreading1;

public class LambdaExample {
    public static void main(String[] args) {

        //lambda expression
        Human suraj = (int s, String f) -> s*2;
        suraj.cookFood(6, "momo");

    }
}


//functional interface
interface Human{
    //only one abstract method
    int cookFood(int time, String food);
}


