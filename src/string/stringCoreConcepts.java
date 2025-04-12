package string;

public class stringCoreConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Immutable = which can't be changed it remains constant
		String s = "Hello";
		s.concat("world");
		System.out.println(s);
		s = s + "world"; // re initialized
		System.out.println(s);

		// StringBuffer and StringBuilder - Immutable
		StringBuffer a = new StringBuffer("Hello");
		a.append(" World");
		System.out.println(a);
		a.insert(0, "Hi ");
		System.out.println(a);
		a.replace(1, 2, "ey");
		System.out.println(a);
		a.delete(1, 2);
		System.out.println(a);
		a.reverse();
		System.out.println(a);
		// methods applied to StringBuffer is changing the original value of it
		// without pushing it to another variable
		// provides vast string manipulating methods
		// StringBuilder is not thread safe, it is not synchronized
		String x = "java";
		String y = "java"; // Referring to x
		String z = new String("java");
		System.out.println(x == y);// true compares addr
		System.out.println(x == z);// false
		System.out.println(x.equals(y));// true compares content
		System.out.println(x.equals(z));// true
	}

}
