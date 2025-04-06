package classObject;

public class ClassObjectEx {

	// Class, Object, Static and return statements

	int a = 10;
	static int b = 20;

	public void method() {
		System.out.println("I am a method");
		System.out.println("From class method: " + a);
		System.out.println("From class method: " + b);
	}

	public static String staticMethod() {
		// System.out.println("From class method: " + a); //- static method can not
		// access non static variables
		System.out.println("From static method: " + b);
		return "I am a static method";
	}

	public static void main(String[] args) {
		ClassObjectEx obj1 = new ClassObjectEx(); // Object creation - same class
		SecondClass obj2 = new SecondClass(); // Other class object
		obj1.method();
		staticMethod(); // static method can be called without creating object of the class
		System.out.println("I am a main method");
		System.out.println("HI");
		System.out.println("Hello");
		// System.out.println("From class method: " + a);- static method can not access
		// non static variables
		System.out.println("From main method: " + obj1.a);
		System.out.println("From main method: " + b);// static var can be called without creating object of the class
		obj2.secondClassmethod(); // method from other class
		// staticMethod2(); //Not possible to call static method from other class
	}
}
