package pagerepo;

import org.openqa.selenium.By;

import businessfunctions.BaseClass;

public class UpdateProfilePage extends BaseClass{

		
		//static WebDriver driver = null;
		
	    static By lnkLogin=By.linkText("LOGIN");
		static By lnkMyAccount=By.linkText("MY ACCOUNT");
		static By lnkMyProfile=By.linkText("My Profile");
		static By txtFullname=By.id("UName");
		static By btnUpdateProfile=By.id("UBtn");
		static By lnkDashboard=By.linkText("Dashboard");
		 
		 	
		public static void clickLogin() {
			driver.findElement(lnkLogin).click();
			
		}
		
		public static void clickMyAccount(){
			driver.findElement(lnkMyAccount).click();
		}
		
		public static void clickMyProfile() {
			driver.findElement(lnkMyProfile).click();
		}
		
		public static void clearFullName() {
			driver.findElement(txtFullname).clear();
		}
		
		public static void enterFullName(String fullname) {
			driver.findElement(txtFullname).sendKeys(fullname);
		}
		
		public static void clickUpdateProfile() {
			driver.findElement(btnUpdateProfile).click();
		}
		
		public static void clickDashboard() {
			driver.findElement(lnkDashboard).click();
		}


	}


