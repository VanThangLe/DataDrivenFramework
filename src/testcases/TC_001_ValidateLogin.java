package testcases;

import org.testng.annotations.Test;

import common.DriverInstance;
import common.Utility;
import pages.LoginPage;

public class TC_001_ValidateLogin extends DriverInstance{
	
	@Test
	public void tc_001_Login_Functionality() throws Exception{
		LoginPage login = new LoginPage(driver);
		login.enterUsername(Utility.getCellData(0, 1));
		login.enterPassword(Utility.getCellData(1, 1));
		login.clickSignin();
		Thread.sleep(3000);
		login.clickAccount();
		login.clickSignOut();
	}
}
