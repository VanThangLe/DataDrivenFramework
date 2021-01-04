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
	
	public void inputContent() throws Exception {
		driver.findElement(By.xpath("")).sendKeys();
	}
	
	public void selectCalendar() throws Exception {
		driver.findElement(By.xpath(""))
	}
}
