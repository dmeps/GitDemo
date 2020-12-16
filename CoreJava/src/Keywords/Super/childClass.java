package Keywords.Super;

public class childClass extends parentClass{

	String name = "DME";
	
	public childClass() {
		super(); //must be the first line in child constructor
		System.out.println("Child con");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name); //if there's same variable name, "super" refers to parent class
	}
	
	public void getData() {
		super.getData(); //if there's overriding, "super" refers to parent class
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		childClass cc = new childClass();
		cc.getStringData();
		cc.getData();
	}

}
