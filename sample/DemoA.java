package sample;

public class DemoA extends DemoB {

	public void main(String[] args) {
		System.out.println("Hello");
		DemoA a = new DemoA();
		a.test("Karthik");
		super.demoB();
	}

	public void test(String a) {
		System.out.println("A value is"+a);
	}

}
