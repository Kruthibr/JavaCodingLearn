package string;

public class CodeChallengesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Separate a string as cap, samll, spcl and num
		System.out.println("Separate a string as cap, samll, spcl and num:");
		String s = "1m2@3GaH(";
		StringBuffer cap = new StringBuffer();
		StringBuffer sml = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spcl = new StringBuffer();
		for (int i = 0; i <= s.length() - 1; i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				cap.append(s.charAt(i));

			} else if (Character.isLowerCase(s.charAt(i))) {
				sml.append(s.charAt(i));

			} else if (Character.isDigit(s.charAt(i))) {
				num.append(s.charAt(i));

			} else {
				spcl.append(s.charAt(i));
			}
		}

		System.out.println(cap);
		System.out.println(sml);
		System.out.println(num);
		System.out.println(spcl);

		// 2. returns the string with all vowels removed.
		System.out.println("Approach1: Return the string with all vowels and numbers removed:");
		String a = "Hello World123";
		// a e i o u = hll wrld
		String b = a.replaceAll("[aeiouAEIOU]", "");
		String c = b.replaceAll("[1-9]", "");
		System.out.println(c);

		// 3. using StringBuffer
		System.out.println("Approach2: Return the string with all vowels and numbers removed:");
		StringBuffer d = new StringBuffer();
		String vow = "aeiouAEIOU123";
		for (char ch : a.toCharArray()) {
			if (vow.indexOf(ch) == -1) {
				d.append(ch);
			}
		}
		System.out.println(d);

		// 4. System.out.println("Approach1: Return the string with all vowels and
		// numbers removed hello world -> olleh dlrow
		System.out.println("Return the string with each word reversed, but the order of the words remains the same:");
		String e = "Hello World";
		String[] f = e.split(" ");
		StringBuffer res = new StringBuffer();
		for (String word : f) {
			res.append(new StringBuffer(word).reverse()).append(" ");
		}
		System.out.println(res.toString().trim());

		// 5. Returns the smallest palindrome substring within that string
		System.out.println("Returns the smallest palindrome substring within that string:");
		String s1 = "momabcdad";
		;
		for (int i = 0; i <= s1.length() - 3; i++) {
			String s3 = s1.substring(i, i + 3);
			StringBuffer s4 = new StringBuffer(s3);
			if (s3.equalsIgnoreCase(s4.reverse().toString())) {
				System.out.println(s4);
			}
		}
		// 5. Returns all the palindrome substring within that string
		System.out.println("Return all the palindrome substring within that string:");
		String s2 = "anamadamdadmomlevelcivic";// mommadam -> mom, ada, madam
		for (int i = 0; i <= s2.length() - 1; i++) {
			int j = i + 3;
			while (j <= s2.length()) {
				String s3 = s2.substring(i, j);
				StringBuffer s4 = new StringBuffer(s3);
				if (s3.equalsIgnoreCase(s4.reverse().toString())) {
					System.out.println(s4);
				}
				j++;
			}

		}
	}

}
