package com.CA.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.ConfigurationsPage;
import com.CA.qa.Util.Testutil;

public class ValidateConfigurationsPage extends TestBase{
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	ConfigurationsPage ConfigurationsPage;
	static String Err_msg;
	static int cou=1;
	
	String Agent_id_Empty_err ="Agent Id is required.";
	String Agent_id_Range_err ="Agent Id should be between 2 to 50 characters.";
	String Agent_id_SplRange_err ="Agent Id should be between 2 to 50 alphanumeric characters long and allows special characters like .,@,_,-";
	String Agent_pwd_empty_err ="Password is required.";
	String Agent_pwd_Range_err ="Password should be between 3 to 50 characters.";
	String Agent_name_Empty_err ="Agent Name is required.";
	String Agent_name_Range_err ="Agent Name should be between 2 to 50 characters.";
	String Agent_name_SplRange_err ="Agent Name should be between 2 to 50 alphanumeric characters long and allows special characters like .,@,_,-";
	String Agent_priority_Empty_err ="Priority is required.";
	String Agent_priority_range_err ="Priority should be between 1 and 999.";
	String Agent_email_err ="Email should be a valid email.";
	String Agent_Data_range_err ="Agent Data should be between 2 to 100 characters.";
	String Agent_Data_Splrange_err ="Agent Data should be between 2 to 100 alphanumeric characters long and allows special characters like .,@,_,-";
	String Agent_mode_empty_err ="Agent Modes is required.";
	
	String Phone_name_Empty_error = "Name is required.";
	String Phone_name_Range_error = "Name should be between 2 to 50 characters.";
	String Phone_name_SplRange_error = "Name should be between 2 to 50 alphanumeric characters long and allows prefix + and allows special characters like .,@,_,-";
	String Phone_number_Empty_error = "Phone Number is required.";
	String Phone_number_Range_error = "Phone Number should be between 3 to 17 characters.";
	String Phone_number_SplRange_error = "Phone Number should be between 3 to 16 digits long and allows prefix +";
	String Phone_Priority_Empty_error = "Priority is required.";
	String Phone_Priority_Range_error = "Priority should be between 1 and 20.";
	
	String Transfer_Name_Empty_err ="Transfer Name is required.";
	String Transfer_Name_Range_err ="Transfer Name should be between 2 to 50 characters.";
	String Transfer_Name_SplRange_err ="Transfer Name should be between 2 to 50 alphanumeric characters long and allows prefix + and allows special characters like .,@,_,space,-";
	String Transfer_Number_Empty_err ="Transfer Number is required.";
	String Transfer_Number_Range_err ="Transfer Number should be between 3 to 16 characters.";
	String Transfer_Number_SplRange_err ="Transfer Number should be between 3 to 16 digits long and allows prefix +";
	
	String Disp_empty_err ="Reason is required.";
	String Disp_Range_err ="Reason should be between 3 to 150 characters.";
	String Disp_SplRange_err ="Reason should be between 3 to 150 alphanumeric characters long and allows special characters like _,space";
	
	String AgentGroup_name_empty_err="Group Name is required.";
	String AgentGroup_name_Range_err="Group Name should be between 2 to 50 characters.";
	String AgentGroup_name_SplRange_err="Group Name seems to be invalid.";
	String AgentGroup_description_empty_err="Description is required.";
	String AgentGroup_description_range_err="Description should be between 2 to 200 characters.";
	String AgentGroup_AssignedAgnets_empty_err="Agents is required.";
	String AgentGroup_AssignedUsers_empty_err="Users is required.";
	
	
	
	
	
	
	
	
	
	
	public ValidateConfigurationsPage() {
		super();
	}
	
	@BeforeClass
	//public void setup(Method method) {
		public void setup() {
		//System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		//AddOutBoundCampaignPage = AdminHomepage.clickOnOutboundAddCampaignButton("");
		ConfigurationsPage = new ConfigurationsPage();
//		JavascriptExecutor jse = (JavascriptExecutor)driver1;
//		jse.executeScript("return document.getElementsByClassName('am-scroll-top')[0].remove();");
		}
	
	@AfterClass
	public void nteardown() {
		//System.out.println(driver1.getCurrentUrl());
		AdminHomepage.admin_logout();
		driver1.close();
		Printhyphens();
	}
	
	@Test (priority=1)
	public void ValidateAgentIdErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_id_Empty_err);
	}
	
	@Test (priority=2)
	public void ValidateAgentIdRAngeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentId("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_id_Range_err);
	}
	

	@Test (priority=3)
	public void ValidateAgentIdSplRAngeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentId("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_id_SplRange_err);
	}
	
	@Test (priority=4)
	public void ValidateAgentPasswordEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_pwd_empty_err);
	}
	
	@Test (priority=5)
	public void ValidateAgentPasswordRAngeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentPassword("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_pwd_Range_err);
	}
	
	@Test (priority=6)
	public void ValidateAgentNameEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_name_Empty_err);
	}
	
	@Test (priority=7)
	public void ValidateAgentNameRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentName("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_name_Range_err);
	}
	
	@Test (priority=8)
	public void ValidateAgentNameSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentName("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_name_SplRange_err);
	}
	
	@Test (priority=9)
	public void ValidateAgentPriorityEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentPriorityErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_priority_Empty_err);
	}
	
	@Test (priority=10)
	public void ValidateAgentPriorityRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterPriorityforAgent("0");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentPriorityErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_priority_range_err);
	}
	
	@Test (priority=11)
	public void ValidateAgentEmailErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterEmailforAgent("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentEmailErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_email_err);
	}
	
	@Test (priority=12)
	public void ValidateAgentDataErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentDataforAgent("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentDataErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_Data_range_err);
	}
	

	@Test (priority=13)
	public void ValidateAgentDataSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentDataforAgent("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentDataErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_Data_Splrange_err);
	}
	
	@Test (priority=14)
	public void ValidateAgentModeNotEnabledErrorMsg() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnableInboundforAgent("no");
		ConfigurationsPage.EnableManualforAgent("no");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentModeErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Agent_mode_empty_err);
	}

	@Test (priority=15)
	public void ValidatePhoneNameEmptyErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_name_Empty_error);
	}
	
	@Test (priority=16)
	public void ValidatePhoneNameRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterNameForPhoneNo("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_name_Range_error);
	}
	
	@Test (priority=17)
	public void ValidatePhoneNameSplRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterNameForPhoneNo("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_name_SplRange_error);
	}
	
	@Test (priority=18)
	public void ValidatePhoneNumberEmptyErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_number_Empty_error);
	}
	
	@Test (priority=19)
	public void ValidatePhoneNumberRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterNoForPhone("1");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_number_Range_error);
	}
	
	@Test (priority=20)
	public void ValidatePhoneNumberSplRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterNoForPhone("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_number_SplRange_error);
	}
	
	@Test (priority=21)
	public void ValidatePriorityEmptyErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_Priority_Empty_error);
	}
	
	@Test (priority=22)
	public void ValidatePriorityRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterPriorityForPhone("0");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_Priority_Range_error);
	}

	@Test (priority=23)
	public void ValidatePriorityMaxRangeErrorMsg() {
		ConfigurationsPage.ClickonPhoneNumberMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterPriorityForPhone("21");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Phone_Priority_Range_error);
	}
	
	@Test (priority=24)
	public void ValidateTransferNameEmptyErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Name_Empty_err);
	}
	
	@Test (priority=25)
	public void ValidateTransferNameRangeErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterTransfername("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Name_Range_err);
	}
	
	@Test (priority=26)
	public void ValidateTransferNameSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterTransfername("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Name_SplRange_err);
	}
	
	@Test (priority=27)
	public void ValidateTransferNumberEmptyErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNumberError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Number_Empty_err);
	}
	
	@Test (priority=28)
	public void ValidateTransferNumberRangeErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterTransferNo("1");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNumberError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Number_Range_err);
	}
	
	@Test (priority=29)
	public void ValidateTransferNumberSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnTransferNoMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterTransferNo("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetTransferNumberError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Transfer_Number_SplRange_err);
	}
	
	@Test (priority=30)
	public void ValidatedispositionEmptyErrorMsg() {
		ConfigurationsPage.ClickOnDispositionMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetDipositionError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Disp_empty_err);
	}
	
	@Test (priority=31)
	public void ValidatedispositionRangeErrorMsg() {
		ConfigurationsPage.ClickOnDispositionMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.Enterdispositions("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetDipositionError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Disp_Range_err);
	}
	
	@Test (priority=32)
	public void ValidatedispositionSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnDispositionMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.Enterdispositions("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetDipositionError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Disp_SplRange_err);
	}
	
	@Test (priority=33)
	public void ValidateAgentGroupNameEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_name_empty_err);
	}
	
	@Test (priority=34)
	public void ValidateAgentGroupNameRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentGroupName("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_name_Range_err);
	}
	
	@Test (priority=35)
	public void ValidateAgentGroupNameSplRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentGroupName("@");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_name_SplRange_err);
	}
	
	@Test (priority=36)
	public void ValidateAgentGroupDesriptionEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupDescriptionError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_description_empty_err);
	}
	
	@Test (priority=37)
	public void ValidateAgentGroupDesriptionRangeErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.EnterAgentGroupDecription("s");
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupDescriptionError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_description_range_err);
	}
	
	@Test (priority=38)
	public void ValidateAgentGroupAssignedAgentsEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupAssignedAgentsError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_AssignedAgnets_empty_err);
	}
	
	@Test (priority=39)
	public void ValidateAgentGroupAssignedUsersEmptyErrorMsg() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ConfigurationsPage.ClickOnSaveforConfig();
		Err_msg =ConfigurationsPage.GetAgentGroupAssignedUsersError();
		System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AgentGroup_AssignedUsers_empty_err);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
