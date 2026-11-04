package IframePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\PageObjectModel\\PageObjectModel\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		
		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		
		
		//Find webelement and Value
		String nseindex = driver.findElement(By.id("nseindex")).getText();
		
		System.out.println(nseindex);
		
		

	}

}
