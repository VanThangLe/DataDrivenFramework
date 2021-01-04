package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Utility;

public class DriverInstance {
	
	public WebDriver driver;

	@BeforeMethod
	public void initiateDriverInstance() throws Exception {
		System.setProperty("webdriver.chrome.driver",
		System.getProperty("user.dir") + "/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
		
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		driver.quit();
	}
}
