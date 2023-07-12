package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.BaseClass;
import businessfunctions.RegisterUserUtil;
import pagerepo.RegisterUserPage;

public class RegisterUserTest extends BaseClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		driver.get("http://tanchan-001-site3.btempurl.com/production/login");
		
		BaseClass.openBrowser();
		
//		driver.findElement(By.name("REmail")).sendKeys("abcd12.dutta@gmail.com");
//		driver.findElement(By.name("RPwd")).sendKeys("abcd@123");
//		driver.findElement(By.name("RName")).sendKeys("Shalini");
//		driver.findElement(By.name("RMobile")).sendKeys("9876543210");
//		driver.findElement(By.xpath("//*[@id=\"RForm\"]/div[3]/div[1]/div[2]/label")).click();
//		driver.findElement(By.name("RDob")).sendKeys("06/20/1990");
//		driver.findElement(By.name("RAddress_1")).sendKeys("140th Ave Ne");
//		driver.findElement(By.name("RAddress_2")).sendKeys("140th Ave Ne");
//		driver.findElement(By.id("RCity")).sendKeys("Redmond");
//		driver.findElement(By.id("RState")).sendKeys("Washington");
//		driver.findElement(By.id("RZip")).sendKeys("98052");
//		driver.findElement(By.id("RBtn")).click();
		
//		RegisterUserPage.enterEmail("abcd14.dutta@gmail.com");
//		RegisterUserPage.enterPassword("abcd@123");
//		RegisterUserPage.enterFullName("Shalini");
//		RegisterUserPage.enterMobileNo("9876543210");
//		RegisterUserPage.selectGender();
//		RegisterUserPage.enterBirthDate("06/20/1990");
//		RegisterUserPage.enterDoorNo("140th Ave Ne");
//		RegisterUserPage.enterLocation("140th Ave Ne");
//		RegisterUserPage.enterCity("Redmond");
//		RegisterUserPage.enterState("Washington");
//		RegisterUserPage.enterZipCode("98052");
//		RegisterUserPage.clickRegisterButton();
		
		RegisterUserUtil.registerUser("abcd25.dutta@gmail.com", "abcd@123", "Shalini", "9876543210", "06/20/1990",
				"140th Ave Ne", "140th Ave Ne", "Redmond", "Washington", "98052");
		
//        BaseClass.closeBrowser();
      
//        driver.quit();
		
		
		

	}

}
