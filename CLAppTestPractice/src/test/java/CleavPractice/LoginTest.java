package CleavPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");		
		//driver.manage().window().maximize();
		
		//Enter Customer Number

		driver.findElement(By.id("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

	
	String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
	
	if(driver.getCurrentUrl().equals(expectedUrl)) {
		System.out.println("Login Successful");
	}
	else {
		System.out.println("Login Failed");
	}
}
}