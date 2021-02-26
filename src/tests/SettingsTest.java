package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Login;
import objects.Settings;

public class SettingsTest {
public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testSettings() throws InterruptedException {
		driver.navigate().to(Login.URL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Login.pressAdvClose(driver);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		Settings.pressSettings(driver);
		Settings.selectLanguage(driver, "Serbian");
		Settings.emailNotif(driver);
		Settings.smsNotif(driver);
		Settings.mobileNotif(driver);
		Settings.saveSettings(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/admin/settings/";
		
		Assert.assertEquals(actual, expected);

	}
}
