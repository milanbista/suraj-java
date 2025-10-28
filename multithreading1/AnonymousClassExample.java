package multithreading1;

public class AnonymousClassExample {

    public static void main(String[] args) {

        Animal dog = new Animal(23);
        dog.makeSound();

        Animal tiger = new Animal(40){
            @Override
            void makeSound() {
                System.out.println("GRRRR....");
            }
        };

        tiger.makeSound();
        tiger.sleep(4);
        System.out.println(tiger.age);

        Computer c = new Computer() {
            @Override
            public void display() {
                System.out.println("windows display");
            }
        };

        c.display();
    }
}

class Animal{

    int age;

    Animal(int age){
        this.age = age;
    }
    void makeSound(){
        System.out.println("wohh wohhh");
    }

    void sleep(int time){
        System.out.println("sleeping");
    }
}

interface Computer{
    void display();
}




