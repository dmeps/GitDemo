package Interfaces;

public class NorthAmericanTraffic extends Guidelines implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		CentralTraffic cet = new NorthAmericanTraffic();
		cet.greenGo();
		cet.redStop();
		cet.yellowWait();
		
		ContinentalTraffic cot = new NorthAmericanTraffic();
		cot.Symbol();
		
		NorthAmericanTraffic nat = new NorthAmericanTraffic();
		nat.WalkOnSymbol();
		nat.Rules(); //inherited from Guidelines
	}

	public void WalkOnSymbol() {
		System.out.println("Walk");
	}
	
	@Override
	public void Symbol() {
		System.out.println("Look");
	}

	@Override
	public void greenGo() {
		System.out.println("Go");
	}

	@Override
	public void redStop() {
		System.out.println("Stop");
	}

	@Override
	public void yellowWait() {
		System.out.println("Wait");
	}

}
