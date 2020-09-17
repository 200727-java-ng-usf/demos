package com.revature.threads;

import com.revature.streams.Geode;

public class ThreadDriver {

    /*
        Thread States:
            - NEW
            - RUNNABLE
                + READY
                + RUNNING
            - WAITING (wait for an indefinite amount of time)
            - TIMED_WAITING (wait for a specific amount of time)
            - BLOCKED (current thread cannot execute because it requires a resource locked by another thread)
            - TERMINATED
     */
    public static void main(String[] args) {

        // Passing lambda expressions that implement Runnable.run() to the Thread constructor
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ": a")).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ": b")).start();

        // passing a local anonymous class implementation of Runnable to the Thread constructor
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

        /*
            new Thread() vs Thread.run() vs Thread.start()

                - new Thread(): makes a Thread object, whose state initially is New;
                                does not start the thread, nor does it execute the run()
                                logic of the thread.

                - Thread.run(): defines the logic which a thread will run when started;
                                but does not actually start a new thread process on the
                                hardware level - simply executes the run() method logic
                                on the current thread.

                - Thread.start(): actually starts a new hardware-level thread process and
                                  executes the logic within the run() on the newly created
                                  thread.
         */

        new Thread().start(); // no work is done here, because no Runnable object was provided


        new MyThread().start(); // custom Thread class with an overridden run method

        System.out.println(Thread.currentThread().getName() + ": g");

//        new Thread(() -> {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i);
//            }
//        }).start();

        // synchronized resource = only one thread at a time can access the resource

        /*
            Deadlock

                - A concurrency phenomenon that occurs when two thread have "locks" on separate resources
                  and each thread requires the locked resource held by the other thread in order to release
                  its lock.
         */

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

        // Thread priority is a way that the JVM prioritizes which order threads will execute.
        t1.setPriority(10); // priority is 1 (low) to 10 (high), default priority = 5
        t2.setPriority(1); // setting priority is not a good way of controlling the order in which threads execute
        // higher priority increases the likelihood that thread will be executed first, but it does not guarantee it

        // if you want to know about controlling thread execution...
        // look in to Thread ExecutorService and semaphores. (not required)

        t1.start();
        t2.start();


    }

}
