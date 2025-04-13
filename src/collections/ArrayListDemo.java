package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(2);// List can hv duplicate values
		System.out.println(al);
		al.add(0, 3);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.contains(2));
		System.out.println(al.indexOf(3));
		System.out.println(al.isEmpty());
		System.out.println(al.size());

	}

}
