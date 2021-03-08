package com.CA.qa.TestCases;

import java.util.ArrayList;

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
	String Agent_id_Range_err ="The agent identifier must be between 2 and 50 alphanumeric characters and allow special characters such as., @, _, -";
	String Agent_id_SplRange_err ="The agent identifier must be between 2 and 50 alphanumeric characters and allow special characters such as., @, _, -";
	String Agent_pwd_empty_err ="Password is required.";
	String Agent_pwd_Range_err ="The password must not contain spaces. The password must be 7 characters, including an uppercase letter, a lowercase letter, and alphanumeric characters.";
	String Agent_name_Empty_err ="Agent Name is required.";
	String Agent_name_Range_err ="The agent name must be between 2 and 50 alphanumeric characters and allow special characters such as., @, _, -.";
	String Agent_name_SplRange_err ="The agent name must be between 2 and 50 alphanumeric characters and allow special characters such as., @, _, -.";
	String Agent_priority_Empty_err ="Priority is required.";
	String Agent_priority_range_err ="Priority should be between 1 and 999.";
	String Agent_email_err ="Email should be a valid email.";
	String Agent_Data_range_err ="Agent data must be between 2 and 100 alphanumeric characters and allow special characters such as., @, _, -.";
	String Agent_Data_Splrange_err = Agent_Data_range_err;
	String Agent_mode_empty_err ="Agent Modes is required.";
	
	String AgentGroup_name_empty_err="Group Name is required.";
	String AgentGroup_name_Range_err="Group Name should be between 2 to 50 characters.";
	String AgentGroup_name_SplRange_err="Group Name seems to be invalid.";
	String AgentGroup_description_empty_err="Description is required.";
	String AgentGroup_description_range_err="Description should be between 2 to 200 characters.";
	String AgentGroup_AssignedAgnets_empty_err="Agents is required.";
	String AgentGroup_AssignedUsers_empty_err="Users is required.";
	
	String Phone_name_Empty_error = "Name is required.";
	String Phone_name_Range_error = "Name should be between 2 to 50 alphanumeric characters long allows prefix + and special characters like .,@,_,- and Name cannot start and end with Special characters.";
	String Phone_name_SplRange_error = "Name should be between 2 to 50 alphanumeric characters long and allows prefix + and allows special characters like .,@,_,-";
	String Phone_number_Empty_error = "Phone Number is required.";
	String Phone_number_Range_error = "Phone Number should be between 3 to 17 characters.";
	String Phone_number_SplRange_error = "Phone Number should be between 3 to 16 digits long and allows prefix +";
	String Phone_Priority_Empty_error = "Priority is required.";
	String Phone_Priority_Range_error = "Priority should be between 1 and 20.";
	
	String Transfer_Name_Empty_err ="Transfer Name is required.";
	String Transfer_Name_Range_err ="Transfer Name should be between 2 to 50 alphanumeric characters long allows prefix + and special characters like .,@,_,space,- and Name cannot start and end with Special characters.";
	String Transfer_Name_SplRange_err ="Transfer Name should be between 2 to 50 alphanumeric characters long and allows prefix + and allows special characters like .,@,_,space,-";
	String Transfer_Number_Empty_err ="Transfer Number is required.";
	String Transfer_Number_Range_err ="Transfer Number should be between 3 to 16 characters.";
	String Transfer_Number_SplRange_err ="Transfer Number should be between 3 to 16 digits long and allows prefix +";
	
	String skill_empty_err ="Skill Name is required.";
	String SkillName_range_error = "Skill Name should be between 2 to 50 alphanumeric characters long and allows special characters like _ and Name cannot start and end with Special characters.";
	String Skill_loc_empty_err ="Skill Location is required.";
	String Queue_Size_empty_err = "Queue Size is required.";
	String queue_range_err = "Queue Size should be between 1 and 999.";
	String skillDetail1_err = "Skill Detail1 should be between 2 to 200 alphanumeric characters long and allows special characters like .,@,_,space,-";
	String skillDetail2_err = "Skill Detail2 should be between 2 to 200 alphanumeric characters long and allows special characters like .,@,_,space,-";
	String skillDetail3_err = "Skill Detail3 should be between 2 to 200 alphanumeric characters long and allows special characters like .,@,_,space,-";
	String Skill_Assigned_agents_empty_err="Assign Agents is required.";
	String skill_hunting_no_empty_err ="Assign Phone Numbers for Hunting(offline) is required.";
	String skill_dial_out_empty_err ="Dial Out Name is required.";
	String Skill_transfer_skill_Empty_err ="Transfer to Skill is required.";
	String Skill_transfer_Ivr_Empty_err ="Transfer to IVR App. URL is required.";
	String calldrop_url_empty_err = "URL is required.";
	String calldrop_tries_empty_err= "Tries is required.";
	String calldrop_tries_range_err= "Tries should be between 1 and 99.";
	
	String loc_name_empty = "Name is required.";
	String loc_range_err ="Name should be between 3 to 50 alphanumeric characters long allows special characters like _ and Name cannot start and end with Special characters.";
	
	String urlMapping_Name_err ="Name is required.";
	String urlMapping_NameRange_err ="Name should be between 2 to 50 alphanumeric characters long allows special characters like .,@,_,space,- and Name cannot start and end with Special characters.";
	String urlMapping_domianName_err = "Domain Name is required.";
	String urlMapping_domianName_Range_err ="Domain Name should be between 2 to 50 alphanumeric characters long allows special characters like .,@,_,space,- and Name cannot start and end with Special characters.";
	String urlMapping_LocalIpName_err = "Local IP is required.";
	String urlMapping_LocalIpName_Range_err ="Local IP should be between 2 to 50 alphanumeric characters long allows special characters like .,@,_,space,- and IP cannot start and end with Special characters.";
	
	String smsTemplate_name_empty_err="Template Name is required.";
	String smsTemplate_name_range_err="Template Name should be between 2 to 50 alphanumeric characters long and allows special characters like _ and Name cannot start and end with Special characters.";
	String smsTemplate_Text_empty_err="Template Text is required.";
	
	String Disp_empty_err ="Reason is required.";
	String Disp_Range_err ="Reason should be between 3 to 150 alphanumeric characters long allows special characters like _,space and Reason cannot start and end with Special characters.";
	
	String dialOut_name_empty_err ="Dial Out Name is required.";
	String dialOut_name_range_err ="Dial Out Name should be between 2 to 50 alphanumeric characters long allows prefix + and special characters like .,@,_,- and Name cannot start and end with Special characters.";
	String dialOut_number_empty_err ="Dial Out Number is required.";
	String dialOut_number_range_err ="Dial Out Number should be between 3 to 17 characters.";
	String dialOut_number_SPLrange_err ="Dial Out Number should be between 3 to 16 digits long and allows prefix +";
	
	String Pause_reason_empty_err ="Reason is required.";
	String Pause_reason_Range_err ="Reason should be between 3 to 50 alphanumeric characters long allows special characters like space,_ and Reason cannot start and end with Special characters.";
	
	String blockNo_empty_err ="Block Number is required.";
	String blockNo_range_err ="Block Number seems to be invalid.";
	String blockNo_range1_err ="Block Number seems to be invalid or already exists";
	
	String blockGroup_name_empty_err ="Group Name is required.";
	String blockGroup_name_range_err ="Group Name seems to be invalid.";
	String blockGroup_name_range1_err ="Group Name should be between 2 to 50 characters.";
	String blockGroup_desc_empty_err ="Description is required.";
	String blockGroup_desc_range_err ="Description should be between 2 to 100 characters.";
	String blockGroup_Number_empty_err ="BlockNumbers is required.";
	
	String iverflow_name_empty_err ="Flow Name is required.";
	String IvrFlow_name_range_err ="Flow Name should be between 2 to 50 alphanumeric characters long allows special characters like .,@,_,-,space and Name cannot start and end with Special characters.";
	String IvrFlow_Type_err ="Flow Type is required.";
	
	String feedback_name_empty_err="FeedBack Name is required.";
	String feedback_name_range_err="Name should be between 2 to 50 alphanumeric characters long allows special characters like _ and Name cannot start and end with Special characters.";
	
	String feedback_master_name_empty_err="FeedBackName is required.";
	String feedback_master_feedback__err="FeedBack should be between 2 to 50 alphanumeric characters long allows special characters like _ and Feedback cannot start and end with Special characters.";
	String feedback_master_Audiofile__err="AudioFile should be between 2 to 50 alphanumeric characters long and allows special characters like _";
	String feedback_master_Audiofile1__err="AudioFile should be between 5 to 50 characters.";
	
	String sip_location_empty_err="Location Name is required.";
	String sip_location_range_err="Location Name should be between 3 to 50 characters.";
	String sip_location_range1_err="Location Name should be between 3 to 50 alphanumeric characters only";
	String sip_serverUrl_empty_err="SIP Server URL is required.";
	String sip_serviceURL_range_err="SIP Server URL should be between 3 to 500 characters.";
	String sip_serviceURL_space_err="SIP Server URL should not allow spaces";
	String sip_assigned_agents_err="Assign Agents is required.";
	
	String music_name_empty_err ="Name is required.";
	String music_name_range_err ="Name should be between 3 to 50 characters.";
	String music_name_range1_err ="The Name should be between 3 to 30 alphanumeric characters and allow special characters like underscore only.";
	String music_URL_empty_err="Audio URL is required.";
	String music_URL_Range_err="Audio URL Should start with http|https and Ends with .wav/.mp3 and atleast one character to be contain in between and allows Max Length of 100 characters";
	
	
	
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
	
//	@Test (priority=1)
//	public void ValidateEmptyAgentIdErrorMsg1_1() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_id_Empty_err);
//	}
//	
//	@Test (priority=2)
//	public void ValidateAgentIdRAngeErrorMsg1_11() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentId("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_id_Range_err);
//	}
//	
//
//	@Test (priority=3)
//	public void ValidateAgentIdSplRAngeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentId("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_id_Range_err);
//	}
//	
//	@Test (priority=4)
//	public void ValidateAgentIdStartWithsplcharErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentId("@agent");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_id_Range_err);
//	}
//	
//	@Test (priority=5)
//	public void ValidateAgentIdEndWithSplCharErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentId("agent@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentIdErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_id_Range_err);
//	}
//	
//	@Test (priority=6)
//	public void ValidateAgentPasswordEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_pwd_empty_err);
//	}
//	
//	@Test (priority=7)
//	public void ValidateAgentPasswordRAngeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentPassword("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_pwd_Range_err);
//	}
//	
//	@Test (priority=8)
//	public void ValidateAgentPasswordAllLowerCaseErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentPassword("ozonetel");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_pwd_Range_err);
//	}
//	
//	@Test (priority=9)
//	public void ValidateAgentPasswordUpperCaseErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentPassword("OZONETEL");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_pwd_Range_err);
//	}
//	
//	@Test (priority=10)
//	public void ValidateAgentPasswordAllSplCharErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentPassword("@!#$%^&");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPasswordErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_pwd_Range_err);
//	}
//	@Test (priority=11)
//	public void ValidateAgentNameEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_name_Empty_err);
//	}
//	
//	@Test (priority=12)
//	public void ValidateAgentNameRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_name_Range_err);
//	}
//	
//	@Test (priority=13)
//	public void ValidateAgentNameSplRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentName("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_name_Range_err);
//	}
//	
//	@Test (priority=14)
//	public void ValidateAgentPriorityEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPriorityErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_priority_Empty_err);
//	}
//	
//	@Test (priority=15)
//	public void ValidateAgentPriorityRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPriorityforAgent("0");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentPriorityErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_priority_range_err);
//	}
//	
//	@Test (priority=16)
//	public void ValidateAgentEmailErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEmailforAgent("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentEmailErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_email_err);
//	}
//	
//	@Test (priority=17)
//	public void ValidateAgentDataErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentDataforAgent("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentDataErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_Data_range_err);
//	}
//	
//	@Test (priority=18)
//	public void ValidateAgentDataSplRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentDataforAgent("@@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentDataErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_Data_range_err);
//	}
//	
//	@Test (priority=19)
//	public void ValidateAgentModeNotEnabledErrorMsg() {
//		ConfigurationsPage.ClickOnAgentMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnableInboundforAgent("no");
//		ConfigurationsPage.EnableManualforAgent("no");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentModeErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Agent_mode_empty_err);
//	}
//	@Test (priority=20)
//	public void ValidateAgentGroupNameEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_name_empty_err);
//	}
//	@Test (priority=21)
//	public void ValidateAgentGroupNameNumberErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentGroupName("11");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_name_SplRange_err);
//	}
//	
//	@Test (priority=22)
//	public void ValidateAgentGroupNameRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentGroupName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_name_Range_err);
//	}
//	
//	@Test (priority=23)
//	public void ValidateAgentGroupNameSplRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentGroupName("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_name_SplRange_err);
//	}
//	@Test (priority=24)
//	public void ValidateAgentGroupNameSplErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentGroupName("s@n");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_name_SplRange_err);
//	}
//	
//	@Test (priority=25)
//	public void ValidateAgentGroupDesriptionEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupDescriptionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_description_empty_err);
//	}
//	
//	@Test (priority=26)
//	public void ValidateAgentGroupDesriptionRangeErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterAgentGroupDecription("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupDescriptionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_description_range_err);
//	}
//	
//	@Test (priority=27)
//	public void ValidateAgentGroupAssignedAgentsEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupAssignedAgentsError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_AssignedAgnets_empty_err);
//	}
//	
//	@Test (priority=28)
//	public void ValidateAgentGroupAssignedUsersEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnAgentGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetAgentGroupAssignedUsersError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, AgentGroup_AssignedUsers_empty_err);
//	}
//	
//
//	@Test (priority=29)
//	public void ValidatePhoneNameEmptyErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_name_Empty_error);
//	}
//	
//	@Test (priority=30)
//	public void ValidatePhoneNameRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterNameForPhoneNo("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_name_Range_error);
//	}
//	
//	@Test (priority=31)
//	public void ValidatePhoneNameSplRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterNameForPhoneNo("@@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNameErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_name_Range_error);
//	}
//	
//	@Test (priority=32)
//	public void ValidatePhoneNumberEmptyErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_number_Empty_error);
//	}
//	
//	@Test (priority=33)
//	public void ValidatePhoneNumberRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterNoForPhone("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_number_Range_error);
//	}
//	
//	@Test (priority=34)
//	public void ValidatePhoneNumberSplRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterNoForPhone("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhoneNumberErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_number_SplRange_error);
//	}
//	
//	@Test (priority=35)
//	public void ValidatePriorityEmptyErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_Priority_Empty_error);
//	}
//	
//	@Test (priority=36)
//	public void ValidatePriorityRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPriorityForPhone("0");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_Priority_Range_error);
//	}
//
//	@Test (priority=37)
//	public void ValidatePriorityMaxRangeErrorMsg() {
//		ConfigurationsPage.ClickonPhoneNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPriorityForPhone("21");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPhonePriorityErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Phone_Priority_Range_error);
//	}
//	
//	@Test (priority=38)
//	public void ValidateTransferNameEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Name_Empty_err);
//	}
//	
//	@Test (priority=39)
//	public void ValidateTransferNameRangeErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterTransfername("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Name_Range_err);
//	}
//	
//	@Test (priority=40)
//	public void ValidateTransferNameSplRangeErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterTransfername("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNameError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Name_Range_err);
//	}
//	
//	@Test (priority=41)
//	public void ValidateTransferNumberEmptyErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNumberError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Number_Empty_err);
//	}
//	
//	@Test (priority=42)
//	public void ValidateTransferNumberRangeErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterTransferNo("+1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNumberError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Number_Range_err);
//	}
//	
//	@Test (priority=43)
//	public void ValidateTransferNumberSplRangeErrorMsg() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterTransferNo("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNumberError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Number_SplRange_err);
//	}
//	
//	@Test (priority=44)
//	public void ValidateTransferNumberSplRangeErrorMsg1() {
//		ConfigurationsPage.ClickOnTransferNoMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterTransferNo("ozonetel");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetTransferNumberError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Transfer_Number_SplRange_err);
//	}
//	
//	@Test (priority=45)
//	public void ValidateSkillNameEmptyErrorMsg5_1() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillNameErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skill_empty_err);
//	}
//	
//	@Test (priority=46)
//	public void ValidateSkillNameRangeErrorMsg5_11() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillNameErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, SkillName_range_error);
//	}
//	
//	@Test (priority=47)
//	public void ValidateSkillNameSplRangeErrorMsg5_12() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillName("@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillNameErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, SkillName_range_error);
//	}
//	
//	@Test (priority=48)
//	public void ValidateSkillNameSplRangeErrorMsg5_13() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillName("_sant");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillNameErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, SkillName_range_error);
//	}
//	
//	@Test (priority=49)
//	public void ValidateSkillLocationEmptyErrorMsg5_2() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillLocationErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Skill_loc_empty_err);
//	}
//	
//	@Test (priority=50)
//	public void ValidateSkillQueueSizeEmptyErrorMsg5_3() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillQueueSizeErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Queue_Size_empty_err);
//	}
//	
//	@Test (priority=51)
//	public void ValidateSkillQueueSizeRangeErrorMsg5_31() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillQueueSize("0");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillQueueSizeErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, queue_range_err);
//	}
//	
//	@Test (priority=52)
//	public void ValidateSkilldetail1RangeErrorMsg5_4() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail1("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail1ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail1_err);
//	}
//	
//	@Test (priority=53)
//	public void ValidateSkilldetail1RangeErrorMsg5_41() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail1("@s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail1ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail1_err);
//	}
//	
//	@Test (priority=54)
//	public void ValidateSkilldetail1RangeErrorMsg5_42() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail1("S@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail1ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail1_err);
//	}
//	
//	@Test (priority=55)
//	public void ValidateSkilldetail2RangeErrorMsg5_5() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail2("S");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail2ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail2_err);
//	}
//	
//	@Test (priority=56)
//	public void ValidateSkilldetail2RangeErrorMsg5_51() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail2("@S");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail2ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail2_err);
//	}
//	
//	@Test (priority=57)
//	public void ValidateSkilldetail2RangeErrorMsg5_52() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail2("S@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail2ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail2_err);
//	}
//	
//	@Test (priority=58)
//	public void ValidateSkilldetail3RangeErrorMsg5_6() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail3("S");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail3ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail3_err);
//	}
//	
//	@Test (priority=59)
//	public void ValidateSkilldetail3RangeErrorMsg5_61() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail3("@S");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail3ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail3_err);
//	}
//	
//	@Test (priority=60)
//	public void ValidateSkilldetail3RangeErrorMsg5_62() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSkillDetail3("S@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillSkillDetail3ErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skillDetail3_err);
//	}
//	
//	@Test (priority=61)
//	public void ValidateSkillAssignedAgentsEmptyErrorMsg5_7() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillAgentsErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Skill_Assigned_agents_empty_err);
//	}
//	
//	@Test (priority=62)
//	public void ValidateSkillHuntingNoEmptyErrorMsg5_8() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillHuntingErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skill_hunting_no_empty_err);
//	}
//	
//	//Dialout   Skill     IVR
//	
//	@Test (priority=63)
//	public void ValidateSkillFallbackDialOutEmptyErrorMsg5_9() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.SelectFallBackRule("Dialout");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillDialOutErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, skill_dial_out_empty_err);
//	}
//	
//	@Test (priority=64)
//	public void ValidateSkillFallbackSkillTransferEmptyErrorMsg5_11() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.SelectFallBackRule("Skill");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillQueueSkillTransferErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Skill_transfer_skill_Empty_err);
//	}
//	
//	@Test (priority=65)
//	public void ValidateSkillFallbackIvrTransferEmptyErrorMsg5_12() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.SelectFallBackRule("IVR");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillQueueIvrTransferErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Skill_transfer_Ivr_Empty_err);
//	}
//	
//	@Test (priority=66)
//	public void ValidateSkillCallDropURLEmptyErrorMsg5_13() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnableCallDrop();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillCallDropURLErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, calldrop_url_empty_err);
//	}
//	
//	@Test (priority=67)
//	public void ValidateSkillCallDropTriesEmptyErrorMsg5_14() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnableCallDrop();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillCallDropTriesErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, calldrop_tries_empty_err);
//	}
//	
//	@Test (priority=68)
//	public void ValidateSkillCallDropTriesRangeErrorMsg5_15() {
//		ConfigurationsPage.ClickOnSkillMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnableCallDrop();
//		ConfigurationsPage.EnterTriesForCallDrop("0");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSkillCallDropTriesErrorMsg();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, calldrop_tries_range_err);
//	}
	@Test (priority=68)
	public void ValidateSkillSaveOptions() {
		ConfigurationsPage.ClickOnSkillMenu();
		ConfigurationsPage.ClickOnAddConfig();
		ArrayList<String> al =ConfigurationsPage.GetsaveDivisionoptions();
		boolean flag=false;
		System.out.println("=================================="+al);
		if(al.size()==2 && al.get(0).equalsIgnoreCase("Save") && al.get(1).equalsIgnoreCase("Cancel"))
			flag=true;
		Assert.assertTrue(flag, "skill form have delete option also");
	}
	
	
//	@Test (priority=69)
//	public void ValidateLocationNameEmptyErrorMsg6_1() {
//		ConfigurationsPage.ClickOnLocationMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetLocationNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, loc_name_empty);
//	}
//	
//	@Test (priority=70)
//	public void ValidateLocationRangeErrorMsg6_11() {
//		ConfigurationsPage.ClickOnLocationMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterLocationName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetLocationNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, loc_range_err);
//	}
//	
//	@Test (priority=71)
//	public void ValidateLocationRangeErrorMsg6_12() {
//		ConfigurationsPage.ClickOnLocationMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterLocationName("_san");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetLocationNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, loc_range_err);
//	}
//	
//	@Test (priority=72)
//	public void ValidateLocationRangeErrorMsg6_13() {
//		ConfigurationsPage.ClickOnLocationMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterLocationName("san_");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetLocationNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, loc_range_err);
//	}
//	
//	@Test (priority=73)
//	public void ValidateURLMappingNameEmptyErrorMsg7_1() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_Name_err);
//	}
//	
//	@Test (priority=74)
//	public void ValidateURLMappingNameRangeErrorMsg7_11() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingName("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_NameRange_err);
//	}
//	
//	@Test (priority=75)
//	public void ValidateURLMappingNameRangeErrorMsg7_12() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingName("_s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_NameRange_err);
//	}
//	
//	@Test (priority=76)
//	public void ValidateURLMappingNameRangeErrorMsg7_13() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingName("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_NameRange_err);
//	}
//	
//	@Test (priority=77)
//	public void ValidateURLMappingDomainNameEmptyErrorMsg7_21() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingDomainNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_domianName_err);
//	}
//	
//	@Test (priority=78)
//	public void ValidateURLMappingDomainNameRangeErrorMsg7_22() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingDomain("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingDomainNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_domianName_Range_err);
//	}
//	@Test (priority=79)
//	public void ValidateURLMappingDomainNameRangeErrorMsg7_23() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingDomain("_s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingDomainNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_domianName_Range_err);
//	}
//	@Test (priority=80)
//	public void ValidateURLMappingDomainNameRangeErrorMsg7_24() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingDomain("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingDomainNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_domianName_Range_err);
//	}
//	@Test (priority=81)
//	public void ValidateURLMappingLocalIpEmptyErrorMsg7_3() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingLocalIPErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_LocalIpName_err);
//	}
//	@Test (priority=82)
//	public void ValidateURLMappingLocalIpRangeErrorMsg7_31() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingLocalIP("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingLocalIPErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_LocalIpName_Range_err);
//	}
//	@Test (priority=83)
//	public void ValidateURLMappingLocalIpRangeErrorMsg7_32() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingLocalIP("_s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingLocalIPErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_LocalIpName_Range_err);
//	}
//	@Test (priority=84)
//	public void ValidateURLMappingLocalIpRangeErrorMsg7_33() {
//		ConfigurationsPage.ClickOnURLMappingMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterURLMappingLocalIP("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetURLMappingLocalIPErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, urlMapping_LocalIpName_Range_err);
//	}
//	
//	@Test (priority=85)
//	public void ValidateSmsTemplateNameEmptyErrorMsg8_1() {
//		ConfigurationsPage.ClickOnSmsTemplateMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSmsTemplateNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, smsTemplate_name_empty_err);
//	}
//	
//	@Test (priority=86)
//	public void ValidateSmsTemplateNameRangeErrorMsg8_11() {
//		ConfigurationsPage.ClickOnSmsTemplateMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSmsTemplateName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSmsTemplateNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, smsTemplate_name_range_err);
//	}
//	
//	@Test (priority=87)
//	public void ValidateSmsTemplateNameRangeErrorMsg8_12() {
//		ConfigurationsPage.ClickOnSmsTemplateMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSmsTemplateName("_s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSmsTemplateNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, smsTemplate_name_range_err);
//	}
//	
//	@Test (priority=88)
//	public void ValidateSmsTemplateNameRangeErrorMsg8_13() {
//		ConfigurationsPage.ClickOnSmsTemplateMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterSmsTemplateName("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSmsTemplateNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, smsTemplate_name_range_err);
//	}
//	@Test (priority=89)
//	public void ValidateSmsTemplateTextErrorMsg8_2() {
//		ConfigurationsPage.ClickOnSmsTemplateMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSmsTemplateTextErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, smsTemplate_Text_empty_err);
//	}
//	
//	@Test (priority=90)
//	public void ValidatedispositionEmptyErrorMsg9_1() {
//		ConfigurationsPage.ClickOnDispositionMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDipositionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Disp_empty_err);
//	}
//	
//	@Test (priority=91)
//	public void ValidatedispositionRangeErrorMsg9_11() {
//		ConfigurationsPage.ClickOnDispositionMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.Enterdispositions("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDipositionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Disp_Range_err);
//	}
//	
//	@Test (priority=92)
//	public void ValidatedispositionSplRangeErrorMsg9_12() {
//		ConfigurationsPage.ClickOnDispositionMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.Enterdispositions("_sa");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDipositionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Disp_Range_err);
//	}
//	@Test (priority=93)
//	public void ValidatedispositionSplRangeErrorMsg9_13() {
//		ConfigurationsPage.ClickOnDispositionMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.Enterdispositions("sa@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDipositionError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Disp_Range_err);
//	}
//	@Test (priority=94)
//	public void ValidatedialOutNameEmptyErrorMsg10_1() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_name_empty_err);
//	}
//	
//	@Test (priority=95)
//	public void ValidatedialOutNameRangeErrorMsg10_12() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEnterDialOutName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_name_range_err);
//	}
//	@Test (priority=96)
//	public void ValidatedialOutNameRangeErrorMsg10_13() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEnterDialOutName("_sa");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_name_range_err);
//	}
//	@Test (priority=97)
//	public void ValidatedialOutNameRangeErrorMsg10_14() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEnterDialOutName("sa@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_name_range_err);
//	}
//	@Test (priority=98)
//	public void ValidatedialOutNumberEmptyErrorMsg10_2() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_number_empty_err);
//	}
//	@Test (priority=99)
//	public void ValidatedialOutNumberRangeErrorMsg10_21() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEnterDialOutNumber("12");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_number_range_err);
//	}
//	@Test (priority=100)
//	public void ValidatedialOutNumberSplRangeErrorMsg10_22() {
//		ConfigurationsPage.ClickOnDialOutNumberMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterEnterDialOutNumber("san");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetDialOutNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, dialOut_number_SPLrange_err);
//	}
//	@Test (priority=101/*,invocationCount=20*/)
//	public void ValidatePauseReasonEmptyErrorMsg11_1() {
//		ConfigurationsPage.ClickOnPauseReasonMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPauseReasonError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Pause_reason_empty_err);
//	}
//	@Test (priority=102)
//	public void ValidatePauseReasonRangeErrorMsg11_12() {
//		ConfigurationsPage.ClickOnPauseReasonMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPauseReason("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPauseReasonError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Pause_reason_Range_err);
//	}
//	@Test (priority=103)
//	public void ValidatePauseReasonRangeErrorMsg11_13() {
//		ConfigurationsPage.ClickOnPauseReasonMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPauseReason("_sa");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPauseReasonError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Pause_reason_Range_err);
//	}
//	@Test (priority=104)
//	public void ValidatePauseReasonRangeErrorMsg11_14() {
//		ConfigurationsPage.ClickOnPauseReasonMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterPauseReason("sa_");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetPauseReasonError();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, Pause_reason_Range_err);
//	}
//	
//	@Test (priority=105)
//	public void ValidateBlockNumberemptyErrorMsg12_1() {
//		ConfigurationsPage.ClickOnBlockNumbersMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		//ConfigurationsPage.EnterPauseReason("sa_");
//		ConfigurationsPage.ClickOnBlockForBlockNumbers();
//		Err_msg =ConfigurationsPage.GetBlockNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockNo_empty_err);
//	}
//	@Test (priority=106)
//	public void ValidateBlockNumberRangeErrorMsg12_11() {
//		ConfigurationsPage.ClickOnBlockNumbersMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumber("2");
//		ConfigurationsPage.ClickOnBlockForBlockNumbers();
//		Err_msg =ConfigurationsPage.GetBlockNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockNo_range_err);
//	}
//	@Test (priority=107)
//	public void ValidateBlockNumberRangeErrorMsg12_12() {
//		ConfigurationsPage.ClickOnBlockNumbersMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumber("san");
//		ConfigurationsPage.ClickOnBlockForBlockNumbers();
//		Err_msg =ConfigurationsPage.GetBlockNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockNo_range_err);
//	}
//	@Test (priority=108)
//	public void ValidateBlockNumberRangeErrorMsg12_13() {
//		ConfigurationsPage.ClickOnBlockNumbersMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumber("111111111111");
//		ConfigurationsPage.ClickOnBlockForBlockNumbers();
//		Err_msg =ConfigurationsPage.GetBlockNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockNo_range1_err);
//	}
//	@Test (priority=109)
//	public void ValidateBlockNumberRangeErrorMsg12_14() {
//		ConfigurationsPage.ClickOnBlockNumbersMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumber("95535787219959177442");
//		ConfigurationsPage.ClickOnBlockForBlockNumbers();
//		Err_msg =ConfigurationsPage.GetBlockNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockNo_range_err);
//	}
//	@Test (priority=110)
//	public void ValidateBlockNumberGroupNameEmptyErrorMsg13_1() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_empty_err);
//	}
//	@Test (priority=111)
//	public void ValidateBlockNumberGroupNameRangeErrorMsg13_12() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupName("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_range_err);
//	}
//	@Test (priority=112)
//	public void ValidateBlockNumberGroupNameRangeErrorMsg13_13() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_range1_err);
//	}
//	@Test (priority=113)
//	public void ValidateBlockNumberGroupNameRangeErrorMsg13_14() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupName("s@n");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_range_err);
//	}
//	@Test (priority=114)
//	public void ValidateBlockNumberGroupNameRangeErrorMsg13_15() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupName("@n");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_range_err);
//	}
//	@Test (priority=115)
//	public void ValidateBlockNumberGroupNameRangeErrorMsg13_16() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupName("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_name_range_err);
//	}
//	@Test (priority=116)
//	public void ValidateBlockNumberGroupDescriptionemptyErrorMsg13_2() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupDescriptionErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_desc_empty_err);
//	}
//	@Test (priority=117)
//	public void ValidateBlockNumberGroupDescriptionRangeErrorMsg13_21() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterBlockNumberGroupDescription("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupDescriptionErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_desc_range_err);
//	}
//	
//	@Test (priority=118)
//	public void ValidateBlockNumberGroupNumberEmptyErrorMsg13_3() {
//		ConfigurationsPage.ClickOnBlockNumbersGroupMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetBlockNumbergroupNumberErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, blockGroup_Number_empty_err);
//	}
//	@Test (priority=119)
//	public void ValidateIvrFlowNameEmptyErrorMsg14_1() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, iverflow_name_empty_err);
//	}
//	@Test (priority=120)
//	public void ValidateIvrFlowNameRangeErrorMsg14_12() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterIvrFlowName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, IvrFlow_name_range_err);
//	}
//	@Test (priority=121)
//	public void ValidateIvrFlowNameRangeErrorMsg14_13() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterIvrFlowName("@@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, IvrFlow_name_range_err);
//	}
//	@Test (priority=122)
//	public void ValidateIvrFlowNameRangeErrorMsg14_14() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterIvrFlowName("@s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, IvrFlow_name_range_err);
//	}
//	@Test (priority=123)
//	public void ValidateIvrFlowNameRangeErrorMsg14_15() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterIvrFlowName("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, IvrFlow_name_range_err);
//	}
//	@Test (priority=124)
//	public void ValidateIvrFlowTypeErrorMsg14_2() {
//		ConfigurationsPage.ClickOnIvrFlowMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetIvrFlowTypeErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, IvrFlow_Type_err);
//	}	
//	@Test (priority=125)
//	public void ValidateFeedBackNameEmptyErrorMsg15_1() {
//		ConfigurationsPage.ClickOnFeedBackMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_name_empty_err);
//	}
//	
//	@Test (priority=126)
//	public void ValidateFeedBackNameRangeErrorMsg15_12() {
//		ConfigurationsPage.ClickOnFeedBackMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedbackName("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_name_range_err);
//	}
//	@Test (priority=127)
//	public void ValidateFeedBackNameRangeErrorMsg15_13() {
//		ConfigurationsPage.ClickOnFeedBackMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedbackName("@@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_name_range_err);
//	}
//	@Test (priority=128)
//	public void ValidateFeedBackNameRangeErrorMsg15_14() {
//		ConfigurationsPage.ClickOnFeedBackMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedbackName("@s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_name_range_err);
//	}
//	@Test (priority=129)
//	public void ValidateFeedBackNameRangeErrorMsg15_15() {
//		ConfigurationsPage.ClickOnFeedBackMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedbackName("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_name_range_err);
//	}
//	@Test (priority=130)
//	public void ValidateFeedBackMasterNameEmptyErrorMsg16_1() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterNameErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_name_empty_err);
//	}
//	@Test (priority=131)
//	public void ValidateFeedBackMasterFeedbackRangeErrorMsg16_11() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterFeedback("1");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterFeedbackErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_feedback__err);
//	}
//	@Test (priority=132)
//	public void ValidateFeedBackMasterFeedbackRangeErrorMsg16_12() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterFeedback("@@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterFeedbackErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_feedback__err);
//	}
//	@Test (priority=133)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_13() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterFeedback("@s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterFeedbackErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_feedback__err);
//	}
//	@Test (priority=134)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_14() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterFeedback("s@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterFeedbackErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_feedback__err);
//	}
//
//	@Test (priority=135)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_2() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterAudioFile("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterAudioFileErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_Audiofile__err);
//	}
//	@Test (priority=136)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_21() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterAudioFile("SS");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterAudioFileErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_Audiofile1__err);
//	}
//	@Test (priority=137)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_22() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterAudioFile("@Sa");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterAudioFileErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_Audiofile__err);
//	}
//	@Test (priority=138)
//	public void ValidateFeedBackMasterFeedbackRange1ErrorMsg16_23() {
//		ConfigurationsPage.ClickOnFeedBackMasterMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EnterFeedBackMasterAudioFile("SS@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetfeedbackMasterAudioFileErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, feedback_master_Audiofile__err);
//	}	
//	@Test (priority=139)
//	public void ValidateSipLOcationNameemptyErrorMsg17_1() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_location_empty_err);
//	}
//	@Test (priority=140)
//	public void ValidateSipLOcationNameRangeErrorMsg17_12() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_location("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_location_range_err);
//	}
//	@Test (priority=141)
//	public void ValidateSipLOcationNameRangeErrorMsg17_13() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_location("s@n");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_location_range1_err);
//	}
//	@Test (priority=142)
//	public void ValidateSipLOcationNameRangeErrorMsg17_14() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_location("@ns");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_location_range1_err);
//	}
//	@Test (priority=143)
//	public void ValidateSipLOcationNameRangeErrorMsg17_15() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_location("sa@");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_location_range1_err);
//	}
//	@Test (priority=144)
//	public void ValidateSipServerURLEmptyErrorMsg17_2() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationURLErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_serverUrl_empty_err);
//	}
//	@Test (priority=145)
//	public void ValidateSipServerURLRangeErrorMsg17_21() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_sipUrl("S");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationURLErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_serviceURL_range_err);
//	}
//
//	@Test (priority=146)
//	public void ValidateSipServerURLRangeErrorMsg17_22() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_sipUrl(" San");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationURLErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_serviceURL_space_err);
//	}
//	@Test (priority=147)
//	public void ValidateSipServerURLRangeErrorMsg17_23() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.EntersipLocation_sipUrl("San ");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetSipLocationURLErr();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_serviceURL_space_err);
//	}
//	@Test (priority=148)
//	public void ValidateSipAssignedAgentsEmptyErrorMsg17_3() {
//		ConfigurationsPage.ClickOnSipLocationsMenu();
//		ConfigurationsPage.ClickOnAddConfig();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetsipLocation_assignedAgents_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, sip_assigned_agents_err);
//	}
//	@Test (priority=149)
//	public void ValidateMusicNameEmptyErrorMsg18_1() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_name_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_name_empty_err);
//	}
//	@Test (priority=150)
//	public void ValidateMusicNameRangeErrorMsg18_12() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_name("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_name_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_name_range_err);
//	}
//	@Test (priority=151)
//	public void ValidateMusicNameRangeErrorMsg18_13() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_name("s@n");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_name_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_name_range1_err);
//	}
//	@Test (priority=152)
//	public void ValidateMusicNameRangeErrorMsg18_14() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_name(" sn");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_name_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_name_range1_err);
//	}
//	@Test (priority=153)
//	public void ValidateMusicNameRangeErrorMsg18_15() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_name("sn ");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_name_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_name_range1_err);
//	}
//	@Test (priority=154)
//	public void ValidateMusicUrlEmptyErrorMsg18_2() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_empty_err);
//	}
//	@Test (priority=155)
//	public void ValidateMusicUrlRangeErrorMsg18_21() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("s");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
//	@Test (priority=156)
//	public void ValidateMusicUrlRangeErrorMsg18_22() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("http://");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
//	@Test (priority=157)
//	public void ValidateMusicUrlRangeErrorMsg18_23() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("https://");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
//	@Test (priority=158)
//	public void ValidateMusicUrlRangeErrorMsg18_24() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("m.wav");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
//	@Test (priority=159)
//	public void ValidateMusicUrlRangeErrorMsg18_25() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("m.mp3");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
//	@Test (priority=160)
//	public void ValidateMusicUrlRangeErrorMsg18_26() {
//		ConfigurationsPage.ClickOncampaignHoldMusicMenu();
//		ConfigurationsPage.ClickOnAddConfig1();
//		ConfigurationsPage.EnterHold_music_URL("http:m.wav");
//		ConfigurationsPage.ClickOnSaveforConfig();
//		Err_msg =ConfigurationsPage.GetHold_music_URL_Err();
//		System.out.println("err msg is: "+Err_msg);
//		Assert.assertEquals(Err_msg, music_URL_Range_err);
//	}
	
	
	
}
