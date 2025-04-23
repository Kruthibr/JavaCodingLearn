package list;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(30);
		list.add(80);
		list.add(10);
		list.add(50);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.get(list.size() - 2));
	}

}
