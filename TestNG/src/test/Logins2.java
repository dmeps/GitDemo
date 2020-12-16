package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logins2 {
	@Test
	public void WebLogin() {
		System.out.println("WebLogin2");
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("MobileLogin2");
	}
	
	@Test(groups={"group1"})
	public void LoginAPI() {
		System.out.println("LoginAPI2");		
	}
	
	@BeforeSuite
	public void Bsuite() {
		System.out.println("Suite start");
	}
	
	@AfterSuite
	public void Asuite() {
		System.out.println("Suite end");
	}
}
