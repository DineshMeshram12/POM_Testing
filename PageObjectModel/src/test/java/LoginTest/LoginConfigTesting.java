package LoginTest;

import org.testng.annotations.Test;

import LoginPage.ConfigReader;
import LoginPage.LoginPage;

public class LoginConfigTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

@SuppressWarnings("null")
@Test
public void loginTest() {
    ConfigReader config = null;
    LoginPage.login(config.getUsername(), config.getPassword());
			
		}

	}


