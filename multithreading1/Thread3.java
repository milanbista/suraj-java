package multithreading1;

import advanced.T;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread3 {

    public static void main(String[] args) throws InterruptedException {
        //multi threading
        // Thread, Runnable
        // start, run method, setPriority, join, setName, Thread.sleep()
        // locks,
        // anonymous classes
        // lambda expression/ functional interface
        // practise

        // race condition

        // java every  object has a lock
        // intrinsic lock ==
        // extrinsic lock == manual lock

        Counter1 counter = new Counter1();

        Thread t1 = new Thread(new CounterThread(counter));
        Thread t2 = new Thread(new CounterThread(counter));

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());

    }
}

class Counter1{

    //manual lock
    private final Lock lock = new ReentrantLock();

    int count = 0;

    //critical block
    //method level lock
    //block level lock
//     synchronized void increment(){
//
//         this.count++;
////         synchronized (this){
////             this.count++;
////         }
//
//        System.out.println("other work");
//    }

    void increment() {
        try{
            if(lock.tryLock(2, TimeUnit.MILLISECONDS)){
                try{
                    System.out.println(" Thread accessing lock " + Thread.currentThread().getName());
                    this.count++;
                }
                catch (Exception e){

                }
                finally {
                    lock.unlock();
                }
            }
            else{
                System.out.println("Unable to acquire lock " + Thread.currentThread().getName());
            }
        }
        catch (Exception e){

        }



    }


    int getCount(){
        return this.count;
    }
}

class CounterThread implements Runnable{
    Counter1 counter;
    CounterThread(Counter1 counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i< 10; i++){
            this.counter.increment();
        }
    }
}




