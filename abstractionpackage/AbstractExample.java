package abstractionpackage;

public class AbstractExample {
    public static void main(String[] args) {


     Tv s = new Samsung();
     s.play();
     s.userMenu();

     Samsung s2  = new Samsung();
     s2.ultraHd();



    }
}


//abstraction
//music player
//car start key in -- engine start
//implementation hide

abstract class Tv{

    //unimplemented
    abstract void power();
    abstract void forward();
    abstract void play();
    abstract void backward();
    abstract void sum(int a, int b);

    //implemented
    void userMenu(){
        System.out.println("user menu");
    }
}

class Samsung extends Tv{

    @Override
    void power() {
        System.out.println("power is on");
    }

    @Override
    void forward() {

    }

    @Override
    void play() {
        System.out.println("playing tv");
    }

    @Override
    void backward() {

    }

    @Override
    void sum(int a, int b) {

    }

    void ultraHd(){
        System.out.println("Ultra hd mode");
    }
}
