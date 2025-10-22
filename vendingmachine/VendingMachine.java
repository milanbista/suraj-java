package vendingmachine;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public static void main(String[] args) {

        //malik
        VendingMachineImpl vendingMachine1 = new VendingMachineImpl();
        vendingMachine1.productAdd(new Product("coke", 1,1.0));
        //product add, subtract
        //purchase
        //clean

        Animal animal = new Animal();
        animal.sleep(3);

    }


}

class Animal{

    void sleep(int time){
        System.out.println("sleep for " + time + "hours");
    }
}


class VendingMachineImpl{

    List<Product> products = new ArrayList<>();

    void productAdd(Product product){

    }

    void productAdd(List<Product> products){

    }


}

class Product{
    String productname;
    int inventorycount;
    double productprice;

    public Product(String productname, int inventorycount, double productprice) {
        this.productname = productname;
        this.inventorycount = inventorycount;
        this.productprice = productprice;
    }
}

