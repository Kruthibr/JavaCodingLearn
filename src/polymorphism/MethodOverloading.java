package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		// either number of args or type of args shd be different
		obj.getData(5);
		obj.getData(1, 2);
		obj.getData(2.0, 1);
	}

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + b);
	}

	public void getData(double a, int b) {
		System.out.println(a + b);
	}

}
