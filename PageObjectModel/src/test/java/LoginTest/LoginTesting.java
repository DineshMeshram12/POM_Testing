package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPage.LoginPage;

public class LoginTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://granthaadeveloperpvtltd.com/pms/");
		
		LoginPage lp = new LoginPage (driver);
		
		lp.setUsername("ajk@gmail.com");
		lp.setPassword("password");
		lp.clicklogin();

	}

}
