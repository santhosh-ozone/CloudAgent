package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Util.Testutil;

public class AdminLoginPageTest extends TestBase{
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	
	public AdminLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		
		
		}
	
	@Test (priority = 1) 
	public void verifyAdminLoginPage_TitleTest() {
		String Act_AdminLoginPageTitle = Adminloginpage.ValidateAdminLoginPageTitle();
		Assert.assertEquals(Act_AdminLoginPageTitle, Testutil.Exp_AdminloginPageTitle);
		
	}
	
	@Test (priority = 2)
	public void verifyAdminLoginpage_logoTest() {
		boolean flag = Adminloginpage.ValidateAdminlLoginPagelogo();
		Assert.assertTrue(flag);
		
	}
	
//	@Test (priority = 2)
//	public void verifyAdminLoginpage_logoTextTest() {
//		String Act_AdminLoginPageLogoText = Adminloginpage.ValidateAdminlLoginPagelogoText();
//		Assert.assertEquals(Act_AdminLoginPageLogoText, Testutil.Exp_Admin_logoText);
//		//System.out.println(Act_AdminLoginPageLogoText);
//		
//	}
	
	@Test (priority = 3)
	public void verifyAdminloginTest() {
		//AdminHomepage = Adminloginpage.LoginAsAdmin(prop.getProperty("Admin_UserName"), prop.getProperty("Admin_password"));
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		Assert.assertEquals(AdminHomepage.AdminHomePageTitle(),	Testutil.Exp_AdminhomePageTitle);
		
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		Printhyphens();
	}

}
