package businessfunctions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.ConfigUtil;
import pagerepo.LogoutPage;

public class BaseClass {
	
	public static WebDriver driver= null;
	
	public static void openBrowser() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get(ConfigUtil.readProperty("url"));
	}
	
	public static void closeBrowser() {
		LogoutPage.clickMyAccountButton();
		LogoutPage.clickLogoutButton();
		
	}
	

}
