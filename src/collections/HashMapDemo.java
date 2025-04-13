package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0,"hey");// index - key & val
		hm.put(1, "hi");
		hm.put(2, "hello");
		hm.put(3, "hey");
		hm.put(4, "Bye");
		hm.put(43, "break");
		System.out.println(hm.get(1));
		System.out.println(hm.get(50));
		System.out.println(hm.size());
		hm.remove(42);
		System.out.println(hm.get(42));
		
		// Map to Set
		Set s=hm.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
