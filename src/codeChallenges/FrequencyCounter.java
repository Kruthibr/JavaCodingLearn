package codeChallenges;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FrequencyCounter {

	/**
	 * @param args
	 */
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program that counts the frequency of each word in a given text using
		// a HashMap.
		String s = "madam";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char a[] = s.toCharArray();
		for (char c : a) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
//		for (int i = 0; i < s.length(); i++) {
//			if (hm.containsKey(s.charAt(i))) {
//				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
//			} else {
//				hm.put(s.charAt(i), 1);
//			}
//		}
		System.out.println(hm.entrySet());
		Set set = hm.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry map = (Map.Entry) it.next();
			System.out.println(map.getKey() + " is present in the word for " + map.getValue() + " times");
		}

		String text = "apple banana apple cherry banana apple";
		HashMap<String, Integer> hmt = new HashMap<String, Integer>();
		String words[] = text.split(" ");
		for (String w : words) {
			if (hmt.containsKey(w)) {
				hmt.put(w, hmt.get(w) + 1);
			} else {
				hmt.put(w, 1);
			}
		}
		System.out.println(hmt.entrySet());
		for (Map.Entry<String, Integer> map : hmt.entrySet()) {
			System.out.println(map.getKey() + " word is present in text for " + map.getValue() + " times");
		}
	}

}
