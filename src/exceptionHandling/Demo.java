package exceptionHandling;

public class Demo {

	int a;
	int b;
	int c;

	public Demo(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void getData() {
		// catch block shd always be follow by at least 1 try block
		// 1 try can have more than one catch block
		// finally block always executes even if Exception never thrown
		// Killing driver session or deleting cookies
		// finally can be written without catch but try is must
		// finally will not execute only when JVM stopped forcefully
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception catched");
		} catch (Exception e) {
			System.out.println("Exception catched");
		} finally {
			System.out.println("Finally! Done");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo(4, 2);
		Demo obj1 = new Demo(4, 0);
		obj.getData();
		obj1.getData();

	}

}
