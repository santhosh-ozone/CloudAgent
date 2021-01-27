package com.CA.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AddCampaignPage;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.AdminUsersPage;
import com.CA.qa.Util.Testutil;

public class ValidateUserPageTest extends TestBase {
	
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	AdminUsersPage AdminUsersPage;

	String username_mt_err ="Username is required.";
	String username_range_err ="Username should be between 3 to 50 alphanumeric characters long and allows special characters like .,@,_";
	String username_range1_err ="Username should be between 3 to 50 characters.";
	
	String password_Mt_err="Password is required.";
	String password_range_err="Password should be between 3 to 50 characters.";
	String Confirmpassword_Mt_err="Confirm Password is required.";
	String Confirmpassword_range_err="Confirm Password should be the same.";
	
	String Hint_MT_err="Password Hint is required.";
	String firstName_MT_err="First Name is required.";
	String firstName_Range_err="First Name should be between 3 to 50 alphanumeric characters long and allows special characters like _";
	String LastName_MT_err="Last Name is required.";
	String LastName_range_err="Last Name should be between 3 to 50 alphanumeric characters long and allows special characters like _";
	
	String email_Mt_err="E-Mail is required.";
	String email_range_err="E-Mail should be a valid email.";
	String extn_MT_err="Extension is required.";
	String extn_Range_err="Extension should be between 3 to 7 characters.";
	String Phno_MT_err="Phone Number is required.";
	String PhNo_Range_err="Phone Number should be between 10 to 16 digits long and allows prefix +";
	
	String city_err="City is required.";
	String state_err="State is required.";
	String Zip_err="Zip is required.";
	String Country_err="Country is required.";
	String Ip_err="Allowed IPs seems to be invalid.";
	String module_err="Admin Modules List is required.";
	
	
	public ValidateUserPageTest() {
		super();
	}
	@BeforeClass
		public void setup() {
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		AdminUsersPage =AdminHomepage.clickOnUsersMenu();
		AdminUsersPage.ClickOnAddUserButton();
		}
	
	@Test (priority=1)
	public void ValidateUserNameEmptyErrorMsg27_1() {
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetUserNameErr();
		Assert.assertEquals(Err_msg, username_mt_err);
		
	}
	@Test (priority=2)
	public void ValidateUserNameErrorMsg27_11() {
		AdminUsersPage.EnterUserNameForUser("@");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetUserNameErr();
		Assert.assertEquals(Err_msg, username_range_err);
		
	}
	@Test (priority=3)
	public void ValidateUserNameErrorMsg27_12() {
		AdminUsersPage.EnterUserNameForUser("_sa");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetUserNameErr();
		Assert.assertEquals(Err_msg, username_range_err);
		
	}
	@Test (priority=4)
	public void ValidateUserNameErrorMsg27_13() {
		AdminUsersPage.EnterUserNameForUser("sa_");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetUserNameErr();
		Assert.assertEquals(Err_msg, username_range_err);
		
	}
	@Test (priority=5)
	public void ValidateUserNameErrorMsg27_14() {
		AdminUsersPage.EnterUserNameForUser("sa");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetUserNameErr();
		Assert.assertEquals(Err_msg, username_range1_err);
		
	}
	@Test (priority=6)
	public void ValidatePasswordEmptyErrorMsg27_2() {
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetPasswordErr();
		Assert.assertEquals(Err_msg, password_Mt_err);
	}
	@Test (priority=7)
	public void ValidatePasswordRangeErrorMsg27_21() {
		AdminUsersPage.EnterPasswordForUser("sa");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetPasswordErr();
		Assert.assertEquals(Err_msg, password_range_err);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
