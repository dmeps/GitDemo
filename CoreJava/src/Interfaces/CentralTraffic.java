package Interfaces;

public interface CentralTraffic {
	int a = 5; // public by default; doesn't require modifier
	public void greenGo();
	public void redStop();
	public void yellowWait();
}
