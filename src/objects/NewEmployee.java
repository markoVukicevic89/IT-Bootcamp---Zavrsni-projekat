package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewEmployee {
	private static final String STAFF = "//*[@id=\"sn_staff\"]/span";
	private static final String ADD_EMP_XPATH = "//*[@id=\"act_primary\"]";
	private static final String FIRST_NAME_INPUT = "//*[@id=\"_asf1\"]";
	private static final String LAST_NAME_INPUT = "//*[@id=\"_asl1\"]";
	private static final String EMAIL_INPUT = "//*[@id=\"_ase1\"]";
	private static final String SAVE_BTN = "//*[@id=\"_as_save_multiple\"]";
	

	
	public static void staff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF)).click();
	}
	
	public static void addEmp(WebDriver driver) {
		driver.findElement(By.xpath(ADD_EMP_XPATH)).click();
	}
	
	public static void inputFirstName(WebDriver driver, String firstName) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement input_fname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FIRST_NAME_INPUT)));
		input_fname.sendKeys(firstName);
	}
	public static void inputLastName(WebDriver driver, String lastName) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement input_lname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LAST_NAME_INPUT)));
		input_lname.sendKeys(lastName);
	}
	public static void inputEmail(WebDriver driver, String email) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EMAIL_INPUT)));
		inputEmail.sendKeys(email);
	}
	public static void saveBtn(WebDriver driver) {
		WebElement save = driver.findElement(By.xpath(SAVE_BTN));
		save.click();
	}

}
