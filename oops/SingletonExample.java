package oops;

public class SingletonExample {

    public static void main(String[] args) {

       Animal a1 = Animal.getInstance();
        System.out.println(a1.getAnimalName());
        a1.setAge(40);

       Animal a2 = Animal.getInstance();
        System.out.println(a1.getAnimalName());
        System.out.println(a2.getAge());

    }
}

class Animal{
    private String animalName;
    private int age;

    public static Animal instance;

    private  Animal(){}

    private Animal(String animalName, int age){
        this.animalName = animalName;
        this.age = age;
    }

    public static Animal getInstance(){
        //check if object exist
        if(instance == null ){
           instance =  new Animal("dog", 2);
        }
       return instance;
        //if exist return that object
        //if not object -> create new object and return
    }

    public String getAnimalName(){
        return this.animalName;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
