package multithreading1;

import advanced.T;

public class ThreadE {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from " + Thread.currentThread().getName());

        //T1 == Thread
        LaundryMan T1 = new LaundryMan();
        T1.setName("SurajThread");
        T1.setPriority(Thread.MAX_PRIORITY);
        T1.start(); // starts a new thread

        Thread T2 = new Thread(new RoomCleaner());
        T2.start();

        T1.join();
        T2.join();

        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");
        System.out.println("Hello again");


        //t3 t4

    }
}

class LaundryMan extends Thread{

    public void run(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" I am a Laundry man " + Thread.currentThread().getName());
        System.out.println(" T1 priority " + Thread.currentThread().getPriority());
    }
}

class RoomCleaner implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(" I am doing room cleaning " + Thread.currentThread().getName());
    }
}
