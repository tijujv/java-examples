package test.st.exceptions;

public class ExceptionTest1 {
	
	
	public static void main(String[] args) {
		calculate(4,0);
	}
	
	static void calculate(int a, int b) {
		int c;
		try {
			c = a/b;
		}
		catch(Exception e){
			System.out.println("exception -- " + e.getLocalizedMessage());
			
		}
		finally {
			System.out.println("finally()" );
		}
	}

}
