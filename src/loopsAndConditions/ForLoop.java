package loopsAndConditions;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For loop:1");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("For loop:2");
		int[] a = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {// Initialization ,testCondition, inc/dec
			System.out.println(a[i]);
		}
		System.out.println("For loop:3");
		for (int i : a) { // Short hand for
			System.out.println(i);
		}
		System.out.println("For loop:4");
		char[] b = { 'a', 'b', 'c', 'd' };
		for (Object i : b) { // default Object type to access any array ele
			System.out.println(i);
		}
		System.out.println("For loop:5");
		for (char i : b) {
			System.out.println(i);
		}

	}

}
