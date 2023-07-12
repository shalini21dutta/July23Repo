package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;

public class LoginPage extends BaseClass {
	
	//static WebDriver driver=null;
	
	static By lnkLogin=By.linkText("LOGIN");
	static By txtEmail=By.name("LEmail");
	static By txtPwd=By.name("LPwd");
	static By btnLogin=By.id("LBtn");
	
	public static void clickLogin() {
		driver.findElement(lnkLogin).click();
		
	}
	
	public static void enterEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
		
	}
	
	public static void enterPassword(String pwd) {
		driver.findElement(txtPwd).sendKeys(pwd);
	}
	
	public static void clickLoginButton() {
		driver.findElement(btnLogin).click();
	}

}
