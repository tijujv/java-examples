package test.st;

public class Boolean {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = false;

		System.out.println(b1 & b2);
		System.out.println(b1 & b3);
		System.out.println(b2 & b3);
		System.out.println(b1 | b2);
		
		
		System.out.println("----------------------");
		
		if (b1 & b2 | b2 & b3 | b2 | b3)
			System.out.println("okay");
		
		if (b1 & b2 | b2 & b3 | b2 | b1)
			System.out.println("okay okay");
	}

}
