package com.study.threads1;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating Runnable...");
		Runnable runnable = new RunnableExample();

		System.out.println("Creating Thread...");
		Thread thread = new Thread(runnable);

		System.out.println("Starting Thread...");
		thread.start();
	}

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