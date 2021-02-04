package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
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
	
	
	String Empty_username_error ="Username is required";
	String Empty_password_error ="Password is required";
	String invalid_username_password ="Invalid username and/or password, please try again.";
	String no_user="no user found.";
	String Email_to_user="\"Reset Password Link is Forwarded to your Email Id\"";
	
	
	
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
	public void verifyAdminloginTest1_1() {
		//AdminHomepage = Adminloginpage.LoginAsAdmin(prop.getProperty("Admin_UserName"), prop.getProperty("Admin_password"));
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		Assert.assertEquals(AdminHomepage.AdminHomePageTitle(),	Testutil.Exp_AdminhomePageTitle);	
	}
	@Test (priority = 2)
	public void verifyAdminLoginInvalidUserErrorMessageTest1_2() {
		Adminloginpage.sendUserName("UN");
		Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.InvalidError();
		Assert.assertEquals(msg,invalid_username_password);
	}
	@Test (priority = 3)
	public void verifyAdminEmptyUserNameErrorMessageTest1_3() {
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.UsernameError();
		Assert.assertEquals(msg,Empty_username_error);
	}

	@Test (priority = 4)
	public void verifyAdminEmptyPasswordErrorMessageTest1_3() {
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.passwordError();
		 Assert.assertEquals(msg,Empty_password_error);
	}
	@Test (priority = 5)
	public void verifyAdminWrongUsernameEmptyPasswordErrorMessageTest1_4() {
		Adminloginpage.sendUserName("UN");
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.passwordError();
		 Assert.assertEquals(msg,Empty_password_error);
	}
	@Test (priority = 6)
	public void verifyAdminCorrectUsernameEmptyPasswordErrorMessageTest1_5() {
		Adminloginpage.sendUserName(Testutil.Readexcel("AdminLogin",1).get(0));
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.passwordError();
		 Assert.assertEquals(msg,Empty_password_error);
	}
	@Test (priority = 7)
	public void verifyAdminMtUserNamewrongPasswordErrorMessageTest1_6() {
		Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.UsernameError();
		Assert.assertEquals(msg,Empty_username_error);
	}
	@Test (priority = 8)
	public void verifyAdminCorrectUsernameWrongPasswordErrorMessageTest1_7() {
		Adminloginpage.sendUserName(Testutil.Readexcel("AdminLogin",1).get(0));
		Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.InvalidError();
		 Assert.assertEquals(msg,invalid_username_password);
	}
	
	@Test (priority = 9)
	public void verifyAdminInvalidUsernameCorrectPasswordErrorMessageTest1_8() {
		Adminloginpage.sendUserName("un");
		Adminloginpage.sendPassword(Testutil.Readexcel("AdminLogin",2).get(0));
		Adminloginpage.clickLogInSubmit();
		String msg =Adminloginpage.InvalidError();
		 Assert.assertEquals(msg,invalid_username_password);
	}
	@Test (priority = 10)
	public void verifyForgotPasswordLinkErrorMessageTestWhen_InvalidUsernameGiven1_9() {
		Adminloginpage.sendUserName("UN");
		//Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickForgotPassword();
		String msg =Adminloginpage.InvalidError();
		Assert.assertEquals(msg,no_user);
	}
	
	@Test (priority = 11)
	public void verifyForgotPasswordLinkErrorMessageTestWhen_MTUsernameGiven1_11() {
		//Adminloginpage.sendUserName("UN");
		//Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickForgotPassword();
		String msg =Adminloginpage.InvalidError();
		Assert.assertEquals(msg,no_user);
	}
	@Test (priority = 12)
	public void verifyForgotPasswordLinkErrorMessageTestWhen_ValidUserNameGiven1_12() {
		Adminloginpage.sendUserName(Testutil.Readexcel("AdminLogin",1).get(0));
		//Adminloginpage.sendPassword("pwd");
		Adminloginpage.clickForgotPassword();
		String msg =Adminloginpage.InvalidError();
		Assert.assertEquals(msg,Email_to_user);
	}
	
	@Test (priority = 13) 
	public void verifyAdminLoginPage_TitleTest1_13() {
		String Act_AdminLoginPageTitle = Adminloginpage.ValidateAdminLoginPageTitle();
		Assert.assertEquals(Act_AdminLoginPageTitle, Testutil.Exp_AdminloginPageTitle);
		
	}
	
//	@Test (priority = 2)
//	public void verifyAdminLoginpage_logoTest() {
//		boolean flag = Adminloginpage.ValidateAdminlLoginPagelogo();
//		Assert.assertTrue(flag);
//		
//	}
//	
//	@Test (priority = 2)
//	public void verifyAdminLoginpage_logoTextTest() {
//		String Act_AdminLoginPageLogoText = Adminloginpage.ValidateAdminlLoginPagelogoText();
//		Assert.assertEquals(Act_AdminLoginPageLogoText, Testutil.Exp_Admin_logoText);
//		//System.out.println(Act_AdminLoginPageLogoText);
//		
//	}
	

	@Test (priority =14)
	public void verifyRememberMeFunctionalityTest1_14() {
		//Adminloginpage.sendUserName(Testutil.Readexcel("AdminLogin",1).get(0));
		//Adminloginpage.sendPassword(Testutil.Readexcel("AdminLogin",2).get(0));
		boolean b =Adminloginpage.EnableRememberMe();
		//System.out.println("--------------------remem1 : "+b);
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		Assert.assertEquals(AdminHomepage.AdminHomePageTitle(),	Testutil.Exp_AdminhomePageTitle);	
		AdminHomepage.admin_logout();
		Assert.assertEquals(Adminloginpage.ValidateAdminLoginPageTitle(), Testutil.Exp_AdminloginPageTitle);
		Adminloginpage.clickLogInSubmit();
		Assert.assertEquals(AdminHomepage.AdminHomePageTitle(),	Testutil.Exp_AdminhomePageTitle);		
	}
	@Test (priority =15)
	public void verifyRememberMeDisabledFunctionalityTest1_15() {
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		Assert.assertEquals(AdminHomepage.AdminHomePageTitle(),	Testutil.Exp_AdminhomePageTitle);	
		AdminHomepage.admin_logout();
		Assert.assertEquals(Adminloginpage.ValidateAdminLoginPageTitle(), Testutil.Exp_AdminloginPageTitle);
		Assert.assertEquals(Adminloginpage.GetUserName(),	Testutil.Readexcel("AdminLogin",1).get(0));	
		Assert.assertEquals(Adminloginpage.GetPassword(),	"");	
		}
	
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		Printhyphens();
	}

}
