package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	private static final String PROFILE = "//*[@id=\"wrap_us_menu\"]";
	private static final String SETTINGS = "//*[@id=\"userm\"]/div/a[2]";
	private static final String MONTHLY_HOURS = "//*[@id=\"monthly_undertime\"]";
	private static final String PAY_TYPE = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[18]/td[2]/select";
	private static final String SAVE = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void pressProfile(WebDriver driver) {
		driver.findElement(By.xpath(PROFILE)).click();
	}
	public static void pressSettings(WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS)).click();
	}
	public static void selectMohntlyHours(WebDriver driver, String select) {
		driver.findElement(By.xpath(MONTHLY_HOURS)).sendKeys(select);
	}
	public static void selectPayType(WebDriver driver, String select2) {
		driver.findElement(By.xpath(PAY_TYPE)).sendKeys(select2);
	}
	public static void saveChanges(WebDriver driver) {
		driver.findElement(By.xpath(SAVE)).click();
	}
}
