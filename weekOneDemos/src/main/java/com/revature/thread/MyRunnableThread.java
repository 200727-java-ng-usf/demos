package com.revature.thread;

public class MyRunnableThread implements Runnable{

    private int tickets = 100;
    Object LOCK = new Object(); // LOCK need instantiate outside of the run();
    @Override
    public void run() {
        while (true){

            synchronized (LOCK) {
                if (tickets > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": Ticket No. " + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
        }

    }
}
