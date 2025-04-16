package streamsDemo;

import java.util.ArrayList;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count the number of names starts with alphabet a in the list
		System.out.println("Count the number of names starts with alphabet a in the list");
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ana");
		names.add("Bin");
		names.add("Ayan");
		names.add("Alan");
		names.add("Nutan");
		names.add("Aran");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			String s = names.get(i);
			if (s.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}
