package testcases;

import org.testng.annotations.Test;

import common.DataGenerator;
import common.DriverInstance;
import pages.LoginPage;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{
	
	@Test(dataProvider = "Excel", dataProviderClass = DataGenerator.class)
	public void tc_001_Login_Functionality(String username, String password) throws Exception{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickSignin();
		Thread.sleep(3000);
		
	}
}
