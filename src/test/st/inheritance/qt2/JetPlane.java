package test.st.inheritance.qt2;

public class JetPlane extends Plane {

	JetPlane() throws Exception {
		System.out.println("JetPlane()");
		try {
			throw new Exception("exception from JetPlane");
		} catch (Exception e) {
			System.out.println("catch in JetPlane e = " + e.getLocalizedMessage());
		}
	}

	public void sound() {
		System.out.println("Jet Plane sound...");
	}

}
