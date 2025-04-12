package inheritance;

public class ClassD extends ClassC implements Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassD c = new ClassD();
		c.method5();
		c.method6();
		c.method7();

	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("Public Method6-Interface1");
	}

	public void method7() {
		System.out.println("Public Method7-Class4");
	}

}
