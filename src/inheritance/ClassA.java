package inheritance;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.method1();
		a.method2();
		a.method3();
	}
	public void method1() {
		System.out.println("Public Method1-Class1");
	}
	protected void method2() {
		System.out.println("Protected Method2-Class1");
	}
	private void method3() {
		System.out.println("Private Method3-Class1");
	}

}
