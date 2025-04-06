package loopsAndConditions;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) { // loops 5 times
			System.out.println("Outer loop value " + i);
			for (int j = 1; j <= 5; j++) { // loops 5 times for each val of outer loop
				System.out.println("Inner loop value " + j); // i.e 5X5=25
			}
		}

	}

}
