package IframePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BobiboDatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&utm_term=!SEM!DF!G!Brand!RSA&cmp=SEM|D|DF|G|Google-CPC-Brand|DF-Brand-EM|Goibibo-Flight|RSA%3e&gad_source=1&gad_campaignid=108599293&gbraid=0AAAAADrlxCculxwRglg7NmM-U-A3wn8Ra&gclid=CjwKCAjw2brFBhBOEiwAVJX5GEjwSr9V6_OCpC0bbWYi6gZXK7n2NxUSGKYzclL0CdmgRTutmM1WQxoCRdYQAvD_BwE");
		
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
		
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


