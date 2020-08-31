package com.revature.threads;

public class ThreadDriver {
    public static void main(String[] args) {
        new Thread(() ->System.out.println(Thread.currentThread().getName()+ "a")).start();
        new Thread(() ->System.out.println(Thread.currentThread().getName()+ "b")).start();

        //passing a local annonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ "c");
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName()+ "d"));

        Worker worker = new Worker();
        new Thread(worker).start();

        //doesnt actually create a new thread executes the run method on the current thread
        new Thread(worker).run();

        /**
         * Thread.run() vs. Thread.start
         *      - new Thread(): makes a new thread object, whose state is initially new
         *          -
         *      - Thread.run() - defines the logic within a thread will run when started, but does not start a new thread process
         *          - simply runs the run() method logic on the current thread
         *      - Thread.start() - actually starts a new hardware level thread process and executes the logic within the
         *          - run() on the newly created thread.
         */

        new Thread().start(); // no work being done here, no thread object provided
        new MyThread().start();
        System.out.println(Thread.currentThread().getName()+ "g");

        //Syncronized resource = only one thread at a time can access the resource

        /**
         * Deadlock -
         *      - a concurrency phenomenon where tow threads have locks on separate resouces and each thread requires
         *      the locked resources held by the other thread to release its lock
         */
        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("t1");
            for (int i =0; i < 10; i++){
                try {
                    Thread.currentThread().join(); //tells this thread to wait for all other threads to complete
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("t2");
            for (int i =0; i < 10; i++){

                try {
                    Thread.sleep(1000l); // puts thread in sleep for a set amount of time
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });

        t1.setPriority(1);
        t2.setPriority(10); //really just a suggesting

        t1.start();
        t2.start();

        try{
            t1.join();
        }catch (InterruptedException E){
            E.printStackTrace();
        }
        System.out.println("more main method logic");
        System.out.println("more main method logic");
        System.out.println("more main method logic");
        System.out.println("main done");
    }
}
