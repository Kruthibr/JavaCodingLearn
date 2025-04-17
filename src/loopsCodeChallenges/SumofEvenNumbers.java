package loopsCodeChallenges;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Challenge 13: Sum of Even Numbers
		// Write a program that calculates the sum of all even numbers between 1 and 100
		// using a loop.
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
