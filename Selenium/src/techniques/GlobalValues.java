package techniques;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\dmeps\\eclipse-workspace\\Selenium\\src\\techniques\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser") + " / " + prop.getProperty("url"));
		//to update a property
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		//to rewrite values in .properties file
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dmeps\\eclipse-workspace\\Selenium\\src\\techniques\\data.properties");
		prop.store(fos, null);
	}

}
