package com.revature.threads;

public class MyThread  extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "f");

        new Thread(() ->System.out.println(Thread.currentThread().getName() + "h")).run();
    }
}
