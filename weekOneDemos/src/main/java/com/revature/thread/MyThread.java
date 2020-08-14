package com.revature.thread;

public class MyThread extends Thread{



    @Override
    public void run() {
        super.run();

        for(int i=0; i<100;i++){

            System.out.println(currentThread().getName()+" :"+ i);
        }

    }
}
