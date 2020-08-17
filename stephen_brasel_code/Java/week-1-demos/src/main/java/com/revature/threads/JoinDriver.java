package com.revature.threads;

/*
	.join() method

		Using join(), we tell our thread to wait until other threads complete
		their run() operation. Once those threads are terminatedm, the thread
		we invoked .join() on will "join" in and complete its own run() operation;

		There are overloaded versions of the metthod which allows the developer the
		ability to tell a thread to pause for a specific amount of time before
		"joining" back in with the other threads.
 */
public class JoinDriver {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);

				try{
					Thread.sleep(1000);
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);

				try{
					Thread.sleep(1000);
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join(3L); // TIMED_WAITING
		} catch (Exception e) {
			e.printStackTrace();
		}
//		boolean running = true;
//		while(running) {
//			try {
//				running = (t1.isAlive() && // TIMED_WAITING
//						t2.isAlive());
////				running = (t1.isAlive() && // TIMED_WAITING
////						t2.isAlive());
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}


		System.out.println("more main method");
		System.out.println("some more main method");
		System.out.println("and more main method");
		System.out.println("even more main method");
		System.out.println("more main method");
		System.out.println("more main method");
		System.out.println("more main method");
		System.out.println("more main method");
		System.out.println("more main method");
		System.out.println("main done");

	}
}
