package com.CA.qa.TestCases;

import java.lang.reflect.Method;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
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
	
	String EditProfile_text="EDIT PROFILE";
	String EditProfile_toolTip="Edit Profile";
	String profile_title="User Settings";
	String profile_header="Edit User";
	
	String InBoundCampaignIcon_text="INBOUND CAMPAIGNS";
	String InBoundCampaignIcon_tooltip="InBound Campaigns";
	String campaign_title="Campaigns";
	String Inboundcampaign_header="Inbound Campaigns";
	
	String outBoundCampaignIcon_text="OUTBOUND CAMPAIGNS";
	String OutBoundCampaignIcon_tooltip="Outbound Campaigns";
	String Outboundcampaign_header="Outbound Campaigns";
	
	String AgentsIcon_text="AGENTS";
	String AgentsIcon_tooltip="Agents";
	String AgentsIcon_title="Agents";
	String AgentsIcon_header="Agents";
	
	String FwpNumberIcon_text="PHONE NUMBERS";
	String FwpNumberIcon_tooltip="Phone Numbers";
	String FwpNumberIcon_title="Phone Numbers";
	String FwpNumberIcon_header="Phone Numbers";
	
	String SkillIcon_text="SKILLS";
	String SkillIcon_tooltip="Skills";
	String SkillIcon_title="Skills";
	String SkillIcon_header="Skills";
	
	String PauseReasonIcon_text="PAUSE REASONS";
	String PauseReasonIcon_tooltip="Pause Reasons";
	String PauseReasonIcon_title="Pause Reasons";
	String PauseReasonIcon_header="Pause Reasons";
	
	
	
	
	
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
	@AfterMethod
	public void teardown(Method method, ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) 
			Testutil.takeScreenshotAtEndOfTest(driver1, method.getName());
		//driver.quit();
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		Printhyphens();
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

	@Test (priority = 1) 
	public void verifyAdminHomePage_TitleTest() {
		String Act_AdminHomePageTitle = AdminHomepage.AdminHomePageTitle();
		Assert.assertEquals(Act_AdminHomePageTitle, Testutil.Exp_AdminhomePageTitle);
		//System.out.println(Act_ATBHomePageTitle);
		
	}
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
	@Test(priority = 11)
	public void verifyEditProfileIcon1_17(){
		
		Assert.assertEquals(AdminHomepage.getTextUnderProfileIcon(),EditProfile_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfProfileIcon(),EditProfile_toolTip);
		AdminHomepage.ClickEditProfileMenu();
		Assert.assertEquals(AdminHomepage.GetTitle(), profile_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), profile_header);
		Assert.assertEquals(AdminHomepage.GetSavedUserName().trim(), Testutil.Readexcel("AdminLogin",1).get(0));
	}
	@Test(priority = 12)
	public void verifyInBoundCampaignIcon1_17() {
		Assert.assertEquals(AdminHomepage.getTextUnderInBoundCampaignIcon(),InBoundCampaignIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfInBoundCampaignIcon(),InBoundCampaignIcon_tooltip);
		AdminHomepage.ClickOnInBoundCampaignIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), campaign_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), Inboundcampaign_header);
		}
	
	@Test(priority = 13)
	public void verifyoutBoundCampaignIcon1_17() {
		
		Assert.assertEquals(AdminHomepage.getTextUnderoutBoundCampaignIcon(),outBoundCampaignIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfoutBoundCampaignIcon(),OutBoundCampaignIcon_tooltip);
		AdminHomepage.ClickOnoutBoundCampaignIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), campaign_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), Outboundcampaign_header);
		}
	@Test(priority = 14)
	public void verifyAgentsIcon1_17() {
		Assert.assertEquals(AdminHomepage.getTextUnderAgentsIcon(),AgentsIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfAgentsIcon(),AgentsIcon_tooltip);
		AdminHomepage.ClickOnAgentsIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), AgentsIcon_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), AgentsIcon_header);
		}
	@Test(priority = 15)
	public void verifyFwpNumberIcon1_17() {
		Assert.assertEquals(AdminHomepage.getTextUnderFwpNumberIcon(),FwpNumberIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfFwpNumberIcon(),FwpNumberIcon_tooltip);
		AdminHomepage.ClickOnFwpNumberIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), FwpNumberIcon_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), FwpNumberIcon_header);
		}//SkillIcon
	
	@Test(priority = 16)
	public void verifySkillIcon1_17() {
		Assert.assertEquals(AdminHomepage.getTextUnderSkillIcon(),SkillIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfSkillIcon(),SkillIcon_tooltip);
		AdminHomepage.ClickOnSkillIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), SkillIcon_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), SkillIcon_header);
		}
	
	@Test(priority = 17)
	public void verifyPauseReasonIcon1_17() {
		Assert.assertEquals(AdminHomepage.getTextUnderPauseReasonIcon(),PauseReasonIcon_text);
		Assert.assertEquals(AdminHomepage.getToolTipOfPauseReasonIcon(),PauseReasonIcon_tooltip);
		AdminHomepage.ClickOnPauseReasonIcon();
		Assert.assertEquals(AdminHomepage.GetTitle(), PauseReasonIcon_title);
		Assert.assertEquals(AdminHomepage.GetHeader(), PauseReasonIcon_header);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
