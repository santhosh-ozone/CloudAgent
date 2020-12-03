package com.CA.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class AddCampaignPage extends TestBase{
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement Campaignheader;
	
	@FindBy(id= "campaignForm_campaign_campignName")
	WebElement CampaignName;
	
	@FindBy(id= "select2-campaignForm_campaign_campaignType-container")
	WebElement CampaignType;
	
	@FindBy(id= "wwctrl_campaignForm_campaign_ivrFlow_flowId")
	WebElement IvrFlow;
	
	@FindBy(xpath = "//li[@title='Progressive']")
	WebElement ProgressiveCampaign;
	
	@FindBy(xpath = "//li[@title='Preview']")
	WebElement PreviewCampaign;
	
	@FindBy(xpath = "//li[@title='IVR']")
	WebElement IvrCampaign;
	
	@FindBy(xpath ="//li[@title='Predictive']")
	WebElement PredictiveCampaign;
	
	@FindBy(id= "select2-campaignForm_campaign_dialMethod-container")
	WebElement CampaigndialMethod;
	
	@FindBy(xpath = "//li[@title='Nonagentwise']")
	WebElement Nonagentwise;
	
	@FindBy(xpath= "//li[@title='Agentwise']")
	WebElement Agentwise;
	
	@FindBy(xpath= "//li[@title='Skillwise']")
	WebElement Skillwise;

	@FindBy(id= "campaignForm_campaign_did")
	WebElement DID;
	
	@FindBy(id= "campaignForm_campaign_ruleNac")
	WebElement PacingRatio;
	
	@FindBy(id= "campaignForm_campaign_dropRatio")
	WebElement dropRatio;
	
	@FindBy(id= "campaignForm_campaign_appURL")
	WebElement appURL;

	@FindBy(id= "campaignForm_campaign_dataLimit")
	WebElement MaxConcurrentCalls;
	
	@FindBy(id= "campaignForm_campaign_runtimeStart")
	WebElement Start_Time;
	
	@FindBy(id= "campaignForm_campaign_runtimeEnd")
	WebElement End_Time;

	@FindBy(id= "campaignForm_campaign_dialInterval")
	WebElement dialInterval;
	
	@FindBy(id= "campaignForm_campaign_priority")
	WebElement Campaign_Priority;
	
	@FindBy(id= "campaignForm_campaign_callbackUrl")
	WebElement URL_to_PUSH;

	@FindBy(id= "campaignForm_campaign_popUrlAt")
	WebElement Hit_ScreenPop_URl_At;
	
	@FindBy(id= "campaignForm_campaign_screenPopUrl")
	WebElement ScreenPop_URl;

	@FindBy(id= "campaignForm_pluginId")
	WebElement PlugIn;
	
	//@FindBy(id= "campaignForm_campaign_script")
	//WebElement script;
	
	@FindBy(xpath= "//*[@id=\"campaignForm\"]//div[@class=\"note-editable panel-body\"]")
	WebElement script;
	
	@FindBy(id= "campaignForm_campaign_ruleNot")
	WebElement No_Of_Tries;

	@FindBy(id= "wwlbl_campaignForm_campaign_offLineMode")
	WebElement offLineMode;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_allowedManual")
	WebElement allowedManual;
	
	@FindBy(id= "campaignForm_campaign_dndEnable")
	WebElement DND_Enabled_checkbox;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_dndEnable")
	WebElement DND_Enabled_label;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_formatPhoneNumber")
	WebElement STD_Enabled_label;
	
	@FindBy(id= "campaignForm_campaign_formatPhoneNumber")
	WebElement STD_Enabled_checkbox;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_customerFirst")
	WebElement DaialcustomerFirst;

	@FindBy(id= "wwlbl_campaignForm_campaign_holdAgent")
	WebElement Dial_by_holding_agent;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_recentFirst")
	WebElement recentFirst;

	@FindBy(id= "wwlbl_campaignForm_campaign_acwNac")
	WebElement ACW_for_UnAnsweredCalls;
	
	@FindBy(id= "wwlbl_campaignForm_campaign_dncEnabled")
	WebElement Apply_DNC_lable;
	
	@FindBy(id= "campaignForm_campaign_dncEnabled")
	WebElement Apply_DNC_checkbox;
	
//	@FindBy(id= "campaignForm_campaign_customerRingingTime")
//	WebElement customer_ring_time;
	
	@FindBy(id= "select2-campaignForm_campaign_dispositionType-container")
	WebElement dispositionType;

	@FindBy(xpath ="//li[@title='Toolbar']")
	WebElement dispositionType_ToolBar;
	
	@FindBy(xpath ="//li[@title='API']")
	WebElement dispositionType_API;
	
	@FindBy(xpath ="//li[@title='None']")
	WebElement dispositionType_NONE;
	
	@FindBy(id= "campaignForm_campaign_sla")
	WebElement WrapupTime;

	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_assignedDispositions']//li/input")
	WebElement Dispositions;
	
	@FindBy(xpath= "//*[@id='ng-app']/body/span/span/div/input[2]")
	WebElement SelectAllDispositions;
	
	//@FindBy(id= "select2-campaignForm_globalDispositions-results")
	//WebElement AllDispositionsList;
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_assignedDispositions-results']/li")
	List<WebElement> AllDispositionsList;
	
//	@FindBy(id= "select2-results__option select2-results__option--highlighted")
//	WebElement Dispositions_highlighted;

	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_assignedSkills']//input[@type='search']")
	WebElement Skills;
	
	@FindBy(xpath= "//*[contains(@title,'unselect')]")
	WebElement UnselectAll;
	
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_assignedSkills-results']/li")
	List<WebElement> AllSkillsList;
	
//	@FindBy(className= "select2-results__option select2-results__option--highlighted")
//	WebElement Skill_highlighted;
	
	@FindBy(id= "moveAllLeft1")
	WebElement moveAllLeft1;
	
	@FindBy(id= "moveAllRight1")
	WebElement moveAllRight1;
	
	@FindBy(id= "moveRight1")
	WebElement moveRight1;
	
	@FindBy(xpath= "//*[@id='skillList']/option")
	List<WebElement> skills_stage88;
		
	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_campaignSubUsers']//input[@type='search']")
	WebElement Users_assigned;
	
	@FindBy(xpath= "//*[@id='select2-campaignForm_campaignSubUsers-results']//li")
	List<WebElement> AllUsersList;
	
	@FindBy(id= "select2-campaignForm_campaign_previewDataMap_id-container")
	WebElement Mapping;

	@FindBy(xpath= "//span/input[@class='select2-search__field']")
	WebElement MappingText;
	
	@FindBy(xpath ="//*[@class='select2-results__option select2-results__option--highlighted']")
	WebElement select_highlighted;
	
	@FindBy(id= "campaignForm_file")
	WebElement uploadFile;
	
	@FindBy(id= "uploadText")
	WebElement uploadText;
	
	@FindBy(id= "select2-campaignForm_holdMusicFile-container")
	WebElement OnHold;
	
	@FindBy(xpath= "//span/*[@class='select2-search__field']")
	WebElement OnHold_input;
	
	@FindBy(id= "select2-campaignForm_transferMusicFile-container")
	WebElement OnTransfer;
	
	@FindBy(id= "campaignForm_button_save")
	WebElement Save_button;
	
	@FindBy(xpath= "//*[@id='parsley-id-5']/*")
	WebElement CampaignName_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-7']/*")
	WebElement CampaignType_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-11']/*")
	WebElement DID_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-21']/*")
	WebElement StartTime_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-23']/*")
	WebElement EndTime_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-31']/*")
	WebElement Priority_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-43']/*")
	WebElement Tries_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-79']/*")
	WebElement Wrapup_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-multiple-assignedDispositions']/*")
	WebElement Dispositions_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-multiple-assignedSkills']/*")
	WebElement Skills_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-93']/*")
	WebElement Mapping_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-29']/*")
	WebElement DialInterval_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-95']/*")
	WebElement Upload_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-17']/*")
	WebElement AppURL_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-19']/*")
	WebElement ConcurrentCalls_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-75']/*")
	WebElement CustomerRingingTime_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-15']/*")
	WebElement MaxDropRatio_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-39']/*")
	WebElement PluginName_error;

	@FindBy(xpath= "//*[@id='parsley-id-13']/*")
	WebElement PacingRatio_error;

	@FindBy(id= "campaignForm_campaign_customerRingingTime")
	WebElement customer_ring_time;
	
	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_campaign_previewDataMap_id']//*[@onclick='createDataMap()']")
	WebElement map_create;
	
	@FindBy(xpath= "//*[@id='parsley-id-5']/*")
	WebElement map_Name_error;
	
	@FindBy(xpath= "//*[@id='parsley-id-7']/*")
	WebElement map_File_error;
	
	@FindBy(id= "previewDataMapForm_name")
	WebElement Map_Name;
	
	@FindBy(id= "uploadText")
	WebElement Map_File_upload;
	
	@FindBy(id= "previewDataMapForm_button_submit")
	WebElement Map_Submit_button;
	
//	@FindBy(xpath= "//*[@id=\"previewDataMapForm\"]/div[3]/div/div")
//	WebElement Map_Submit_button;
	
	//*[@id="previewDataMapForm_button_submit"]
	@FindBy(xpath= "//*[@id='wwctrl_previewDataMapForm_previewDataMap_sheet']//*[@onclick]")
	WebElement map_download_sample;
	
	@FindBy(xpath= "//*[@id='wwctrl_previewDataMapForm_previewDataMap_sheet']//*[@onclick]/following-sibling::*")
	WebElement map_download_xls_Only;
	
	@FindBy(xpath= "//*[@id='genericModalDialog']//*[contains(text(),'Data Mapping')]/preceding-sibling::*/i")
	WebElement map_close_button;
	
	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_campaign_file']//*[@onclick]")
	WebElement FileUpload_download_sample;
	
	@FindBy(xpath= "//*[@id='wwctrl_campaignForm_campaign_file']//*[@onclick]/following-sibling::*")
	WebElement FileUpload_download_xls_Only;
	
	@FindBy(id= "campaignForm_button_cancel")
	WebElement Cancel_button;
	
	public AddCampaignPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public void enterCampaignName(String cname) {
		CampaignName.clear();
		CampaignName.sendKeys(cname);
	}
	
	public void enterCustomerRingTime(Object sec) {
		try {
		if(!sec.equals("") && customer_ring_time.isDisplayed() ) {
		customer_ring_time.clear();
		customer_ring_time.sendKeys(sec.toString().trim());
	}}catch(NoSuchElementException e) {
	}}
		
	public void SelectCampaignType(Object ctype) {
		if(!ctype.equals("")) {
			try {
				if(CampaignType.isDisplayed())
				CampaignType.click();
		if(ctype.toString().contains("Preview")|| ctype.toString().equalsIgnoreCase("preview") )
			PreviewCampaign.click();
		else if(ctype.toString().contains("Progressive") || ctype.toString().equalsIgnoreCase("progressive"))
			ProgressiveCampaign.click();
		else if(ctype.toString().contains("IVR") || ctype.toString().equalsIgnoreCase("ivr"))
			IvrCampaign.click();
		else if(ctype.toString().contains("Predictive") || ctype.toString().equalsIgnoreCase("predictive")) {
			PredictiveCampaign.click();
			//driver1.findElement(By.id("campaignForm_campaign_customerRingingTime")).sendKeys("30");
		}
		}catch(NoSuchElementException e) {
		}
		}
	}
	
	public void SelectDialMethod(Object dmethod) {
		if(!dmethod.equals(""))
		try {
		if(CampaigndialMethod.isDisplayed()) {
		CampaigndialMethod.click();
		if(dmethod.toString().contains("Nonagentwise") || dmethod.toString().equalsIgnoreCase("nonagentwise"))
			Nonagentwise.click();
		else if(dmethod.toString().contains("Agentwise")|| dmethod.toString().equalsIgnoreCase("agentwise"))
			Agentwise.click();
		else if(dmethod.toString().contains("Skillwise") || dmethod.toString().equalsIgnoreCase("skillwise"))
			Skillwise.click();
		}	}catch(NoSuchElementException e) {
		}
		}
	
	public void EnterDID(String did) {
		if(!did.equals("")) {
		DID.clear();
		DID.sendKeys(did);
	}}
	
	public void ClickOnADDMapping() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		JavascriptExecutor jse = (JavascriptExecutor)driver1;
		jse.executeScript("scroll(0,500)");
		//jse.executeScript("return document.getElementsByClassName('am-scroll-top')[0].remove();");

		map_create.click();
	}
	
	public void SubmitOnADDMapping() {
		driver1.switchTo().frame("modal_iframe");
		Map_Submit_button.submit();
		driver1.switchTo().defaultContent();
	}
	
	public void CloseOnADDMapping() {
		//driver1.switchTo().frame("modal_iframe");
		map_close_button.click();
		//driver1.switchTo().defaultContent();
	}
	
	public void EnterAppURL(Object url) {
		if(!url.equals(""))
		try {
			if(appURL.isDisplayed())
			appURL.sendKeys(url.toString().trim());
	}catch(NoSuchElementException e) {
	}
	}
	
	public void SelectIvrFlow(Object I) {
		if(!I.equals("")) {
			try {
				if(IvrFlow.isDisplayed()) {
					IvrFlow.click();
					OnHold_input.sendKeys(I.toString().trim());
					select_highlighted.click();
				}
			}catch(NoSuchElementException e) {
			}
		}
		
	}
	public void EnterMaxConcurrentCalls(Object m) {
		if(!m.equals(""))
		try {
			if(MaxConcurrentCalls.isDisplayed())
			{
				JavascriptExecutor jse = (JavascriptExecutor)driver1;
				jse.executeScript("scroll(1500,0)");
				MaxConcurrentCalls.clear();
				MaxConcurrentCalls.sendKeys(m.toString().trim());
			}
		}catch(NoSuchElementException e) {
		}
		
	}
	
	public void EnterPacingRatio(Object p) {
		if(!p.toString().trim().equals(""))
		try {
			if(PacingRatio.isDisplayed()) {
				PacingRatio.clear();
				PacingRatio.sendKeys(p.toString().trim());
			}}catch(NoSuchElementException e) {
		}
	}
	
	public void EnterPacingRatio1(Object p) {
		if(!p.toString().equals(""))
		try {
			if(PacingRatio.isDisplayed()) {
				PacingRatio.clear();
				PacingRatio.sendKeys(p.toString().trim());
			}}catch(NoSuchElementException e) {
		}
	}
	
	public void EnterMaxDropRatio(Object d) {
		if(!d.equals(""))
		try {
			if(dropRatio.isDisplayed())
				dropRatio.sendKeys(d.toString());
		}catch(NoSuchElementException e) {
		}
	}
	public void EnterStartTime(Object s_time) {
		if(!s_time.equals("")) {
			try {
			if(Start_Time.isDisplayed()) {
				//Start_Time.clear();
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", Start_Time);
		Start_Time.sendKeys(s_time.toString());}
			}catch(NoSuchElementException e) {
			}
	}
	}
	
	public void EnterEndTime(Object e_time) {
		if(!e_time.equals("")) {
		try {
			if(End_Time.isDisplayed()) {
				//End_Time.clear();
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", End_Time);
		End_Time.sendKeys(e_time.toString());}
	}catch(NoSuchElementException e) {
	}
		}
	}
	
	
	public void EnterDialInterval(Object di) {
		if(!di.equals(""))
		try {
		if(dialInterval.isDisplayed()) 
		dialInterval.sendKeys(di.toString());
	}catch(NoSuchElementException e) {
	}
	}
	
	public void EnterPriority(Object P) {
		if(!P.equals("")) {
			try {
				if(Campaign_Priority.isDisplayed()) {
					Campaign_Priority.clear();
					Campaign_Priority.sendKeys(P.toString());
				}
	}catch(NoSuchElementException e) {
	}
	}}
	
	public void EnterURLtoPush(Object url) {
		if(!url.equals("") )
			try {
				if(URL_to_PUSH.isDisplayed()) {
					URL_to_PUSH.clear();
					URL_to_PUSH.sendKeys(url.toString());
				}
			}catch(NoSuchElementException e) {
			}
		
	}
	
	
	public void SelectHitScreenPopURlAt(Object at, Object pn ) {
		if(!at.equals("")) 
			try {
				if(Hit_ScreenPop_URl_At.isDisplayed()) {
			Select dd=new Select (Hit_ScreenPop_URl_At);
			dd.selectByVisibleText(at.toString());
			if(at.toString().equalsIgnoreCase("Plugin")) {
				Select dd1 = new Select(PlugIn);
				if(!pn.equals("")) 
				dd1.selectByVisibleText(pn.toString());
				}
			}
		
	}catch(NoSuchElementException e) {
		}
	}
	
	public void EnterScreenPopURL(Object url) {
		if(!url.equals(""))
		try {
			if(ScreenPop_URl.isDisplayed())
				ScreenPop_URl.sendKeys(url.toString());
		}catch(NoSuchElementException e) {
		}
		
	}
	
	public void EnterScript(Object s) {
		if(!s.equals("")) {
			try {
				if(script.isDisplayed())
				script.sendKeys(s.toString().trim());
	}catch(NoSuchElementException e) {}
	}
	}
	
	public void EnterNoOfTries(Object T) {
		if(!T.equals("")) {
			try {
				if(No_Of_Tries.isDisplayed()) {
					No_Of_Tries.clear();
		No_Of_Tries.sendKeys(T.toString().trim());}
	}catch(NoSuchElementException e) {
	}
	}		
	}
	
	public void EnableOfflineMode(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(offLineMode.isDisplayed()&& !offLineMode.isSelected())
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", offLineMode);
		}
			//offLineMode.click();
		}catch(NoSuchElementException e) {
		} else if (E.equalsIgnoreCase("no"))
		try {
			if(offLineMode.isDisplayed()&& offLineMode.isSelected())
				offLineMode.click();
		}catch(NoSuchElementException e) {
		}
		
	}
		
	
	public void EnableAllowedForManualDialing(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(allowedManual.isDisplayed() && !allowedManual.isSelected() )
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", allowedManual);
		}
			//allowedManual.click();
		}catch(NoSuchElementException e) {
		} else if (E.equalsIgnoreCase("No"))
			try {
				if(allowedManual.isDisplayed() && allowedManual.isSelected() )
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", allowedManual);
				}
					//allowedManual.click();
				}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableDND(String E) {
//		System.out.println("dnd selcted status: "+DND_Enabled_checkbox.isSelected());
//		System.out.println("dnd dispalyed:"+DND_Enabled_label.isDisplayed());
		if(E.equalsIgnoreCase("YES"))
			try {
				if(DND_Enabled_label.isDisplayed() && !DND_Enabled_checkbox.isSelected())	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", DND_Enabled_checkbox);
			//System.out.println("inside if;dnd status: "+DND_Enabled_checkbox.isSelected());
			//DND_Enabled.click();
			}
		}catch(NoSuchElementException e) {
			}else if(E.equalsIgnoreCase("no"))
				try {
					if(DND_Enabled_label.isDisplayed() && DND_Enabled_checkbox.isSelected())	
						{
						JavascriptExecutor js = (JavascriptExecutor)driver1;
						js.executeScript("arguments[0].click();", DND_Enabled_checkbox);
						//System.out.println("inside else case: dnd status: "+DND_Enabled_checkbox.isSelected());
						//DND_Enabled.click();
						}
					}catch(NoSuchElementException e) {
						}
		//System.out.println("dnd status: "+DND_Enabled_checkbox.isSelected());	
		
	}
	
	public void EnableSTD(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(STD_Enabled_label.isDisplayed() && !STD_Enabled_checkbox.isSelected())	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", STD_Enabled_checkbox);
			//STD_Enabled.click();
			}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(STD_Enabled_label.isDisplayed() && STD_Enabled_checkbox.isSelected())	
					{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", STD_Enabled_checkbox);
					//STD_Enabled.click();
					}
				}catch(NoSuchElementException e) {
				} 
		
	}
	
	public void EnableDialCustomerFirst(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(DaialcustomerFirst.isDisplayed() && !DaialcustomerFirst.isSelected())	
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", DaialcustomerFirst);
			//DaialcustomerFirst.click();
			//driver1.findElement(By.id("campaignForm_campaign_customerRingingTime")).sendKeys("30");
		}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(DaialcustomerFirst.isDisplayed() && DaialcustomerFirst.isSelected())	
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", DaialcustomerFirst);
					//DaialcustomerFirst.click();
				}
				}catch(NoSuchElementException e) {
				} 
		
	}
	
	public void EnableDialbyholdingAgent(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(Dial_by_holding_agent.isDisplayed() && !Dial_by_holding_agent.isSelected() )	
			{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Dial_by_holding_agent);
			//Dial_by_holding_agent.click();
			}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(Dial_by_holding_agent.isDisplayed() && Dial_by_holding_agent.isSelected() )	
					{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", Dial_by_holding_agent);
					//Dial_by_holding_agent.click();
					}
				}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableRecentFirst(String E) {
		if(E.equalsIgnoreCase("YES"))
		try {
		if(recentFirst.isDisplayed() && !recentFirst.isSelected() )
		{
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", recentFirst);
			//recentFirst.click();
		}
		}catch(NoSuchElementException e) {
		}else if(E.equalsIgnoreCase("no"))
			try {
				if(recentFirst.isDisplayed() && recentFirst.isSelected() )
				{
					JavascriptExecutor js = (JavascriptExecutor)driver1;
					js.executeScript("arguments[0].click();", recentFirst);
					//recentFirst.click();
				}
			}catch(NoSuchElementException e) {
				}
		
	}
	
	public void EnableACWforUnAnsweredCalls(String E) {
		if(E.contains("YES") || E.equalsIgnoreCase("yes"))
		try {
		if(ACW_for_UnAnsweredCalls.isDisplayed())
			ACW_for_UnAnsweredCalls.click();
	}catch(NoSuchElementException e) {
		}
		
	}
	
	
	public void EnableDNC(Object D) {
		if(D.toString().trim().contains("YES") || D.toString().trim().equalsIgnoreCase("yes"))
		try {
		if(Apply_DNC_lable.isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Apply_DNC_checkbox);
			//Apply_DNC_checkbox.click();
			}
	}catch(NoSuchElementException e) {
		}
		
	}
	
	public void SelectDispositionType(String DispType) {
		if(!DispType.equals("")) {
//		JavascriptExecutor js = (JavascriptExecutor)driver1;
//		js.executeScript("arguments[0].click();", dispositionType);
		dispositionType.click();
		if(DispType.contains("Toolbar") || DispType.equalsIgnoreCase("toolbar")) 
			dispositionType_ToolBar.click();
		else if(DispType.contains("API")|| DispType.equalsIgnoreCase("api"))
			dispositionType_API.click();
		else if(DispType.contains("NONE") || DispType.equalsIgnoreCase("none"))
			dispositionType_NONE.click();
		else dispositionType_ToolBar.click();
	}}
	
	public void EnterCustomerRingTime(Object crt) {
		if(!crt.equals("")) {
		try {
			if(customer_ring_time.isDisplayed())
				customer_ring_time.sendKeys(crt.toString().trim());
	}catch(NoSuchElementException e) {
		
	}
	}
	}
	
	public void EnterWrapupTime(String w) {
		
		if(!w.equals("")) {
		try {
			if(WrapupTime.isDisplayed())
				WrapupTime.sendKeys(w);
	}catch(NoSuchElementException e) {
	}
	}}
	
	public void SelectDisposition(String D) {
		if(!D.equals("")) {
			Dispositions.click();
			UnselectAll.click();
		if(D.contains(",")) {
			String words[]=D.split(",");
			for (String u: words) {
				if(u.trim().equalsIgnoreCase("all")) {
					Dispositions.sendKeys(" ");
					for (WebElement w:AllDispositionsList) {
						if(!w.getText().equals(""))
						w.click();}
					break;
				} else {
					Dispositions.sendKeys(u);
					for (WebElement w:AllDispositionsList)
						w.click();
				}
				Dispositions.clear();
			}
		}
			else if(D.equalsIgnoreCase("all")){
				//Dispositions.sendKeys(" ");
			//Dispositions.click();
//			for (WebElement w:AllDispositionsList) {
//				if(!w.getText().equals(""))
//				w.click();
//			Dispositions.clear();}
				Dispositions.sendKeys(" ");
				SelectAllDispositions.click();		
		}
		else {
			Dispositions.sendKeys(D);
			for (WebElement w:AllDispositionsList)
				w.click();
		}}
	}
	
	public void SelectSkills(String S) {
		if(!S.equals("")) {
			Skills.click();
			UnselectAll.click();
		if(S.contains(",")) {
			String words[]=S.split(",");
			for (String u: words) {
				if(u.trim().equalsIgnoreCase("all")) {
					//System.out.println(u);
					//Skills.clear();
					Skills.sendKeys(" ");
					for (WebElement w:AllSkillsList) {
						if(!w.getText().equals(""))
						w.click();}
					break;
				} else {
					//System.out.println(u);
					//Skills.clear();
					Skills.sendKeys(u);
					for (WebElement w:AllSkillsList)
						w.click();
				}
				Skills.clear();
			}
			}
		else if(S.equalsIgnoreCase("all")) {
			Skills.sendKeys(" ");
			for (WebElement w:AllSkillsList)
				if(!w.getText().equals(""))
				w.click();
		} else {
			Skills.sendKeys(S);
			for (WebElement w:AllSkillsList)
				w.click();
		}
	}}
	
	public void EnterSkillsforStaging88(Object S) {
		if(!S.equals("")) {
			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
			moveAllLeft1.click();
//			for (WebElement w:skills_stage88) {
//				System.out.println("skill name:"+w.getText());
//				w.click();}
//			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
				for (String u: words) {
					if(u.trim().equalsIgnoreCase("all")) {
						((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
						moveAllRight1.click();
						break;
					} 
					else {
						for (WebElement w:skills_stage88) {
							if(w.getText().contains(u)) {
							w.click();
							((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
							moveRight1.click();
							}
						}
						}
				}
			}
			else if(S.toString().trim().equalsIgnoreCase("all")) {
				((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-1000)", "");
				moveAllRight1.click();}
			else {
				for (WebElement w:skills_stage88) {
					System.out.println("in for loop");
					if(w.getText().contains(S.toString().trim())) {
						System.out.println("in if");
//					driver1.findElement(By.className("am-scroll-top")).click();
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//					
					
					//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", moveRight1);	
					System.out.println("scroll over");
					w.click();
					System.out.println("skill click over");
					((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,-2000)", "");
					moveRight1.click();
					System.out.println("move right over");
					}
				}
				}
			}
	}
	
	public void SelectUsers(Object S) {
		try {
		if(!S.equals("")) {
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
				for (String u: words) {
					if(u.trim().equalsIgnoreCase("all")) {
						//Users_assigned.clear();	
						Users_assigned.sendKeys(" ");
						for (WebElement w:AllUsersList) {
							if(!w.getText().equals(""))
							w.click();}
						break;
					} else {
						//Users_assigned.clear();		
						Users_assigned.sendKeys(u.trim());
						for (WebElement w:AllUsersList)
							w.click();
					}
					Users_assigned.clear();}
			}
			else if(S.toString().trim().equalsIgnoreCase("all")){
				Users_assigned.clear();	
				Users_assigned.sendKeys(" ");
				for (WebElement w:AllUsersList)
					w.click();
			}else {
				Users_assigned.clear();		
				Users_assigned.sendKeys(S.toString().trim());
				if(AllUsersList.get(0).getText().equals("No results found")) {
					Users_assigned.sendKeys(Keys.TAB);
				}
				else for (WebElement w:AllUsersList)
						w.click();
				
			}
		}
	}
		catch(NoSuchElementException e) {
		
	}}
	
	public void SelectMapping(Object M) {
		if(!M.equals("")) {
			try {
				if(Mapping.isDisplayed()) {
		Mapping.click();
		MappingText.sendKeys(M.toString());
		select_highlighted.click();}
	}catch(NoSuchElementException e) {
	}
		}			
}
	
	public void EnterMappingName(Object N) {
		if(!N.equals("")) {
			driver1.switchTo().frame("modal_iframe");
			Map_Name.sendKeys(N.toString().trim());
			driver1.switchTo().defaultContent();
		}
	}
	
	public void FiletoUpload(Object path) {
		if(!path.equals("")) {
			try {
				if(uploadText.isDisplayed()) {
		((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('style')", uploadFile);
		//System.out.println(path.toString());
		uploadFile.sendKeys(path.toString());
		}
	}catch(NoSuchElementException e) {
	}
		}			
}
	
	public void SelectHoldMusic(Object H) {
		if(!H.toString().trim().equals("")) {
			try {
				if(OnHold.isDisplayed()) {
				OnHold.click();
				OnHold_input.sendKeys(H.toString());
				select_highlighted.click();
				}
			}catch(NoSuchElementException e) {
			}
		}
	}
	
	public void SelectTransferMusic(Object T) {
		
		if(!T.toString().trim().equals("")) {
			try {
				if(OnHold.isDisplayed()) {
				JavascriptExecutor jse = (JavascriptExecutor)driver1;
				jse.executeScript("scroll(0, 1500)");
				
				OnTransfer.click();
				OnHold_input.sendKeys(T.toString());
				select_highlighted.click();
		}}catch(NoSuchElementException e) {
		}
	}
}
	
	
	public void ClickOnSaveCampaign() {
		JavascriptExecutor js = (JavascriptExecutor) driver1;

		js.executeScript("arguments[0].style.height = '50px'", script);
		Save_button.click();
		//document.getElementById(script).style.height = "50px";
		//System.out.println("clicked save");
	}
	
	public void ClickOnCancelCampaign() {
		Cancel_button.click();
	}

	public String getCampaignNameError() {
		try {
			if(CampaignName_error.isDisplayed())
				return CampaignName_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getCampaignTypeError() {
		try {
			if(CampaignType_error.isDisplayed())
				return CampaignType_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getDidError() {
		try {
			if(DID_error.isDisplayed())
				return DID_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getStartTimeError() {
		try {
			if(StartTime_error.isDisplayed())
				return StartTime_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getEndTimeError() {
		try {
			if(EndTime_error.isDisplayed())
				return EndTime_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getPriorityError() {
		try {
			if(Priority_error.isDisplayed())
				return Priority_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getTriesError() {
		try {
			if(Tries_error.isDisplayed())
				return Tries_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}

	public String getWrapupError() {
		try {
			if(Wrapup_error.isDisplayed())
				return Wrapup_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getDispositionsError() {
		try {
			if(Dispositions_error.isDisplayed())
				return Dispositions_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getSkillsError() {
		try {
			if(Skills_error.isDisplayed())
				return Skills_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getMappingError() {
		try {
			if(Mapping_error.isDisplayed())
				return Mapping_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getMappingNameError() {
		driver1.switchTo().frame("modal_iframe");
		String errmsg= map_Name_error.getText();
		driver1.switchTo().defaultContent();
		return errmsg;
	}
	
	public String getMappingFileError() {
		driver1.switchTo().frame("modal_iframe");
		String errmsg= map_File_error.getText();
		driver1.switchTo().defaultContent();
		return errmsg;
	}
	
	public String getMappingFileSampleTooltip() {
		driver1.switchTo().frame("modal_iframe");
		String errmsg=  map_download_sample.getAttribute("data-original-title");
		driver1.switchTo().defaultContent();
		return errmsg;
	}
	
	public String getMappingFileXlsOnlyTooltip() {
		driver1.switchTo().frame("modal_iframe");
		String errmsg= map_download_xls_Only.getAttribute("data-original-title");
		driver1.switchTo().defaultContent();
		return errmsg;
	}
	
	public String getFileUploadSampleTooltip() {
		
		return FileUpload_download_sample.getAttribute("data-original-title");
	}
	
	public String getFileUploadXlsOnlyTooltip() {
		
		return FileUpload_download_xls_Only.getAttribute("data-original-title");
	}
	
	public String getMappingTooltip() {
		
		return map_create.getAttribute("data-original-title");
	}
	
	public String getDialIntervalError() {
		try {
			if(DialInterval_error.isDisplayed())
				return DialInterval_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}

	public String getUploadError() {
		try {
			if(Upload_error.isDisplayed())
				return Upload_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getAppURLError() {
		try {
			if(AppURL_error.isDisplayed())
				return AppURL_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getConcurrentCallsError() {
		try {
			if(ConcurrentCalls_error.isDisplayed())
				return ConcurrentCalls_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getCustomerRingingTimeError() {
		try {
			if(CustomerRingingTime_error.isDisplayed())
				return CustomerRingingTime_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getMaxDropRatioError() {
		try {
			if(MaxDropRatio_error.isDisplayed())
				return MaxDropRatio_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}
	
	public String getPluginNameError() {
		try {
			if(PluginName_error.isDisplayed())
				return PluginName_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}

	public String getPacingRatioError() {
		try {
			if(PacingRatio_error.isDisplayed())
				return PacingRatio_error.getText();
		}catch(NoSuchElementException e) {
		}return "";
	}

	public String ConsolidatedErrorMessage(){
		String Con_err_msg= getCampaignNameError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getCampaignTypeError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getDidError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getStartTimeError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getEndTimeError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getPriorityError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getPluginNameError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getTriesError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getWrapupError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getDispositionsError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getSkillsError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getMappingError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getUploadError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getDialIntervalError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getAppURLError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getConcurrentCallsError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getCustomerRingingTimeError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getPacingRatioError();
		if(Con_err_msg.trim().equals(""))
			Con_err_msg =Con_err_msg+getMaxDropRatioError();
		
			return Con_err_msg;
	}





	
}
