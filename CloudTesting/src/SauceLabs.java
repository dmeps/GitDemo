import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {

	public static final String USERNAME = "dmepst";
	public static final String ACCESS_KEY = "9242d6f3-3e5f-4c06-be65-9b6e59885d2d";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws Exception {
		
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 10");
	    caps.setCapability("version", "43.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://dmme.net");
		System.out.println(driver.getTitle());
	}

}
