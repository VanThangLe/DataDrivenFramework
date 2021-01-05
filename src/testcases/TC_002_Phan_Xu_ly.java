package testcases;

import org.testng.annotations.Test;

import common.DriverInstance;
import common.Utility;
import pages.ProcessingMission;

public class TC_002_Phan_Xu_ly extends DriverInstance {
	
	@Test
	public void tc_002_Phan_Xu_Ly() throws Exception {
		ProcessingMission processingMission = new ProcessingMission(driver);
		processingMission.enterUsername(Utility.getCellData(1, 1));
		processingMission.enterPassword(Utility.getCellData(1, 2));
		processingMission.clickSignin();
		Thread.sleep(3000);
		processingMission.clickButtonCreateMission();
		processingMission.selectMissionType();
		processingMission.inputFollowingContent("Hệ thống quản lý nhiệm vụ và hồ sơ công việc");
		processingMission.selectProcessingTerm();
	}
}
