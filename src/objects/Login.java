package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static final String URL = "https://www.humanity.com/";
	private static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	private static final String LOG_EMAIL_XPATH = "//*[@id=\"email\"]";
	private static final String LOG_PASS_XPATH = "//*[@id=\"password\"]";
	private static final String LOG_BTN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	private static final String ADD_CLOSE = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	
	public static void pressLogin(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN_XPATH)).click();
	}
	public static void inputLogEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(LOG_EMAIL_XPATH)).sendKeys(email);
	}
	public static void inputLogPass(WebDriver driver, String password) {
		driver.findElement(By.xpath(LOG_PASS_XPATH)).sendKeys(password);
	}
	public static void pressLogBtn(WebDriver driver) {
		driver.findElement(By.xpath(LOG_BTN_XPATH)).click();
	}
	public static void pressAdvClose(WebDriver driver) {
		driver.findElement(By.xpath(ADD_CLOSE)).click();
	}
}
