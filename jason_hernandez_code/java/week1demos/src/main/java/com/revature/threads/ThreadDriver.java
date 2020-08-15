package com.revature.threads;


public class ThreadDriver {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("a")).start();
        new Thread(() -> System.out.println("b")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": c");
            }
        }).start();

        // you can create a custom object that implements Runnable, and pass an instance of it to
        // the Thread constructor and start it to create new thread.
        Worker worker = new Worker();
        new Thread(worker).start();

        // doesn't actually create a new thread; executes the run() logic on the current thread
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ": e")).run();


        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("g");
            }
        }).start();

        new Thread().start(); // Begins a thread, but it does nothing

        new MyThread().start(); // Custom Thread class with overridden run method

        System.out.println(Thread.currentThread().getName() + ": h");

        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("t1");
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.currentThread().join(); // tells this thread to wait for all other threads to complete
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("t2");
            for (int i = 0; i < 10; i++) {

                try {
                    Thread.sleep(1000L); // .sleep(long) puts the current thread into the TIMED_WAITING state
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
