package com.revature.thread;

public class WindowTest extends Thread{

    private static int tickets = 30;

    @Override
    public void run() {
        while (true){

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
