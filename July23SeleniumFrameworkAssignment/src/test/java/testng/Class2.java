package testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

import businessfunctions.ApplyInsuranceUtil;
import businessfunctions.UpdateLocationUtil;
import businessfunctions.UpdateProfileUtil;

public class Class2 {
	@Test
	public void test3() {
		UpdateLocationUtil.updateLocation("98050");
		System.out.println("test 3 is running");
	}
	
	@Test
	public void test4() {
		UpdateProfileUtil.updateProfile("Shalini D");
		System.out.println("test 4 is running");
	}
	
	@Test
	public void test5() {
		ApplyInsuranceUtil.applyInsurance("10000", "09/20/1990", "5", "3", "143");
		System.out.println("test 5 is running");
		
	}

}
