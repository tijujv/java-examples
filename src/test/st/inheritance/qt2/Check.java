package test.st.inheritance.qt2;

public class Check {
	
	public static void main(String[] args) {
		
		try {
			new JetPlane();
		} catch (Exception e) {
			System.out.println("catch in check e = " + e.getLocalizedMessage());
		}
		
	}

}
