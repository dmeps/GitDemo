import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnect {

	public static void main(String[] args) throws SQLException {
		
		String host = "localhost";
		String port = "3306";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmeps\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_in");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadb", "root", "musik111");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from EmployeeInfo where Location = 'London'");
		while (rs.next()) {
		driver.findElement(By.id("user_email")).sendKeys(rs.getString("Name"));
		driver.findElement(By.id("user_password")).sendKeys(rs.getString("Location"));
		}
	}

}
