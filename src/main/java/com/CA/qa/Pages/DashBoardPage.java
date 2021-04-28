package com.CA.qa.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.qa.Base.TestBase;

public class DashBoardPage extends TestBase{
	
	@FindBy(id= "ReportMenu")
	WebElement ReportMenu;
	
	@FindBy(id= "CDRReportMenu")
	WebElement CDRReportMenu;
	
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement main_heading;
	
	@FindBy(id= "reportForm_button_generate")
	WebElement Report_generate;
	
	@FindBy(id= "reportForm_report_button_dump")
	WebElement Report_generate_dump;
	
	@FindBy(id= "table_filter")
	WebElement totalCalls;
	
	@FindBy(xpath= "//*[@id='reportList']/tbody/tr[1]/td[1]")
	WebElement cdr_first_record;
	
	@FindBy(id= "CampaignDataCountReportMenu")
	WebElement DialerCountReport;
	
	@FindBy(id= "checkme")
	WebElement enableAgentFilter_DialerCountReport;
	
	@FindBy(id= "reportForm_fromTime")
	WebElement fromTime_DialerCountReport;
	
	@FindBy(id= "reportForm_toTime")
	WebElement ToTime_DialerCountReport;
	
	@FindBy(id= "wwlbl_reportForm_campaignId")
	WebElement CampaignFilter_DialerCountReport;
	
	@FindBy(id= "wwlbl_reportForm_agentId")
	WebElement AgentFilter_DialerCountReport;
	
	
	
	
	
	
	
	
	public DashBoardPage() {
		PageFactory.initElements(driver1, this);
	}
	
	public String dashboardpageTitle() {
		return driver1.getTitle();
	}
	public void clickOnReportsMenu() {
		javascriptClickforAdmin(ReportMenu);
	}
	public void clickOnCDRReportMenu() {
		javascriptClickforAdmin(CDRReportMenu);
	}
	
	public String GetMainheading() {
		return main_heading.getText();
	}
	public void ClickOngenerateOnCDR() {
		javascriptClickforAdmin(Report_generate);
	}
	public void ClickOngenerateDumpOnCDR() {
		javascriptClickforAdmin(Report_generate_dump);
	}
	public String GetTotalCallsOnCdr() {
		String str=totalCalls.getText();
		String[] str1=str.split("::");
		//System.out.println("============="+str1[1]+"====");
		return str1[1].trim();
	}
	public String GetDataFromFirstCellOnCdr() {
		return cdr_first_record.getText();
	}
	
	public void clickOnDialerCountReportsMenu() {
		javascriptClickforAdmin(DialerCountReport);
	}
	public void EnterFromTimeOfDialerCountReport(Object s_time) {
		if(!s_time.equals("")) {
			try {
			if(fromTime_DialerCountReport.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", fromTime_DialerCountReport);
		fromTime_DialerCountReport.clear();
		fromTime_DialerCountReport.sendKeys(s_time.toString());}
			}catch(NoSuchElementException e) {
			}
	}
	}
	public void EnterToTimeOfDialerCountReport(Object s_time) {
		if(!s_time.equals("")) {
			try {
			if(ToTime_DialerCountReport.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", ToTime_DialerCountReport);
		ToTime_DialerCountReport.clear();
		ToTime_DialerCountReport.sendKeys(s_time.toString());}
			}catch(NoSuchElementException e) {
				System.out.println("time is: "+s_time+"======EXCEPTION IN TO TIME +++++++++++++++");
			}
	}
	}
	public String GetTotalCallsOnDialerCountReport() {
		String str=totalCalls.getText();
		String[] str1=str.split(":");
		//System.out.println("============="+str1[1]+"====");
		return str1[1].trim();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
