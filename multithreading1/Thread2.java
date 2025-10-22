package multithreading1;

public class Thread2 {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(Counter.count);

    }
}
class MyThread extends Thread{
    public void run() {
        for(int i = 0 ; i<  1000 ; i++){
            Counter.increment();
        }

    }
}
class Counter{
    public static int count = 0;

    public static void increment(){
        count = count + 1;
    }
    public int getCount(){
        return count;
    }
}
