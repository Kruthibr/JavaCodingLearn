package polymorphism;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.method1();// child method is overridden

	}

	public void method1() {
		System.out.println("Method1 from ClassB");
	}

}
