package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Utility;

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
}
