package webUIcontrols;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Shopping_Cart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 5);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		String[] shopList = { "Carrot", "Apple", "Pears", "Pista" };
		addItems(driver, shopList);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//*[text() = 'PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		Assert.assertTrue(driver.findElement(By.cssSelector("span.promoInfo")).getText().equals("Code applied ..!"));
		driver.quit();
	}

	public static void addItems(WebDriver driver, String[] shopList) {
//		//Single item
//		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
//		for (int a = 0; a < products.size(); a++) {
//			String prodName = products.get(a).getText();
//			if (prodName.contains("Carrot")) {
//				driver.findElements(By.xpath("//*[text() = 'ADD TO CART']")).get(a).click(); //text locator is unreliable
//				break;
//			}
//		}

		// Multiple items
		int x = 0;
		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		for (int a = 0; a < products.size(); a++) {
			String[] prodName = products.get(a).getText().split("-"); // extract string and split into array
			String formattedName = prodName[0].trim(); // get first index and remove spaces to the left & right
			List<String> items = Arrays.asList(shopList); // convert array to list
			if (items.contains(formattedName)) { // check whether ArrayList contains extracted string
				x++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(a).click();
				if (x == shopList.length) {
					break;
				}
			}
		}
	}
}
