package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

	public void clickMissionType() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("mission_type_xpath"))).click();
	}
	
	public void selectMissionType() throws Exception {
		driver.findElement(By.xpath("//span[text()='Nhiệm vụ Bộ']")).click();
	}

	public void inputFollowingContent(String content) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("following_content_xpath"))).sendKeys(content);
	}

	public void selectProcessingTerm() throws Exception {
		Select processingTerm = new Select(driver.findElement(By.xpath("processing_term_xpath")));
		processingTerm.selectByValue("31");
	}

	public void clickSaveAndClose() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("button_save_and_close_xpath"))).click();
	}

	public void clickHandlingMission() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("icon_handling_xpath"))).click();
	}

	public void selectHandlerMission() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue(""))).click();
	}

	public void clickHandling() throws Exception {
		driver.findElement(By.xpath("button_handling_xpath")).click();
	}

	// Validate page URL
	public static boolean validatePageURL(WebDriver driver, String expectedURL) {
		boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expectedURL)) {
			flag = true;
		}
		return flag;
	}

	// Validate page title
	public static boolean validatePageTitle(WebDriver driver, String expectedTitle) {
		boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			flag = true;
		}
		return flag;
	}
}
