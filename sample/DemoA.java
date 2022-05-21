package sample;

public class DemoA {

	public static void main(String[] args) {
		System.out.println("Hello");
		DemoA a = new DemoA();
		a.test("Karthik");
	}
	
	public void test(String a) {
		System.out.println("A value is"+a);
	}

}
