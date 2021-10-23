package test.st.exceptions;

public class TryCatch {

	public static void main(String[] args) {

		System.out.println("get1() " + get1());
		System.out.println("get2() " + get2());

	}

	static int get1() {
		try {
			return 1000;
		} finally {
			return 2000;
		}
	}

	static int get2() {
		int b = 0;
		try {
			b = 1000;
			return b;
		} finally {
			b = 2000;
			//return b;
		}
	}

}
