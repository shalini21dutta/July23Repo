package pagerepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;

public class LogoutPage extends BaseClass{
	
	//static WebDriver driver=null;
	
	static By btnMyAccount=By.xpath("//*[@id=\"dropdown03\"]");
	static By lnkLogout=By.linkText("Logout");
	
	public static void clickMyAccountButton() {
		driver.findElement(btnMyAccount).click();
	}
	
	public static void clickLogoutButton() {
		driver.findElement(lnkLogout).click();
	}

}
