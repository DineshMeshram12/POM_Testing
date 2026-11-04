package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPage.ConfigReader;

public class BaseTestCong {
	
	WebDriver driver;

	ConfigReader config = new ConfigReader();

    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(config.getUrl()); //For dynamic URL
    }
}