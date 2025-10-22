package casting;


class Animal{
    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog extends  Animal{

    void bark(){
        System.out.println("Barking");
    }
}


public class Casting2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog; // upcasting
        animal.sleep();

        Animal animal1 = new Animal();
        Dog dog1 = (Dog) animal; //downcasting manual
        dog1.bark();

    }
}



