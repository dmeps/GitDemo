package Inheritance;

public class ChildClass extends ParentClass {
	
	public void audiosystem() {
		System.out.println("Audio code");
	}

	public void color() {
		System.out.println(color);
	}
	
	public static void main (String[] args) {
		ChildClass cc = new ChildClass();
		cc.color();
		cc.audiosystem();
	}
}
