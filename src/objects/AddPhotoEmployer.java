package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddPhotoEmployer {
	private static final String CLICK_STAFF = "//*[@id=\"sn_staff\"]/span";
	private static final String CLICK_ON_ZIKA = "//*[@id=\"7\"]/a";
	private static final String CLICK_CHANGE = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String ADD_PHOTO = "//*[@id=\"in-btn\"]";
	private static final String SAVE_BTN = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_STAFF)).click();
	}
	public static void clickZika(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_ON_ZIKA)).click();
	}
	public static void clickChange(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_CHANGE)).click();
	}
	public static void addPhoto(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ADD_PHOTO));
		we.sendKeys("C:\\Screenshot\\photo.jpg");
	}
	public static void saveBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_BTN)).click();
	}
}
