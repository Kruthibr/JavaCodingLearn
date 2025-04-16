package streamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Ana", "Alex", "Dona", "Aran", "Arren", "Ann").filter(s -> s.endsWith("n"))
				.forEach(s -> System.out.println(s.toUpperCase()));
		System.out.println();
		// using map
		System.out.println("using map");
		Stream.of("Ana", "Alex", "Dona", "Aran", "Arren", "Ann").filter(s -> s.endsWith("n")).map(s -> s.toLowerCase())
				.forEach(s -> System.out.println(s));
		System.out.println();

		// first letter as a with upper case and sort
		System.out.println("first letter as a with upper case and sort");
		String a[] = { "Ana", "Alex", "Aba", "Aca", "Azak" };
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(a);
		al.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).sorted()
				.forEach(s -> System.out.println(s));

	}

}
