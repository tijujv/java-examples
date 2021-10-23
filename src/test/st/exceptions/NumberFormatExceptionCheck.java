package test.st.exceptions;

public class NumberFormatExceptionCheck {
	public static void main(String[] args) {

		try {

			Float f = new Float("3.0");

			System.out.println(f.intValue() + " " + f.byteValue() + " " + f.doubleValue());

			int i = f.intValue();
			byte b = f.byteValue();
			double d = f.doubleValue();

			System.out.println(i + b + d);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}
