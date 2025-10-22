package genericss;

public class Generics2 {
    public static void main(String[] args) {

        ABC<Double> c = new ABC<>(4.5);
       // ABC<String> a = new ABC<>("Ram");
        ABC<Integer> b = new ABC<>(4);

    }
}

class ABC<T extends Number> {
    T num;
    ABC(T num){
        this.num = num;
    }
}
