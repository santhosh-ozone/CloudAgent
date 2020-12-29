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

public class ValidateCampaignPageTest extends TestBase{
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	AddCampaignPage AddCampaignPage;
	static boolean flag = false;
	static String Err_msg;
	
	
	String campaign_name_empty_error = "Campaign Name is required.";
	//String campaign_range_error = "Campaign Name should be between 2 to 255 alphanumeric characters long and allows special characters like .,@,_,-";
	String campaign_range1_error = "Campaign Name should be between 2 to 255 alphanumeric characters long and allows special characters like .,@,_,-";
	String campaign_type_empty_error = "Campaign Type is required.";
	String campaign_DID_empty_error = "DID is required.";
	String campaign_DID_range_error = "DID should be between 3 to 16 digits long and allows prefix +";
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
	String skill_empty_error = "Skills is required.";
	String mapping_empty_error = "Mapping Name is required.";
	String upload_empty_error = "File to Upload is required.";
	String dial_Int_err="Dial Interval(in Sec) is required.";
	String AppUrl_empty_err="App. URL is required.";
	String AppUrl_invalid_err="App. URL seems to be invalid.";
	String concurrentcalls_error = "Max Concurrent Calls is required.";
	String concurrentcalls_range_error = "Max Concurrent Calls should be between 1 and 99.";
	String cust_ringTime_error ="Customer Ringing Time is required.";
	String cust_ringTimeRange_error ="Customer Ringing Time should be between 1 and 90.";
	String pacing_ratio_empty_error ="Pacing Ratio(Calls:Agent) is required.";
	String pacing_ratio_validity_error ="Pacing Ratio(Calls:Agent) seems to be invalid.";
	String drop_ratio_empty_error ="Max Drop Ratio (%) is required.";
	String drop_ratio_range_error ="Max Drop Ratio (%) should be between 1 and 99.";
	String Map_name_error ="Map Name is required.";
	String Map_name_range_error ="Map Name should be between 2 to 50 characters.";
	String Map_name_Spl_error ="Map Name allows alphanumeric characters with Underscore";
	String Map_file_error ="Mapping File is required.";
	String Map_sample_tooltip ="Download Sample";
	String Map_xls_tooltip ="Upload file should be in XLS format only, Download the XLS for sample.";
	String mapping_tooltip ="Add Mapping";
	
	
	public ValidateCampaignPageTest() {
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
		AddCampaignPage =AdminHomepage.clickOnAddCampaignButton("outBound");
//		JavascriptExecutor jse = (JavascriptExecutor)driver1;
//		jse.executeScript("return document.getElementsByClassName('am-scroll-top')[0].remove();");
		}
	
	
	@Test (priority=1)
	public void ValidateCampaignNameErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_name_empty_error);
	}
	
	@Test (priority=2)
	public void ValidateCampaignNameRangeErrorMsg() {
		AddCampaignPage.enterCampaignName("c");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_range1_error);
	}
	
	@Test (priority=3)
	public void ValidateCampaignNameSplRangeErrorMsg() {
		AddCampaignPage.enterCampaignName("@");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg =AddCampaignPage.getCampaignNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_range1_error);
		
	}
	@Test (priority=4)
	public void ValidateCampaignTypeErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getCampaignTypeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_type_empty_error);		
	}
	
	@Test (priority=5)
	public void ValidateDidErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_empty_error);
	}
	
	@Test (priority=6)
	public void ValidateDidRangeErrorMsg() {
		AddCampaignPage.EnterDID("c");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	
	@Test (priority=7)
	public void ValidateDidRangeMaxErrorMsg() {
		AddCampaignPage.EnterDID("12345678901234567");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDidError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, campaign_DID_range_error);
	}
	
	@Test (priority=8)
	public void ValidateStartTimeErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getStartTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, startTime_empty_error);
	}
	
	@Test (priority=9)
	public void ValidateEndTimeErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getEndTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, endTime_empty_error);
	}
	
	@Test (priority=10)
	public void ValidateGreaterEndTimeErrorMsg() {
		AddCampaignPage.EnterStartTime("01:02:03");
		AddCampaignPage.EnterEndTime("01:02:02");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getEndTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, endTime_greater_error);
	}
	
	@Test (priority=11)
	public void ValidatePriorityErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPriorityError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, priority_empty_error);
	}
	
	@Test (priority=12)
	public void ValidatePriorityRangeErrorMsg() {
		AddCampaignPage.EnterPriority("0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPriorityError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, priority_range_error);
	}

	@Test (priority=13)
	public void ValidatePluginNameErrorMsg() {
		AddCampaignPage.SelectHitScreenPopURlAt("Plugin", "");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPluginNameError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, plugin_Name_error);
	}
	
	@Test (priority=14)
	public void ValidateTriesErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getTriesError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Tries_empty_error);
	}
	
	@Test (priority=15)
	public void ValidateTriesRangeErrorMsg() {
		AddCampaignPage.EnterNoOfTries("0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getTriesError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Tries_range_error);
	}
	
	@Test (priority=16)
	public void ValidateTriesRangemaxErrorMsg() {
		AddCampaignPage.EnterNoOfTries("11");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getTriesError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Tries_range_error);
	}
	
	@Test (priority=17)
	public void ValidateWrapupErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getWrapupError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, WrapUp_empty_error);
	}
	
	@Test (priority=18)
	public void ValidateDispositionErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDispositionsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, disp_empty_error);
	}
	
	@Test (priority=19)
	public void ValidateSkillErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getSkillsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, skill_empty_error);
	}
	
	@Test (priority=20)
	public void ValidateMapErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getMappingError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, mapping_empty_error);
	}
	
	@Test (priority=21)
	public void ValidateUploadErrorMsg() {
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getUploadError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, upload_empty_error);
	}
	
	@Test (priority=22)
	public void ValidateDialIntervalErrorMsg() {
		AddCampaignPage.SelectCampaignType("Progressive");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getDialIntervalError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, dial_Int_err);
	}
	
	@Test (priority=23)
	public void ValidateAppUrlEmptyErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getAppURLError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AppUrl_empty_err);
	}
	
	@Test (priority=24)
	public void ValidateAppUrlInvalidErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.EnterAppURL("abc");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getAppURLError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, AppUrl_invalid_err);
	}
	
	@Test (priority=25)
	public void ValidateConcurrentCallsEmptyErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getConcurrentCallsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, concurrentcalls_error);
	}
	
	@Test (priority=26)
	public void ValidateConcurrentCallsRangeErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.EnterMaxConcurrentCalls("0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getConcurrentCallsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, concurrentcalls_range_error);
	}
	
	@Test (priority=27)
	public void ValidateConcurrentCallsMaxRangeErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.EnterMaxConcurrentCalls("100");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getConcurrentCallsError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, concurrentcalls_range_error);
	}
	
	@Test (priority=28)
	public void ValidateCustomerRingTimeEmptyErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getCustomerRingingTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, cust_ringTime_error);
	}
	
	@Test (priority=29)
	public void ValidateCustomerRingTimeRangeErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.enterCustomerRingTime("0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getCustomerRingingTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, cust_ringTimeRange_error);
	}
	
	@Test (priority=30)
	public void ValidateCustomerRingTimeRangeMaxErrorMsg() {
		AddCampaignPage.SelectCampaignType("IVR");
		AddCampaignPage.enterCustomerRingTime("91");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getCustomerRingingTimeError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, cust_ringTimeRange_error);
	}
	
	@Test (priority=31)
	public void ValidatePacingRatioEmptyErrorMsg() {
		AddCampaignPage.SelectCampaignType("Predictive");
		AddCampaignPage.EnterPacingRatio1(" ");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPacingRatioError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, pacing_ratio_empty_error);
	}
	
	@Test (priority=32)
	public void ValidatePacingRatioInvalidErrorMsg() {
		AddCampaignPage.SelectCampaignType("Predictive");
		AddCampaignPage.EnterPacingRatio("0:0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getPacingRatioError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, pacing_ratio_validity_error);
	}
	
	@Test (priority=33)
	public void ValidateMaxDropRatioEmptyErrorMsg() {
		AddCampaignPage.SelectCampaignType("Predictive");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getMaxDropRatioError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, drop_ratio_empty_error);
	}
	
	@Test (priority=34)
	public void ValidateMaxDropRatioRangeErrorMsg() {
		AddCampaignPage.SelectCampaignType("Predictive");
		AddCampaignPage.EnterMaxDropRatio("0");
		AddCampaignPage.ClickOnSaveCampaign();
		Err_msg=AddCampaignPage.getMaxDropRatioError();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, drop_ratio_range_error);
	}
	
	@Test (priority=35)
	public void ValidateEmptyMapNameErrorMsg() {
		AddCampaignPage.ClickOnADDMapping();
		AddCampaignPage.SubmitOnADDMapping();
		Err_msg=AddCampaignPage.getMappingNameError();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_name_error);
	}
	
	@Test (priority=36)
	public void ValidateMapNameRangeErrorMsg() {
		AddCampaignPage.ClickOnADDMapping();
		AddCampaignPage.EnterMappingName("o");
		AddCampaignPage.SubmitOnADDMapping();
		Err_msg=AddCampaignPage.getMappingNameError();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_name_range_error);
	}
	
	@Test (priority=37)
	public void ValidateMapNameSplRangeErrorMsg() {
		AddCampaignPage.ClickOnADDMapping();
		AddCampaignPage.EnterMappingName("@");
		AddCampaignPage.SubmitOnADDMapping();
		Err_msg=AddCampaignPage.getMappingNameError();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_name_Spl_error);
	}
	
	@Test (priority=38)
	public void ValidateMapFileErrorMsg() {
		AddCampaignPage.ClickOnADDMapping();
		AddCampaignPage.SubmitOnADDMapping();
		Err_msg=AddCampaignPage.getMappingFileError();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_file_error);
	}
	
	@Test (priority=39)
	public void ValidateMapFileSampleTooltipMsg() {
		AddCampaignPage.ClickOnADDMapping();
		Err_msg=AddCampaignPage.getMappingFileSampleTooltip();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_sample_tooltip);
	}
	
	@Test (priority=40)
	public void ValidateMapFileXlsOnlyTooltipMsg() {
		AddCampaignPage.ClickOnADDMapping();
		Err_msg=AddCampaignPage.getMappingFileXlsOnlyTooltip();
		AddCampaignPage.CloseOnADDMapping();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_xls_tooltip);
	}
	
	@Test (priority=41)
	public void ValidateFileUploadSampleTooltipMsg() {
		Err_msg=AddCampaignPage.getFileUploadSampleTooltip();
		//System.out.println("err msg1 is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_sample_tooltip);
	}
	
	@Test (priority=42)
	public void ValidateFileUploadXlsOnlyTooltipMsg() {
		Err_msg=AddCampaignPage.getFileUploadXlsOnlyTooltip();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, Map_xls_tooltip);
	}
	
	@Test (priority=43)
	public void ValidateMappingTooltipMsg() {
		Err_msg=AddCampaignPage.getMappingTooltip();
		//System.out.println("err msg is: "+Err_msg);
		Assert.assertEquals(Err_msg, mapping_tooltip);
	}
	
	@Test (priority=44)
	public void ValidateConsolidatedErrMsg() {
		Err_msg=AddCampaignPage.ConsolidatedErrorMessage();
		System.out.println("err msg is: "+Err_msg);
		//Assert.assertEquals(Err_msg, mapping_tooltip);
	}
	
	
		
	@AfterClass
	public void nteardown() {
		//System.out.println(driver1.getCurrentUrl());
		AdminHomepage.admin_logout();
		driver1.close();
		Printhyphens();
	}
	
	
	
	
	
	
	
	
	
	

}
