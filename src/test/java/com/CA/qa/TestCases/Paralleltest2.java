package com.CA.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;

public class Paralleltest2 extends TestBase{

	WebDriver driver_b;
	@BeforeMethod
	public void setup() {
		System.out.println("beforemethod in class2");
		//driver_b=AdminLogin();
	}
	@Test
	public void verifyAdminloginTest1_1() {
		System.out.println("Test 2");
		System.out.println(driver_b.getCurrentUrl()+"   :2");
	}
	@AfterMethod
	public void teardown() {
		System.out.println("aftermethod in class2");
		driver_b.close();
		System.out.println("2 closed");
	}
}
