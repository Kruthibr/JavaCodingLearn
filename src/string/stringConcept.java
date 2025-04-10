package string;

public class stringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hey"; // String literal
		String b = "Hey"; // JVM checks string constant pool & assigns the addr of a
		String c = new String("hello"); // String class object
		String s="  hello world";
		System.out.println(s);
		System.out.println(s.trim()); //ASCII 1 to 32 JAVA 1.0
		System.out.println(s.strip()); //wider range JAVA 11
		String a1[]=s.split("w");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		String x="Madam";
		String rev="";
		for(int i=x.length()-1;i>=0;i--) {
			System.out.println(x.charAt(i));
			rev=rev+x.charAt(i);
		}
		System.out.println(rev);
		if(x.equalsIgnoreCase(rev))
			System.out.println("Yes Palindrome");
		else
			System.out.println("Not Palindorme");
	}

}
