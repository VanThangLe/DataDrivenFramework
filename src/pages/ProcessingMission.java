package pages;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.Utility;

public class ProcessingMission {
	
	WebDriver driver;
	
	public ProcessingMission(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_username_xpath"))).sendKeys(username);
	}
	
	public void enterPassword(String password) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_password_xpath"))).sendKeys(password);
	}
	
	public void clickSignin() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
	}
	
	public void clickButtonCreateMission() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("button_create_mission_xpath"))).click();
	}
	
	public void selectMissionType() throws Exception {
		Select missionType = new Select(driver.findElement(By.xpath("//input[@placeholder='Chọn loại nhiệm vụ']")));
		missionType.selectByValue("Nhiệm vụ Bộ");
	}
	
	public void inputFollowingContent(String content) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("following_content_xpath"))).sendKeys(content);
	}
	
	public void selectProcessingTerm() throws Exception {
		Select processingTerm = new Select(driver.findElement(By.xpath("processing_term_xpath")));
		processingTerm.selectByValue("31");
	}
	
	public void clickSaveAndClose() throws Exception {
		driver.findElement(By.xpath("//div[@class='tao-nhiem-vu-top']//button[contains(text(), 'Lưu và đóng')]")).click();
	}
	
	public void clickHandingMission() throws Exception {
		//List<WebElement> elementsIcons = driver.findElements(By.xpath(""));
		//for(WebElement e: elementsIcons) {
			
		//}
	}
	
	public void selectHanderMission() throws Exception {
		
	}
	
	public void clickHandling() throws Exception {
		driver.findElement(By.xpath("button_handing_xpath")).click();
	}
}
