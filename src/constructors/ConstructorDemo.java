package constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor is a block of code that is executed when a obj is created
		// Constructor doesn't return anything - no return type
		// Constructor name is className
		// Class always have a constructor if not defined implicit constructor is called
		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo(1, 2);
		obj.method1();
	}

	// default constructor
	public ConstructorDemo() {
		System.out.println("I am constructor");
	}

	// Parameterized Constructor
	public ConstructorDemo(int a, int b) {
		System.out.println("I am parameterized constructor " + a + b);
	}

	public void method1() {
		System.out.println("I am method1");
	}

}
