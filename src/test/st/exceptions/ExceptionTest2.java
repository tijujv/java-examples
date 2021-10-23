package test.st.exceptions;

public class ExceptionTest2 {
	public static void main(String[] args) {

		try {
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		} finally {
			System.out.println("C");
		}
		System.out.println("D");
	}

}
