package com.CA.qa.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class AgentToolBarLoginPage extends TestBase {
	
	
	 //Cloud Agent
	@FindBy(xpath = "//*[contains(@class,'logo')]")
	WebElement ATB_CAlogo;
	
	@FindBy(id= "customer")
	WebElement ATBcustomer;
	
	@FindBy(id = "agentid")
	WebElement ATBagentid;
	
	@FindBy(id = "phoneNumber")
	WebElement ATBphoneNumber;
	
	@FindBy(id = "pin")
	WebElement ATBpin;
	
	@FindBy(id = "parsley-id-5")
	WebElement Customer_err;
	
	@FindBy(id = "parsley-id-7")
	WebElement AgentId_err;
	
	@FindBy(id = "parsley-id-9")
	WebElement phoneNo_err;
	
	@FindBy(id = "parsley-id-11")
	WebElement pin_err;
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement ATBLogin_Btn;
	
	@FindBy(id = "logMeOutBtn")
	WebElement ATBerrLogout_Btn;
	
	@FindBy(id = "error_message")
	WebElement ATBerr_Msg;
	
	//*[@id="error_message"]/div[2]
	public AgentToolBarLoginPage() {
		PageFactory.initElements(driver, this);
				
	  }
	
	public String ValidateATBLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ValidateATBlLoginPagelogo() {
		
		return ATB_CAlogo.isDisplayed();
	}
	
	public String ValidateATBcustomerErrMsg() {
		return Customer_err.getText();
	}
	
	public String ValidateATBphoneNoErrMsg() {
		return phoneNo_err.getText();
	}
	
	public String ValidateATBAgentIdErrMsg() {
		return AgentId_err.getText();
	}
	
	public String ValidateATBpinErrMsg() {
		return pin_err.getText();
	}
	
	public String ValidateErrMsg() {
		return ATBerr_Msg.getText();
	}
	
	public void EnterCustomerID(String CustomerId) {
		ATBcustomer.sendKeys(CustomerId);
	}
	
	public void EnterAgentID(String AgentId) {
		ATBagentid.sendKeys(AgentId);
	}
	
	public void EnterPhoneNo(String PhoneNo) {
		ATBphoneNumber.sendKeys(PhoneNo);
	}
	
	public void EnterPin(String Pin) {
		ATBpin.sendKeys(Pin);
		
	}
	
	public void ClickOnATBLogin_Btn() {
		ATBLogin_Btn.click();
	}
	
	
	
	public AgentToolBarHomePage LoginintoATB( String cus, String id, String ph, String pwd) {
		ATBcustomer.clear();
		ATBcustomer.sendKeys(cus);
		ATBagentid.clear();
		ATBagentid.sendKeys(id);
		ATBphoneNumber.clear();
		ATBphoneNumber.sendKeys(ph);
		ATBpin.clear();
		ATBpin.sendKeys(pwd);
		ATBLogin_Btn.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//try {
			if (driver.getTitle().contains(Testutil.Exp_ATBloginPageTitle)) {
		//if (ATBerrLogout_Btn.isDisplayed()) {
			ATBerrLogout_Btn.click();
			ATBcustomer.clear();
			ATBcustomer.sendKeys(cus);
			ATBagentid.clear();
			ATBagentid.sendKeys(id);
			ATBphoneNumber.clear();
			ATBphoneNumber.sendKeys(ph);
			ATBpin.clear();
			ATBpin.sendKeys(pwd);
			ATBLogin_Btn.click();
		}
		
//		}catch(NoSuchElementException e) {
//			
//		}
		return new AgentToolBarHomePage();
	}
	
	
	
	
	
	

	
}
