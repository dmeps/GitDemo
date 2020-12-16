package AbstractClasses;

public class BritishAirlies extends GlobalRules {

	public static void main(String[] args) {
		BritishAirlies ba = new BritishAirlies();
		ba.engine();
		ba.safety();
		ba.color();
	}

	@Override
	public void color() {
		System.out.println("Paint It Black");
	}
}
