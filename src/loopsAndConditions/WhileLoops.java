package loopsAndConditions;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		System.out.println("While Loop:1");
		while (i <= 10) {// boolean condition
			System.out.println(i);
			i++;
		}
		int j = 10;
		System.out.println("While Loop:2");
		while (j >= 0) {
			System.out.println(j);
			j--;
		}
		System.out.println("Do While Loop:1");
		int k = 5;
		do {
			System.out.println(k);
			k++;
		} while (k > 10);
	}

}
