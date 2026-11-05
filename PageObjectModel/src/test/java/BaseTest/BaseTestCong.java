package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import LoginPage.ConfigReader;

public class BaseTestCong {
	
	WebDriver driver;

	ConfigReader config = new ConfigReader();

   /* public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(config.getUrl()); //For dynamic URL
    }*/
	
	public void setup() {

        ChromeOptions options = new ChromeOptions();

        // Run Chrome without opening a visible browser window
        options.addArguments("--headless=new");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-gpu");

        driver = new ChromeDriver(options);

        driver.get(config.getUrl());
}
}