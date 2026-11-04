package IframePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while (true) {
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		  if (year.equals("2020")&& month.equals("January")) {
			  driver.findElement(By.xpath("//a[text()='27']")).click();
			  break;
		  }
		  else {
			  driver.findElement(By.xpath("//span[text()='Prev']")).click();
		  }
		}
	}

}
