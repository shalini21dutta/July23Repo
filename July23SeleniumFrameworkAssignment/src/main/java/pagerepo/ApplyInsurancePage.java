package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import businessfunctions.BaseClass;

public class ApplyInsurancePage extends BaseClass{
	
	static By lnkLogin=By.linkText("LOGIN");
	static By lnkInsurance=By.linkText("INSURANCE");
	static By lnkApplyInsurance=By.linkText("Apply Life Insurance");
	static By dropDownCoverageAmt=By.id("LQCoverage");
	static By txtBirthDate=By.id("LQDob");
	static By radioBtnGender=By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[2]/label");
	static By txtHeightFeet=By.id("LQHeightF");
	static By txtHeightInches=By.id("LQHeightI");
	static By txtWeight=By.id("LQWeight");
	static By btnGetInstantQuotes=By.id("LQBtn");
	
	public static void clickLogin() {
		driver.findElement(lnkLogin).click();
		
	}
	
	public static void clickInsurance() {
		driver.findElement(lnkInsurance).click();
	}
	
	public static void clickApplyInsurance() {
		driver.findElement(lnkApplyInsurance).click();
	}
	
	public static void clickCoverageAmount(String value) {
	//	driver.findElement(dropDownCoverageAmt).click();
		
		Select dropdown = new Select(driver.findElement(By.id("LQCoverage"))); 
		dropdown.selectByValue(value);
	}
	
	public static void enterBirthDate(String birthdate) {
		driver.findElement(txtBirthDate).sendKeys(birthdate);
	}
	
	public static void selectGender() {
		driver.findElement(radioBtnGender).click();
	}
	
	public static void enterHeightFeet(String heightFeet) {
		driver.findElement(txtHeightFeet).sendKeys(heightFeet);
	}
	
	public static void enterHeightInches(String heightInch) {
		driver.findElement(txtHeightInches).sendKeys(heightInch);
	}
	
	public static void enterWeightLbs(String weight) {
		driver.findElement(txtWeight).sendKeys(weight);
	}
	
	public static void clickGetInstantQuotes() {
		driver.findElement(btnGetInstantQuotes).click();
	}
	
	

}
