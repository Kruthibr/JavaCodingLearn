package inheritance;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.method1();//public
		b.method2(); //protected
		//b.method3();//private not possible
		b.method4();
	}
	public void method4() {
		System.out.println("Public Method4-Class2");
	}

}
