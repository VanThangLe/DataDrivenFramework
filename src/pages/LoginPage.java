package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Utility;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
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

	public String checkURL() {
		return driver.getCurrentUrl();
	}

	public String checkTitle() {
		return driver.getTitle();
	}
	
	public void clickAccount() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue("account_xpath"))).click();
	}
	
	public void clickSignOut() throws Exception {
		driver.findElement(By.xpath(Utility.fetchLocatorValue(""))).click();
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
