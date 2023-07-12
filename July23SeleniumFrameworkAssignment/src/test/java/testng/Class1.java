package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import businessfunctions.BaseClass;
import businessfunctions.LoginUtil;
import businessfunctions.RegisterUserUtil;
import utilityfunctions.ExcelUtil;

public class Class1 {
	
	@BeforeSuite
	public void BeforeSuite() {
		int rcount=ExcelUtil.getNoOfRows();
		BaseClass.openBrowser();
		for(int i=1;i<rcount;i++) {
			//BaseClass.openBrowser();
			//LoginUtil.login(ConfigUtil.readProperty("email"), ConfigUtil.readProperty("pwd"));
		LoginUtil.login(ExcelUtil.getCellData(i, 0), ExcelUtil.getCellData(i, 1));
		BaseClass.closeBrowser();}
		
		System.out.println("Before suite is running");
	}
	
	@Test
	public void test2() {
		RegisterUserUtil.registerUser("abcd25.dutta@gmail.com", "abcd@123", "Shalini", "9876543210", "06/20/1990",
				"140th Ave Ne", "140th Ave Ne", "Redmond", "Washington", "98052");
		System.out.println("test 2 is running");
	}

}
