package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	/*
	 * 3. Map: It contains key value pairs and can not contain dupe keys Types:
	 * HashMap, LinkedHashMap, TreeMap
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
		hm1.put("Hello", 1);
		hm1.put("Hi", 2);
		hm1.put("Hey", 3);
		hm1.put("Dummy", 30);
		System.out.println(hm1.get("Hello"));
		hm1.remove("Dummy");
		System.out.println(hm1);
		System.out.println(hm1.entrySet());
		System.out.println(hm1.containsKey("Hello"));
		System.out.println(hm1.containsValue(2));
		for (Map.Entry<String, Integer> entry : hm1.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

}
