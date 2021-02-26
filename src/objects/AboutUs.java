package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class AboutUs {
	public static final String URL = "https://www.humanity.com/";
	private static final String ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/a";
	private static final String ABOUT_US_CLICK = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a";
	
	public static void pressAboutUs (WebDriver driver) {
		driver.findElement(By.xpath(ABOUT_US_XPATH)).click();
	}
	public static void clickAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(ABOUT_US_CLICK)).click();
	}
	public static void captureScreenShot(WebDriver driver, String obj) throws IOException {
		String yourfilepath = "C:\\Screenshot\\screenshot.png";

		// Take a snapshort
		File snapshort_file = ((TakesScreenshot) driver)
		        .getScreenshotAs(OutputType.FILE);
		// Copy the file into folder

		FileUtils.copyFile(snapshort_file, new File(yourfilepath));
	}
}