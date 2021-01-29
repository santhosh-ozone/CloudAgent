package com.CA.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
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
	String firstName_Range1_err="First Name should be between 3 to 50 characters.";
	String LastName_MT_err="Last Name is required.";
	String LastName_range_err="Last Name should be between 3 to 50 alphanumeric characters long and allows special characters like _";
	String LastName_range1_err="Last Name should be between 3 to 50 characters.";
	
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
		//WebDriver driver_U;
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		AdminUsersPage =AdminHomepage.clickOnUsersMenu();
		AdminUsersPage.ClickOnAddUserButton();
		}
	
	@AfterClass
	public void teardown() {
		AdminHomepage.admin_logout();
		driver1.close();
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
	@Test (priority=8)
	public void ValidateConfirmPasswordRangeErrorMsg27_3() {
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetConfirmPasswordErr();
		Assert.assertEquals(Err_msg, Confirmpassword_Mt_err);
	}
	@Test (priority=9)
	public void ValidateConfirmPasswordRangeErrorMsg27_31() {
		AdminUsersPage.EnterPasswordForUser("santosh");
		AdminUsersPage.EnterConfirmPasswordForUser("kumar");
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetConfirmPasswordErr();
		Assert.assertEquals(Err_msg, Confirmpassword_range_err);
	}
	@Test (priority=10)
	public void ValidatePasswordHintMtErrorMsg27_4() {
		AdminUsersPage.ClickOnSaveOfUser();
		String Err_msg = AdminUsersPage.GetPasswordHintErr();
		Assert.assertEquals(Err_msg, Hint_MT_err);
	}
	@Test (priority=11)
	public void ValidatePasswordHintErrorMsg27_41() {
		AdminUsersPage.EnterPasswordHintForUser("  ");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetPasswordHintErr();
		Assert.assertEquals(Err_msg, Hint_MT_err);
	}
	@Test (priority=12)
	public void ValidateFirstNameMtErrorMsg27_5() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetFirstNameUserErr();
		Assert.assertEquals(Err_msg, firstName_MT_err);
	}
	@Test (priority=13)
	public void ValidateFirstNameRangeErrorMsg27_51() {
		AdminUsersPage.EnterFirstNameForUser("@");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetFirstNameUserErr();
		Assert.assertEquals(Err_msg, firstName_Range_err);
	}

	@Test (priority=14)
	public void ValidateFirstNameRangeErrorMsg27_52() {
		AdminUsersPage.EnterFirstNameForUser("sa");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetFirstNameUserErr();
		Assert.assertEquals(Err_msg, firstName_Range1_err);
	}
	@Test (priority=15)
	public void ValidateFirstNameRangeErrorMsg27_53() {
		AdminUsersPage.EnterFirstNameForUser("@sa");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetFirstNameUserErr();
		Assert.assertEquals(Err_msg, firstName_Range_err);
	}
	@Test (priority=16)
	public void ValidateFirstNameRangeErrorMsg27_54() {
		AdminUsersPage.EnterFirstNameForUser("sa@");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetFirstNameUserErr();
		Assert.assertEquals(Err_msg, firstName_Range_err);
	}
	@Test (priority=17)
	public void ValidateLastNameRangeMtMsg27_6() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetLastNameUserErr();
		Assert.assertEquals(Err_msg, LastName_MT_err);
	}
	@Test (priority=18)
	public void ValidateLastNameRangeErrorMsg27_61() {
		AdminUsersPage.EnterLastNameForUser("@");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetLastNameUserErr();
		Assert.assertEquals(Err_msg, LastName_range_err);
	}
	@Test (priority=19)
	public void ValidateLastNameRangeErrorMsg27_62() {
		AdminUsersPage.EnterLastNameForUser("sa");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetLastNameUserErr();
		Assert.assertEquals(Err_msg, LastName_range1_err);
	}
	@Test (priority=20)
	public void ValidateLastNameRangeErrorMsg27_63() {
		AdminUsersPage.EnterLastNameForUser("_sa");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetLastNameUserErr();
		Assert.assertEquals(Err_msg, LastName_range_err);
	}
	@Test (priority=21)
	public void ValidateLastNameRangeErrorMsg27_64() {
		AdminUsersPage.EnterLastNameForUser("sa_");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetLastNameUserErr();
		Assert.assertEquals(Err_msg, LastName_range_err);
	}
	@Test (priority=22)
	public void ValidateEmailMtErrorMsg27_7() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetEmailForUserErr();
		Assert.assertEquals(Err_msg, email_Mt_err);
	}
	@Test (priority=23)
	public void ValidateEmailRangeErrorMsg27_71() {
		AdminUsersPage.EnterEmailForUser("sa");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetEmailForUserErr();
		Assert.assertEquals(Err_msg, email_range_err);
	}
	@Test (priority=24)
	public void ValidateExtnMtErrorMsg27_8() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetExtensionForUserErr();
		Assert.assertEquals(Err_msg, extn_MT_err);
	}
	@Test (priority=25)
	public void ValidateExtnRangeErrorMsg27_81() {
		AdminUsersPage.EnterExtensionForUser("1");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetExtensionForUserErr();
		Assert.assertEquals(Err_msg, extn_Range_err);
	}
	@Test (priority=26)
	public void ValidatePhNoMtErrorMsg27_9() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetPhNoForUserErr();
		Assert.assertEquals(Err_msg, Phno_MT_err);
	}
	@Test (priority=27)
	public void ValidatePhNoRangeErrorMsg27_91() {
		AdminUsersPage.EnterPhNoForUser("1");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetPhNoForUserErr();
		Assert.assertEquals(Err_msg, PhNo_Range_err);
	}
	@Test (priority=28)
	public void ValidatePhNoRangeErrorMsg27_92() {
		AdminUsersPage.EnterPhNoForUser("+S@ntoshhhh");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetPhNoForUserErr();
		Assert.assertEquals(Err_msg, PhNo_Range_err);
	}
	@Test (priority=29)
	public void ValidatePhNoRangeErrorMsg27_93() {
		AdminUsersPage.EnterPhNoForUser("1234567890+");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetPhNoForUserErr();
		Assert.assertEquals(Err_msg, PhNo_Range_err);
	}
	@Test (priority=30)
	public void ValidateCityMtErrorMsg27_10() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAddressCityErr();
		Assert.assertEquals(Err_msg, city_err);
	}
	
	@Test (priority=31)
	public void ValidateStateMtErrorMsg27_10_1() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAddressStateErr();
		Assert.assertEquals(Err_msg, state_err);
	}
	@Test (priority=32)
	public void ValidateZipMtErrorMsg27_10_2() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAddressPostalcodeErr();
		Assert.assertEquals(Err_msg, Zip_err);
	}
	@Test (priority=33)
	public void ValidateCountryMtErrorMsg27_10_3() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAddressCountryErr();
		Assert.assertEquals(Err_msg, Country_err);
	}
	@Test (priority=34)
	public void ValidateAllowedIPErrorMsg27_10_4() {
		AdminUsersPage.EnterUserAllowedIP("1");
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAllowedIPErr();
		Assert.assertEquals(Err_msg, Ip_err);
	}
	@Test (priority=35)
	public void ValidateAdminModulesErrorMsg27_10_5() {
		AdminUsersPage.ClickOnSaveOfUser(); 
		String Err_msg = AdminUsersPage.GetUserAssignedModulesErr();
		Assert.assertEquals(Err_msg, module_err);
	}
	
	
	
	
}
