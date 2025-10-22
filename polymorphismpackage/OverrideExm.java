package polymorphismpackage;

public class OverrideExm {


    public static void main(String[] args) {

        Toyota t1 = new Toyota();
        t1.engine();
    }
}

//parent
class Car{

    void engine(){
        System.out.println("Engine on for car");
    }

}

//child
class Toyota extends  Car{

    //override
    @Override
    void engine(){
        super.engine();
        System.out.println("custom engine from toyota");
    }

}

class Draw{
    void draw(){


    }
}

class Circle extends  Draw {

    @Override
    void draw() {
       super.draw();
    }
}

