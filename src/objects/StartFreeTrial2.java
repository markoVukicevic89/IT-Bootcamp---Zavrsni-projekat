package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartFreeTrial2 {
	public static final String URL = "https://www.humanity.com/";
	private static final String BTN1_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[3]";
	private static final String NAME_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String WORK_EMAIL_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String BTN2_XPATH = "//*[@id=\"popup-free-trial-link\"]";
	
	public static void pressBtn1(WebDriver driver) {
		driver.findElement(By.xpath(BTN1_XPATH)).click();
	}
	public static void inputName(WebDriver driver, String name) {
		driver.findElement(By.xpath(NAME_XPATH)).sendKeys(name);
	}
	public static void inputWorkEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(WORK_EMAIL_XPATH)).sendKeys(email);
	}
	public static void pressBtn2(WebDriver driver) {
		driver.findElement(By.xpath(BTN2_XPATH)).click();
	}
}
