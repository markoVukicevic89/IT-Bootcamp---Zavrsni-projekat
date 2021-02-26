package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AddPhotoEmployer;
import objects.Login;

public class AddPhotoTest {
public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
		@Test 
		public void addPhoto() throws InterruptedException {
			driver.navigate().to(Login.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Login.pressAdvClose(driver);
			Login.pressLogin(driver);
			Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
			Login.inputLogPass(driver, "testsite123");
			Login.pressLogBtn(driver);
			
			Thread.sleep(4000);
			AddPhotoEmployer.clickStaff(driver);
			AddPhotoEmployer.clickZika(driver);
			AddPhotoEmployer.clickChange(driver);
			Thread.sleep(4000);
			AddPhotoEmployer.addPhoto(driver);
			AddPhotoEmployer.saveBtn(driver);
			
			String actual = driver.getCurrentUrl();
			String expected = "https://ittest1.humanity.com/app/staff/edit/6090291/";
			
			Assert.assertEquals(actual, expected);
}
}