package multithreading1;

import advanced.T;

public class LamThread {

    public static void main(String[] args) throws InterruptedException {

        Counter3 counter = new Counter3();

       Runnable r = () -> {
           for (int i = 0; i< 1000; i++){
               counter.increment();
           }
       };

       Thread t1 = new Thread(r);
       Thread t2 = new Thread(r);
       t1.start();
       t2.start();
       t1.join();
       t2.join();
        System.out.println(counter.count);
    }
}

class Counter3 {
    int count;

    void increment(){
        this.count++;
    }
}
