package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("alan", "rina", "mina", "cina", "rina");
		List<String> lis = names.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(lis.get(0));

		// Unique and distinct number in an array
		List<Integer> al = Arrays.asList(1, 2, 5, 4, 5, 3, 2, 6);
		al.stream().distinct().sorted().forEach(s -> System.out.println(s));

	}
}