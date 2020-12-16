package basicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTraverse_old {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab4']/preceding-sibling::li[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/parent::ul")).getText());
	}
}
