package multithreading1;

import advanced.T;

public class AnonyThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread running");
            }
        });

        t1.start();
    }
}

