package list;

import java.util.ArrayList;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		int num = 1;
		for (int i = 0; i < list.size(); i++) {
			if (num != list.get(i)) {
				System.out.println("Missing number is " + num);
				break;
			}
			num++;
		}

	}

}
