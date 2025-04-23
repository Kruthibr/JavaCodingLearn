package map;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFrequencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountCharacterFrequencies obj = new CountCharacterFrequencies();
		obj.getCount("programming");

	}

	public void getCount(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char i : s.toCharArray()) {
			if (!hm.containsKey(i)) {
				hm.put(i, 1);
			} else {
				hm.put(i, hm.get(i) + 1);
			}
		}
		for (Map.Entry<Character, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + ":" + map.getValue());
		}

	}

}
