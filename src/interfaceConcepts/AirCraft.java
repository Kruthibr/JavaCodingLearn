package interfaceConcepts;

public class AirCraft extends GlobalRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirCraft a1=new AirCraft();
		a1.engine();
		a1.shape();
		a1.motor();
		a1.color();
		GlobalRules g = new AirCraft();
		g.color();//was not possible in interface
		g.engine();
		g.motor();
		g.shape();
		//GlobalRules g1 = new GlobalRules(); //can not instantiate an abstract class
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("White");
	}

}
