package com.revature.threads;

//a bit less common, but you can extend thte thread class and override the .run() method
public class MyThread extends Thread {
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+ "f");
    }
}
