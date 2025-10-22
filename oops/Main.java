package oops;

public class Main {

    public static void main(String[] args) {

        Vehicle v2= new Vehicle("Toyota", 1995);

        Vehicle a =  v2.magicMethod();
        a.name = "Ram";
        v2.name = "Shyam";

        System.out.println(a.name);
        System.out.println(v2.name);


    }
}

class Vehicle{

    //this == objects properties and methods access

    //properties
    String name;
    int year;

    //constructor
    //default non parameter

    public Vehicle(){

    }
    //parameter
    public Vehicle(String name, int year){
        this.name = name;
        this.year = year;
    }


    //methods
    void drive(){

        System.out.println("vehicle driving");
        this.playMusic();
    }

    void  playMusic(){
        System.out.println("Playing music" + this.year);

    }

    Vehicle magicMethod(){
        return this;
    }




}
