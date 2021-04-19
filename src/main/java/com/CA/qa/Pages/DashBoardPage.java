package com.CA.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	
	
}
