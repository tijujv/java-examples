package test.st.abstractclass.qt;

public class Check {
	public static void main(String[] args) {
		// Abstract ab = new Abstract(); // Cannot instantiate the type Abstract

		Abstract ab2 = new Abstract() {

			@Override
			void abstractMethod() {
				System.out.println("abstractMethod");

			}
		};

		ab2.nonAbstractMethod();
		ab2.abstractMethod();
	}
}
