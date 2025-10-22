package abstractionpackage;

public class InterfaceExample {

    public static void main(String[] args) {

        String a = """
                hi
                i am good""" ;

        Object v =   new Honda();
//      v.start();
//      v.accessSeat();
//      v.ok();

      if(v instanceof Vehicle b){
          System.out.println(" true");
          b.ok();
      }
    }
}

//abstract class Vehicle{
//    abstract void start();
//    abstract void accelerate();
//    abstract void stop();
//}

//contract
interface Vehicle{
     void start();
     void accelerate();
     void stop();
     void accessSeat();

     default void ok(){
         System.out.println("Ok from vehicle");
     }

     
}

interface Engine{
    void cylinders();

}

class Seat{

    void fourSeats(){}
}

class Honda extends Seat implements Vehicle, Engine{


//    public void ok(){
//        System.out.println("Ok from honda");
//    }
    @Override
    public void start() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accessSeat() {
        super.fourSeats();
    }

    @Override
    public void cylinders() {

    }
}



