package Test;

import org.testng.annotations.Test;

import Data.TestData;

public class LoginTest {

    @Test(dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void loginTest(String username, String password) {

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

}
}