package streamsDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OptimizedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ana");
		names.add("Bin");
		names.add("Ayan");
		names.add("Alan");
		names.add("Nutan");
		names.add("Aran");

		long count = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);
		long d = Stream.of("Dona", "Ana", "Alak").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 3).forEach(s -> System.out.println(s));
		System.out.println("");
		names.stream().filter(s -> s.length() > 3).limit(2).forEach(s -> System.out.println(s));
		System.out.println("");
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

	}

}
