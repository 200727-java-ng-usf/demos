package com.revature.threads;

/*
    .join() method

        Using join(), we tell our thread to wait until other threads complete
        their run() operation. Once those threads are terminated, the thread
        we invoked .join() on will "join" in and complete its own run() operation.

        There are overloaded versions of this method, which allows the developer
        the ability to tell a thread to pause for a specific amount of time before
        "joining" back in with the other threads.
 */
public class JoinDriver {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();

        try {
            t1.join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        System.out.println("more main method logic...");
        System.out.println("some more main method logic...");
        System.out.println("and more main method logic...");
        System.out.println("and then...");
        System.out.println("and then...");
        System.out.println("main done.");
    }
}
