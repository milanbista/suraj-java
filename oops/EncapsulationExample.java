package oops;

public class EncapsulationExample {

    public static void main(String[] args) {

        Bank b1 = new Bank();


        b1.setName("Suraj");
        b1.setBalance(1000000000);

        System.out.println(b1.getBalance());


        //encapsulation
        //restrict direct access
        //only have controlled access
        //security
        //making properties and methods private
        //only expose necessary fields // methods through getters and setters


    }
}

class Bank{
    private String name;
    private double balance;

    public Bank(){
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){

        //verify balance is accurate
        //document is submitted
        //login

        this.balance = balance;
    }
}
