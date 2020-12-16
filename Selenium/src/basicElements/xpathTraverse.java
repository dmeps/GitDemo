package basicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTraverse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

				//traverse to following sibling
				System.out.print(driver.findElement(By.xpath("//button[@class='btn btn-primary']")).getText());
				System.out.println(" followed by: " + 
				driver.findElement(By.xpath("//button[@class='btn btn-primary']/following-sibling::button")).getText());
		
				//traverse to preceding sibling
				System.out.print(driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).getText());
				System.out.println(" preceded by: " + 
				driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]/preceding-sibling::button[1]")).getText());
				
				//traverse to parent
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();


//				System.out.println(driver.findElement(By.xpath("//*[text() = 'Home']/following-sibling::button")).getText());
	}
}
