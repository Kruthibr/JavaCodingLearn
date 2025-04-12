package interfaceConcepts;

public class ClassImplements implements CentralTraffic, Traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic c1 = new ClassImplements();
		c1.redStop();
		c1.greenGo();
		c1.yellowReady();
		ClassImplements c2 = new ClassImplements();
		c2.redStop();
		c2.greenGo();
		c2.yellowReady();
		c2.handSymbol();
		Traffic c3 = new ClassImplements();
		c3.traffic();
		ClassImplements c4 = new ClassImplements(); // interface object 
		c4.redStop();
		c4.greenGo();
		c4.yellowReady();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green - Go");

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red - Stop");

	}

	@Override
	public void yellowReady() {
		// TODO Auto-generated method stub
		System.out.println("Yellow - Be Ready");

	}

	public void handSymbol() {
		System.out.println("Hand Symbol - Stop pedistriants waiting");
	}

	@Override
	public void traffic() {
		// TODO Auto-generated method stub
		System.out.println("Traffic rules must be followed");
	}

}
