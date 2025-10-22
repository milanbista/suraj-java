package genericss;

import java.util.HashMap;
import java.util.Map;

public class Generics1 {

    public static void main(String[] args) {

        PrintSomething<Integer, Integer> intP = new PrintSomething<>(5, 5);
        intP.print();

        PrintSomething<String, String> sp = new PrintSomething<>("Ram", "Hari");
        sp.print();


        Map<Integer, Integer> map = new HashMap<>();
    }
}

class PrintSomething<K, V> {
    K something;
    V something2;
    PrintSomething(K something, V something2){
        this.something = something;
        this.something2 = something2;
    }
    void print(){
        System.out.println(this.something);
        System.out.println(this.something2);
    }
}

