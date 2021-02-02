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

public class AdminHomePageTest extends TestBase{
	
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	
	public AdminHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		
	}
	
	@Test (priority = 1) 
	public void verifyAdminHomePage_TitleTest() {
		String Act_AdminHomePageTitle = AdminHomepage.AdminHomePageTitle();
		Assert.assertEquals(Act_AdminHomePageTitle, Testutil.Exp_AdminhomePageTitle);
		//System.out.println(Act_ATBHomePageTitle);
		
	}
	
//	@Test (priority = 2)
//	public void VerifyAdminHomepage_logoTest() {
//		boolean flag = AdminHomepage.ValidateAdminlHomePagelogo();
//		Assert.assertTrue(flag);
//		
//	}
//	
//	@Test (priority = 2)
//	public void VerifyAdminHomePage_logoTextTest() {
//		String Act_AdminLoginPageLogoText = AdminHomepage.ValidateAdminlHomePagelogoText();
//		Assert.assertEquals(Act_AdminLoginPageLogoText, Testutil.Exp_Admin_logoText);
//		//System.out.println(Act_AdminLoginPageLogoText);
//		
//	}
	
	@Test(priority = 2)
	public void verifyclickingoninbound() {
		AdminHomepage.ClickOnInbound();
		Assert.assertEquals(driver1.getTitle(), "Campaigns");
	}
	
	@Test(priority = 3)
	public void verifyclickingonOutbound() {
		AdminHomepage.ClickOnOutbound();
		Assert.assertEquals(driver1.getTitle(), "Campaigns");
	}
	
	@Test(priority = 4)
	public void verifyAdminLogout() {
		AdminHomepage.admin_logout();
		Assert.assertEquals(driver1.getTitle(), "Login");
	}
	@Test(priority = 5)
	public void verifyOutboundAddCampaignButton() {
		AdminHomepage.clickOnAddCampaignButton("outbound");
		Assert.assertEquals(driver1.getTitle(), "Campaign Detail");
	}
	
	@Test(priority = 6)
	public void verifyInboundAddCampaignButton() {
		AdminHomepage.clickOnAddCampaignButton("inbound");
		Assert.assertEquals(driver1.getTitle(), "Campaign Detail");
	}
	@Test(priority = 7)
	public void verifywhetherRunningInboundCampaignDIDEditable() {
		String msg =AdminHomepage.EditDidForRunnungInboundCampaign();
		Assert.assertEquals(msg, "not able to edit");
	}
	@Test(priority = 8)
	public void verifywhetherRunningOutboundCampaignDIDEditable() {
		String msg =AdminHomepage.EditDidForRunnungOutboundCampaign();
		Assert.assertEquals(msg, "not able to edit");
		
	}
	@Test(priority = 9)
	public void verifywhetherRunningOutboundCampaignDeletable() {
		String msg =AdminHomepage.DeleteRunnungOutboundCampaign();
		Assert.assertEquals(msg, "delete is not available");
	}
	@Test(priority = 10)
	public void verifywhetherRunningInboundCampaignDeletable() {
		String msg =AdminHomepage.DeleteRunnungInboundCampaign();
		Assert.assertEquals(msg, "delete is not available");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		Printhyphens();
	}

}
