package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objRepo.Home;
import objRepo.Login;

public class LoginApp {
	@Test
	public void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Login rd = new Login(driver);
		rd.Username().sendKeys("hello");
		rd.Password().sendKeys("olleh");
		rd.Submit().click();
		rd.Home().click();
		Thread.sleep(2000);
		
		Home rh = new Home(driver);
		rh.Search().sendKeys("thingy");
		rh.Submit().click();
	}
}
