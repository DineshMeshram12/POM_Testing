package LoginTest;

import org.testng.annotations.Test;

import BaseTest.DriversSetup;
import LoginPage.LoginPage;

public class LoginTesting1 extends DriversSetup{
	
	@Test
	public void validLoginTest() {
		
		LoginPage lp = new LoginPage (driver);
		lp.setUsername("admin@example.com");
		lp.setPassword("password");
		lp.clicklogin();
		
	}
	
	
	

}
