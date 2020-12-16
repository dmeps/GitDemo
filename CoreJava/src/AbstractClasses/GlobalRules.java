package AbstractClasses;

public abstract class GlobalRules { //unlike interfaces, abstract classes have concrete and at least one abstract methods
	
	public void engine() {
		System.out.println("Follow engine guidelines");
	}
	
	public void safety() {
		System.out.println("Follow safety guidelines");
	}
	
	public abstract void color();
}
