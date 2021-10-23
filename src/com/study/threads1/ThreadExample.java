package com.study.threads1;

public class ThreadExample extends Thread {

	public ThreadExample(String name) {
		super(name);
	}

	// run() method contains the code that is executed by the thread.
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " run() beginning");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Inside : " + Thread.currentThread().getName() + ": iteration : " + i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " run() end");
	}

}