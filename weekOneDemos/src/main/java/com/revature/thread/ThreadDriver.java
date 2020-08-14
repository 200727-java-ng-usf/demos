package com.revature.thread;

public class ThreadDriver {

    public static void main(String[] args) {

        for(int i =0; i<10;i++){

            System.out.println(Thread.currentThread().getName()+":"+i);
        }

        // extends Thread.class
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        //implements Runnable interface
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread showThread = new Thread(myRunnableThread);



        myThread1.setPriority(2);
        myThread1.start();
        try {
            showThread.join(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread2.setPriority(5);
        myThread2.start();




        showThread.start();




    }
}
