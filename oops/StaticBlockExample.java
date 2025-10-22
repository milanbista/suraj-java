package oops;

public class StaticBlockExample {

    public static void main(String[] args) {

        Glass g = new Glass();
    }
}


class Raw{
    public Raw(){
        System.out.println("raw constructor called");
    }
    static int totalthickness;


    static {
        //database connection
        //configuration
        totalthickness = 10;
        System.out.println("Static block in raw class");
    }





    public Raw(int a){}


}

class Glass extends Raw{

    public Glass(){

        System.out.println("Default Glass constructor called");
    }

}
