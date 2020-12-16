package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Logins1 {
	@Test
	@Parameters({"URL"}) //method level
	public void WebLogin(String urladress) {
		System.out.println("WebLogin1");
		System.out.println(urladress);
	}
	
	@Test
	public void MobileLogin() {
		System.out.println("MobileLogin1");
	}
	
	@Test(dependsOnMethods={"WebLogin"}) //multiple dependencies can be used: {"method1", "method2"}
	public void MobileLogout() {
		System.out.println("MobileLogout1");
	}
	
	@Test(groups={"group1"})
	public void LoginAPI() {
		System.out.println("LoginAPI1");		
	}
}
