package abstractionpackage;

public class ABS2 {

    public static void main(String[] args) {

        DEF d = new DEF();
        d.hello();


    }
}

abstract class ABC{

    void hello(){
        System.out.println("Hello from ABC");
    }
}

class DEF extends ABC{

}


interface ABCD{

    private void hello(){
        System.out.println("hi");
    }
}
