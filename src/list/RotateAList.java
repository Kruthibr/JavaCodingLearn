package list;

import java.util.ArrayList;
import java.util.Collections;

public class RotateAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		int n = list.size();
		int k = 2;
		k = k % n;
		Collections.rotate(list, k);
		System.out.println(list);

	}

}
