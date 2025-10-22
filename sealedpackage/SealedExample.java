package sealedpackage;

public class SealedExample {

    public static void main(String[] args) {

    }
}

sealed class Bank permits BOA{

}

non-sealed class BOA extends Bank{

}
class ABE extends BOA{

}
