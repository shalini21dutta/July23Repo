package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.UpdateLocationUtil;
import pagerepo.UpdateLocationPage;

public class UpdateLocationTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		driver.get("http://tanchan-001-site3.btempurl.com/production/login");
//		

		BaseClass.openBrowser();
		
//		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/ul/li[4]/a")).click();
//		driver.findElement(By.id("mdzip")).sendKeys("98050");
//		driver.findElement(By.xpath("//*[@id=\"MDZBtn\"]")).click();
		
//		UpdateLocationPage.clickLocationIcon();
//		UpdateLocationPage.enterZipCode("98052");
//		UpdateLocationPage.clickSubmitButton();
		
		UpdateLocationUtil.updateLocation("98052");
	}

}
