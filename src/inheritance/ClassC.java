package inheritance;

public class ClassC {
	public static void main(String[] args) {
		ClassB b = new ClassB(); // no inheritance just object creation of diff class
		b.method1();
		b.method2();
		b.method4();
		ClassC c = new ClassC();
		c.method5();
	}

	public void method5() {
		System.out.println("Public Method5-Class3");
	}
}
