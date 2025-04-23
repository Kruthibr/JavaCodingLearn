package collectionCodeChallenges;

import java.util.ArrayList;

public class ListDemo {
	/*
	 * Java Collection Framework is a collection of classes and interfaces which has
	 * good number methods to code easy 1. List: its an ordered, Sequential
	 * collection and it may contain duplicate values Types: ArrayList,
	 * LinkedList,Vector
	 */

	/*
	 * An ArrayList in Java is a part of the Java Collections Framework and is used
	 * to store dynamically sized collections of elements. Unlike arrays, an
	 * ArrayList can grow and shrink in size automatically when elements are added
	 * or removed.
	 */

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anna");
		al.add("Rina");
		al.add("Mina");
		al.add("Tina");
		System.out.println(al.get(0));
		for (String s : al) {
			System.out.println(s);
		}
		System.out.println(al);
		System.out.println(al.size());
		al.remove(3);
		System.out.println(al);
		al.set(1, "Kina");
		System.out.println(al);
	}

}
