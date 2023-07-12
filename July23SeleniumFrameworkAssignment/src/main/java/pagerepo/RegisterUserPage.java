package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;

public class RegisterUserPage extends BaseClass{
	
	//static WebDriver driver=null;
	
	static By lnkLogin=By.linkText("LOGIN");
	static By txtEmail=By.name("REmail");
	static By txtPassword=By.name("RPwd");
	static By txtFullName=By.name("RName");
	static By txtMobileNo=By.name("RMobile");
	static By radioBtnGender=By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[2]/label");
	static By txtBirthDate=By.name("RDob");
	static By txtDoorNo=By.name("RAddress_1");
	static By txtLocation=By.name("RAddress_2");
	static By txtCity=By.id("RCity");
	static By txtState=By.id("RState");
	static By txtZipCode=By.id("RZip");
	static By btnRegister=By.id("RBtn");
	
	public static void clickLogin() {
		driver.findElement(lnkLogin).click();
		
	}
	
	public static void enterEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
		
	}
	
	public static void enterPassword(String pwd) {
		driver.findElement(txtPassword).sendKeys(pwd);
		
	}
	
	public static void enterFullName(String fullname) {
		driver.findElement(txtFullName).sendKeys(fullname);
		
	}
	
	public static void enterMobileNo(String mobileNo) {
		driver.findElement(txtMobileNo).sendKeys(mobileNo);
		
	}
	
	public static void selectGender() {
		driver.findElement(radioBtnGender).click();
		
	}
	
	public static void enterBirthDate(String birthDate) {
		driver.findElement(txtBirthDate).sendKeys(birthDate);
		
	}
	
	public static void enterDoorNo(String doorNo) {
		driver.findElement(txtDoorNo).sendKeys(doorNo);
		
	}
	
	public static void enterLocation(String location) {
		driver.findElement(txtLocation).sendKeys(location);
		
	}
	
	public static void enterCity(String city) {
		driver.findElement(txtCity).sendKeys(city);
		
	}
	
	public static void enterState(String state) {
		driver.findElement(txtState).sendKeys(state);
		
	}
	
	public static void enterZipCode(String zipCode) {
		driver.findElement(txtZipCode).sendKeys(zipCode);
		
	}
	
	public static void clickRegisterButton() {
		driver.findElement(btnRegister).click();
		
	}
	

}
