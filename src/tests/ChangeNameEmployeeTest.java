package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.ChangeNameEmployee;
import objects.Login;

public class ChangeNameEmployeeTest {
public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
		@Test 
		public void changeNameTest() throws InterruptedException {
			driver.navigate().to(Login.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Login.pressAdvClose(driver);
			Login.pressLogin(driver);
			Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
			Login.inputLogPass(driver, "testsite123");
			Login.pressLogBtn(driver);
			
			ChangeNameEmployee.clickStaff(driver);
			ChangeNameEmployee.clickOnSteva(driver);
			ChangeNameEmployee.clickOnChange(driver);
			Thread.sleep(4000);
			ChangeNameEmployee.inputFname(driver, "Milos");
			ChangeNameEmployee.inputLname(driver, "Misic");
			ChangeNameEmployee.saveBtn(driver);
			
			String actual = driver.getCurrentUrl();
			String expected = "https://ittest1.humanity.com/app/staff/edit/6090292/";
			
			Assert.assertEquals(actual, expected);
}
}