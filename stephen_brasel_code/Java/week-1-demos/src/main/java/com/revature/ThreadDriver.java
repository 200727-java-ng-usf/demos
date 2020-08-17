package com.revature;

import com.revature.threads.MyThread;
import com.revature.threads.Worker;

public class ThreadDriver {

	/*
		Thread States:
			- NEW
			- RUNNABLE
				+ READY
				+ RUNNING
			- WAITING (wait for an indefinite amount of time)
			- TIMER_WAITING (wait for a specific amount of time)
			- BLOCKED (current thread cannot execute because it requires a resource locked by another thread
			- TERMINATED (will be back.)
	 */

	public static void main(String[] args) {

		// passing lambda exprewssions that implement Runnable.run() to the Thread constucotr
		new Thread(() -> System.out.println(Thread.currentThread().getName() + ": " + "a")).start();
		new Thread(() -> System.out.println(Thread.currentThread().getName() + ": " + "b")).start();
//		new Thread().run();

		// passing a local anonymous class simple,menmt of Runnable to the Thread constructor
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + ": " + "c");
			}
		}).start();


		// you can create a custom object that implements Runnable, and pass an instance of it
		// to the Thread constructor and start it to create a new thread.
		Worker worker = new Worker();
		new Thread(worker).start();

		// doesn't actually create a new thread. executes the run() logic on the current thread.
		new Thread(() -> System.out.println(Thread.currentThread().getName() + ": " + "e")).run();

		/*
			new Thread vs Thread.run() vs Thread.start()

				- new Thread(): makes a Thread object, whose state initially is New;
								does not start the thread, nor does it execute the run object of the thread.

				- Thread.run():  defines the logic which a thread will run when started;
								 but does not actually start a new thread process on the hardware level
								 - simply executes the run() method logic on the current thread.

				- Thread.start(): actually starts a new hardware-level thread process and
								  executes the logic within the run)_ on the newly created
								  thread.
		 */

		//no work is done here because no runnable object was provided
		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

		new MyThread().start();

		new Thread(() ->{
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		}).start();

		System.out.println(Thread.currentThread().getName() + ": " + "g");

		// synchronized resource = only one thread at a time can access the resource

		/*
			Deadlock

				- A concurrency phenomenon that occurs when two threads have "locked"
					resources and each thread requires the locked resource held by the
					other thread in order to release its lock.

			Livelock
				- A condition where

		 */

		final long millis = 300L;
		Thread t1 = new Thread(() -> {
			Thread.currentThread().setName("t1");
			for (int i = 0; i < 10; i++) {
				try{
				    Thread.sleep(millis);
				} catch(InterruptedException e) {
				    e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		});

		Thread t2 = new Thread(() -> {
			Thread.currentThread().setName("t2");
			for (int i = 0; i < 11; i++) {
				try{
					Thread.sleep(millis); // tells thread to wait for specific time in milliseconds
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + ": " + i);
			}
		});

		// Thread priority is a way that the JVM prioritizes which order threads will execute.
		t1.setPriority(10); // priority is 1 (low) to 10 (high), default priority = 5
		t2.setPriority(1); // setting priority is not a good way of controlling the order in which threads execute
		// higher priority increases the likelihoog that thread will be executed first, but does not guarantee it.
		// if you want to know about that... look into Thread ExecutorService and semaphores. (not required)

		t1.start();
		t2.start();

		try{
		    t1.join();
		} catch(InterruptedException e) {
		    e.printStackTrace();
		}

		System.out.println("Main Done");
		System.out.println("Main Done");
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main 2 Done");
		System.out.println("Main 2 Done");
	}
}
