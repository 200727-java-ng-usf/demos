package com.revature.threads;

public class ThreadDriver {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("a")).start();
        new Thread(() -> System.out.println("b")).start();

        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("c");
            }
        });

        Worker worker = new Worker();
        new Thread(worker).start();
        //new Thread(() -> System.out.println())

        //this doesn't create a new thread, only executes run method logic
        new Thread(worker).run();

    }

}
