package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Utility;

public class ProcessingMission {

	WebDriver driver;

	// Init
	public ProcessingMission(WebDriver driver) {
		this.driver = driver;
	}

	// Nhập Username
	public void enterUsername(String username) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_username_xpath"))).sendKeys(username);
	}

	// Nhập Password
	public void enterPassword(String password) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_password_xpath"))).sendKeys(password);
	}

	// Click Đăng Nhập
	public void clickSignin() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("login_signin_xpath"))).click();
	}

	// Click Button Tạo mới
	public void clickButtonCreateMission() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("button_create_mission_xpath"))).click();
	}

	// Click Dropdown Loại Nhiệm Vụ
	public void clickMissionType() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("mission_type_xpath"))).click();
	}

	// Chọn Nhiệm Vụ Bộ
	public void selectMissionType() throws Exception {
		driver.findElement(By.xpath("//span[text()='Nhiệm vụ Bộ']")).click();
	}

	// Nhập Nội Dung Theo Dõi
	public void inputFollowingContent(String content) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("following_content_xpath"))).sendKeys(content);
	}

	// Chọn Hạn Xử Lý
	public void clickProcessingTerm() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("processing_term_xpath"))).click();
	}

	// Chọn Hạn Xử Lý
	public void selectProcessingTerm(String dateTerm) throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("processing_term_xpath"))).sendKeys(dateTerm);
	}

	// Click Lưu và Đóng
	public void clickSaveAndClose() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("button_save_and_close_xpath"))).click();
	}

	// Click Icon Phân Xử Lý
	public void clickHandlingMission() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("icon_handling_xpath"))).click();
	}

	// Chọn Chủ Trì
	public void selectHost() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("checkbox_host_xpath"))).click();
	}

	// Chọn Phối Hợp
	public void selectCoop() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("checkbox_coop_xpath"))).click();
	}

	// Click Button Phân Xử Lý
	public void clickHandling() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("button_handling_xpath"))).click();
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
