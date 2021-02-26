package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import objects.Buttons;
import objects.Login;

public class ButtonsTest {
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority = 1)
	public void testShiftBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Login.pressAdvClose(driver);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressShiftPlanning(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/schedule/employee/week/overview/overview/23%2c1%2c2021/";
		
		Assert.assertEquals(actual, expected);
		
}
	@Test (priority = 2)
	public void testTimeClockBtn() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		Buttons.pressTimeClock(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/timeclock/";
		
		Assert.assertEquals(actual, expected);
}
	@Test (priority = 3)
	public void testLeaveBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressLeave(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/requests/vacation/";
		
		Assert.assertEquals(actual, expected);
}	

	@Test (priority = 4)
	public void testTrainingBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressTraining(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/training/";
		
		Assert.assertEquals(actual, expected);
}	
	@Test (priority = 5)
	public void testStaffBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressStaff(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/staff/list/load/true/";
		
		Assert.assertEquals(actual, expected);
}	
	@Test (priority = 6)
	public void testAvailabillityBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressAvailabillity(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/fe/availability/#/requests/week/2021-02-21/1";
		
		Assert.assertEquals(actual, expected);
				
}	
	@Test (priority = 7)
	public void testPayrollBtn() throws InterruptedException {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		Thread.sleep(4000);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressPayroll(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/payroll/scheduled-hours/";
		
		Assert.assertEquals(actual, expected);
}	
	@Test (priority = 8)
	public void testReportBtn() {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		
		driver.navigate().to(Buttons.URL);
		Buttons.pressReports(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/reports/dashboard/";
		
		Assert.assertEquals(actual, expected);
}	
}	
	
	
	
	
	
	
	
	
	
	
	
	