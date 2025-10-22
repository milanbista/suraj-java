package advanced;

import java.util.Scanner;

public class ThreadP {

    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner("10 hi 12 ok fine so \n 14 cool");

        System.out.println(s.nextInt());
        System.out.println(s.nextLine());
        System.out.println(s.next());
        Counter c = new Counter();

        Runnable r = ()->{
            for (int i = 0; i< 10000; i++){
                c.increment();
            }
        };

        Thread t = new Thread(r);
        Thread t1 = new Thread(r);

        t.start();
        t1.start();
        t.join();
        t1.join();

        System.out.println(c.count);


    }
}

class Counter{

    int count = 0;

    synchronized void increment(){
        this.count = this.count +1;
    }
}
