package Keywords;

public class StaticVar {

	//instance vars - change from obj tp obj
	String name;
	String address;
	//class var - common for all objects - saves memory
	static String city;
	static int x;
	
	static { //to initialize all static vars - can be initialized above
		city = "Thornhill";
		x = 0; //updated whenever new obj is created; doesn't start from 0 every time as it's the same var
	}
	
	StaticVar(String name, String address) { //local vars
		this.name = name;
		this.address = address;
		x++;
		System.out.println(x);
	}
	
	public void getAddress() {
		System.out.println(address + ", " + city);
	}
	
	public static void getCity() { //static methods accept only static vars
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		StaticVar sv = new StaticVar("DME", "North Park Rd.");
		StaticVar sv1 = new StaticVar("YDE", "North PR.");
		sv.getAddress();
		sv1.getAddress();
		getCity(); //no need to refer to obj - same as StaticVar.getCity()
		StaticVar.x = 4; //assigning at runtime for static vars via class name
		System.out.println(x);
		sv.address = "XYZ"; //assigning at runtime for instance vars via obj name
		System.out.println(sv.address);
	}
}
