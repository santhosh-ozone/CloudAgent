package com.CA.qa.Pages;

import java.util.Set;

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
	
	@FindBy(id= "EmailReportMenu")
	WebElement EmailReportMenu;
	
	@FindBy(id= "AgentDashBoardMenu")
	WebElement AgentDashBoardMenu;
	
	@FindBy(xpath= "//*[@id='table1']/div[1]/span")
	WebElement AgentDashBoard_BasedOnCallType;
	
	@FindBy(xpath= "//*[@id='table2']/div[1]/span")
	WebElement AgentDashBoard_BasedOnCallMode;
	
	@FindBy(xpath= "//*[@aria-controls='dispositionSummary']")
	WebElement AgentDashBoard_dispositionSummary_tab;
	
	@FindBy(xpath= "//*[@id='dispositionReportDiv']/p")
	WebElement AgentDashBoard_dispositionSummary_Lastfetched ;
	
	@FindBy(xpath= "//*[@aria-controls='loginReport']")
	WebElement AgentDashBoard_loginReport_tab;
	
	@FindBy(xpath= "//*[@id='agentLoginReportDiv']/p")
	WebElement AgentDashBoard_loginReport_Lastfetched ;
	
	@FindBy(id= "AgentDashBoardGroupWiseMenu")
	WebElement AgentDashBoardGroupWiseMenu;
	
	@FindBy(id= "MissedCallReportMenu")
	WebElement MissedCallReportMenu;
	
	@FindBy(xpath= "//*[@id='misscallReport']/tbody/tr[1]/td[1]")
	WebElement MissedCallReport_first_record;
	
	
	
	
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
	
	public void clickOnEmailReportMenu() {
		javascriptClickforAdmin(EmailReportMenu);
	}
	public String GetTotalCallsOnEmailReport() {
		String str=totalCalls.getText();
		String[] str1=str.split(":");
		//System.out.println("============="+str1[1]+"====");
		return str1[2].trim();
	}
	
	public void clickOnAgentDashBoardMenu() {
		String p_wh = driver1.getWindowHandle();
		javascriptClickforAdmin(AgentDashBoardMenu);
		Set<String> whs=driver1.getWindowHandles();
		for(String wh:whs)
			if(!(wh==p_wh))
				driver1.switchTo().window(wh);
	}
	
	public String GetTextFromBasedOnCallTypefield() {
		return AgentDashBoard_BasedOnCallType.getText();
	}
	public String GetTextFromBasedOnCallModefield() {
		return AgentDashBoard_BasedOnCallMode.getText();
	}
	public void ClickDispositionSummeryTabOnAGDashbpard() {
		javascriptClickforAdmin(AgentDashBoard_dispositionSummary_tab);
	}
	public String GetTextFromAgentDashBoard_dispositionSummary_Lastfetchedfield() {
		return AgentDashBoard_dispositionSummary_Lastfetched.getText();
	}	
	
	public void ClickAgentLoginReportTabOnAGDashbpard() {
		javascriptClickforAdmin(AgentDashBoard_loginReport_tab);
	}
	
	public String GetTextFromAgentDashBoard_loginReport_Lastfetchedfield() {
		return AgentDashBoard_loginReport_Lastfetched.getText();
	}
	
	public void clickOnMissedCallReportMenu() {
		javascriptClickforAdmin(MissedCallReportMenu);
	}
	public String GetDataFromFirstCellOnMissedCallReport() {
		return MissedCallReport_first_record.getText();
	}
	
	public void clickOnAgentDashBoardGroupWiseMenu() {
		String p_wh = driver1.getWindowHandle();
		javascriptClickforAdmin(AgentDashBoardGroupWiseMenu);
		Set<String> whs=driver1.getWindowHandles();
		for(String wh:whs)
			if(!(wh==p_wh))
				driver1.switchTo().window(wh);
	}
	
	
	
	
}
