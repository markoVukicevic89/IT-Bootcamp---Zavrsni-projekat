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
import objects.NewEmployee;

public class NewEmployeeTest {
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
		@Test 
		public void addNewEmployeeTest() throws InterruptedException {
			driver.navigate().to(Login.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Login.pressAdvClose(driver);
			Login.pressLogin(driver);
			Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
			Login.inputLogPass(driver, "testsite123");
			Login.pressLogBtn(driver);
			
			NewEmployee.staff(driver);
			Thread.sleep(4000);
			NewEmployee.addEmp(driver);
			Thread.sleep(4000);
			NewEmployee.inputFirstName(driver, "steva");
			NewEmployee.inputLastName(driver, "stevic");
			NewEmployee.inputEmail(driver, "steva@hmail.com");
			NewEmployee.saveBtn(driver);
			
			String actual = driver.getCurrentUrl();
			String expected = "https://ittest1.humanity.com/app/staff/edit/6081178/";
			
			Assert.assertEquals(actual, expected);
}
}