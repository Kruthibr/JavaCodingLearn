package superThis;

public class ChildClass extends ParentClass {
	String s = "Child";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// child class variables & methods overrides parent class
		ChildClass c = new ChildClass();
		c.getData();
		c.getData1();
		c.getData2();
		c.getData3();
	}

	public ChildClass() {
		super(); // shd be first line only used for constructors
		System.out.println("Child Constructor");
	}

	public void getData() {
		System.out.println("I am child class method");
		super.getData();
	}

	public void getData1() {
		System.out.println("As default " + s);
	}

	public void getData2() {
		System.out.println("This keyword " + this.s);
	}

	public void getData3() {
		System.out.println("Super keyword " + super.s);
	}

}
