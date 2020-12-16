package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecCl {
	@BeforeClass
	public void bc() {
		System.out.println("Before class");
	}
	@AfterClass
	public void ac() {
		System.out.println("After class");
	}
	
	@AfterMethod
	public void Af() {
		System.out.println("After method");
	}
	
	@Test(timeOut = 4000) //prevent failing before timeout
	public void Demo() {
		System.out.println("DME2");
		Assert.assertTrue(false);
	}
	
	@Test(groups={"group1"})
	public void Demo1() {
		System.out.println("DME3");
	}
	
	@Test(dataProvider = "getData")
	public void dataTest(String uname, String pass) {
		System.out.println(uname + ", " + pass);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object [][] data = new Object [3][2]; //[number of combinations][number of values in each]
		data[0][0] = "vu"; 		//1. valid user & pass 
		data[0][1] = "vp";
		data[1][0] = "iu";		//2. invalid user & valid pass
		data[1][1] = "vp";
		data[2][0] = "vu";		//3. valid user & invalid pass
		data[2][1] = "ip";
		return data;
	}
}
