package com.CA.qa.Pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

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
	
	@FindBy(id= "CallBackMenu")
	WebElement AgentCallBackMenu;
	
	@FindBy(xpath= "//*[@id='callBackList']/tbody/tr[1]/td[1]")
	WebElement AgentCallBack_first_record;

	@FindBy(id= "AgentBreakReportMenu")
	WebElement AgentPause_breakMenu;
	
	@FindBy(xpath= "//input[@type='search']")
	WebElement AgentpauseReport_agent_search;

	@FindBy(id= "reportForm_agentId")
	WebElement AgentPause_SelectAgents;
	
	@FindBy(xpath= "//*[@id='agentBreakReport']/tbody/tr[1]/td[1]")
	WebElement agentBreakReport_first_record;
	
	@FindBy(id= "AgentBreakReportGroupWiseMenu")
	WebElement AgentBreakReportGroupWiseMenu;
	
	@FindBy(xpath= "//*[@id='agentBreakReportGroupWise']/tbody/tr[1]/td[1]")
	WebElement agentBreakReportGroupWise_first_record;
	
	@FindBy(id= "CallInboundLogsReportMenu")
	WebElement CustomerInterestReportMenu;
	
	@FindBy(id= "SmsOutboundLogsReportMenu")
	WebElement CustomerInterestReportMenu_sms;
	
	@FindBy(id= "callInboundLogForm_campaignIds")
	WebElement CustomerInterestReport_select;
	
	@FindBy(id= "callInboundLogForm_campaignIds")
	WebElement CustomerInterestReport_search;
	
	@FindBy(xpath= "//*[@id='callInboundLogsList']/tbody/tr[1]/td[1]")
	WebElement CustomerInterestReport_first_record;
	
	@FindBy(id= "smsOutboundLogsForm_button_search")
	WebElement CustomerInterestReportSMS_search;
	
	@FindBy(xpath= "//*[@id='smsOutboundLogsList']/tbody/tr[1]/td[1]")
	WebElement CustomerInterestReport_SMS_first_record;
	
	@FindBy(id= "CheckPointLogReportMenu")
	WebElement CustomerInterestReportMenu_checkPoint;
	
	@FindBy(id= "checkPointLogForm_button_search")
	WebElement CustomerInterestReport_checkPoint_search;
	
	@FindBy(id= "checkPointLogForm_button_search_dump")
	WebElement CustomerInterestReport_checkPoint_searchAll;
	
	@FindBy(xpath= "//*[@id='checkPointLogList']/tbody/tr[1]/td[1]")
	WebElement CustomerInterestReport_CheckPoint_first_record;
	
	@FindBy(id= "PriUtilizationReportMenu")
	WebElement PriUtilizationReportMenu;
	
	@FindBy(id= "priUtilizationListForm_button_search")
	WebElement PriUtilizationReport_search;
	
	@FindBy(xpath= "//*[@id='priUtilizationList']/tbody/tr[1]/td[1]")
	WebElement priUtilizationReport_first_record;
	
	@FindBy(id= "ConferenceReportsMenu")
	WebElement ConferenceReportsMenu;
	
	@FindBy(id= "conferenceReportsList_button_search")
	WebElement ConferenceReport_search;
	
	@FindBy(xpath= "//*[@id='report']/tbody/tr[1]/td[1]")
	WebElement ConferenceReport_first_record;
	
	@FindBy(id= "IVRHangupsReportMenu")
	WebElement IVRHangupsReportMenu;
	
	@FindBy(id= "reportForm_button_generate")
	WebElement IVRHangupsReportMenu_generate;
	
	@FindBy(xpath= "//*[@id='ivrhangupReportList  ']/tbody/tr[1]/td[1]")
	WebElement IVRHangupsReport_first_record;
	
	@FindBy(id= "AgentLogMenu")
	WebElement AgentLogMenu;
	
	@FindBy(id= "agentLogForm_button_search")
	WebElement agentLogReport_search;
	
	@FindBy(xpath= "//*[@id='agentLogList']/tbody/tr[1]/td[1]")
	WebElement AgentLogReport_first_record;
	
	@FindBy(id= "ChatDetailReportMenu")
	WebElement ChatDetailReportMenu;
	
	@FindBy(id= "chatReportForm_button_search")
	WebElement chatDetailReport_search;
	
	@FindBy(xpath= "//*[@id='chatDetailReportList']/tbody/tr[1]/td[1]")
	WebElement ChatDetailReport_first_record;
	
	@FindBy(id= "CustomerHoldReport")
	WebElement CustomerHoldReport;
	
	@FindBy(id= "PredictivePerformanceReport")
	WebElement PredictivePerformanceReportMenu;
	
	@FindBy(id= "slaReport")
	WebElement slaReportMenu;
	
	@FindBy(id= "reportForm_campaignIds")
	WebElement select_campaignIds_slaReport;
	
	@FindBy(id= "reportForm_skillIds")
	WebElement select_Skills_slaReport;
	
	@FindBy(id= "InboundProcessDashBoardMenu")
	WebElement SkillReportMenu;
	
	@FindBy(id= "form1_skillIds")
	WebElement select_Skills_skillReport;
	
	@FindBy(xpath= "//*[@value='Generate']")
	WebElement SkillReport_generate;
	
	@FindBy(xpath= "//*[@id='agentReport']/tbody/tr[1]/td[1]")
	WebElement SkillReport_agwise_first_record;
	
	@FindBy(xpath= "//*[@id='skillReport']/tbody/tr[1]/td[1]")
	WebElement SkillReport_skillwise_first_record;
	
	
	
	
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
	public void clickOnAgentCallbacksMenu() {
		javascriptClickforAdmin(AgentCallBackMenu);
	}
	public String GetDataFromFirstCellOnCallBackReport() {
		return AgentCallBack_first_record.getText();
	}
	
	public void ClickOnSelectALLAgentsOnpauseReport() {
		javascriptClickforAdmin(AgentpauseReport_agent_search);
		Select s=new Select(AgentPause_SelectAgents);
		s.selectByValue("0");
	}
	public void clickOnAgentpauseReportMenu() {
		javascriptClickforAdmin(AgentPause_breakMenu);
	}
	public String GetDataFromFirstCellOnAgentBreakReport() {
		return agentBreakReport_first_record.getText();
	}
	
	public void clickOnAgentBreakReportGroupWiseMenu() {
		javascriptClickforAdmin(AgentBreakReportGroupWiseMenu);
	}
	public String GetDataFromFirstCellOnAgentBreakGroupwiseReport() {
		return agentBreakReportGroupWise_first_record.getText();
	}
	public void clickOnCustomerInterestReportMenu() {
		javascriptClickforAdmin(CustomerInterestReportMenu);
	}
	
	public void ClickOnSelectALLCampaignsOnCustomerInterestReport() {
		javascriptClickforAdmin(AgentpauseReport_agent_search);
		Select s=new Select(CustomerInterestReport_select);
		s.selectByValue("0");
	}
	
	public void clickOnCustomerInterestReport_search() {
		javascriptClickforAdmin(CustomerInterestReport_search);
	}
	
	public String GetDataFromFirstCellOnCustomerInterestReport() {
		return CustomerInterestReport_first_record.getText();
	}
	
	public void clickOnCustomerInterestReportMenu_sms() {
		javascriptClickforAdmin(CustomerInterestReportMenu_sms);
	}
	
	public void clickOnCustomerInterestReport_sms_search() {
		javascriptClickforAdmin(CustomerInterestReportSMS_search);
	}
	public String GetDataFromFirstCellOnCustomerInterestReport_SMS() {
		return CustomerInterestReport_SMS_first_record.getText();
	}
	
	public void clickOnCustomerInterestReportMenu_CheckPoint() {
		javascriptClickforAdmin(CustomerInterestReportMenu_checkPoint);
	}
	
	public void clickOnCustomerInterestReport_checkPoint_search() {
		javascriptClickforAdmin(CustomerInterestReport_checkPoint_search);
	}
	
	public void clickOnCustomerInterestReport_checkPoint_searchAll() {
		javascriptClickforAdmin(CustomerInterestReport_checkPoint_searchAll);
	}
	public String GetDataFromFirstCellOnCustomerInterestReport_CheckPoint() {
		return CustomerInterestReport_CheckPoint_first_record.getText();
	}//PriUtilizationReportMenu
	
	public void clickOnPriUtilizationReportMenu() {
		javascriptClickforAdmin(PriUtilizationReportMenu);
	}
	
	public void clickOnPriUtilizationReport_search() {
		javascriptClickforAdmin(PriUtilizationReport_search);
	}
	public String GetDataFromFirstCellOnPriUtilizationReport() {
		return priUtilizationReport_first_record.getText();
	}
	
	public void clickOnConferenceReportMenu() {
		javascriptClickforAdmin(ConferenceReportsMenu);
	}
	
	public void clickOnConferenceReport_search() {
		javascriptClickforAdmin(ConferenceReport_search);
	}
	
	public String GetDataFromFirstCellOnConferenceReport() {
		return ConferenceReport_first_record.getText();
	}
	
	public void clickOnIVRHangupsReportMenu() {
		javascriptClickforAdmin(IVRHangupsReportMenu);
	}
	
	public void clickOnIVRHangupsReportMenu_generate() {
		//Testutil.flash(IVRHangupsReportMenu_generate, driver1);
		javascriptClickforAdmin(IVRHangupsReportMenu_generate);
	}
	
	public String GetDataFromFirstCellOnIVRHangupReport() {
		return IVRHangupsReport_first_record.getText();
	}
	
	public void clickOnAgentLogMenu() {
		javascriptClickforAdmin(AgentLogMenu);
	}
	
	public void clickOnagentLogReport_search() {
		//Testutil.flash(IVRHangupsReportMenu_generate, driver1);
		javascriptClickforAdmin(agentLogReport_search);
	}
	
	public String GetDataFromFirstCellOnAgentLogReport() {
		return AgentLogReport_first_record.getText();
	}
	
	public void clickOnChatDetailReportMenu() {
		javascriptClickforAdmin(ChatDetailReportMenu);
	}
	
	public void clickOnChatDetailReport_search() {
		//Testutil.flash(IVRHangupsReportMenu_generate, driver1);
		javascriptClickforAdmin(chatDetailReport_search);
	}
	
	public String GetDataFromFirstCellOnchatDetailReport() {
		return ChatDetailReport_first_record.getText();
	}
	public void clickOnCustomerHoldReportMenu() {
		javascriptClickforAdmin(CustomerHoldReport);
	}
	public void clickOnPredictivePerformanceReportMenu() {
		javascriptClickforAdmin(PredictivePerformanceReportMenu);
	}
	public void clickOnSLAReportMenu() {
		javascriptClickforAdmin(slaReportMenu);
	}
	public void ClickOnSelectALLCampaignsOnSLAReport() {
		//javascriptClickforAdmin(AgentpauseReport_agent_search);
		Select s=new Select(select_campaignIds_slaReport);
		s.selectByValue("0");
	}
	public void ClickOnSelectALLSkillsOnSLAReport() {
		//javascriptClickforAdmin(AgentpauseReport_agent_search);
		Select s=new Select(select_Skills_slaReport);
		s.selectByValue("0");
	}
	
	public void clickOnSkillReportMenu() {
		javascriptClickforAdmin(SkillReportMenu);
	}
	public void ClickOnSelectALLSkillsOnSkillReport() {
		//javascriptClickforAdmin(AgentpauseReport_agent_search);
		Select s=new Select(select_Skills_skillReport);
		s.selectByValue("0");
	}
	public String GetDataFromFirstCellOnSkillReportAgentStatus() {
		return SkillReport_agwise_first_record.getText();
	}
	public String GetDataFromFirstCellOnSkillReportSkillwise() {
		return SkillReport_skillwise_first_record.getText();
	}
	public void clickOnSkillReport_generate() {
		javascriptClickforAdmin(SkillReport_generate);
	}
	
	
	
	
	
	
}
