package com.study.threads1;

public class MainThread {
	public static void main(String[] args) {
		System.out.println( Thread.currentThread().getName() + " beginning");

		System.out.println("Creating thread...");
		Thread t1 = new ThreadExample("t1");
		System.out.println("Starting thread...");
		t1.start();
		
		//---------------------------------------

		System.out.println("Creating Runnable...");
		Runnable runnable = new RunnableExample();
		System.out.println("Creating Runnable Thread...");
		Thread t2 = new Thread(runnable);

		System.out.println("Starting Thread...");
		t2.setName("t2-runnable");
		t2.start();
		
		System.out.println(Thread.currentThread().getName() + " end");
		
		
		//let all threads finish execution before finishing main thread
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
		System.out.println("All threads are dead, exiting main thread");

	}

}
