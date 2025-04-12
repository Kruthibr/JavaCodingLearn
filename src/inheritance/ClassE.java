package inheritance;

public class ClassE implements Interface1, Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassE e = new ClassE();
		e.method6();
		e.method8();
		e.method9();
	}

	@Override
	public void method8() {
		// TODO Auto-generated method stub
		System.out.println("Public Method8-Interface2");
	}

	@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("Public Method6-Interface1");
	}

	public void method9() {
		System.out.println("Public Method9-Class5");
	}
}
