package com.revature.thread;

import java.util.Arrays;

public class ThreadDriver {

    public static void main(String[] args) {

//        for(int i =0; i<10;i++){
//
//            System.out.println(Thread.currentThread().getName()+":"+i);
//        }

        // extends Thread.class
//        MyThread myThread1 = new MyThread();
//        MyThread myThread2 = new MyThread();

        //implements Runnable interface
//        MyRunnableThread myRunnableThread = new MyRunnableThread();
//        Thread showThread1 = new Thread(myRunnableThread);
//        Thread showThread2 = new Thread(myRunnableThread);
//        Thread showThread3 = new Thread(myRunnableThread);
//
//        showThread1.start();
//        showThread2.start();
//        showThread3.start();





//        myThread1.setPriority(2);
//        myThread1.start();
//        try {
//            showThread.join(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myThread2.setPriority(5);
//        myThread2.start();

//
//
//    WindowTest  t3 = new WindowTest();
//    WindowTest  t2 = new WindowTest();
//
//
//    t2.start();
//    t3.start();
//
//
//    //lambda expression of the New Tread
//   new Thread(()-> System.out.println("a")).start();

//   Thread t4 =new Thread(() ->{ for(int i =0;i<10;i++) {
//       System.out.println(Thread.currentThread().getName() + ": " + i);
//   }
//        });
//
//        Thread t5 =new Thread(() ->{ for(int i =0;i<10;i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }
//        });

        Thread myThread = new Thread(() -> {
            synchronized (Thread.class){
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": The even number is " + i);
                }
            }
        }});
        myThread.start();

        Thread myThread1 = new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        });
        myThread1.start();




    }
}
