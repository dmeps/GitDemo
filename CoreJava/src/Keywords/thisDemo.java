package Keywords;

public class thisDemo {
	int a = 5;

	public void getData() {
		
		int a = 10;
		System.out.println(a); 	// local var is used
		a = this.a; 			// "this" refers to the current object whose scope is on the class level
		System.out.println(a); 	// global var is used
		System.out.println(this.a); 
	}
	
	public void sum() {
		int a = 7;
		int x = a + this.a;
		System.out.println(x);
	}

	public static void main(String[] args) {
		thisDemo td = new thisDemo();
		td.getData();
		td.sum();
	}
}
