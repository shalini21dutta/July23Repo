package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.LoginUtil;
import businessfunctions.UpdateProfileUtil;
import configuration.ConfigUtil;
import pagerepo.UpdateProfilePage;

public class UpdateProfileTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		driver.get("http://tanchan-001-site3.btempurl.com/production/login");
		
		BaseClass.openBrowser();
		
		
//		driver.findElement(By.name("LEmail")).sendKeys("shalini.ddutta@gmail.com");
//		driver.findElement(By.name("LPwd")).sendKeys("Monamona@123");
//		driver.findElement(By.xpath("//*[@id=\"LBtn\"]")).click();
		
		LoginUtil.login(ConfigUtil.readProperty("email"), ConfigUtil.readProperty("pwd"));
		
		
//		driver.findElement(By.linkText("MY ACCOUNT")).click();
//		driver.findElement(By.linkText("My Profile")).click();
//		driver.findElement(By.id("UName")).clear();
//		
//		driver.findElement(By.id("UName")).sendKeys("Shalini Dutta");
//		driver.findElement(By.id("UBtn")).click();
//		driver.findElement(By.linkText("MY ACCOUNT")).click();
//		driver.findElement(By.linkText("Dashboard")).click();
		
//		UpdateProfilePage.clickMyAccount();
//		UpdateProfilePage.clickMyProfile();
//		UpdateProfilePage.clearFullName();
//		UpdateProfilePage.enterFullName("Shalini D");
//		UpdateProfilePage.clickUpdateProfile();
//		UpdateProfilePage.clickMyAccount();
//		UpdateProfilePage.clickDashboard();
		
		UpdateProfileUtil.updateProfile("Shalini D");

	}

}
