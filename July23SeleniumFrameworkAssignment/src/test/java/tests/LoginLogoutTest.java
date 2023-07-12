package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.LoginUtil;
import configuration.ConfigUtil;
import pagerepo.LoginPage;
import pagerepo.LogoutPage;
import utilityfunctions.ExcelUtil;

public class LoginLogoutTest extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		driver.get("http://tanchan-001-site3.btempurl.com/production/login");
		
		//BaseClass.openBrowser();
		
//		driver.findElement(By.name("LEmail")).sendKeys("shalini.ddutta@gmail.com");
//		driver.findElement(By.name("LPwd")).sendKeys("Monamona@123");
//		driver.findElement(By.xpath("//*[@id=\"LBtn\"]")).click();
		
//		LoginPage.enterEmail("shalini.ddutta@gmail.com");
//		LoginPage.enterPassword("Monamona@123");
//		LoginPage.clickLoginButton();
		
		
		int rcount=ExcelUtil.getNoOfRows();
		BaseClass.openBrowser();
		for(int i=1;i<rcount;i++) {
			//BaseClass.openBrowser();
			//LoginUtil.login(ConfigUtil.readProperty("email"), ConfigUtil.readProperty("pwd"));
		LoginUtil.login(ExcelUtil.getCellData(i, 0), ExcelUtil.getCellData(i, 1));
		BaseClass.closeBrowser();
		}
		
//		driver.findElement(By.xpath("//*[@id=\"dropdown03\"]")).click();
//		driver.findElement(By.linkText("Logout")).click();
		
//		LogoutPage.clickMyAccountButton();
//		LogoutPage.clickLogoutButton();
		
		//BaseClass.closeBrowser();
		
		driver.quit();

	}

}
