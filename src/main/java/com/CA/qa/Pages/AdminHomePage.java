package com.CA.qa.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class AdminHomePage extends TestBase{

//	@FindBy(xpath = "//*[contains(@class,'brand')]")
//	WebElement Admin_CAlogo;
	AddCampaignPage AddCampaignPage;
	String first ="//*[@id='campaignList']/tbody/tr[";
	String second = "]/td[";
	String third = "]";
	
	
	@FindBy(id= "CampaignMenu")
	WebElement CampaignMenu;
	
	@FindBy(id= "AdminMenu")
	WebElement Users;
	
	@FindBy(id= "ConfigurationMenu")
	WebElement Configurations;

	@FindBy(id= "MainMenu")
	WebElement Home;
	
	@FindBy(id= "InBoundCampaignMenu")
	WebElement Inboundcampaign;
	
	@FindBy(id= "outBoundCampaignMenu")
	WebElement outboundcampaign;
	
	@FindBy(xpath="//*[text()='Sign Out']")
	WebElement Admin_signout;
	
	@FindBy(xpath="//*[@id='am-navbar-collapse']/ul")
	WebElement Admin_usericon;
	
	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[2]")
	WebElement FirstCampaignName_inbound;
	
	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[1]")
	WebElement FirstCampaignName_Outbound;
	
	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[3]")
	WebElement FirstCampaignDID_inbound;
	
	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[4]")
	WebElement FirstInboundCampaign_Position;
	
	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[12]")
	WebElement FirstInboundCampaign_Start;
	
	@FindBy(xpath="//*[contains(@data-original-title,'Add Campaign')]")
	WebElement Add_Campaign;
	
	@FindBy(id= "pageSize")
	WebElement show_button;
	
	@FindBy(xpath="//*[contains(@name,'search')]")
	WebElement search_did_inbound;
	
	@FindBy(xpath="//*[contains(@name,'search')]")
	WebElement search_did_outbound;
	
//	@FindBy(xpath="//*[@id=srchFrm']/div/input")
//	WebElement search_did_outbound;
	
	@FindBy(xpath="//*[contains(@onclick,'submit')]")
	WebElement search_did_submit;
	
	@FindBy(className ="message")
	WebElement div_message;
	
	@FindBy(xpath= "//*[@id='campaignList']/thead/tr/th")
	List<WebElement> AllTablerHeaders;
	
	@FindBy(xpath= "//*[@id='campaignList']/tbody/tr")
	List<WebElement> AllTableRows;
	
	@FindBy(id= "campaignForm_campaign_campignName")
	WebElement CampaignName;
	
	@FindBy(id= "campaignForm_button_delete")
	WebElement Campaign_delete_button;
	
	@FindBy(id= "campaignForm_button_reset")
	WebElement Campaign_reset_button;
	
	@FindBy(id= "campaignForm_button_delete")
	WebElement Campaign_data_delete_button;
	
	@FindBy(className ="main-heading")
	WebElement add_data_heading;
	
	@FindBy(xpath= "//label[@id='campaignForm_campaign_campignName']")
	WebElement CampaignName_addDATA;
	
	@FindBy(id= "campaignForm_file")
	WebElement uploadFile;
	
	@FindBy(id= "uploadText")
	WebElement uploadText;
	
	@FindBy(id= "campaignForm_button_save")
	WebElement Save_button;
	
	public AdminHomePage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public String AdminHomePageTitle() {
		return driver1.getTitle();
	}
	
	public void ClickOnCAMPAIGNS() {
		CampaignMenu.click();
		
	}
	
	public void ClickOnInbound() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CampaignMenu.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Inboundcampaign.click();
	}

	public void ClickOnOutbound() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CampaignMenu.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outboundcampaign.click();
	}

	public void admin_logout() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Admin_usericon.click();
		Admin_signout.click();
		
	}
	
	public String GetFirstCampaign_nameForInbound() {
		
		ClickOnInbound();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.titleIs("Campaigns"));
		return FirstCampaignName_inbound.getText().trim();	
	}
	public String GetFirstCampaign_DidForInbound() {
		ClickOnInbound();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.titleIs("Campaigns"));
		return FirstCampaignDID_inbound.getText().trim();	
	}
	public String GetFirstCampaign_nameForOutbound() {
		ClickOnOutbound();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.titleIs("Campaigns"));
		return FirstCampaignName_Outbound.getText().trim();	
	}
	
//	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[4]")
//	WebElement FirstInboundCampaign_Position;
//	
//	@FindBy(xpath="//*[@id='campaignList']/tbody/tr[1]/td[12]")
//	WebElement FirstInboundCampaign_Start;
//	
	public String EditDidForRunnungInboundCampaign() {
		String cam_name=GetFirstCampaign_nameForInbound();
		//String cam_position=GetCampaignPosition(1);
		RunCampaign("Inbound", cam_name);
		AddCampaignPage = ClickOnSelectedCampaign("InBound", cam_name,"" );
		return AddCampaignPage.EnterDID("10000001");
	}
	public String EditDidForRunnungOutboundCampaign() {
		String cam_name=GetFirstCampaign_nameForOutbound();
		//String cam_position=GetCampaignPosition(1);
		RunCampaign("Outbound", cam_name);
		AddCampaignPage = ClickOnSelectedCampaign("outBound", cam_name,"" );
		return AddCampaignPage.EnterDID("10000001");
	}
	public String DeleteRunnungOutboundCampaign() {
		String cam_name=GetFirstCampaign_nameForOutbound();
		String msg=RunCampaign("Outbound", cam_name);
		if(msg.contains("started"))
		return DeleteCampaign1("Outbound", cam_name);
		
		return "Campaign not Running";
	}
	public String DeleteRunnungInboundCampaign() {
		String cam_name=GetFirstCampaign_nameForInbound();
		String msg=RunCampaign("Inbound", cam_name);
		if(msg.contains("started"))
		return DeleteCampaign1("Inbound", cam_name);
		return "Campaign not Running";
	}
	
	public AddCampaignPage clickOnAddCampaignButton(String C) {
		new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(CampaignMenu));
		Testutil.flash(CampaignMenu, driver1);
		CampaignMenu.click();
		//System.out.println("CLICKED MENU");
		if(C.contains("inbound")|| C.equalsIgnoreCase("inbound")) {
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(Inboundcampaign));
			Testutil.flash(Inboundcampaign, driver1);
			Inboundcampaign.click();
		}
		else if(C.contains("outbound")|| C.equalsIgnoreCase("outbound")) {
			
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(outboundcampaign));
			Testutil.flash(outboundcampaign, driver1);
			outboundcampaign.click();
		}
		//System.out.println("CLICKED CAMPAIGN");
		new WebDriverWait(driver1, 50).until(ExpectedConditions.titleIs("Campaigns"));
		new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(Add_Campaign));
		Testutil.flash(Add_Campaign, driver1);
		Add_Campaign.click();
		//System.out.println("CLICKED ON ADD BUTTON");
		return new AddCampaignPage();
	}
	public AdminUsersPage clickOnUsersMenu() {
		new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(Users));
		Users.click();
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", Users);
		return new AdminUsersPage();
				
	}
	public String Getmessagediv() {
		try {
			//new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(div_message));
			if(div_message.isDisplayed())
				return div_message.getText();
	}catch(NoSuchElementException e) {
	}return "success";
}
	
	public void clickOnBound(String C) {
		new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(CampaignMenu));
		Testutil.flash(CampaignMenu, driver1);
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", CampaignMenu);
		//CampaignMenu.click();
		if(C.contains("inbound")|| C.equalsIgnoreCase("inbound")) {
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(Inboundcampaign));
			Inboundcampaign.click();
		}
		else if(C.contains("outbound")|| C.equalsIgnoreCase("outbound")) {
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(outboundcampaign));
			outboundcampaign.click();
		}
	}
	
	public void ClickOnShowAllButton() {
		if(!driver1.getCurrentUrl().contains("http://10.1.2.88:8080")) {
		Select s=new Select(show_button);
		s.selectByValue("0");
		}
	}
	
	public void searchDID(String Bound,String D) {
		if(Bound.equalsIgnoreCase("inbound"))
			search_did_inbound.sendKeys(D);
		else search_did_outbound.sendKeys(D);
		search_did_submit.click();
	}
	
	
	
	public String RunCampaign(String bound,String cName) {
		return RunCampaign( bound, cName, "");
	}
	
	
	public String RunCampaign(String bound,String cName,String Di) {
		System.out.println("Campaign details to run: name: "+cName+"  type: "+bound);
//		clickOnBound(bound);
//		searchDID(bound,Di);
//		ClickOnShowAllButton();
		int result_row = IdentifyCampaignRow( bound, cName, Di);
		
		if(result_row>0) {
			System.out.println("Campaign position to run: "+GetCampaignPosition(result_row));
			if(GetCampaignPosition(result_row).equals("COMPLETED")) { 
				String res =resetCampaign( bound, result_row);
				System.out.println(res);
				if(res.contains(cName) && res.contains("reset") && res.contains("success")) {
					clickOnBound(bound);
					searchDID(bound,Di);
					ClickOnShowAllButton();
					//return RunCampaign( bound, cName, Di);
				} else return "not able to reset: "+res;
			}
			if(GetCampaignPosition(result_row).equals("READY")) {
				WebElement element=driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*[contains(@onclick,'start')]" ));
				scrollandclick(element);
				return Getmessagediv();
				}
			//if(GetCampaignPosition(result_row).equals("RUNNING")) {
			
			return "success: no need to started: campaign is already running";
		}
		return "Campaign not found to run it";
		
	}
	
	public String resetCampaign(String bound,int result_row) {
		if(result_row>0) {
			
			if(GetCampaignPosition(result_row).equals("COMPLETED")) {
				if(driver1.getCurrentUrl().contains("getkookoo") ||  driver1.getCurrentUrl().contains("172.16")) {
					WebElement element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*"));
					//System.out.println(":"+element.getAttribute("value")+":");
					if(element.getAttribute("value").contains("Reset"))
					scrollandclick(element);

				} else {
	
			WebElement element= driver1.findElement(By.xpath((first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='Reset']")+" | "+(first+result_row+second+AllTablerHeaders.size()+third+"/*[@title='Reset']")));
			scrollandclick(element);
				}
			Campaign_reset_button.click();

			//System.out.println(div_message.getText());
			return Getmessagediv();
			
	} return "campaign is not completed to reset";
		} return "campaign not found to reset";
	}
	
	public String DeleteDataOfCampaign(String bound,int result_row) {
		if(result_row>0) {
		
			if(GetCampaignPosition(result_row).equals("COMPLETED")) {
				if(driver1.getCurrentUrl().contains("getkookoo") ||  driver1.getCurrentUrl().contains("172.16")) {
					WebElement element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*"));
					//System.out.println(":"+element.getAttribute("value")+":");
					if(element.getAttribute("value").contains("Reset"))
					scrollandclick(element);

				} else {
	
			WebElement element= driver1.findElement(By.xpath((first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='Reset']")+" | "+(first+result_row+second+AllTablerHeaders.size()+third+"/*[@title='Reset']")));
			scrollandclick(element);
				}
			
			Campaign_data_delete_button.click();
			driver1.switchTo().alert().accept();

			//System.out.println(div_message.getText());
			return Getmessagediv();
			
	} return "campaign is not completed to delete the data";
		} return "campaign not found to delete the data";
	}
	
	public String ForceCompleteCampaign(String bound,int result_row) {
		if(result_row>0) {
			
			if(!GetCampaignPosition(result_row).equals("COMPLETED")) {
				if(driver1.getCurrentUrl().contains("getkookoo")||  driver1.getCurrentUrl().contains("172.16")) {
					WebElement element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*/*"));
					if(element.getAttribute("value").contains("ForceComplete"))
					scrollandclick(element);

				} else {
			WebElement element= driver1.findElement(By.xpath((first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='ForceComplete']")+" | "+(first+result_row+second+AllTablerHeaders.size()+third+"/*[@title='Force Complete']")));
				
			scrollandclick(element);
				}
			//System.out.println(div_message.getText());
			//System.out.println(Getmessagediv());
			return Getmessagediv();
			
	} return "campaign is in completed already";
		} return "campaign not found to reset";
	}
	
	
	public int IdentifyCampaignRow(String bound,String cName,String Di) {
		clickOnBound(bound);
		//System.out.println("clicking on Bound is over");
		searchDID(bound,Di);
		//System.out.println("search DID over");
		ClickOnShowAllButton();
		//System.out.println("show all over");
		int result_row =0;
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		//System.out.println("cam_name_col is: "+cam_name_col);
		int size = AllTableRows.size();
		//System.out.println("no of rows: "+size);
		
		for (int i=1;i<=size;i++) {
			if(driver1.findElement(By.xpath("//*[@id='campaignList']/tbody/tr[1]/td[1]")).getText().contains("Nothing found to display")) {
				return -1;
				}
			//System.out.println("row "+i+" campaign name with title: "+driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getAttribute("title"));
			//System.out.println("row "+i+" campaign name with title: "+driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getText());
			if(driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getAttribute("title").equals(cName) || driver1.findElement(By.xpath(first+i+second+cam_name_col+third)).getText().equals(cName)) {
				result_row=i;
				//System.out.println("result row is:"+result_row);
				return result_row;}
		}
		return -2;
	}
	
	public String GetCampaignPosition(int result_row) {
		if(result_row>0) {
			int cam_position = returnColumnNoOfTableHeader("Position");
		
			String pos =driver1.findElement(By.xpath(first+result_row+second+cam_position+third)).getText();
			//System.out.println("position of the campaign is:"+pos);
			return pos;
		}
		
		return "campaign not found, not able to know the position";
	}
	
	public String StopCampaign(String bound,String cName,String Di) {
		System.out.println("Campaign details for Stop: Name:"+cName+"  Type:"+bound);
		clickOnBound(bound);
		searchDID(bound,Di);
		ClickOnShowAllButton();
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		
		if(result_row>0) {
			if(GetCampaignPosition(result_row).equals("RUNNING")) {
				WebElement element=driver1.findElement(By.xpath((first+result_row+second+AllTablerHeaders.size()+third+"/*[contains(@onclick,'stop')]") ) );
				scrollandclick(element);
				return Getmessagediv();
			}
			return "success: campaign is not running to stop it";
		}return "success: campaign is not found to stop it";
	}

	public void scrollandclick(WebElement webelement) {
		try {
			webelement.click();
		}catch (WebDriverException e) {
			//System.out.println("in exception of click");
			((JavascriptExecutor) driver1).executeScript("window.scrollBy(0,200)", "");
			webelement.click();
		}
		
	}
	
	public String DeleteCampaign(String bound,String cName) {
		return DeleteCampaign( bound, cName,"");
		
	}
	
	public AddCampaignPage ClickOnSelectedCampaign(String bound,String cName, String Di) {
		System.out.println("Campaign details for Editing: Name:"+cName+"  Type:"+bound);
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		if(result_row>0) {
		WebElement element = driver1.findElement(By.xpath(first+result_row+second+cam_name_col+third));
		new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		}
		
		return new AddCampaignPage();
	}
	
	
	
	public boolean ClickOnAddDataOfSelectedCampaign(String bound,String cName, String Di) {
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		if(result_row>0) {
			if(!GetCampaignPosition(result_row).equals("RUNNING")) {
				if(driver1.getCurrentUrl().contains("getkookoo")||  driver1.getCurrentUrl().contains("172.16")) {
					WebElement element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*/*"));
					//System.out.println("1:"+element.getAttribute("value")+":");
					if(element.getAttribute("value").contains("AddData"))
					scrollandclick(element);
					
					else {
						element= driver1.findElement(By.xpath(first+result_row+second+AllTablerHeaders.size()+third+"/*/*/*"));
						//System.out.println("2:"+element.getAttribute("value")+":");
						if(element.getAttribute("value").contains("AddData"))
						scrollandclick(element);

					}
						
				} else {

				WebElement element=driver1.findElement(By.xpath((first+result_row+second+AllTablerHeaders.size()+third+"/*[@value='AddData']")+" | "+(first+result_row+second+AllTablerHeaders.size()+third+"/*[@title='Add Campaign Data']")));
				scrollandclick(element);
				}
				return true;
			}
		}
		return false;
	}
	
	public String ClickOnFileUploadOfAddData(String cName, Object path) {
		
		if(add_data_heading.getText().contains("Add Campaign data")) {
			if(CampaignName_addDATA.getText().trim().equalsIgnoreCase(cName)) {
				System.out.println("campaign name for add Data: "+cName+ "  Result campaign name: "+CampaignName_addDATA.getText() );
				if(!path.equals("")) {
					try {
						if(uploadText.isDisplayed()) {
				((JavascriptExecutor)driver1).executeScript("arguments[0].removeAttribute('style')", uploadFile);
				//System.out.println(path.toString());
				uploadFile.sendKeys(path.toString());
				Save_button.click();
				return Getmessagediv();
				
				}
			}catch(NoSuchElementException e) {
			}
				}	return "path is blank";
			} return "campaign name not matching";
				
		} return "Add Campaign data is not there";
		
		
	}
	
		
		
		
		
		
	public String DeleteCampaign(String bound,String cName, String Di) {
		System.out.println("Campaign details for deletion: Name:"+cName+"  Type:"+bound);
//		clickOnBound(bound);
//		searchDID(bound,Di);
//		ClickOnShowAllButton();
		
		//int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		//System.out.println("result_row is: "+result_row);
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		//System.out.println("cam_name_col is : "+cam_name_col);
		
		if(result_row>0) {
			System.out.println("Campaign position: "+GetCampaignPosition(result_row));
			
			if(GetCampaignPosition(result_row).equals("RUNNING")) { 
				System.out.println(StopCampaign( bound, cName, Di));
				clickOnBound(bound);
				searchDID(bound,Di);
				ClickOnShowAllButton();
			}
			
			if(!GetCampaignPosition(result_row).equals("RUNNING")) {
				driver1.findElement(By.xpath(first+result_row+second+cam_name_col+third)).click();
				System.out.println("campaign name: "+ cName+" deleting: "+CampaignName.getAttribute("value"));
				
				if(CampaignName.getAttribute("value").trim().equals(cName.trim())) {
					try {
				Campaign_delete_button.click();}
					catch(Exception e) {
						return "delete is not available";
					}
				driver1.switchTo().alert().accept();
				//driver1.switchTo().alert().dismiss();
				//return "correct";
				return Getmessagediv();
				}return "program error, not deleting correct campaign so stopped1";
			} return "program error, not deleting correct campaign so stopped2";
		}return "campaign not identified to delete";
		}
	public String DeleteCampaign1(String bound,String cName) {
		return DeleteCampaign1( bound, cName,"");
		
	}
	public String DeleteCampaign1(String bound,String cName, String Di) {
		System.out.println("Campaign details for deletion: Name:"+cName+"  Type:"+bound);
		int result_row = IdentifyCampaignRow(bound,cName, Di);
		//System.out.println("result_row is: "+result_row);
		int cam_name_col = returnColumnNoOfTableHeader("Campaign Name");
		//System.out.println("cam_name_col is : "+cam_name_col);
		
		if(result_row>0) {
			System.out.println("Campaign position: "+GetCampaignPosition(result_row));
			if(GetCampaignPosition(result_row).equals("RUNNING")) {
				driver1.findElement(By.xpath(first+result_row+second+cam_name_col+third)).click();
				System.out.println("campaign name: "+ cName+" deleting: "+CampaignName.getAttribute("value"));
				
				if(CampaignName.getAttribute("value").trim().equals(cName.trim())) {
					try {
				Campaign_delete_button.click();}
					catch(Exception e) {
						return "delete is not available";
					}
				//driver1.switchTo().alert().accept();
				driver1.switchTo().alert().dismiss();
				return "incorrect";
				//return Getmessagediv();
				}return "program error, not deleting correct campaign so stopped1";
			} return "program error, not deleting correct campaign so stopped2";
		}return "campaign not identified to delete";
		}
			
	
	public int returnColumnNoOfTableHeader(String H) {
		int i=0;
		//System.out.println("size of headers: "+AllTablerHeaders.size());
		for (WebElement w:AllTablerHeaders) {
			//System.out.println(w.getText());
			i++;
		 	if(w.getText().contains(H) )
			return i;
		 	}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
