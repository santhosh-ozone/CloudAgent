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
	
	public DashBoardPageTest() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		DashBoardLogin();
		Adminloginpage = new AdminLoginPage();
		DashBoardpage = Adminloginpage.LoginIntoDashBoard(Testutil.Readexcel("DashBoardLogin",1).get(0),Testutil.Readexcel("DashBoardLogin",2).get(0));
		
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
	
//	@Test (priority = 1) 
//	public void verifyDashboardPage_TitleTest() {
//		String Act_AdminHomePageTitle = DashBoardpage.dashboardpageTitle();
//		Assert.assertEquals(Act_AdminHomePageTitle, Testutil.Exp_AdminhomePageTitle);
//		//System.out.println(Act_ATBHomePageTitle);
//	}
//	
//	@Test (priority = 2) 
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
//		String str=DashBoardpage.GetTotalCallsOnCdr();
//		Assert.assertTrue(!str.isBlank(), "message");
//	}
//	@Test (priority = 3) 
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
	
	@Test (priority = 5) 
	public void verifyTotalRecordsOnDialCountReportTest() {
		DashBoardpage.clickOnReportsMenu();
		DashBoardpage.clickOnDialerCountReportsMenu();
		String Act_PageTitle = DashBoardpage.dashboardpageTitle();
		Assert.assertEquals(Act_PageTitle, dialerCountReport_title);
		
		String Act_PageHeading = DashBoardpage.GetMainheading();
		Assert.assertEquals(Act_PageHeading, dialerCountReport_title);
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        //Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -7);
        Date todate1 = cal.getTime();  
        String s_time = dateFormat.format(todate1);
       // System.out.println("============================================="+s_time);
		DashBoardpage.EnterFromTimeOfDialerCountReport(s_time);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DATE, -1);
		Date todate2 = cal1.getTime();  
        String t_time = dateFormat.format(todate2);
        //System.out.println("============================================="+t_time);
        DashBoardpage.EnterToTimeOfDialerCountReport(t_time);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DashBoardpage.ClickOngenerateOnCDR();
		String str=DashBoardpage.GetTotalCallsOnDialerCountReport();
		Assert.assertTrue(!str.isBlank(), "message");
	}


}
