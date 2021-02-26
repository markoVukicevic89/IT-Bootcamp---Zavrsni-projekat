package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buttons {
	public static final String URL = "https://ittest1.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span";
	private static final String SHIFTPLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span/p";
	private static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span";
	private static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span";
	private static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	private static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	private static final String AVAILABILLITY_XPATH = "//*[@id=\"sn_availability\"]/span";
	private static final String PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span";
	private static final String REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span";
	
	public static void pressShiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(SHIFTPLANNING_XPATH)).click();
	}
	public static void pressTimeClock(WebDriver driver) {
		driver.findElement(By.xpath(TIME_CLOCK_XPATH)).click();
	}
	public static void pressLeave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE_XPATH)).click();
	}
	public static void pressTraining(WebDriver driver) {
		driver.findElement(By.xpath(TRAINING_XPATH)).click();
	}
	public static void pressStaff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF_XPATH)).click();
	}
	public static void pressAvailabillity(WebDriver driver) {
		driver.findElement(By.xpath(AVAILABILLITY_XPATH)).click();
	}
	public static void pressPayroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL_XPATH)).click();
	}
	public static void pressReports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS_XPATH)).click();
	}
	public static void pressDashboard(WebDriver driver) {
		driver.findElement(By.xpath(DASHBOARD_XPATH)).click();
	}
}
