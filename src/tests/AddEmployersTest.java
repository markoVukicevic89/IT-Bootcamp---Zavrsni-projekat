package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.AddEmployers;
import objects.Login;

public class AddEmployersTest {
public static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void addEmployersTest() throws InterruptedException {
		File f = new File("employers.xlsx"); // Ucitavanje fajla
		try {
			InputStream inp = new FileInputStream(f); // Citanje iz fajla
			XSSFWorkbook wb = new XSSFWorkbook(inp); // Pretvaranje fajla u odgovarajuci format
			Sheet sheet = wb.getSheetAt(0); // Dohvata sheet
			
			SoftAssert sa = new SoftAssert();
			
			driver.navigate().to(Login.URL);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Login.pressAdvClose(driver);
			Login.pressLogin(driver);
			Login.inputLogEmail(driver, "gerofa8339@bulkbye.com");
			Login.inputLogPass(driver, "testsite123");
			Login.pressLogBtn(driver);
			Thread.sleep(4000);
			
			for (int i = 0; i < 5; i++) {
				
				Row row = sheet.getRow(i);
				
				Cell c1 = row.getCell(0);
				Cell c2 = row.getCell(1);
				Cell c3 = row.getCell(2);
				
				String fname = c1.toString();
				String lname = c2.toString();
				String email = c3.toString();
		
		
		
		
		
		AddEmployers.staffClick(driver);
		Thread.sleep(4000);
		AddEmployers.addBtn(driver);
		Thread.sleep(4000);
		AddEmployers.inputFname(driver, fname);
		AddEmployers.inputLname(driver, lname);
		AddEmployers.inputEmail(driver, email);
		AddEmployers.saveBtn(driver);
	}
			sa.assertAll();
			
			wb.close();
			
}	catch (IOException e) {
	System.out.println("Nije pronadjen fajl!");
	e.printStackTrace();
}
}
}