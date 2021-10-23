package test.st.thread;

public class MyThread extends Thread {
	
	public void run() {
		System.out.println("run in foo");
		
	}
	public void run(String name) {
		System.out.println("run in doo");
		
	}
	
	
	public static void main(String[] args) {
		MyThread myThread = new MyThread() {
			public void run() {
				System.out.println("run in joo");
				
			}
		};
		
		myThread.start();
	}
	

}
