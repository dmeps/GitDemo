package Basics;

public class class_method {
	
	int x = 6;

	public static void main(String[] args) {
		class_method ts = new class_method(); //class object to invoke methods
		ts.getData();
		System.out.println(ts.x);
	}
	
	public void getData() {
		System.out.println("smn");
	}

}
