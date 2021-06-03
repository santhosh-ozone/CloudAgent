package com.CA.qa.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AddCampaignPage;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Util.Testutil;

public class ValidateInboundCampaignPageTest extends TestBase{
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	AddCampaignPage AddCampaignPage;
	static boolean flag = false;
	static String Err_msg;
	
	
	String campaign_name_empty_error = "Campaign Name is required.";
	//String campaign_range_error = "Campaign Name should be between 2 to 255 alphanumeric characters long and allows special characters like .,@,_,-";
	String campaign_range1_error = "Campaign Name should be between 2 to 255 alphanumeric characters long and allows special characters like .,@,_,-";
	String camp_already_exist="Campaign Name Already exists";
	String campaign_type_empty_error = "Campaign Type is required.";
	String campaign_DID_empty_error = "DID is required.";
	String campaign_DID_range_error = "DID must be between 3 and 16 digits and allows the + prefix";
	String did_duplicate_err="DID Already exists";
	String campaign_fallbackDID_range_error ="FallBack DID must be between 3 and 16 digits and allows the + prefix";
	
	String campign_prefix_err="Call Prefix should be between 1 to 6 digits long and allows prefix +";
	String startTime_empty_error = "Start Time is required.";
	String endTime_empty_error = "End Time is required.";
	String endTime_greater_error = "End Time should be greater.";
	String priority_empty_error = "Priority is required.";
	String priority_range_error = "Priority should be between 1 and 999.";
	String plugin_Name_error = "Plugin Name is required.";
	String Tries_empty_error = "No.Of Tries is required.";
	String Tries_range_error = "No.Of Tries should be between 1 and 10.";
	String WrapUp_empty_error = "Wrapup Time (in Sec) is required.";
	String disp_empty_error = "Dispositions is required.";
	String blockNo_empty_err="Block Number Groups is required.";
	
	String skill_empty_error = "Skills is required.";
	String mapping_empty_error = "Mapping Name is required.";
	String upload_empty_error = "File to Upload is required.";
	String dial_Int_err="Dial Interval(in Sec) is required.";
	String AppUrl_empty_err="App. URL is required.";
	String AppUrl_invalid_err="App. URL seems to be invalid.";
	String concurrentcalls_error = "Max Concurrent Calls is required.";
	String concurrentcalls_range_error = "Max Concurrent Calls should be between 1 and 9999.";
	String cust_ringTime_error ="Customer Ringing Time is required.";
	String cust_ringTimeRange_error ="Customer Ringing Time should be between 1 and 90.";
	String pacing_ratio_empty_error ="Pacing Ratio(Calls:Agent) is required.";
	String pacing_ratio_validity_error ="Pacing Ratio(Calls:Agent) seems to be invalid.";
	String drop_ratio_empty_error ="Max Drop Ratio (%) is required.";
	String drop_ratio_range_error ="Max Drop Ratio (%) should be between 1 and 99.";
	String Map_name_error ="Map Name is required.";
	String Map_name_range_error ="Map Name should be between 2 to 50 alphanumeric characters long and allows special characters like _";
	String Map_name_Spl_error ="Map Name allows alphanumeric characters with Underscore";
	String Map_file_error ="Mapping File is required.";
	String Map_sample_tooltip ="Download Sample";
	String Map_xls_tooltip ="Upload file should be in XLS format only, Download the XLS for sample.";
	String mapping_tooltip ="Add Mapping";
	
	String Existing_Incamp_Name ;//=AdminHomepage.GetFirstCampaign_nameForInbound();
	String existing_DID ;//=AdminHomepage.GetFirstCampaign_DidForInbound();
	
	public ValidateInboundCampaignPageTest() {
		super();
	}

	@BeforeClass(groups={"smoke"})
	//public void setup(Method method) {
		public void setup() {
		//System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		//AddOutBoundCampaignPage = AdminHomepage.clickOnOutboundAddCampaignButton("");
		Existing_Incamp_Name =AdminHomepage.GetFirstCampaign_nameForInbound();
		System.out.println("----------------------------------------------");
		System.out.println("Existing_Incamp_Name: "+Existing_Incamp_Name);
		existing_DID=AdminHomepage.GetFirstCampaign_DidForInbound();
		System.out.println("existing_DID: "+existing_DID);
		System.out.println("----------------------------------------------");

		AddCampaignPage =AdminHomepage.clickOnAddCampaignButton("inBound");
//		JavascriptExecutor jse = (JavascriptExecutor)driver1;
//		jse.executeScript("return document.getElementsByClassName('am-scroll-top')[0].remove();");
		}
	
	
	@Test (priority=1)
	public void ValidateCampaignNameErrorMsg25_1() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_name_empty_error);
	}
	@Test (priority=2)
	public void ValidateCampaignNameDuplicateErrorMsg25_11() {
		AddCampaignPage.enterCampaignName(Existing_Incamp_Name);
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, camp_already_exist);
	}
	@Test (priority=2)
	public void ValidateCampaignNameRangeErrorMsg25_12() {
		AddCampaignPage.enterCampaignName("c");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_range1_error);
	}
	
	@Test (priority=3)
	public void ValidateCampaignNameSplRangeErrorMsg25_13() {
		AddCampaignPage.enterCampaignName("#&");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_range1_error);
		
	}
	@Test (priority=4)
	public void ValidateCampaignNameSplRangeErrorMsg25_14() {
		AddCampaignPage.enterCampaignName("Sa_");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_range1_error);
		
	}
	
	@Test (priority=5)
	public void ValidateDidErrorMsg25_2() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_empty_error);
	}
	
	@Test (priority=6)
	public void ValidateDidRangeErrorMsg25_21() {
		AddCampaignPage.EnterDID("c");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	@Test (priority=7, groups={"smoke"})
	public void ValidateDidDuplicateErrorMsg25_22() {
		System.out.println("============"+existing_DID);
		AddCampaignPage.EnterDID(existing_DID);
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, did_duplicate_err);
	}
	
	@Test (priority=7)
	public void ValidateDidRangeErrorMsg25_23() {
		AddCampaignPage.EnterDID("12");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	@Test (priority=8)
	public void ValidateDidRangeErrorMsg25_24() {
		AddCampaignPage.EnterDID("@1");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	@Test (priority=9)
	public void ValidateDidRangeErrorMsg25_25() {
		AddCampaignPage.EnterDID("1234@12");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	@Test (priority=10)
	public void ValidateDidRangeMaxErrorMsg() {
		AddCampaignPage.EnterDID("12345678901234567");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	@Test (priority=11)
	public void ValidateFallbackDidRangeMaxErrorMsg25_3() {
		AddCampaignPage.EnterfallbackDID("qa");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getfallbackDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_fallbackDID_range_error);
	}
	@Test (priority=12)
	public void ValidateFallbackDidRangeMaxErrorMsg25_31() {
		AddCampaignPage.EnterfallbackDID("12");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getfallbackDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_fallbackDID_range_error);
	}
	@Test (priority=13)
	public void ValidateFallbackDidRangeMaxErrorMsg25_32() {
		AddCampaignPage.EnterfallbackDID("@12");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getfallbackDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_fallbackDID_range_error);
	}
	@Test (priority=14)
	public void ValidateFallbackDidRangeMaxErrorMsg25_33() {
		AddCampaignPage.EnterfallbackDID("1@2");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getfallbackDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_fallbackDID_range_error);
	}
	
	@Test (priority=15)
	public void ValidatePrefixRangeErrorMsg25_4() {
		AddCampaignPage.EnterPrefix("qa");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPrefixError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campign_prefix_err);
	}
	@Test (priority=16)
	public void ValidatePrefixRangeErrorMsg25_41() {
		AddCampaignPage.EnterPrefix("@12");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPrefixError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campign_prefix_err);
	}
	@Test (priority=17)
	public void ValidatePrefixRangeErrorMsg25_42() {
		AddCampaignPage.EnterPrefix("1@2");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPrefixError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campign_prefix_err);
	}
	
	
	
	@Test (priority=18)
	public void ValidateSkillErrorMsg25_5() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getSkillsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, skill_empty_error);
	}
	
	@Test (priority=19)
	public void ValidateWrapupErrorMsg25_6() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getWrapupError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, WrapUp_empty_error);
	}
	
	@Test (priority=20)
	public void ValidateDispositionErrorMsg25_7() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDispositionsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, disp_empty_error);
		
	}
	
	@Test (priority=16)
	public void ValidateBlockNoEmptyErrorMsg25_8() {
		AddCampaignPage.SelectBlockNumber("Block");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getBlocknoError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, blockNo_empty_err);
	}
	
	@Test (priority=21)
	public void ValidatePluginNameErrorMsg25_9() {
		AddCampaignPage.SelectHitScreenPopURlAt("Plugin", "");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPluginNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, plugin_Name_error);
	}
	
	@Test (priority=22)
	public void ValidateDefaultManualDialDisabledOrNot() {
		boolean b=AddCampaignPage.IsAllowedForManualDialingEnabled();
		
		Assert.assertTrue(b, "default AllowedForManualDialing selected");
		//Assert.assertEquals(Err_msg, plugin_Name_error);
	}
//	@Test (priority=44)
//	public void ValidateConsolidatedErrMsg() {
//		Err_msg=AddCampaignPage.ConsolidatedErrorMessage();
//		System.out.println("err msg is: "+Err_msg);
//		//Assert.assertEquals(Err_msg, mapping_tooltip);
//	}
			
	@AfterClass(groups={"smoke"})
	public void nteardown() {
		//System.out.println(driver1.getCurrentUrl());
		AdminHomepage.admin_logout();
		driver1.close();
		Printhyphens();
	}
	
	
	
	
	
	
	
	
	
	

}
