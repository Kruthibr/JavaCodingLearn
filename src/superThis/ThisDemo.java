package superThis;

public class ThisDemo {

	int a = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo obj = new ThisDemo();
		System.out.println(obj.a);
		obj.getData();
	}

	public void getData() {
		int a = 2;
		System.out.println("Local Variable " + a);// local variable
		System.out.println("Class Variable " + this.a);// refers to object of the class - global var
		System.out.println(a + this.a);
	}

}
