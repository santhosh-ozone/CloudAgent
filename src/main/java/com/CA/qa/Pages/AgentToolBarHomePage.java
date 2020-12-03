package com.CA.qa.Pages;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class AgentToolBarHomePage extends TestBase {
	
	@FindBy (id = "agentStatus")
	WebElement ATBagentStatus;
	
	@FindBy (id = "changeStatus")
	WebElement ATBagentchangeStatus;
	
	@FindBy (id = "readyLi")
	WebElement ATBChangeStatusToReady;
	
	@FindBy (id = "pauseLi")
	WebElement ATBChangeStatusToPause;
	
	@FindBy (id = "pauseReason")
	WebElement ATBpauseReason;
	
	@FindBy (xpath = "//*[text()='Done']")
	WebElement Pause_Done;
	//*[@id='popupReasonBox']/div[3]/button
	
	@FindBy (id = "agentMode")
	WebElement ATBagentMode;
	
	@FindBy (id = "inboundLi")
	WebElement ATBChangeAgentModeToInbound;
	
	@FindBy (id = "manualLi")
	WebElement ATBChangeAgentModeTomanual;
	
	@FindBy (id = "previewLi")
	WebElement ATBChangeAgentModeTopreview;
	
	@FindBy (id = "progressLi")
	WebElement ATBChangeAgentModeToprogress;
	
	@FindBy (id = "blendedLi")
	WebElement ATBChangeAgentModeToblended;
	
	//*[@class='dropdown-toggle']/span/i
	@FindBy (xpath = "//*[@id='action_nav']//span/i")
	WebElement ATBAgent;
	
	@FindBy (xpath = "//*[@id='action_nav']//span/parent::*/following-sibling::*/child::*[1]")
	WebElement ATBAgentPhone;
	
	@FindBy (id = "forceRelease")
	WebElement ATBForceRelease;
	
	@FindBy (id = "logout")
	WebElement ATBlogout;
	
	public AgentToolBarHomePage() {
		PageFactory.initElements(driver, this);
				
	  }
	
	public String ATBagentStatus() {
		return ATBagentStatus.getText();
		
	}

	public void ATBchangeToReady() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ATBagentchangeStatus));
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBagentchangeStatus));
		
		//ATBagentchangeStatus.click();
		js.executeScript("arguments[0].click();", ATBagentchangeStatus);
		//System.out.println("change status clicked");
		js.executeScript("arguments[0].click();", ATBChangeStatusToReady);
		//ATBChangeStatusToReady.click();
		//System.out.println("ready clicked");
		//System.out.println(System.currentTimeMillis());
		//System.out.println("status 1is: "+ATBagentStatus.getText());
		WebDriverWait w= new WebDriverWait(driver,20);
		w.until(ExpectedConditions.textToBePresentInElement(ATBagentStatus, "READY"));
		//System.out.println(System.currentTimeMillis());
		//System.out.println("status 2is: "+ATBagentStatus.getText());
		}
	
	public void ATBchangeToPause() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBagentchangeStatus));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ATBagentchangeStatus);
		//ATBagentchangeStatus.click();
		js.executeScript("arguments[0].click();", ATBChangeStatusToPause);
		//ATBChangeStatusToPause.click();
		//new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("pauseReason")));
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(ATBpauseReason));
		Select drp = new Select(ATBpauseReason);
		//System.out.println("passed1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		drp.selectByIndex(1);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].click();", Pause_Done);
		//System.out.println("status 3is: "+ATBagentStatus.getText());
		new WebDriverWait(driver, 20).until(ExpectedConditions.textToBePresentInElement(ATBagentStatus, "PAUSED"));
		//System.out.println("status 4is: "+ATBagentStatus.getText());		
	}
	

	public void AgentLogout() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Testutil.flash(ATBAgent, driver);
//		if (ATBAgent.isEnabled()) {
//			
//		ATBAgent.click();
//		   }
//		else
//		
			js.executeScript("arguments[0].click();", ATBAgent );
		
//		if (ATBlogout.isDisplayed()) {
//		
//		ATBlogout.click();
//		}
//		
//		else
			Testutil.flash(ATBlogout, driver);
		
			js.executeScript("arguments[0].click();", ATBlogout );
		
//			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//					.withTimeout(30, TimeUnit.SECONDS)
//					.pollingEvery(300, TimeUnit.MILLISECONDS)
//					.ignoring(NoSuchElementException.class);
		
	}
	
	public void ATBForceRelease(){
		//ATBAgent.click();
		//ATBForceRelease.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ATBAgent );
				
		js.executeScript("arguments[0].click();", ATBForceRelease );
		
		
	}
	 
	public void ATBchangeToInbound() {
		ATBagentMode.click();
		ATBChangeAgentModeToInbound.click();
		
	}
	
	public void ATBchangeTomanual() {
		ATBagentMode.click();
		ATBChangeAgentModeTomanual.click();
		
	}
	
	public void ATBchangeToProgressive() {
		ATBagentMode.click();
		ATBChangeAgentModeToprogress.click();
		
	}
	
	public void ATBchangeToBlended() {
		ATBagentMode.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ATBChangeAgentModeToblended );
		//ATBChangeAgentModeToblended.click();
	}
	
	public void ATBchangeToPreview() {
		ATBagentMode.click();
		ATBChangeAgentModeTopreview.click();
		
	}
	
	public String ATBHomePageTitle() {
		return driver.getTitle();
	}
	
	public String get_Agentmode() {
		
		return ATBagentMode.getText();
	}
	
	public void closebrowser() {
		 driver.close();
	}
	
	
   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
