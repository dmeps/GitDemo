package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {
	@BeforeMethod
	public void Be() {
		System.out.println("Bebebe");
	}
	
	@Test(enabled=false)
	public void Demo() {
		System.out.println("DME");
	}
	
	@Parameters({"URL", "username"})
	@Test(groups={"group1"})
	public void Demo1(String address, String uname) {
		System.out.println("DME1");
		System.out.println(address + ", " + uname);
	}
	
	
	@BeforeTest //only on <Test> not <Suite> level
	public void Prerequisite() {
		System.out.println("Hello");
	}
	
	@AfterTest //only on <Test> not <Suite> level
	public void Signoff() {
		System.out.println("Adios");
	}
}
