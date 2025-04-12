package inheritance;

public class MainClass {

	public static void main(String[] args) {
		Class1 a = new Class2();
		a.method();
		System.out.println(a.i);
		Class2 b = new Class2();
		b.method();
		System.out.println(b.i);
	}
}
