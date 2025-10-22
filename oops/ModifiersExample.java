package oops;

public class ModifiersExample {

    public static void main(String[] args) {

        Fruit f = new Fruit("Mango", 20);
        f.price = 10;

        //access modifier
        //public == anyone can access
        //protected == child, same package,
        //private == within same class only
        //default == package, class, inherit child
    }
}

class Fruit{
    public String fruitName;
    public int price;

    public Fruit(String fruitName, int price){
        this.fruitName = fruitName;
        this.price = price;
    }
}
