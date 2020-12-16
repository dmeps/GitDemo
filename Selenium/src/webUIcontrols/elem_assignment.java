package webUIcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class elem_assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption2")).click();
		WebElement chckbx = driver.findElement(By.cssSelector("label[for='benz']"));
		String label = chckbx.getText();

		Select sel = new Select(driver.findElement(By.id("dropdown-class-example")));
		sel.selectByVisibleText(label);
		
		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String alText = driver.switchTo().alert().getText();
		Assert.assertTrue(alText.contains(label));
	}
}
