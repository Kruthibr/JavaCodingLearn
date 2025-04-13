package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("China");
		hs.add("India");
		System.out.println(hs);
		hs.add("India");
		System.out.println(hs);
		hs.remove("China");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("India"));
		System.out.println(hs.isEmpty());
		hs.add("Japan");
		hs.add("Autralia");
		hs.add("Antartica");

		// Iterator
		Iterator<String> it = hs.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
