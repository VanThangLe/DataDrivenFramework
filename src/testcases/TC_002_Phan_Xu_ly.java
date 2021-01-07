package testcases;

import org.testng.annotations.Test;

import common.Constant;
import common.DriverInstance;
import common.Utility;
import pages.ProcessingMission;

public class TC_002_Phan_Xu_ly extends DriverInstance {
	
	@Test
	public void tc_002_Phan_Xu_Ly() throws Exception {
		ProcessingMission processingMission = new ProcessingMission(driver);
		Utility.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Login");
		processingMission.enterUsername(Utility.getCellData(1, 1));
		processingMission.enterPassword(Utility.getCellData(1, 2));
		processingMission.clickSignin();
		Thread.sleep(6000);
		processingMission.clickButtonCreateMission();
		//processingMission.clickMissionType();
		//processingMission.selectMissionType();
		//Utility.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Data");
		//processingMission.inputFollowingContent(Utility.getCellData(1, 0));
		//processingMission.clickProcessingTerm();
		//processingMission.selectProcessingTerm(Utility.getCellData(1, 1));
		Thread.sleep(5000);
		processingMission.clickSaveAndClose();
		Thread.sleep(8000);
		//processingMission.clickHandlingMission();
		//processingMission.selectHandlerMission();
		//processingMission.clickHandling();
		
	}
}
