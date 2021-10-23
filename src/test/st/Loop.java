package test.st;

public class Loop {

	public static void main(String[] args) {
		loop(5);
		System.out.println("loop completed");
	}

	static void loop(int a) {

		loop: for (int i = 1; i < 3; i++) {
			for (int j = 1; i < 3; i++) {
				if (a == 5)
					break loop;
				System.out.println(i * j);
			}
		}
	}
}
