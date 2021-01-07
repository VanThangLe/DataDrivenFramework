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
		
		//Đăng nhập
		Utility.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Login");
		processingMission.enterUsername(Utility.getCellData(1, 1));
		processingMission.enterPassword(Utility.getCellData(1, 2));
		Thread.sleep(2000);
		processingMission.clickSignin();
		Thread.sleep(3000);
		
		//Tạo nhiệm vụ
		processingMission.clickButtonCreateMission();
		processingMission.clickMissionType();
		processingMission.selectMissionType();
		Utility.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"CreateMission");
		processingMission.inputFollowingContent(Utility.getCellData(1, 0));
		processingMission.clickProcessingTerm();
		processingMission.selectProcessingTerm(Utility.getCellData(1, 1));
		Thread.sleep(4000);
		processingMission.clickSaveAndClose();
		Thread.sleep(3000);
		
		//Phân xử lý
		processingMission.clickHandlingMission();
		Thread.sleep(2000);
		processingMission.selectHost();
		Thread.sleep(2000);
		processingMission.selectCoop();
		Thread.sleep(2000);
		processingMission.clickHandling();
		
	}
}
