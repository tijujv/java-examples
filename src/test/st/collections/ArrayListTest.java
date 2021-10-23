package test.st.collections;

import java.util.ArrayList;
import java.util.List;

class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		x.add("1");
		x.add("2");
		x.add("3");

		List<String> z = new ArrayListTest().addZ(x);
		z.add("5");

		System.out.println(z);
		System.out.println(x);

	}

	List<String> addZ(List<String> y) {
		y.add("4");
		return y;
	}

}
