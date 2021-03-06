package com.CA.qa.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class ConfigurationsPage extends TestBase{

	@FindBy(id= "MainMenu")
	WebElement Admin_home;
	
	@FindBy(id= "ConfigurationMenu")
	WebElement ConfigurationMenu;
	
	@FindBy(id= "AgentMenu")
	WebElement Agentmenu;
	
	@FindBy(id= "AgentGroupMenu")
	WebElement AgentGroupMenu;
	
	@FindBy(id= "FwpNumberMenu")
	WebElement ph_no_menu;
	
	@FindBy(id= "TransferNumberMenu")
	WebElement TransferNumberMenu;
	
	@FindBy(id= "LocationMenu")
	WebElement LocationMenu;
	
	@FindBy(id= "UrlMapMenu")
	WebElement UrlMapMenu;
	
	@FindBy(id= "SkillMenu")
	WebElement SkillMenu;
	
	@FindBy(id= "SmsTemplateMenu")
	WebElement SmsTemplateMenu;
	
	@FindBy(id= "DispositionMenu")
	WebElement DispositionMenu;
	
	@FindBy(id= "DialOutNumberMenu")
	WebElement DialOutNumberMenu;
	
	@FindBy(id= "PauseReasonMenu")
	WebElement PauseReasonMenu;
	
	@FindBy(id= "BlockNumbersMenu")
	WebElement BlockNumbersMenu;
	
	@FindBy(id= "BlockNumbersGroupMenu")
	WebElement BlockNumbersGroupMenu;
	
	@FindBy(id= "IvrFlowMenu")
	WebElement IvrFlowMenu;
	
	@FindBy(id= "FeedBackMenu")
	WebElement FeedBackMenu;
	
	@FindBy(id= "FeedBackMasterMenu")
	WebElement FeedBackMasterMenu;

	@FindBy(id= "SipLocations")
	WebElement SipLocations;
	
	@FindBy(id= "campaignHoldMusicMenu")
	WebElement campaignHoldMusicMenu;
	
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement configurations_heading;
	
	@FindBy(xpath= "//*[contains(@data-original-title,'Add')] ")
	WebElement Config_Add_Button;
	
	@FindBy(xpath= "//*[@class='tools']")
	WebElement Config_Add_Button1;
	
	@FindBy(xpath= "//*[contains(@name,'search')]")
	WebElement Config_search_button;
	
	@FindBy(xpath="//*[contains(@onclick,'submit')]")
	WebElement Config_search_submit;
	
	@FindBy(className ="message")
	WebElement div_message;
	
	@FindBy(id= "pageSize")
	WebElement show_button;
	
	@FindBy(xpath="//*[@id='dispositionList']/tbody/tr")
	List<WebElement> disp_table_list;
	
	@FindBy(xpath="//*[@id='dialOutNumberList']/tbody/tr")
	List<WebElement> dialOut_table_list;
	
	@FindBy(xpath="//*[@id='pauseReasonList']/tbody/tr")
	List<WebElement> pauseReasonTable_list;
	
	@FindBy(xpath="//*[@id='blockNumbers']/tbody/tr")
	List<WebElement> blockNumbersTable_list;
	
	@FindBy(className= "pagination")
	WebElement pagination;
	
	@FindBy(id= "agentForm_agent_agentId")
	WebElement Agent_ID;
	
	@FindBy(id= "wwlbl_agentForm_agent_locked")
	WebElement Agent_Lock;
	
	@FindBy(id= "agentForm_agent_password")
	WebElement Agent_password;
	
	@FindBy(id= "agentForm_agent_agentName")
	WebElement Agent_Name;
	
	@FindBy(id= "agentForm_agent_priority")
	WebElement Agent_Priority;
	
	@FindBy(id= "agentForm_agent_email")
	WebElement Agent_email;
	
	@FindBy(id= "agentForm_agent_agentData")
	WebElement Agent_Data;
	
	@FindBy(className="select2-selection__arrow")
	WebElement Auto_answer_sip_calls;
	
	@FindBy(xpath= "//*[@id='select2-agentForm_agent_autoAnswer-results']/li")
	List<WebElement> AutoAnswer_options;
	
	@FindBy(id= "skill_table")
	WebElement skill_table;
	
	@FindBy(xpath= "//*[@id='wwctrl_agentForm_agentSkills']//input[@type='search']")
	WebElement Skills;
	
	@FindBy(xpath= "//*[@id='select2-agentForm_agentSkills-results']/li")
	List<WebElement> AllSkillsList;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agentSkills']//ul/li")
	List<WebElement> Selected_Skills;
	
	@FindBy(className="select2-selection__choice__remove")
	List<WebElement> removing_Skills;
	
//	@FindBy(xpath= "//*[@id='select2-agentForm_agentSkills-results']/li")
//	List<WebElement> AllSkillsSelected;
	
	@FindBy(id= "agentForm_agent_inbound")
	WebElement Agent_inbound;
	
	@FindBy(id= "agentForm_agent_manual")
	WebElement Agent_manual;
	
	@FindBy(id= "agentForm_agent_preview")
	WebElement Agent_Preview;
	
	@FindBy(id= "agentForm_agent_progressive")
	WebElement Agent_progressive;
	
	@FindBy(id= "agentForm_agent_blended")
	WebElement Agent_Blended;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agent_agentId']/ul/li")
	WebElement Agent_Id_Err;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agent_password']/ul/li")
	WebElement Agent_pwd_Err;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agent_agentName']/ul/li")
	WebElement Agent_name_Err;
	
	@FindBy(id= "parsley-id-14")
	WebElement Agent_priority_Err;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agent_email']/ul/li")
	WebElement Agent_email_Err;
	
	@FindBy(xpath ="//*[@id='wwctrl_agentForm_agent_agentData']/ul/li")
	WebElement Agent_data_Err;
	
	@FindBy(id= "parsley-id-multiple-agentModes")
	WebElement Agent_mode_Err;
	
	@FindBy(id= "agentGroupForm_agentGroup_name")
	WebElement AgentGroup_Name;
	
	@FindBy(id= "agentGroupForm_agentGroup_description")
	WebElement AgentGroup_description;

	@FindBy(xpath ="//*[@id='wwctrl_agentGroupForm_agentGroup_name']/ul/li")
	WebElement AgentGroup_Name_err;

	@FindBy(xpath ="//*[@id='wwctrl_agentGroupForm_agentGroup_description']/ul/li")
	WebElement AgentGroup_description_err;
	
	@FindBy(id= "parsley-id-multiple-assignedAgents")
	WebElement AgentGroup_assignedAgents_err;

	@FindBy(id= "parsley-id-multiple-assignedUsers")
	WebElement AgentGroup_assignedUsers_err;
		
	@FindBy(id= "fwpNumberForm_fwpNumber_name")
	WebElement Number_name;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_phoneNumber")
	WebElement Number_phoneNumber;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_priority")
	WebElement Number_priority;
	
	@FindBy(id= "fwpNumberForm_fwpNumber_sip")
	WebElement Number_sip;
	
	@FindBy(xpath= "//*[@id='wwlbl_fwpNumberForm_fwpNumber_sip' ] [@for='fwpNumberForm_fwpNumber_sip']")
	WebElement Number_sip1;
	
	@FindBy(xpath= "//*[@id='wwctrl_fwpNumberForm_fwpNumber_name']/ul/li")
	WebElement Phone_name_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_fwpNumberForm_fwpNumber_phoneNumber']/ul/li")
	WebElement Phone_Number_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_fwpNumberForm_fwpNumber_priority']/ul/li")
	WebElement Phone_priority_err;
		
	@FindBy(id= "transferNumberForm_transferNumber_transferName")
	WebElement transferName;
	
	@FindBy(id= "transferNumberForm_transferNumber_transferNumber")
	WebElement transferNumber;
	
	@FindBy(id= "transferNumberForm_transferNumber_sip")
	WebElement transferNumber_sip;
	
	@FindBy(xpath= "//*[@id='wwlbl_transferNumberForm_transferNumber_sip' ] [@for='transferNumberForm_transferNumber_sip']")
	WebElement transferNumber_sip1;
	
	@FindBy(xpath= "//*[@id='wwctrl_transferNumberForm_transferNumber_transferName']/ul/li")
	WebElement transferName_Err;
	
	@FindBy(xpath= "//*[@id='wwctrl_transferNumberForm_transferNumber_transferNumber']/ul/li")
	WebElement transferNumber_err;
	
	@FindBy(id= "skillForm_skill_skillName")
	WebElement skillName;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_skillName']/ul/li")
	WebElement SkillName_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_location_id']/ul/li")
	WebElement Skill_loc_err;
	
	@FindBy(id= "skillForm_skill_queueSize")
	WebElement skillQueueSize;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_queueSize']/ul/li")
	WebElement skill_queueSize_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_assignedAgents']/ul/li")
	WebElement skillForm_assignedAgents_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_assignedFwpNumbers']/ul/li")
	WebElement Skill_hunting_err;
	
	@FindBy(id= "skillForm_skill_skillDetail1")
	WebElement skill_skillDetail1;
	
	@FindBy(id= "skillForm_skill_skillDetail2")
	WebElement skill_skillDetail2;
	
	@FindBy(id= "skillForm_skill_skillDetail3")
	WebElement skill_skillDetail3;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_skillDetail1']/ul/li")
	WebElement skillDetail1_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_skillDetail2']/ul/li")
	WebElement skillDetail2_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_skillDetail3']/ul/li")
	WebElement skillDetail3_err;

	@FindBy(id= "skillForm_min")
	WebElement skillForm_queueTimeout_minutes;
	
	@FindBy(id= "skillForm_sec")
	WebElement skillForm_queueTimeout_seconds;

	@FindBy(id= "skillForm_skill_fallBackRule")
	WebElement skillForm_skill_fallBackRule;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_dialOutNumber_id']/ul/li")
	WebElement skill_dialOutNumber_err;

	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_queueIvrTransfer']/ul/li")
	WebElement queueIvrTransfer_err;

	@FindBy(id= "skillForm_skill_dropAction")
	WebElement skillForm_skill_dropAction;
	
	@FindBy(xpath= "//*[@id='wwgrp_skillForm_callDropActions_0__actionUrl']/ul/li")
	WebElement callDropActions_Url_err;

	@FindBy(id= "skillForm_callDropActions_0__actionValue")
	WebElement skillForm_callDropActions_tries;
	
	@FindBy(xpath= "//*[@id='wwgrp_skillForm_callDropActions_0__actionValue']/ul/li")
	WebElement callDropActions_tries_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_skillForm_skill_queueSkillTransfer_id']/ul/li")
	WebElement queueSkillTransfer_err;
	
	@FindBy(id= "moveAllLeft1")
	WebElement moveAllLeft1;
	
	@FindBy(id= "moveAllRight1")
	WebElement moveAllRight1;
	
	@FindBy(id= "moveRight1")
	WebElement moveRight1;
	
	@FindBy(xpath= "//*[@id='availableSkills']/option")
	List<WebElement> skills_stage88;
	
	@FindBy(id= "locationForm_location_name")
	WebElement LocationName;
	
	@FindBy(xpath= "//*[@id='wwctrl_locationForm_location_name']/ul/li")
	WebElement LocationName_err;
	
	@FindBy(id= "urlMapForm_urlMap_name")
	WebElement UrlMappingName;
	
	@FindBy(xpath= "//*[@id='wwctrl_urlMapForm_urlMap_name']/ul/li")
	WebElement URLMappingName_err;
	
	@FindBy(id= "urlMapForm_urlMap_domainName")
	WebElement urlMapForm_urlMap_domainName;
	
	@FindBy(xpath= "//*[@id='wwctrl_urlMapForm_urlMap_domainName']/ul/li")
	WebElement URLMappingDomainName_err;
	
	@FindBy(id= "urlMapForm_urlMap_localIp")
	WebElement urlMapForm_urlMap_localIp;
	
	@FindBy(xpath= "//*[@id='wwctrl_urlMapForm_urlMap_localIp']/ul/li")
	WebElement URLMappingLocalIP_err;
	
	@FindBy(id= "smsTemplateForm_smsTemplate_name")
	WebElement smsTemplateForm_smsTemplate_name;
	
	@FindBy(xpath= "//*[@id='wwctrl_smsTemplateForm_smsTemplate_name']/ul/li")
	WebElement smsTemplate_name_err;
	
	@FindBy(id= "smsTemplateForm_smsTemplate_text")
	WebElement smsTemplateForm_smsTemplate_text;
	
	@FindBy(xpath= "//*[@id='wwctrl_smsTemplateForm_smsTemplate_text']/ul/li")
	WebElement smsTemplate_text_err;
	
	@FindBy(id= "dispositionForm_disposition_reason")
	WebElement disposition_reason;
	
	@FindBy(xpath= "//*[@id='wwctrl_dispositionForm_disposition_reason']/ul/li")
	WebElement disposition_err;
	
	@FindBy(id= "dialOutNumberForm_dialOutNumber_dialOutName")
	WebElement dialOutName;
	
	@FindBy(xpath= "//*[@id='wwctrl_dialOutNumberForm_dialOutNumber_dialOutName']/ul/li")
	WebElement dialOutName_err;
	
	@FindBy(id= "dialOutNumberForm_dialOutNumber_dialOutNumber")
	WebElement dialOutNumber;
	
	@FindBy(xpath= "//*[@id='wwctrl_dialOutNumberForm_dialOutNumber_dialOutNumber']/ul/li")
	WebElement dialOutNumber_err;
	
	@FindBy(id= "dialOutNumberForm_dialOutNumber_sip")
	WebElement dialOutNumber_sip;
	
	@FindBy(id= "pauseReasonForm_pauseReason_reason")
	WebElement pauseReason_reason;
	
	@FindBy(xpath= "//*[@id='wwctrl_pauseReasonForm_pauseReason_reason']/ul/li")
	WebElement pauseReason_reason_err;
	
	@FindBy(id= "pauseReasonForm_pauseReason_formattedTimeLimit")
	WebElement pauseReason_Time;
	
	@FindBy(xpath= "//*[@id='wwctrl_pauseReasonForm_pauseReason_formattedTimeLimit']//a")
	WebElement pauseReasonTime_clear;
	
	@FindBy(id= "blockNumberForm_blockNumber_blockedNumber")
	WebElement blockNumber_blockedNumber;
	
	@FindBy(xpath= "//*[@id='wwctrl_blockNumberForm_blockNumber_blockedNumber']/ul/li")
	WebElement blockNumber_reason_err;
	
	@FindBy(xpath= "//*[contains(@type,'submit')]")
	WebElement BlockNo_Block_button;
	
	@FindBy(xpath= "//*[@id='blockNumberForm_blockNumber_unblock']")
	WebElement BlockNo_UnBlock_button;
	
	@FindBy(id= "blockNumberGroupForm_blockNumberGroup_name")
	WebElement blockNumberGroup_name;
	
	@FindBy(xpath= "//*[@id='wwctrl_blockNumberGroupForm_blockNumberGroup_name']/ul/li")
	WebElement blockNumberGroup_name_err;
	
	@FindBy(id= "blockNumberGroupForm_blockNumberGroup_description")
	WebElement blockNumberGroup_description;
	
	@FindBy(xpath= "//*[@id='wwctrl_blockNumberGroupForm_blockNumberGroup_description']/ul/li")
	WebElement blockNumberGroup_desc_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_blockNumberGroupForm_assignedBlockNumbers']/ul/li")
	WebElement blockNumberGroup_number_err;
	
	@FindBy(id= "ivrFlowForm_ivrFlow_flowName")
	WebElement ivrFlowForm_ivrFlow_flowName;
	
	@FindBy(xpath= "//*[@id='wwctrl_ivrFlowForm_ivrFlow_flowName']/ul/li")
	WebElement ivrFlowForm_ivrFlow_flowName_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_ivrFlowForm_ivrFlow_type']/ul/li")
	WebElement ivrFlowForm_ivrFlow_type_err;
	
	@FindBy(id= "feedBackForm_feedBack_feedbackName")
	WebElement feedBackForm_feedBack_feedbackName;
	
	@FindBy(xpath= "//*[@id='wwctrl_feedBackForm_feedBack_feedbackName']/ul/li")
	WebElement feedbackName_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_feedBackMasterForm_feedBackMaster_feedback_id']/ul/li")
	WebElement feedbackmasterName_err;
	
	@FindBy(id= "feedBackMasterForm_feedBackMaster_feedBack")
	WebElement feedBackMasterForm_feedBackMaster_feedBack;
	
	@FindBy(xpath= "//*[@id='wwctrl_feedBackMasterForm_feedBackMaster_feedBack']/ul/li")
	WebElement feedBackMaster_feedBack_err;
	
	@FindBy(id= "feedBackMasterForm_feedBackMaster_audioFile")
	WebElement feedBackMasterForm_feedBackMaster_audioFile;
	
	@FindBy(xpath= "//*[@id='wwctrl_feedBackMasterForm_feedBackMaster_audioFile']/ul/li")
	WebElement feedBackMaster_audioFile_err;
	
	@FindBy(id= "sipLocationForm_sipLocation_location")
	WebElement sipLocationForm_sipLocation_location;
	
	@FindBy(xpath= "//*[@id='wwctrl_sipLocationForm_sipLocation_location']/ul/li")
	WebElement sipLocation_location_err;
	
	@FindBy(id= "sipLocationForm_sipLocation_sipUrl")
	WebElement sipLocationForm_sipLocation_sipUrl;
	
	@FindBy(xpath= "//*[@id='wwctrl_sipLocationForm_sipLocation_sipUrl']/ul/li")
	WebElement sipLocation_sipUrl_err;
	
	@FindBy(xpath= "//*[@id='wwctrl_sipLocationForm_assignedAgents']/ul/li")
	WebElement sipLocationForm_assignedAgents_err;
	
	@FindBy(id= "appAudioFilesForm_appAudioFile_name")
	WebElement Hold_music_name;
	
	@FindBy(xpath= "//*[@id='wwctrl_appAudioFilesForm_appAudioFile_name']/ul/li")
	WebElement Hold_music_name_err;
	
	@FindBy(id= "appAudioFilesForm_appAudioFile_audioUrl")
	WebElement Hold_music_URL;
	
	@FindBy(xpath= "//*[@id='wwctrl_appAudioFilesForm_appAudioFile_audioUrl']/ul/li")
	WebElement Hold_music_URL_err;
	
	@FindBy(xpath= "//*[contains(@id,'save')]")
	WebElement config_save_button;
	
	@FindBy(xpath= "//*[contains(@id,'cancel')]")
	WebElement config_cancel_button;
	
	@FindBy(xpath= "//*[@id='skillForm']//div[contains(@class,'text-center')]/input")
	List<WebElement> Save_div_inputs;
	
	@FindBy(xpath= "//*[@id='report']/tbody/tr")
	List<WebElement> Table_report;
	
	@FindBy(xpath= "//*[@id='report']/tbody/tr/td[1]")
	WebElement Agent_table_data_1stRow;

//	@FindBy(xpath= "//*[@id='fwpNumberList']/tbody/tr/td[1]")
//	WebElement phoneNo_table_data_1stRow;
	
	@FindBy(xpath= "//tbody/tr/td[1]")
	WebElement table_data_1stRow;
	
	@FindBy(xpath= "//*[contains(@name,'delete')]")
	WebElement config_delete_button;
	
	public ConfigurationsPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public void ClickOnAgentMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(Agentmenu));
		Agentmenu.click();
	}
	
	public String GetConfigHeader() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(configurations_heading));
		return configurations_heading.getText();
	}
	
	public void ClickOnAddConfig() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(Config_Add_Button));
		Config_Add_Button.click();
	}
	public void ClickOnAddConfig1() {
		Config_Add_Button1.click();
	}
	public void EnterSerachItem(Object S) {
		if(!S.equals("")) {
		Config_search_button.sendKeys(S.toString().trim());
		Config_search_submit.click();
	}}
	
	public void EnterAgentId(Object id) {
		if(!id.equals("")) {
			Agent_ID.clear();
			Agent_ID.sendKeys(id.toString().trim());
	}}
	
	public void EnableAgentLock(Object L) {
		if(L.toString().trim().equalsIgnoreCase("yes")) 
			Agent_Lock.click();
	}
	public void EnterAgentPassword(Object Pwd) {
		if(!Pwd.equals("")) {
			Agent_password.clear();
			Agent_password.sendKeys(Pwd.toString().trim());
	}}
	
	public void EnterAgentName(Object name) {
		if(!name.equals("")) {
			Agent_Name.clear();
			Agent_Name.sendKeys(name.toString().trim());
	}}
	
	public void EnterPriorityforAgent(Object Pr) {
		if(!Pr.equals("")) {
			Agent_Priority.clear();
			Agent_Priority.sendKeys(Pr.toString().trim());
	}}
	
	public void EnterEmailforAgent(Object Email) {
		if (!Email.equals("")) {
			Agent_email.clear();
			Agent_email.sendKeys(Email.toString().trim());
	}}
	
	public void EnterAgentDataforAgent(Object data) {
		if(!data.equals("")) {
			Agent_Data.clear();
			Agent_Data.sendKeys(data.toString().trim());
	}}
	
	public void EnterSkillsforAgent(Object S) {
		if(!S.equals("")) {
			if(Selected_Skills.size()>1) {
				//System.out.println("========================"+Selected_Skills.size());
				while(removing_Skills.size()>0) 
				driver1.findElement(By.className("select2-selection__choice__remove")).click();
			}
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
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
						System.out.println(u);
						//Skills.clear();
						Skills.sendKeys(u);
						for (WebElement w:AllSkillsList)
							w.click();
					}
					Skills.clear();
				}
				}
			else if(S.toString().trim().equalsIgnoreCase("all")) {
				Skills.sendKeys(" ");
				for (WebElement w:AllSkillsList)
					if(!w.getText().equals(""))
					w.click();
			} else if(S.toString().trim().equalsIgnoreCase("EMPTY")) {
				if(Selected_Skills.size()>1) {
					//System.out.println("========================"+Selected_Skills.size());
					while(removing_Skills.size()>0) 
					driver1.findElement(By.className("select2-selection__choice__remove")).click();
				}
			}
				
			else {
				Skills.sendKeys(S.toString());
				for (WebElement w:AllSkillsList)
					w.click();
			}
		}
	}
	
	
	public void EnterSkillsforAgentforStaging88(Object S) {
		if(!S.equals("")) {
			moveAllLeft1.click();
			for (WebElement w:skills_stage88) 
				w.click();
			driver1.findElement(By.xpath("//*[@class='am-scroll-top']")).click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(S.toString().contains(",")) {
				String words[]=S.toString().split(",");
				for (String u: words) {
					if(u.trim().equalsIgnoreCase("all")) {
						moveAllRight1.click();
						break;
					} 
					else {
						for (WebElement w:skills_stage88) {
							if(w.getText().contains(u)) {
								w.click();
								moveRight1.click();
							}
						}
						}
				}
			}
			else if(S.toString().trim().equalsIgnoreCase("all")) 
				moveAllRight1.click();
			else {
				for (WebElement w:skills_stage88) 
					if(w.getText().contains(S.toString().trim())) {
					w.click();
					moveRight1.click();
					}
				}
			}
	}
	
	
	public void EnableInboundforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_inbound.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_inbound);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_inbound.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_inbound);
			}
	}}
	
	public void EnableManualforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_manual.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_manual);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_manual.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_manual);
			}
	}}
	
	public void EnablePreviewforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_Preview.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Preview);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_Preview.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Preview);
			}
	}}
	
	public void EnableProgressiveforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_progressive.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_progressive);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_progressive.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_progressive);
			}
	}}
	
	public void EnableBlendedforAgent(Object E) {
		if(!E.equals("")) {
		if(E.toString().trim().equalsIgnoreCase("YES") && !Agent_Blended.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Blended);
			}
		else if(E.toString().trim().equalsIgnoreCase("no") && Agent_Blended.isSelected()){
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", Agent_Blended);
		}	}
	}
	
	public void ClickOnSaveforConfig() {
		//Testutil.flash(config_save_button, driver1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", config_save_button);
		}//Save_div_inputs
	public void ClickOnCancelforConfig() {
		//Testutil.flash(config_save_button, driver1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", config_cancel_button);
		}
	public ArrayList<String> GetsaveDivisionoptions() {
		 ArrayList<String> al=new ArrayList<String>();
		for(WebElement w:Save_div_inputs)
			al.add(w.getAttribute("value"));
		return al;	
	}
	public void ClickOnBlockForBlockNumbers() {
		//Testutil.flash(config_save_button, driver1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", BlockNo_Block_button);
		}
	
	public void ClickOnUnBlockForBlockNumbers() {
		//Testutil.flash(config_save_button, driver1);
		
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", BlockNo_UnBlock_button);
		}
	
	public String GetAgentIdErrorMessage() {
		try{
			if(Agent_Id_Err.isDisplayed())
				return	Agent_Id_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentPasswordErrorMessage() {
		try{
			if(Agent_pwd_Err.isDisplayed())
				return	Agent_pwd_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentNameErrorMessage() {
		try{
			if(Agent_name_Err.isDisplayed())
				return	Agent_name_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentPriorityErrorMessage() {
		try{
			if(Agent_priority_Err.isDisplayed())
				return	Agent_priority_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentEmailErrorMessage() {
		try{
			if(Agent_email_Err.isDisplayed())
				return	Agent_email_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentDataErrorMessage() {
		try{
			if(Agent_data_Err.isDisplayed())
				return	Agent_data_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentModeErrorMessage() {
		try{
			if(Agent_mode_Err.isDisplayed())
				return	Agent_mode_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentConsolidatedErrorMessage() {
		String con_agent_err_msg="";
			con_agent_err_msg = GetAgentIdErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentPasswordErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentNameErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentPriorityErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentEmailErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentDataErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetAgentModeErrorMessage();
		return con_agent_err_msg;
		
	}
	public String GetAgentGroupEmptyErrorMessage() {
		try{
			if(Agent_data_Err.isDisplayed())
				return	Agent_data_Err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetPhoneNameErrorMessage() {
		try{
			if(Phone_name_err.isDisplayed())
				return	Phone_name_err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetPhoneNumberErrorMessage() {
		try{
			if(Phone_Number_err.isDisplayed())
				return	Phone_Number_err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetPhonePriorityErrorMessage() {
		try{
			if(Phone_priority_err.isDisplayed())
				return	Phone_priority_err.getText();
		}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetPhoneNumberConsolidatedErrorMessage() {
		String con_agent_err_msg="";
			con_agent_err_msg = GetPhoneNameErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetPhoneNumberErrorMessage();
		if(con_agent_err_msg=="")
			con_agent_err_msg =	GetPhonePriorityErrorMessage();
		return con_agent_err_msg;
	}

	
	
	public void ClickOnShowAllButton() {
		Select s=new Select(show_button);
		s.selectByValue("0");
	}
	public void ClickOnShow10Button() {
		Select s=new Select(show_button);
		s.selectByValue("10");
	}
	public void ClickOnShow25Button() {
		Select s=new Select(show_button);
		s.selectByValue("25");
	}
	public void ClickOnShow50Button() {
		Select s=new Select(show_button);
		s.selectByValue("50");
	}
	public void ClickOnShow75Button() {
		Select s=new Select(show_button);
		s.selectByValue("75");
	}
	public void ClickOnShow100Button() {
		Select s=new Select(show_button);
		s.selectByValue("100");
	}
	public int getDispositionsCount() {
		
		return disp_table_list.size();
	}//pagination
	public int getDialOutNumbersCounnt() {
		return dialOut_table_list.size();
	}
	
	public int getPauseReasonsCounnt() {
		return pauseReasonTable_list.size();
	}
	
	public int getBlockNumbersCounnt() {
		return blockNumbersTable_list.size();
	}
	
	public boolean ispaginationDisplayed() {
		try {
		return pagination.isDisplayed();}
		catch(Exception e){
			return false;
		}
		
	}
	
	public String Getmessagediv() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(div_message));
		return div_message.getText();
	}
	
	public String AddAgent(Object id, Object nid, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend) {
	//String id, Object lock, String pwd, String name,String pr,Object mail,Object data,Object Skill,
	//String in, String man, String pre, String prog,String blend
		
		System.out.println("Agent details for adding: id: "+id);
		ClickOnAgentMenu();
		String H =GetConfigHeader();
		if(H.contains("Agents")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add Agent")) {
				EnterAgentId(id);
				EnableAgentLock(lock);
				EnterAgentPassword(pwd);
				
				try {
					if (Agent_Id_Err.isDisplayed()) 
						return "success "+Agent_Id_Err.getText();
					//if (driver1.findElement(By.xpath("//*[@id=\"parsley-id-5\"]/li")).isDisplayed()) 
					//return "Passed: already exist";
					}catch(NoSuchElementException e) {
				}
								
				EnterAgentName(name);
				EnterPriorityforAgent(pr);
				EnterEmailforAgent(mail);
				EnterAgentDataforAgent(data);
				
				if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080")) {
					EnterSkillsforAgentforStaging88(Skill);
				}else
				EnterSkillsforAgent(Skill);
				
				EnableInboundforAgent(in);
				EnableManualforAgent(man);
				EnablePreviewforAgent(pre);
				EnableProgressiveforAgent(prog);
				EnableBlendedforAgent(blend);
				ClickOnSaveforConfig();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(driver1.getTitle().equals("Agents"))
				return "Passed: "+Getmessagediv();
				else return GetAgentConsolidatedErrorMessage();
			}return "header is not displayed as Add Agent";
		} return "header is not displayed as Agents";
	}
	
	public String EditAgent(String idold,Object idnew, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend) {
		//String id, Object lock, String pwd, String name,String pr,Object mail,Object data,Object Skill,
		//String in, String man, String pre, String prog,String blend
			String ids;
			if(!idnew.equals(""))
				ids = idnew.toString();
			else ids = idold.toString();
			System.out.println("Agent details for Editing: old id: "+idold+ "  New id: "+ids);
			ClickOnAgentMenu();
			String H =GetConfigHeader();
			if(H.contains("Agents")) {
				EnterSerachItem(idold);
				if(!driver1.getCurrentUrl().contains("http://10.1.2.88:8080"))
				ClickOnShowAllButton();
				if(!Agent_table_data_1stRow.getText().contains("Nothing") ) {
					Agent_table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit Agent") && Agent_ID.getAttribute("value").trim().equals(idold.trim()) ) {
					EnterAgentId(idnew);
					EnableAgentLock(lock);
					EnterAgentPassword(pwd);
					EnterAgentName(name);
					EnterPriorityforAgent(pr);
					EnterEmailforAgent(mail);
					EnterAgentDataforAgent(data);
					
					if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080")) {
						EnterSkillsforAgentforStaging88(Skill);
					}else
					EnterSkillsforAgent(Skill);
					
					EnableInboundforAgent(in);
					EnableManualforAgent(man);
					EnablePreviewforAgent(pre);
					EnableProgressiveforAgent(prog);
					EnableBlendedforAgent(blend);
					ClickOnSaveforConfig();
					return Getmessagediv();
				}return "header is not displayed as 'Edit Agent' or id not matching";
			} return "agentid "+ idold+" is not available to edit";
		}return "header is not displayed as 'Agents'";
	}
	
	public String deleteAgent(Object AgentId) {
		
		System.out.println("Deleting agent id:"+AgentId.toString().trim());
		ClickOnAgentMenu();
		String H =GetConfigHeader();
		if(H.contains("Agents")) {
			EnterSerachItem(AgentId.toString().trim());
			//ClickOnShowAllButton();
			if(Table_report.size()==1) {
				if(!Agent_table_data_1stRow.getText().contains("Nothing") ) {
					Agent_table_data_1stRow.click();
					//System.out.println("agent id is: "+AgentId+"     deleting is:  "+Agent_ID.getAttribute("value"));
					if(Agent_ID.getAttribute("value").equals(AgentId.toString().trim())) {
						config_delete_button.click();	
						driver1.switchTo().alert().accept();
						//driver1.switchTo().alert().dismiss();
						//return "correct";
						return Getmessagediv();
					}return "agent ids are not matching so stopped deleting agent";
			   } return "no records found with the agentid: "+ AgentId.toString();
			} else {
				Agent_table_data_1stRow.click();
				if(Agent_ID.getAttribute("value").equals(AgentId.toString().trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();
					}return "no of rows. Agent ids are not matching so stopped deleting agent";
				}
			}return "header is not displayed as Agents";
	}
	
	public void ClickOnAgentGroupMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(AgentGroupMenu));
		AgentGroupMenu.click();
	}
	
	public void EnterAgentGroupName(String n) {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(AgentGroup_Name));
		AgentGroup_Name.clear();
		AgentGroup_Name.sendKeys(n);
	}
	
	public void EnterAgentGroupDecription(String n) {
		AgentGroup_description.clear();
		AgentGroup_description.sendKeys(n);
	}
	
	public String GetAgentGroupNameError() {
		try{
		if(AgentGroup_Name_err.isDisplayed())
			return AgentGroup_Name_err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentGroupDescriptionError() {
		try{
		if(AgentGroup_description_err.isDisplayed())
			return AgentGroup_description_err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentGroupAssignedAgentsError() {
		try{
		if(AgentGroup_assignedAgents_err.isDisplayed())
			return AgentGroup_assignedAgents_err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetAgentGroupAssignedUsersError() {
		try{
		if(AgentGroup_assignedUsers_err.isDisplayed())
			return AgentGroup_assignedUsers_err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	public void ClickonPhoneNumberMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ph_no_menu));
		ph_no_menu.click();
	}
	
	public void EnterNameForPhoneNo(Object n) {
		if(!n.equals("")) {
			Number_name.clear();
			Number_name.sendKeys(n.toString().trim());
		}
	}
	
	public void EnterNoForPhone(Object P) {
		if(!P.equals("")) {
			Number_phoneNumber.clear();
			Number_phoneNumber.sendKeys(P.toString().trim());	}
	}
	
	public void EnterPriorityForPhone(Object P) {
		if(!P.equals("")) {
			Number_priority.clear();
			Number_priority.sendKeys(P.toString().trim());	}
	}
	
	public void EnterSIPforPhone(Object S) {
		if(!S.equals("")) {
			System.out.println("-------------------------------------------------1");
			if(S.toString().trim().equalsIgnoreCase("yes") && !Number_sip.isSelected()) {
				System.out.println("-------------------------------------------------2");
				Number_sip1.click();
				System.out.println("-------------------------------------------------clicked");
			}
			if(S.toString().trim().equalsIgnoreCase("no") && Number_sip.isSelected()) {
				System.out.println("-------------------------------------------------3");
				JavascriptExecutor js = (JavascriptExecutor)driver1;
				js.executeScript("arguments[0].click();", Number_sip1);
				//Number_sip1.click();
				System.out.println("-------------------------------------------------clicked");
			}
		}
	}
	
	
	public String DetailsOfPhoneNo(Object name, Object phno,Object pr,Object sip) {
		boolean esip =false;
		if(sip.toString().equalsIgnoreCase("yes"))
			 esip =true;
		
		ClickonPhoneNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			EnterSerachItem(phno);
			 //ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				String H1 =GetConfigHeader();
				if(H1.contains("Edit Phone Number") && Number_name.getAttribute("value").equals(name.toString().trim()) && Number_phoneNumber.getAttribute("value").equals(phno.toString().trim())) {
					String act_name = Number_name.getAttribute("value");
					String act_no = Number_phoneNumber.getAttribute("value");
					
					String act_prio =Number_priority.getAttribute("value");
					boolean act_sip = Number_sip.isSelected();		
					
//					System.out.println("---------------------------------------------------------");
//					System.out.println("act_name: "+act_name+"  act_no : "+act_no+"  act_prio: "+act_prio+" act_sip");
//					System.out.println("---------------------------------------------------------");

					if(act_name.equals(name) && act_no.equals(phno) && act_prio.equals(pr) && esip==act_sip) 
						return "verified";	
					
					
		
		
	}}}return "No details found";}
	
	
	
	public String addPhoneNo(Object name, Object phno,Object pr,Object sip) {
		System.out.println("Adding phone no details: name: "+name+"   Phno: "+phno);
		ClickonPhoneNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterNameForPhoneNo(name);
				EnterNoForPhone(phno);
				EnterPriorityForPhone(pr);
				
				try {
					if (driver1.findElement(By.xpath("//*[@id='wwctrl_fwpNumberForm_fwpNumber_name']/ul/li")).isDisplayed()) 
						return "Passed: Ph no already exist";
						}catch(NoSuchElementException e) {
					}
				try {
					if (driver1.findElement(By.xpath("//*[@id='wwctrl_fwpNumberForm_fwpNumber_name']/ul/li")).isDisplayed()) 
						return "Passed: name for Ph no already exist";
						}catch(NoSuchElementException e) {
					}
				
				
				EnterSIPforPhone(sip) ;
				ClickOnSaveforConfig();
				return "Passed: "+Getmessagediv();
			}	return "header not matching";
		}return "header not matching";
	}
	
	public String EditPhoneNo(Object name, Object Nname,Object phno,Object Nphno,Object pr,Object sip) {
		String nn,np;
		if (!Nname.equals(""))
			nn=Nname.toString();
		else nn=name.toString();
		if (!Nphno.equals(""))
			np=Nphno.toString();
		else np=phno.toString();
		
		System.out.println("Editing phone no details: name: "+name+"  New name: "+nn+"   Phno: "+phno+" new phno: "+np);
		ClickonPhoneNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			EnterSerachItem(phno);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				String H1 =GetConfigHeader();
				if(H1.contains("Edit Phone Number") && Number_name.getAttribute("value").equals(name.toString().trim()) && Number_phoneNumber.getAttribute("value").equals(phno.toString().trim())) {
					EnterNameForPhoneNo(Nname);
					EnterNoForPhone(Nphno);
					EnterPriorityForPhone(pr);
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					EnterSIPforPhone(sip) ;
					ClickOnSaveforConfig();
					return Getmessagediv();
				}	return "header 'Edit' or name or number not matching";
		}return "no data found";
		}return "header not matching";
	}
	
	public String deletePhoneNo(String name, String phno) {
		System.out.println("Deleting phone no details: name: "+name+"   Phno: "+phno);
		ClickonPhoneNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			EnterSerachItem(phno);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(Number_name.getAttribute("value").equalsIgnoreCase(name.trim()) && Number_phoneNumber.getAttribute("value").equalsIgnoreCase(phno.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
				} return "names are not matching so not deleting";
			} return "no data found with deatils:  Name: "+name+"   PhNo: "+phno;
	}return " header is not matching";
	}
	
	public void EnterTransfername(Object name) {
		if(!name.equals(""))
			transferName.clear();
			transferName.sendKeys(name.toString().trim());
	}
	
	public void EnterTransferNo(Object no) {
		if(!no.equals(""))
			transferNumber.clear();
			transferNumber.sendKeys(no.toString().trim());
	}
	
	public void EnterTransferSip(Object S) {
		if(!S.equals(""))
			if(S.toString().trim().equalsIgnoreCase("yes") && !transferNumber_sip.isSelected())
				transferNumber_sip1.click();
			if(S.toString().trim().equalsIgnoreCase("no") && transferNumber_sip.isSelected())
				transferNumber_sip1.click();
	}
	
	public void ClickOnTransferNoMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(TransferNumberMenu));
		TransferNumberMenu.click();
	}
	
	public String AddTransferNumber(Object name, Object no, Object sip) {
		ClickOnTransferNoMenu();
		String H =GetConfigHeader();
		if(H.contains("TransferNumbers")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterTransfername(name);
				EnterTransferNo(no);
				EnterTransferSip(sip);
				ClickOnSaveforConfig();
				return Getmessagediv();
			}	return "'add'header not matching";
		}return "'Transfer' header not matching";
	}
	
	public String EditTransferNo(Object name, Object Nname,Object phno,Object Nphno,Object sip) {
		String nn,np;
		if (!Nname.equals(""))
			nn=Nname.toString();
		else nn=name.toString();
		if (!Nphno.equals(""))
			np=Nphno.toString();
		else np=phno.toString();
		
		System.out.println("Editing Transfer no details: name: "+name+"  New name: "+nn+"   Phno: "+phno+" new phno: "+np);
		ClickOnTransferNoMenu();
		String H =GetConfigHeader();
		if(H.contains("TransferNumbers")) {
			EnterSerachItem(phno);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				String H1 =GetConfigHeader();
				if(H1.contains("Edit") && transferName.getAttribute("value").equals(name.toString().trim()) && transferNumber.getAttribute("value").equals(phno.toString().trim())) {
					EnterTransfername(Nname);
					EnterTransferNo(Nphno);
					EnterTransferSip(sip);
					ClickOnSaveforConfig();
					return Getmessagediv();
				}	return "header 'Edit' or name or number not matching";
		}return "no data found";
		}return "header not matching";
	}
	
	public String deleteTransferNo(String name, String phno) {
		System.out.println("Deleting Transfer no details: name: "+name+"   Phno: "+phno);
		ClickOnTransferNoMenu();
		String H =GetConfigHeader();
		if(H.contains("TransferNumbers")) {
			EnterSerachItem(phno);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(transferName.getAttribute("value").equalsIgnoreCase(name.trim()) && transferNumber.getAttribute("value").equalsIgnoreCase(phno.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
				} return "names are not matching so not deleting";
			} return "no data found with deatils:  Name: "+name+"   PhNo: "+phno;
	}return " header is not matching";
	}
	
	public String GetTransferNameError() {
		try{
		if(transferName_Err.isDisplayed())
			return transferName_Err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	public String GetTransferNumberError() {
		try{
		if(transferNumber_err.isDisplayed())
			return transferNumber_err.getText();
	}catch(NoSuchElementException e) {}
		return "";
	}
	
	
	public void ClickOnDispositionMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		AddCampaignPage.JavaScriptClick(ConfigurationMenu);
		//ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(DispositionMenu));
		AddCampaignPage.JavaScriptClick(DispositionMenu);
		//DispositionMenu.click();
	}
	
	public void Enterdispositions(String R) {
		if(!R.trim().equals("")) {
			disposition_reason.clear();
			disposition_reason.sendKeys(R);
	}}
	
	public String AddDispositions(String Reason) {
		System.out.println("disposition details for Adding: reason: "+Reason);
		ClickOnDispositionMenu();
		String H =GetConfigHeader();
		if(H.contains("Dispositions")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				Enterdispositions(Reason);
				ClickOnSaveforConfig();
				return Getmessagediv();
			}return " 'Add' header is not matching";
		}return " 'Dispositions' header is not matching";
	}
	
	public String EditDispositions(String Reason, String Reason1) {
		System.out.println("disposition details for Editing: reason: "+Reason+"  new reason: "+Reason1);
		ClickOnDispositionMenu();
		String H =GetConfigHeader();
		if(H.contains("Dispositions")) {
			EnterSerachItem(Reason);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && disposition_reason.getAttribute("value").equalsIgnoreCase(Reason.trim()) ) {
					Enterdispositions(Reason1);
					ClickOnSaveforConfig();
					return Getmessagediv();
				} return "either Edit header or reason not matching";
			}return "no data found to edit";
		}return " 'Dispositions' header is not matching";
	}
	
	public String deleteDisposition(String reason) {
		System.out.println("Deleting disposition details: Reason: "+reason);
		ClickOnDispositionMenu();
		String H =GetConfigHeader();
		if(H.contains("Dispositions")) {
			EnterSerachItem(reason);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && disposition_reason.getAttribute("value").equalsIgnoreCase(reason.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
				} return "names are not matching so not deleting";
			} return "no data found with deatils "+reason;
	}return " header is not matching";
	}
	
	public String GetDipositionError() {
		try{
			if(disposition_err.isDisplayed())
				return disposition_err.getText();
		}catch(NoSuchElementException e) {}
			return "";
	}
	
	public void EnterPauseReason(Object Preason) {
		if(!Preason.equals("")) {
			pauseReason_reason.clear();
			pauseReason_reason.sendKeys(Preason.toString().trim());
		}}
	
	public String GetPauseReasonError() {
		try{
			if(pauseReason_reason_err.isDisplayed())
				return pauseReason_reason_err.getText();
		}catch(NoSuchElementException e) {}
			return "";
	}
	
	
	public void EnterPauseTime(Object rTime) {
		if(!rTime.equals("")) {
			pauseReasonTime_clear.click();
			((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", pauseReason_Time);
			pauseReason_Time.sendKeys(rTime.toString().trim());
		}}
	
	public void ClickOnPauseReasonMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		AddCampaignPage.JavaScriptClick(ConfigurationMenu);
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(PauseReasonMenu));
		AddCampaignPage.JavaScriptClick(PauseReasonMenu);
		
	}
	public String AddPauseReason(String reason, Object time) {
		System.out.println("Adding Pause reason details: reason: "+reason);
		ClickOnPauseReasonMenu();
		String H =GetConfigHeader();
		if(H.contains("Pause Reasons")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterPauseReason(reason);
				EnterPauseTime(time);
				ClickOnSaveforConfig();
				return Getmessagediv();
			}return " 'Add' header is not matching";
		}return " 'Dispositions' header is not matching";
	}
	
	public String EditPausereason(String reason,Object reason1,Object time) {
		String str ="";
		if(!reason1.equals(""))
			str="  new reason is: "+reason1.toString();
		System.out.println("Editing Pause reason details: reason: "+reason+str);
		ClickOnPauseReasonMenu();
		String H =GetConfigHeader();
		if(H.contains("Pause Reasons")) {
			EnterSerachItem(reason);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && pauseReason_reason.getAttribute("value").equalsIgnoreCase(reason.trim())) {
					EnterPauseReason(reason1);
					EnterPauseTime(time);
					ClickOnSaveforConfig();
					return Getmessagediv();
				}return "either Edit header or reason not matching";
			}return "no data found to edit";
		}return " 'Pause' header is not matching";
	}
	public String CancelPauseReason(String reason,Object reason1,Object time) {
		//String str ="";
		//if(!reason1.equals(""))
		//	str="  new reason is: "+reason1.toString();
		//System.out.println("Editing Pause reason details: reason: "+reason+str);
		ClickOnPauseReasonMenu();
		String H =GetConfigHeader();
		if(H.contains("Pause Reasons")) {
			EnterSerachItem(reason);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && pauseReason_reason.getAttribute("value").equalsIgnoreCase(reason.trim())) {
					EnterPauseReason(reason1);
					EnterPauseTime(time);
					ClickOnCancelforConfig();
					//ClickOnSaveforConfig();
					return "success";
				}return "either Edit header or reason not matching";
			}return "no data found to edit";
		}return " 'Pause' header is not matching";
	}
	
	public String deletePauseReason(String reason) {
		System.out.println("Deleting Pause reason details: reason: "+reason);
		ClickOnPauseReasonMenu();
		String H =GetConfigHeader();
		if(H.contains("Pause Reasons")) {
			EnterSerachItem(reason);
			//ClickOnShowAllButton();
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && pauseReason_reason.getAttribute("value").equalsIgnoreCase(reason.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
				} return "names are not matching so not deleting";
			} return "no data found with deatils "+reason;
	}return " header is not matching";
	}
	
	public void ClickOnSkillMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		AddCampaignPage.JavaScriptClick(ConfigurationMenu);
		//ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(SkillMenu));
		AddCampaignPage.JavaScriptClick(SkillMenu);
		//SkillMenu.click();
	}
	
	public String GetSkillNameErrorMsg() {
		try{
			if(SkillName_err.isDisplayed())
				return SkillName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillQueueSizeErrorMsg() {
		try{
			if(skill_queueSize_err.isDisplayed())
				return skill_queueSize_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillAgentsErrorMsg() {
		try{
			if(skillForm_assignedAgents_err.isDisplayed())
				return skillForm_assignedAgents_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillLocationErrorMsg() {
		try{
			if(Skill_loc_err.isDisplayed())
				return Skill_loc_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillHuntingErrorMsg() {
		try{
			if(Skill_hunting_err.isDisplayed())
				return Skill_hunting_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetSkillSkillDetail1ErrorMsg() {
		try{
			if(skillDetail1_err.isDisplayed())
				return skillDetail1_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetSkillSkillDetail2ErrorMsg() {
		try{
			if(skillDetail2_err.isDisplayed())
				return skillDetail2_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetSkillSkillDetail3ErrorMsg() {
		try{
			if(skillDetail3_err.isDisplayed())
				return skillDetail3_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillQueueIvrTransferErrorMsg() {
		try{
			if(queueIvrTransfer_err.isDisplayed())
				return queueIvrTransfer_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillQueueSkillTransferErrorMsg() {
		try{
			if(queueSkillTransfer_err.isDisplayed())
				return queueSkillTransfer_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillDialOutErrorMsg() {
		try{
			if(skill_dialOutNumber_err.isDisplayed())
				return skill_dialOutNumber_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillCallDropURLErrorMsg() {
		try{
			if(callDropActions_Url_err.isDisplayed())
				return callDropActions_Url_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetSkillCallDropTriesErrorMsg() {
		try{
			if(callDropActions_tries_err.isDisplayed())
				return callDropActions_tries_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterSkillName(Object name) {
		if(!name.equals(""))
			skillName.clear();
		skillName.sendKeys(name.toString().trim());
	}
	
	public void EnterSkillQueueSize(Object size) {
		if(!size.equals(""))
			skillQueueSize.clear();
		skillQueueSize.sendKeys(size.toString().trim());
	}
	
	public void EnterSkillDetail1(Object details) {
		if(!details.equals(""))
			skill_skillDetail1.clear();
		skill_skillDetail1.sendKeys(details.toString().trim());
	}
	
	public void EnterSkillDetail2(Object details) {
		if(!details.equals(""))
			skill_skillDetail2.clear();
		skill_skillDetail2.sendKeys(details.toString().trim());
	}
	
	public void EnterSkillDetail3(Object details) {
		if(!details.equals(""))
			skill_skillDetail3.clear();
		skill_skillDetail3.sendKeys(details.toString().trim());
	}
	
	public void SelectQueueTimeOut(Object Min, Object sec) {
		if(!Min.equals("") || !sec.equals("")) {
			Select Mins = new Select (skillForm_queueTimeout_minutes);
			Mins.selectByValue((String) Min);
			
			Select seconds = new Select (skillForm_queueTimeout_seconds);
			seconds.selectByValue((String) sec);
			
		}
	}
	
	public void SelectFallBackRule(Object text) {
		if(!text.equals("")) {
			SelectQueueTimeOut("1","0");
			Select fallback = new Select(skillForm_skill_fallBackRule);
			fallback.selectByVisibleText(text.toString());
		}
	}
	
	public void EnableCallDrop() {
		try {
		skillForm_skill_dropAction.click();
		}catch(Exception e) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", skillForm_skill_dropAction);
		}
	}
	
	public void EnterTriesForCallDrop(Object Tries) {
		if(!Tries.equals(""))
			skillForm_callDropActions_tries.clear();
		skillForm_callDropActions_tries.sendKeys(Tries.toString().trim());
	}
	
	public void ClickOnLocationMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(LocationMenu));
		LocationMenu.click();
	}
	
	public void EnterLocationName(String str) {
		LocationName.sendKeys(str);
	}
	
	public String GetLocationNameErr() {
		try{
			if(LocationName_err.isDisplayed())
				return LocationName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void ClickOnURLMappingMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(UrlMapMenu));
		UrlMapMenu.click();
	}
	
	public void EnterURLMappingName(String str) {
		UrlMappingName.sendKeys(str);
	}
	
	public void EnterURLMappingDomain(String str) {
		urlMapForm_urlMap_domainName.sendKeys(str);
	}
	
	public void EnterURLMappingLocalIP(String str) {
		urlMapForm_urlMap_localIp.sendKeys(str);
	}
	
	public String GetURLMappingDomainNameErr() {
		try{
			if(URLMappingDomainName_err.isDisplayed())
				return URLMappingDomainName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetURLMappingNameErr() {
		try{
			if(URLMappingName_err.isDisplayed())
				return URLMappingName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetURLMappingLocalIPErr() {
		try{
			if(URLMappingLocalIP_err.isDisplayed())
				return URLMappingLocalIP_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void ClickOnSmsTemplateMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(SmsTemplateMenu));
		SmsTemplateMenu.click();
	}
	
	public void EnterSmsTemplateName(String str) {
		smsTemplateForm_smsTemplate_name.sendKeys(str);
	}
	public String GetSmsTemplateNameErr() {
		try{
			if(smsTemplate_name_err.isDisplayed())
				return smsTemplate_name_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterSmsTemplateText(String str) {
		smsTemplateForm_smsTemplate_text.sendKeys(str);
	}
	public String GetSmsTemplateTextErr() {
		try{
			if(smsTemplate_text_err.isDisplayed())
				return smsTemplate_text_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void ClickOnDialOutNumberMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		AddCampaignPage.JavaScriptClick(ConfigurationMenu);
		//ConfigurationMenu.click();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(DialOutNumberMenu));
		AddCampaignPage.JavaScriptClick(DialOutNumberMenu);
		//DialOutNumberMenu.click();
	}
	
	public void EnterEnterDialOutName(Object str) {
		if(!str.equals("")) {
			dialOutName.clear();
			dialOutName.sendKeys(str.toString().trim());
		}
	}
	public void EnterEnterDialOutNumber(Object str) {
		if(!str.equals("")) {
			dialOutNumber.clear();	
			dialOutNumber.sendKeys(str.toString().trim());
	}}
	public String GetDialOutNameErr() {
		try{
			if(dialOutName_err.isDisplayed())
				return dialOutName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetDialOutNumberErr() {
		try{
			if(dialOutNumber_err.isDisplayed())
				return dialOutNumber_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnableSipforDialOutNo() {
		try {
			dialOutNumber_sip.click();
		}catch(Exception e) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", dialOutNumber_sip);
		}
	}
	public void disableSipforDialOutNo() {
		
		if(dialOutNumber_sip.isSelected())
		try {
			dialOutNumber_sip.click();
		}catch(Exception e) {
			JavascriptExecutor js = (JavascriptExecutor)driver1;
			js.executeScript("arguments[0].click();", dialOutNumber_sip);
		}
	}
	public String AddDialOutNumber(String DoutName, String DoutN0,Object sip) {
		System.out.println("Adding DialOutNumber details: Dialout Name: "+DoutName+ "  DialoutN0: "+DoutN0);
		ClickOnDialOutNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("DialOutNumbers")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterEnterDialOutName(DoutName);
				EnterEnterDialOutNumber(DoutN0);
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("yes"))
				EnableSipforDialOutNo();
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("no"))
				disableSipforDialOutNo();
				ClickOnSaveforConfig();
				return Getmessagediv();
			}return " 'Add' header is not matching";
		}return " 'DialOutNumber' header is not matching";
	}
	
	public String EditDialOutNumber(String DoutName,Object DoutNameNew, String DoutN0,Object DoutN0new , Object sip) {
		System.out.println("Editing DialOutNumber details: Dialout Name: "+DoutName+ "  DialoutN0: "+DoutN0);
		ClickOnDialOutNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("DialOutNumbers")) {
			EnterSerachItem(DoutN0);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && dialOutName.getAttribute("value").equalsIgnoreCase(DoutName.trim())) {
				EnterEnterDialOutName(DoutNameNew);
				EnterEnterDialOutNumber(DoutN0new);
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("yes"))
				EnableSipforDialOutNo();
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("no"))
				disableSipforDialOutNo();
				ClickOnSaveforConfig();
				return Getmessagediv();
			}return " 'Edit' header is not matching";
		}return "not available for edit";
			}return " 'DialOutNumber' header is not matching";
	}
	public String CancelDialOutNumber(String DoutName,Object DoutNameNew, String DoutN0,Object DoutN0new , Object sip) {
		System.out.println("Cancelling DialOutNumber details: Dialout Name: "+DoutName+ "  DialoutN0: "+DoutN0);
		ClickOnDialOutNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("DialOutNumbers")) {
			EnterSerachItem(DoutN0);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && dialOutName.getAttribute("value").equalsIgnoreCase(DoutName.trim())) {
				EnterEnterDialOutName(DoutNameNew);
				EnterEnterDialOutNumber(DoutN0new);
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("yes"))
				EnableSipforDialOutNo();
				if(sip.toString().toLowerCase().trim().equalsIgnoreCase("no"))
				disableSipforDialOutNo();
				ClickOnCancelforConfig();
				return "Success";
			}return " 'Edit' header is not matching";
		}return "not available for edit";
			}return " 'DialOutNumber' header is not matching";
	}
	public String DeleteDialOutNumber(String DoutName, String DoutN0) {
		System.out.println("Cancelling DialOutNumber details: Dialout Name: "+DoutName+ "  DialoutN0: "+DoutN0);
		ClickOnDialOutNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("DialOutNumbers")) {
			EnterSerachItem(DoutN0);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && dialOutName.getAttribute("value").equalsIgnoreCase(DoutName.trim())) {
					config_delete_button.click();	
					driver1.switchTo().alert().accept();
					return Getmessagediv();	
			}return " 'Edit' header is not matching";
		}return "not available for delete";
			}return " 'DialOutNumber' header is not matching";
	}
	public String[] DialOutNumberDetails( String DoutN0) {
		//System.out.println("Cancelling DialOutNumber details: Dialout Name: "+DoutName+ "  DialoutN0: "+DoutN0);
		ClickOnDialOutNumberMenu();
		String H =GetConfigHeader();
		if(H.contains("DialOutNumbers")) {
			EnterSerachItem(DoutN0);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				
				if(GetConfigHeader().contains("Edit") && dialOutNumber.getAttribute("value").trim().equalsIgnoreCase(DoutN0)) {
				String name=dialOutName.getAttribute("value");
				String n0=dialOutNumber.getAttribute("value");
				boolean b= dialOutNumber_sip.isSelected();
				String esip;
				if(b) esip="TRUE";
				else esip="FALSE";
				String[] details= {name,n0,esip};
				//for(String s:details)
				//System.out.println("=============================="+s);
				return details;
				}
		}String[] str1={ "dialoutno not available" };
		return str1;
			}String[] str1={ "dialoutno header not matching" };
			return str1;
	}
	
	public void ClickOnBlockNumbersMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(ConfigurationMenu));
		AddCampaignPage.JavaScriptClick(ConfigurationMenu);	
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(BlockNumbersMenu));
		AddCampaignPage.JavaScriptClick(BlockNumbersMenu);	
	}
	
	public void EnterBlockNumber(String str) {
		blockNumber_blockedNumber.clear();
		blockNumber_blockedNumber.sendKeys(str);
	}
	public String GetBlockNumberErr() {
		try{
			if(blockNumber_reason_err.isDisplayed())
				return blockNumber_reason_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String AddBlockNumber(String no) {
		ClickOnBlockNumbersMenu();
		if(GetConfigHeader().contains("Block Numbers List")) {
			ClickOnAddConfig();
			System.out.println("==========================clicked on add");
			if(GetConfigHeader().contains("Add")) {
				EnterBlockNumber(no);
				ClickOnBlockForBlockNumbers();
				return Getmessagediv();
			}return "Add header not matching";
		}return "block main header not matching";
	}
	public String EditBlockNumber(String no,String no1) {
		ClickOnBlockNumbersMenu();
		if(GetConfigHeader().contains("Block Numbers List")) {
			EnterSerachItem(no);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && blockNumber_blockedNumber.getAttribute("value").contains(no.trim())) {
				EnterBlockNumber(no1);
				ClickOnBlockForBlockNumbers();
				return Getmessagediv();
			}return "Edit header or block num not matching";
		}return "not available for edit";
	}return "block main header not matching";
	}
	
	public String UNBlockNumber(String no) {
		ClickOnBlockNumbersMenu();
		if(GetConfigHeader().contains("Block Numbers List")) {
			EnterSerachItem(no);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") && blockNumber_blockedNumber.getAttribute("value").contains(no.trim())) {
					ClickOnUnBlockForBlockNumbers();
					driver1.switchTo().alert().accept();
				return Getmessagediv();
			}return "Edit header or block num not matching";
		}return "not available for edit";
	}return "block main header not matching";
	}
	
	public String BlockNumberDetails(String no) {
		ClickOnBlockNumbersMenu();
		if(GetConfigHeader().contains("Block Numbers List")) {
			EnterSerachItem(no);
			if(!table_data_1stRow.getText().contains("Nothing") ) {
				table_data_1stRow.click();
				if(GetConfigHeader().contains("Edit") ) {
					return blockNumber_blockedNumber.getAttribute("value");
			}return "Edit header or block num not matching";
		}return "not available for edit";
	}return "block main header not matching";
	}
	
	public void ClickOnBlockNumbersGroupMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(BlockNumbersGroupMenu));
		AddCampaignPage.JavaScriptClick(BlockNumbersGroupMenu);	
	}
	
	public void EnterBlockNumberGroupName(String str) {
		blockNumberGroup_name.sendKeys(str);
	}
	public String GetBlockNumbergroupNameErr() {
		try{
			if(blockNumberGroup_name_err.isDisplayed())
				return blockNumberGroup_name_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterBlockNumberGroupDescription(String str) {
		blockNumberGroup_description.sendKeys(str);
	}
	public String GetBlockNumbergroupDescriptionErr() {
		try{
			if(blockNumberGroup_desc_err.isDisplayed())
				return blockNumberGroup_desc_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetBlockNumbergroupNumberErr() {
		try{
			if(blockNumberGroup_number_err.isDisplayed())
				return blockNumberGroup_number_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void ClickOnIvrFlowMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(IvrFlowMenu));
		AddCampaignPage.JavaScriptClick(IvrFlowMenu);	
	}
	public void EnterIvrFlowName(String str) {
		ivrFlowForm_ivrFlow_flowName.sendKeys(str);
	}
	public String GetIvrFlowNameErr() {
		try{
			if(ivrFlowForm_ivrFlow_flowName_err.isDisplayed())
				return ivrFlowForm_ivrFlow_flowName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetIvrFlowTypeErr() {
		try{
			if(ivrFlowForm_ivrFlow_type_err.isDisplayed())
				return ivrFlowForm_ivrFlow_type_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void ClickOnFeedBackMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(FeedBackMenu));
		
		AddCampaignPage.JavaScriptClick(FeedBackMenu);	
	}
	
	public String GetfeedbackNameErr() {
		try{
			if(feedbackName_err.isDisplayed())
				return feedbackName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterFeedbackName(String str) {
		feedBackForm_feedBack_feedbackName.sendKeys(str);
	}
	public void ClickOnFeedBackMasterMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(FeedBackMasterMenu));
		
		AddCampaignPage.JavaScriptClick(FeedBackMasterMenu);	
	}
	
	public String GetfeedbackMasterNameErr() {
		try{
			if(feedbackmasterName_err.isDisplayed())
				return feedbackmasterName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterFeedBackMasterFeedback(String str) {
		feedBackMasterForm_feedBackMaster_feedBack.sendKeys(str);
	}
	public void EnterFeedBackMasterAudioFile(String str) {
		feedBackMasterForm_feedBackMaster_audioFile.sendKeys(str);
	}
	public String GetfeedbackMasterAudioFileErr() {
		try{
			if(feedBackMaster_audioFile_err.isDisplayed())
				return feedBackMaster_audioFile_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetfeedbackMasterFeedbackErr() {
		try{
			if(feedBackMaster_feedBack_err.isDisplayed())
				return feedBackMaster_feedBack_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void ClickOnSipLocationsMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(SipLocations));
		AddCampaignPage.JavaScriptClick(SipLocations);	
	}
	
	public void EntersipLocation_location(String str) {
		sipLocationForm_sipLocation_location.sendKeys(str);
	}
	public String GetSipLocationErr() {
		try{
			if(sipLocation_location_err.isDisplayed())
				return sipLocation_location_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EntersipLocation_sipUrl(String str) {
		sipLocationForm_sipLocation_sipUrl.sendKeys(str);
	}
	public String GetSipLocationURLErr() {
		try{
			if(sipLocation_sipUrl_err.isDisplayed())
				return sipLocation_sipUrl_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public String GetsipLocation_assignedAgents_Err() {
		try{
			if(sipLocationForm_assignedAgents_err.isDisplayed())
				return sipLocationForm_assignedAgents_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	
	public void ClickOncampaignHoldMusicMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(campaignHoldMusicMenu));
		AddCampaignPage.JavaScriptClick(campaignHoldMusicMenu);	
	}
	
	public void EnterHold_music_name(String str) {
		Hold_music_name.sendKeys(str);
	}
	public String GetHold_music_name_Err() {
		try{
			if(Hold_music_name_err.isDisplayed())
				return Hold_music_name_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterHold_music_URL(String str) {
		Hold_music_URL.sendKeys(str);
	}
	public String GetHold_music_URL_Err() {
		try{
			if(Hold_music_URL_err.isDisplayed())
				return Hold_music_URL_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	
	
	
	
}
