package techniques;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_cerificates {

	public static void main(String[] args) {		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		dc.acceptInsecureCerts(); //general Chrome profile that accepts certs
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //alt to above 
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //alt to above
		ChromeOptions co = new ChromeOptions();
		co.merge(dc); //merging profile with local browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(co); //injecting capabilities into driver
	}

}
