package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartFreeTrial1 {
	public static final String URL = "https://www.humanity.com/";
	private static final String FULL_NAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String EMAIL_XPATH = "//*[@id=\"top-form\"]/div/div[2]/input";
	private static final String BTN_XPATH = "//*[@id=\"free-trial-link-01\"]";
	
	public static void inputFullName(WebDriver driver, String username) {
		driver.findElement(By.xpath(FULL_NAME_XPATH)).sendKeys(username);
	}
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(EMAIL_XPATH)).sendKeys(email);
	}
	public static void pressBtn(WebDriver driver) {
		driver.findElement(By.xpath(BTN_XPATH)).click();
	}
}
