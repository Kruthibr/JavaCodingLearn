package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mergeAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("dona", "mona", "cona", "rona");
		List<String> names1 = Arrays.asList("rina", "mina", "cina", "rina");
		// Merge 2 Array List
		Stream<String> s = Stream.concat(names.stream(), names1.stream());
		// s.sorted().forEach(a -> System.out.println(a));
		// Is Present
		boolean present = s.anyMatch(a -> a.equalsIgnoreCase("dona"));
		System.out.println(present);

	}

}
