package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangeNameEmployee {
	private static final String CLICK_STAFF = "//*[@id=\"sn_staff\"]/span";
	private static final String CLICK_ON_STEVA = "//*[@id=\"7\"]/a";
	private static final String CLICK_ON_CHANGE = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	private static final String INPUT_FNAME = "//*[@id=\"first_name\"]";
	private static final String INPUT_LNAME = "//*[@id=\"last_name\"]";
	private static final String SAVE = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	
	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_STAFF)).click();
	}
	
	public static void clickOnSteva(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_ON_STEVA)).click();
	}
	public static void clickOnChange(WebDriver driver) {
		driver.findElement(By.xpath(CLICK_ON_CHANGE)).click();
	}
	public static void inputFname(WebDriver driver, String firstName) {
		WebElement we = driver.findElement(By.xpath(INPUT_FNAME));
		we.clear();
		we.sendKeys(firstName);
	}
	public static void inputLname(WebDriver driver, String lastName) {
		WebElement we = driver.findElement(By.xpath(INPUT_LNAME));
		we.clear();
		we.sendKeys(lastName);
	}
	public static void saveBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVE)).click();
	}
}
