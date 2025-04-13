package variableScope;

public class StaticVar {

	// Instance Variables
	String name;
	String addr;
	static String city; // Memory saving & sharing - class Variables
	static int i; // every time object created this variable is shared
	int j = 0;// Instance var resets when a obj is created
	static {// This block is used to initialize all static variables
		city = "Bng";
		i = 0;
	}

	public StaticVar(String name, String addr) {
		this.name = name;// local variables
		this.addr = addr;
		i++;
		j++;
		System.out.println(i + " " + j);
	}

	public void getAddress() {
		System.out.println(addr + " " + city);
	}

	public static void getCity() {
		System.out.println(city); // only static var is allowed in static method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("Allen", "Kng");
		StaticVar obj1 = new StaticVar("Ken", "BTM");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();// static method & var is called with classname
		StaticVar.i = 6;

	}

}
