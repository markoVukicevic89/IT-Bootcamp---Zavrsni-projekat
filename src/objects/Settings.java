package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {
	public static final String URL = "https://ittest1.humanity.com/app/admin/settings/";
	private static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	private static final String SELECT_LANGUAGE = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	private static final String EMAIL_NOTIF = "//*[@id=\"pref_pref_email\"]";
	private static final String SMS_NOTIF = "//*[@id=\"pref_pref_sms\"]";
	private static final String MOBILE_NOTIF = "//*[@id=\"pref_pref_mobile_push\"]";
	private static final String SAVE_SETTINGS = "//*[@id=\"_save_settings_button\"]";
	
	public static void pressSettings(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS_XPATH)).click();
	}
	public static void selectLanguage(WebDriver driver, String name) {
		driver.findElement(By.xpath(SELECT_LANGUAGE)).sendKeys(name);
	}
	public static void emailNotif(WebDriver driver) {
		driver.findElement(By.xpath(EMAIL_NOTIF)).click();
	}
	public static void smsNotif(WebDriver driver) {
		driver.findElement(By.xpath(SMS_NOTIF)).click();
	}
	public static void mobileNotif(WebDriver driver) {
		driver.findElement(By.xpath(MOBILE_NOTIF)).click();
	}
	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS)).click();
	}
}
