package com.CA.qa.TestCases;

import java.io.File;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.DashBoardPage;
import com.CA.qa.Util.Testutil;

public class DashBoardPageTest extends TestBase{
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	DashBoardPage DashBoardpage;
	
	String dialerCountReport_title ="Dialer Count Report";
	String cdrPage_title="Call Details Report";
	String EmailReport_tilte ="Email Report";
	String MissedCallReport_tilte ="Missed Call Report";
	String AgentDashboard_title ="Agent Dashboard";
	String Agentcallbacks_title ="Agent CallBacks";
	String Agentcallbacks_header ="CallBacks";
	
	String AgentpauseReport_header ="Agent Pause/Break Report";
	String AgentpauseGroupWiseReport_header ="Agent Pause/Break Report-Group Wise";
	String CustomerInterestReport_header ="Customer Interest Report (Missed Calls)";
	String CustomerInterestReport_SMS_header ="Customer Interaction report (SMS)";
	String CustomerInterestReport_CheckPoint_header ="Customer Interaction report (Check Point)";
	String PriUtilizationReport_header ="PriUtilization Report";
	String PriUtilizationReport_Title ="PRI Utilization";
	String ConfernceReport_Title ="Conference Report";
	
	
	
	public DashBoardPageTest() {
		super();
	}

	@BeforeMethod(groups= {"The smoke test"})
	@Parameters("TesterName")
	public void setup(Method method, String TesterName) {
		System.out.println("Test name: " + method.getName()+"     Executed By:  "+TesterName);
		DashBoardLogin();
		Adminloginpage = new AdminLoginPage();
		DashBoardpage = Adminloginpage.LoginIntoDashBoard(Testutil.Readexcel("DashBoardLogin",1).get(0),Testutil.Readexcel("DashBoardLogin",2).get(0));
		
	}
	@AfterMethod(groups= {"The smoke test"})
	public void teardown(Method method, ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) 
			Testutil.takeScreenshotAtEndOfTest(driver1, method.getName());
		//driver.quit();
		System.out.println(driver1.getCurrentUrl());
		driver1.quit();
		Printhyphens();
	}
	
//	@Test (priority = 1,groups= {"The smoke test"}) 
//	public void verifyDashboardPage_TitleTest() {
//		String Act_AdminHomePageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_AdminHomePageTitle, Testutil.Exp_AdminhomePageTitle);
//		//System.out.println(Act_ATBHomePageTitle);
//	}
//	
//	@Test (priority = 2, groups= {"The smoke test","The func test"}) 
//	public void verifyTotalCallsonCDRDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnCDRReportMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle, cdrPage_title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, cdrPage_title);
//		
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str1=DashBoardpage.GetDataFromFirstCellOnCdr();
//		Assert.assertTrue(!str1.isBlank(), "message");
//		
//		String str=DashBoardpage.GetTotalCallsOnCdr();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 3, groups= {"The func test"}) 
//	public void verifyTotalCallsonCDRDumpDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnCDRReportMenu();
//		DashBoardpage.ClickOngenerateDumpOnCDR();
//		String str=DashBoardpage.GetTotalCallsOnCdr();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 4) 
//	public void verifyTotalRecordsOnDialCountReportTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnDialerCountReportsMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle, dialerCountReport_title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, dialerCountReport_title);
//		
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetTotalCallsOnDialerCountReport();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 5) 
//	public void verifyDateFiltersOnDialCountReportTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnDialerCountReportsMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle, dialerCountReport_title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, dialerCountReport_title);
//		
//		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//        //Date date = new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DATE, -7);
//        Date todate1 = cal.getTime();  
//        String s_time = dateFormat.format(todate1);
//       // System.out.println("============================================="+s_time);
//		DashBoardpage.EnterFromTimeOfDialerCountReport(s_time);
//		
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Calendar cal1 = Calendar.getInstance();
//		cal1.add(Calendar.DATE, -1);
//		Date todate2 = cal1.getTime();  
//        String t_time = dateFormat.format(todate2);
//        //System.out.println("============================================="+t_time);
//        DashBoardpage.EnterToTimeOfDialerCountReport(t_time);
//		try {
//			Thread.sleep(1500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetTotalCallsOnDialerCountReport();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 6) 
//	public void verifyEmailReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnEmailReportMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle, EmailReport_tilte);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, EmailReport_tilte);
//		
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetTotalCallsOnEmailReport();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 7) 
//	public void verifyMissedCallReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnMissedCallReportMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle, MissedCallReport_tilte);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, MissedCallReport_tilte);
//		
//		String str=DashBoardpage.GetDataFromFirstCellOnMissedCallReport();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 8) 
//	public void verifyAgentDashboardtDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnAgentDashBoardMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("======================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle, AgentDashboard_title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, AgentDashboard_title);
//		
//		String a = DashBoardpage.GetTextFromBasedOnCallModefield();
//		Assert.assertTrue(a.contains("Based On Call Mode"), "message");	
//				
//		String b = DashBoardpage.GetTextFromBasedOnCallTypefield();
//		Assert.assertTrue(b.contains("Based On Call Type"), "message");	
//		
//		DashBoardpage.ClickDispositionSummeryTabOnAGDashbpard();
//		
//		String c = DashBoardpage.GetTextFromAgentDashBoard_dispositionSummary_Lastfetchedfield();
//		Assert.assertTrue(c.contains("Last fetch"), "message");			
//		
//		DashBoardpage.ClickAgentLoginReportTabOnAGDashbpard();
//		
//		String d = DashBoardpage.GetTextFromAgentDashBoard_loginReport_Lastfetchedfield();
//		Assert.assertTrue(d.contains("Last fetch"), "message");			
//		
//	}
//	
//	@Test (priority = 9) 
//	public void verifyAgentDashBoardGroupWiseMenutDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnAgentDashBoardGroupWiseMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		//System.out.println("======================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle, AgentDashboard_title);
//		
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, AgentDashboard_title);
//		
//		String a = DashBoardpage.GetTextFromBasedOnCallModefield();
//		Assert.assertTrue(a.contains("Based On Call Mode"), "message");	
//				
//		String b = DashBoardpage.GetTextFromBasedOnCallTypefield();
//		Assert.assertTrue(b.contains("Based On Call Type"), "message");	
//		
//		DashBoardpage.ClickDispositionSummeryTabOnAGDashbpard();
//		
//		String c = DashBoardpage.GetTextFromAgentDashBoard_dispositionSummary_Lastfetchedfield();
//		Assert.assertTrue(c.contains("Last fetch"), "message");			
//		
//		DashBoardpage.ClickAgentLoginReportTabOnAGDashbpard();
//		
//		String d = DashBoardpage.GetTextFromAgentDashBoard_loginReport_Lastfetchedfield();
//		Assert.assertTrue(d.contains("Last fetch"), "message");			
//		
//	}
//	@Test (priority = 10) 
//	public void verifyAgentCallbackReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnAgentCallbacksMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_PageTitle,Agentcallbacks_title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, Agentcallbacks_header);
//		
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetDataFromFirstCellOnCallBackReport();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 11) 
//	public void verifyAgentPauseReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnAgentpauseReportMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,AgentpauseReport_header);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		Assert.assertEquals(Act_PageHeading, AgentpauseReport_header);
//		
//		DashBoardpage.ClickOnSelectALLAgentsOnpauseReport();
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetDataFromFirstCellOnAgentBreakReport();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 12) 
//	public void verifyAgentPauseGroupWiseReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnAgentBreakReportGroupWiseMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,AgentpauseReport_header);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		System.out.println("=================="+Act_PageHeading);
//		Assert.assertEquals(Act_PageHeading, AgentpauseGroupWiseReport_header);
//		
//		DashBoardpage.ClickOnSelectALLAgentsOnpauseReport();
//		DashBoardpage.ClickOngenerateOnCDR();
//		String str=DashBoardpage.GetDataFromFirstCellOnAgentBreakGroupwiseReport();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 13) 
//	public void verifyCustomerInterestReportReportDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnCustomerInterestReportMenu();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,CustomerInterestReport_header);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		System.out.println("=================="+Act_PageHeading);
//		Assert.assertEquals(Act_PageHeading, CustomerInterestReport_header);
//		
//		DashBoardpage.ClickOnSelectALLCampaignsOnCustomerInterestReport();
//		DashBoardpage.clickOnCustomerInterestReport_search();
//		String str=DashBoardpage.GetDataFromFirstCellOnCustomerInterestReport();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 14) 
//	public void verifyCustomerInterestReportReport_SMSDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnCustomerInterestReportMenu_sms();
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,CustomerInterestReport_SMS_header);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		System.out.println("=================="+Act_PageHeading);
//		Assert.assertEquals(Act_PageHeading, CustomerInterestReport_SMS_header);
//		
//		DashBoardpage.clickOnCustomerInterestReport_sms_search();
//		String str=DashBoardpage.GetDataFromFirstCellOnCustomerInterestReport_SMS();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	
//	@Test (priority = 15) 
//	public void verifyCustomerInterestReportReport_CheckPointDisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnCustomerInterestReportMenu_CheckPoint();
//		
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,CustomerInterestReport_CheckPoint_header);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		System.out.println("=================="+Act_PageHeading);
//		Assert.assertEquals(Act_PageHeading, CustomerInterestReport_CheckPoint_header);
//		
//		DashBoardpage.clickOnCustomerInterestReport_checkPoint_search();
//		String str=DashBoardpage.GetDataFromFirstCellOnCustomerInterestReport_CheckPoint();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//		
//		DashBoardpage.clickOnCustomerInterestReport_checkPoint_searchAll();
//		String str1=DashBoardpage.GetDataFromFirstCellOnCustomerInterestReport_CheckPoint();
//		System.out.println("====================="+str1);
//		Assert.assertTrue(!str1.isBlank(), "message");
//		}
//	
//	@Test (priority = 16) 
//	public void verifyPriUtilisationReport_DisplayedTest() {
//		DashBoardpage.clickOnReportsMenu();
//		DashBoardpage.clickOnPriUtilizationReportMenu();
//		
//		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
//		System.out.println("================"+Act_PageTitle);
//		Assert.assertEquals(Act_PageTitle,PriUtilizationReport_Title);
//		
//		String Act_PageHeading = DashBoardpage.GetMainheading();
//		System.out.println("=================="+Act_PageHeading);
//		Assert.assertEquals(Act_PageHeading, PriUtilizationReport_header);
//		
//		DashBoardpage.clickOnPriUtilizationReport_search();
//		String str=DashBoardpage.GetDataFromFirstCellOnPriUtilizationReport();
//		System.out.println("====================="+str);
//		Assert.assertTrue(!str.isBlank(), "message");
//		
//		}
	
	@Test (priority = 17) 
	public void verifyConferenceReport_DisplayedTest() {
		DashBoardpage.clickOnReportsMenu();
		DashBoardpage.clickOnConferenceReportMenu();
		
		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
		System.out.println("Title================"+Act_PageTitle);
		Assert.assertEquals(Act_PageTitle,ConfernceReport_Title);
		
		String Act_PageHeading = DashBoardpage.GetMainheading();
		System.out.println("Header=================="+Act_PageHeading);
		Assert.assertEquals(Act_PageHeading, ConfernceReport_Title);
		
		DashBoardpage.clickOnConferenceReport_search();
		String str=DashBoardpage.GetDataFromFirstCellOnConferenceReport();
		System.out.println("first Cell====================="+str);
		Assert.assertTrue(!str.isBlank(), "message");
		
		}
	
	
	
	
	
}
