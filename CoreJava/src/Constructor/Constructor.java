package Constructor;

public class Constructor {

	//default
	public Constructor() {
		System.out.println("Constructor");
	}
	
	//parameterized 
	public Constructor(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	//parameterized 
	public Constructor(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Constructor con = new Constructor(); //runs constructor code when object is created
		Constructor parCon = new Constructor(5, 7);
		Constructor strCon = new Constructor("DME");
	}

}
