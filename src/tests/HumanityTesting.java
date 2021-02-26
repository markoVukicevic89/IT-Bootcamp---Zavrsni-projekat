package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.AboutUs;
import objects.Buttons;
import objects.Login;
import objects.StartFreeTrial1;
import objects.StartFreeTrial2;

public class HumanityTesting {
	public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	@Test (priority = 1)
	public void testFreeTrial1() {
		driver.navigate().to(StartFreeTrial1.URL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Login.pressAdvClose(driver);
		StartFreeTrial1.inputFullName(driver, "Zika Zikic");
		StartFreeTrial1.inputEmail(driver, "kamupunech@wemel.top");
		StartFreeTrial1.pressBtn(driver);
		
		driver.manage().window().maximize();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/";
		
		Assert.assertEquals(actual, expected);
		
	}
	@Test (priority = 2)
	public void testFreeTrial2() {
		driver.navigate().to(StartFreeTrial2.URL);
		StartFreeTrial2.pressBtn1(driver);
		StartFreeTrial2.inputName(driver, "Marija Maric");
		StartFreeTrial2.inputWorkEmail(driver, "kamupunech1@wemel.top");
		StartFreeTrial2.pressBtn2(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/";
		
		Assert.assertEquals(actual, expected);
		
	}
	@Test (priority = 3)
	public void testAboutUs() throws IOException  {
		driver.navigate().to(AboutUs.URL);
		AboutUs.pressAboutUs(driver);
		AboutUs.clickAboutUs(driver);
		AboutUs.captureScreenShot(driver, "C:\\Screenshot\\screenshot.png");
		
		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/about";
		
		Assert.assertEquals(actual, expected);
	}
	
	@Test (priority = 4)
	public void testLogin() {
		driver.navigate().to(Login.URL);
		Login.pressLogin(driver);
		Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
		Login.inputLogPass(driver, "testsite123");
		Login.pressLogBtn(driver);
		
		String actual = driver.getCurrentUrl();
		String expected = "https://ittest1.humanity.com/app/dashboard/";
		
		Assert.assertEquals(actual, expected);
	}
	
	
}











