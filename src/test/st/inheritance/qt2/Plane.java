package test.st.inheritance.qt2;

public class Plane {
	
	public Plane() throws Exception {
		System.out.println("Plane()");
		throw new Exception("exception from plane");
	}
	
	public void sound() {
		System.out.println("Plane sound...");
	}
	
	public void start() {
		System.out.println("Plane start...");
	}

}
