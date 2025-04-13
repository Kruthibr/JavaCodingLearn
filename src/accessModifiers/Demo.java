package accessModifiers;

public class Demo {

	void method1() { // Default - can be accessed anywhere but within the package
		System.out.println("Default Method1");
	}

	public void method2() { // Public - anywhere, across packages
		System.out.println("Public Method2");
	}

	protected void method3() { // Protected - Only Child class in other packages
		System.out.println("Protected Method3");
	}

	private void method4() { // Private - Only the current class
		System.out.println("Private Method4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();

	}

}
