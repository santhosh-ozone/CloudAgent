package com.CA.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;

public class ParallelTest1 extends TestBase{
	WebDriver driver_A;
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("beforemethod in class1");
		driver_A=AdminLogin1();
	}
	@Test
	public void verifyAdminloginTest1_1() {
		//driver_A.findElement)
		System.out.println("Test 1");
		System.out.println(driver_A.getCurrentUrl()+"   :1");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("aftermethod in class1");
		driver_A.close();
		System.out.println("1 closed");
	}

}
