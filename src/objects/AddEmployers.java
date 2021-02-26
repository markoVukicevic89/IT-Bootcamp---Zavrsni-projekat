package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployers {
	private static final String STAFF_CLICK = "//*[@id=\"sn_staff\"]/span";
	private static final String ADD_BTN = "//*[@id=\"act_primary\"]";
	private static final String INPUT_FNAME = "//*[@id=\"_asf1\"]";
	private static final String INPUT_LNAME = "//*[@id=\"_asl1\"]";
	private static final String INPUT_EMAIL = "//*[@id=\"_ase1\"]";
	private static final String SAVE_BTN = "//*[@id=\"_as_save_multiple\"]";
	
	public static void staffClick(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_CLICK)).click();
	}
	public static void addBtn(WebDriver driver) {
		driver.findElement(By.xpath(ADD_BTN)).click();
	}
	public static void inputFname(WebDriver driver, String fname) {
		driver.findElement(By.xpath(INPUT_FNAME)).sendKeys(fname);
	}
	public static void inputLname(WebDriver driver, String lname) {
		driver.findElement(By.xpath(INPUT_LNAME)).sendKeys(lname);
	}
	public static void inputEmail(WebDriver driver, String email) {
		driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
	}
	public static void saveBtn(WebDriver driver) {
		driver.findElement(By.xpath(SAVE_BTN)).click();
	}
}
