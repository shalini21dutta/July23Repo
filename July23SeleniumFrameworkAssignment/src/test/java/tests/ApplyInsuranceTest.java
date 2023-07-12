package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import businessfunctions.ApplyInsuranceUtil;
import businessfunctions.BaseClass;
import businessfunctions.LoginUtil;
import configuration.ConfigUtil;
import pagerepo.ApplyInsurancePage;

public class ApplyInsuranceTest extends BaseClass {

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
		
//		driver.findElement(By.linkText("INSURANCE")).click();
//		driver.findElement(By.linkText("Apply Life Insurance")).click();
//		
//		Select dropdown = new Select(driver.findElement(By.id("LQCoverage"))); 
//		dropdown.selectByValue("10000");
//		
//		driver.findElement(By.id("LQDob")).sendKeys("10/20/1990");
//		driver.findElement(By.xpath("//*[@id=\"LQForm\"]/div[3]/div[1]/div[2]/label")).click();
//		driver.findElement(By.id("LQHeightF")).sendKeys("5");
//		driver.findElement(By.id("LQHeightI")).sendKeys("3");
//		driver.findElement(By.id("LQWeight")).sendKeys("143");
//		driver.findElement(By.id("LQBtn")).click();
		
//		ApplyInsurancePage.clickInsurance();
//		ApplyInsurancePage.clickApplyInsurance();
//		
//		ApplyInsurancePage.clickCoverageAmount("10000");
//		ApplyInsurancePage.enterBirthDate("09/20/1990");
//		ApplyInsurancePage.selectGender();
//		ApplyInsurancePage.enterHeightFeet("5");
//		ApplyInsurancePage.enterHeightInches("3");
//		ApplyInsurancePage.enterWeightLbs("143");
//		ApplyInsurancePage.clickGetInstantQuotes();
		
		ApplyInsuranceUtil.applyInsurance("10000", "09/20/1990", "5", "3", "143");

	}

}
