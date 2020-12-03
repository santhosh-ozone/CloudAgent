package com.CA.qa.Pages;

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
	
	@FindBy(id= "SkillMenu")
	WebElement SkillMenu;
	
	@FindBy(id= "DispositionMenu")
	WebElement DispositionMenu;
	
	@FindBy(id= "PauseReasonMenu")
	WebElement PauseReasonMenu;
	
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement configurations_heading;
	
	@FindBy(xpath= "//*[contains(@data-original-title,'Add')]")
	WebElement Config_Add_Button;
	
	@FindBy(xpath= "//*[contains(@name,'search')]")
	WebElement Config_search_button;
	
	@FindBy(xpath="//*[contains(@onclick,'submit')]")
	WebElement Config_search_submit;
	
	@FindBy(className ="message")
	WebElement div_message;
	
	@FindBy(id= "pageSize")
	WebElement show_button;
	
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
	
	@FindBy(id= "parsley-id-5")
	WebElement Agent_Id_Err;
	
	@FindBy(id= "parsley-id-10")
	WebElement Agent_pwd_Err;
	
	@FindBy(id= "parsley-id-12")
	WebElement Agent_name_Err;
	
	@FindBy(id= "parsley-id-14")
	WebElement Agent_priority_Err;
	
	@FindBy(id= "parsley-id-16")
	WebElement Agent_email_Err;
	
	@FindBy(id= "parsley-id-18")
	WebElement Agent_data_Err;
	
	@FindBy(id= "parsley-id-multiple-agentModes")
	WebElement Agent_mode_Err;
	
	@FindBy(id= "agentGroupForm_agentGroup_name")
	WebElement AgentGroup_Name;
	
	@FindBy(id= "agentGroupForm_agentGroup_description")
	WebElement AgentGroup_description;

	@FindBy(id= "parsley-id-5")
	WebElement AgentGroup_Name_err;

	@FindBy(id= "parsley-id-7")
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
	
	@FindBy(id= "parsley-id-5")
	WebElement Phone_name_err;
	
	@FindBy(id= "parsley-id-7")
	WebElement Phone_Number_err;
	
	@FindBy(id= "parsley-id-9")
	WebElement Phone_priority_err;
		
	@FindBy(id= "transferNumberForm_transferNumber_transferName")
	WebElement transferName;
	
	@FindBy(id= "transferNumberForm_transferNumber_transferNumber")
	WebElement transferNumber;
	
	@FindBy(id= "transferNumberForm_transferNumber_sip")
	WebElement transferNumber_sip;
	
	@FindBy(xpath= "//*[@id='wwlbl_transferNumberForm_transferNumber_sip' ] [@for='transferNumberForm_transferNumber_sip']")
	WebElement transferNumber_sip1;
	
	@FindBy(id= "parsley-id-5")
	WebElement transferName_Err;
	
	@FindBy(id= "parsley-id-7")
	WebElement transferNumber_err;
	
	
		
	@FindBy(id= "dispositionForm_disposition_reason")
	WebElement disposition_reason;
	
	@FindBy(id= "parsley-id-5")
	WebElement disposition_err;
	
		@FindBy(id= "pauseReasonForm_pauseReason_reason")
	WebElement pauseReason_reason;
	
	@FindBy(id= "moveAllLeft1")
	WebElement moveAllLeft1;
	
	@FindBy(id= "moveAllRight1")
	WebElement moveAllRight1;
	
	@FindBy(id= "moveRight1")
	WebElement moveRight1;
	
	@FindBy(xpath= "//*[@id='availableSkills']/option")
	List<WebElement> skills_stage88;
	
	@FindBy(id= "pauseReasonForm_pauseReason_formattedTimeLimit")
	WebElement pauseReason_Time;
	
	@FindBy(xpath= "//*[@id='wwctrl_pauseReasonForm_pauseReason_formattedTimeLimit']//a")
	WebElement pauseReasonTime_clear;
	
	@FindBy(xpath= "//*[contains(@id,'save')]")
	WebElement config_save_button;
	
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
		ConfigurationMenu.click();
		Agentmenu.click();
	}
	
	public String GetConfigHeader() {
		return configurations_heading.getText();
	}
	
	public void ClickOnAddConfig() {
		Config_Add_Button.click();
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
			} else {
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
				if (driver1.findElement(By.xpath("//*[@id=\"parsley-id-5\"]/li")).isDisplayed()) 
					return "Passed: already exist";
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
		ConfigurationMenu.click();
		AgentGroupMenu.click();
	}
	
	public void EnterAgentGroupName(String n) {
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
		ConfigurationMenu.click();
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
			if(S.toString().trim().equalsIgnoreCase("yes") && !Number_sip.isSelected())
				Number_sip1.click();
			if(S.toString().trim().equalsIgnoreCase("no") && Number_sip.isSelected())
				Number_sip1.click();
		}
	}
	public String addPhoneNo(Object name, Object phno,Object pr,Object sip) {
		System.out.println("Adding phone no details: name: "+name+"   Phno: "+phno);
		ConfigurationMenu.click();
		ph_no_menu.click();
		String H =GetConfigHeader();
		if(H.contains("Phone Numbers")) {
			ClickOnAddConfig();
			String H1 =GetConfigHeader();
			if(H1.contains("Add")) {
				EnterNameForPhoneNo(name);
				EnterNoForPhone(phno);
				EnterPriorityForPhone(pr);
				
				try {
					if (driver1.findElement(By.xpath("//*[@id=\"parsley-id-7\"]/li")).isDisplayed()) 
						return "Passed: Ph no already exist";
						}catch(NoSuchElementException e) {
					}
				try {
					if (driver1.findElement(By.xpath("//*[@id=\"parsley-id-5\"]/li")).isDisplayed()) 
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
		ConfigurationMenu.click();
		ph_no_menu.click();
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
					EnterSIPforPhone(sip) ;
					ClickOnSaveforConfig();
					return Getmessagediv();
				}	return "header 'Edit' or name or number not matching";
		}return "no data found";
		}return "header not matching";
	}
	
	public String deletePhoneNo(String name, String phno) {
		System.out.println("Deleting phone no details: name: "+name+"   Phno: "+phno);
		ConfigurationMenu.click();
		ph_no_menu.click();
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
		ConfigurationMenu.click();
		TransferNumberMenu.click();
	}
	
	public String AddTransferNumber(Object name, Object no, Object sip) {
		ConfigurationMenu.click();
		TransferNumberMenu.click();
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
		ConfigurationMenu.click();
		TransferNumberMenu.click();
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
		ConfigurationMenu.click();
		TransferNumberMenu.click();
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
		ConfigurationMenu.click();
		DispositionMenu.click();
	}
	
	public void Enterdispositions(String R) {
		if(!R.trim().equals("")) {
			disposition_reason.clear();
			disposition_reason.sendKeys(R);
	}}
	
	public String AddDispositions(String Reason) {
		System.out.println("disposition details for Adding: reason: "+Reason);
		ConfigurationMenu.click();
		DispositionMenu.click();
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
		ConfigurationMenu.click();
		DispositionMenu.click();
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
		ConfigurationMenu.click();
		DispositionMenu.click();
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
	
	public void EnterPauseTime(Object rTime) {
		if(!rTime.equals("")) {
			pauseReasonTime_clear.click();
			((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('readonly')", pauseReason_Time);
			pauseReason_Time.sendKeys(rTime.toString().trim());
		}}
	
	public String AddPauseReason(String reason, Object time) {
		System.out.println("Adding Pause reason details: reason: "+reason);
		ConfigurationMenu.click();
		PauseReasonMenu.click();
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
		ConfigurationMenu.click();
		PauseReasonMenu.click();
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
	
	public String deletePauseReason(String reason) {
		System.out.println("Deleting Pause reason details: reason: "+reason);
		ConfigurationMenu.click();
		PauseReasonMenu.click();
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
	
	
	
}
