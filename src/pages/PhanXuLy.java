package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import common.Utility;

public class PhanXuLy {
	
	WebDriver driver;
	
	public PhanXuLy(WebDriver driver) {
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
	
	public void inputFollowingContent() throws Exception {
		driver.findElement(By.xpath("following_content_xpath")).sendKeys();
	}
	
	public void selectProcessingTerm() throws Exception {
		Select processingTerm = new Select(driver.findElement(By.xpath("processing_term_xpath")));
		processingTerm.selectByValue("31");
	}
	
	public void clickSaveAndClose() {
		driver.findElement(By.xpath("//div[@class='tao-nhiem-vu-top']//button[contains(text(), 'Lưu và đóng')]")).click();
	}
	
	public void clickHandingMission() {
		
	}
}
