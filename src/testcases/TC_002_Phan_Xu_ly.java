package testcases;

import org.testng.annotations.Test;

import common.DriverInstance;
import pages.ProcessingMission;

public class TC_002_Phan_Xu_ly extends DriverInstance {
	
	@Test(dataProvider = "testData")
	public void tc_002_Phan_Xu_Ly(String username, String password) throws Exception {
		ProcessingMission processingMission = new ProcessingMission(driver);
		processingMission.enterUsername(username);
		processingMission.enterPassword(password);
		processingMission.clickSignin();
	}
}
