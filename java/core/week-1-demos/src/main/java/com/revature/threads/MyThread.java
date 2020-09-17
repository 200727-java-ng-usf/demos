package com.revature.threads;

// a bit less common, but you can extend the Thread class and
// override the .run() method (which still comes Runnable) and
// invoke the inherited .start() method to actually create a
// new thread process.
public class MyThread extends Thread {

    @Override
    public void run() {

        this.setName("MyThread");
        System.out.println(Thread.currentThread().getName() + ": f");

        // still Thread-6 (because run() does not create a new thread process)
        new Thread(() -> System.out.println(Thread.currentThread().getName() + ": h")).run();
    }

}
