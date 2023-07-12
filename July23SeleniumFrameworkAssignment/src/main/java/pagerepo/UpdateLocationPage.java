package pagerepo;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class UpdateLocationPage extends BaseClass{
	
	static By lnkLogin=By.linkText("LOGIN");
	static By locationIcon=By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[4]/a");
	static By txtZipcode=By.id("mdzip");
	static By btnSubmit=By.xpath("//*[@id=\"MDZBtn\"]");
	
	public static void clickLogin() {
		driver.findElement(lnkLogin).click();
		
	}
	
	public static void clickLocationIcon() {
		driver.findElement(locationIcon).click();
	}
	
	public static void enterZipCode(String zipcode) {
		driver.findElement(txtZipcode).sendKeys(zipcode);
	}
	
	public static void clickSubmitButton() {
		driver.findElement(btnSubmit).click();
	}

}
