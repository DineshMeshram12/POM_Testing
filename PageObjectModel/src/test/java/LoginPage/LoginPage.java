package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//Initialize the Locators
	By usernameFiled =By.id("login");
	By passwordFiled =By.id("password");
	By loginBtn =By.xpath("//button[contains(text(),'LOGIN')]");
	
	//Create a Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Setter (Using this method)
	public void setUsername (String username) {
		//driver.findElement(usernameFiled).sendKeys(username);
		driver.findElement(usernameFiled).sendKeys(username);
	}
	
	//Setter (Using this method)
	public void setPassword (String password) {
		driver.findElement(passwordFiled).sendKeys(password);
	}
	
	public void clicklogin() {
		driver.findElement(loginBtn).click();
	}

	public static void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}

}
