package test.st.inheritance.qt1;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		System.out.println("------A------");
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println("------B-----");
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);
		System.out.println(b instanceof C);
		System.out.println("------C-----");
		System.out.println(c instanceof A);
		System.out.println(c instanceof B);
		System.out.println(c instanceof C);


	}
}
