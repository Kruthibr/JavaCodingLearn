package interfaceConcepts;

public abstract class GlobalRules {

	//public or protected always
	public void engine() {
		System.out.println("Engine design");
	}
	protected void shape() {
		System.out.println("Aircraft body");
	}
	public void motor() {
		System.out.println("Motor type");
	}
	public abstract void color();
}
