package finalConcepts;

public class Final {

	final int i = 10; // constant value can not be changed
	// i=20; // error: as final var value can not be changed

	public final void method1() { // final method can not be overridden
		System.out.println("I am a final method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final obj = new Final();
		System.out.println(obj.i);
		obj.method1();

	}

}
