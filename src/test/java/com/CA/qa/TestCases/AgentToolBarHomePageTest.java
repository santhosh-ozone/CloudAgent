package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;
import com.CA.qa.Util.Testutil;

public class AgentToolBarHomePageTest extends TestBase{
	
	AgentToolBarLoginPage ATBloginpage;
	AgentToolBarHomePage  ATBHomePage;
	
	public AgentToolBarHomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		ATBLogin();
		ATBloginpage = new AgentToolBarLoginPage();
		ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
		
		}
	
	@Test (priority = 1) 
	public void verifyATBHomePage_TitleTest() {
		String Act_ATBHomePageTitle = ATBHomePage.ATBHomePageTitle();
		Assert.assertEquals(Act_ATBHomePageTitle, Testutil.Exp_ATBhomePageTitle);
		//System.out.println(Act_ATBHomePageTitle);
		
	}
	
	@Test (priority = 2)
	public void verifyAgentStatusTestAtStart() {
		String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(agent_status, "Not Ready");
		//System.out.println("passed status");		
	}
	
	@Test( priority =3)
    public void VerifyAgentStatusToPause() {
		ATBHomePage.ATBchangeToReady();
		ATBHomePage.ATBchangeToPause();
		//String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(ATBHomePage.ATBagentStatus(), "PAUSED");
			
	}
	
	
	
	@Test( priority =4)
	public void VerifyAgentStatusToReady() {
		ATBHomePage.ATBchangeToReady();
		String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(agent_status, "READY");
		//System.out.println("passed status");	
		
	}
	
	@Test( priority =5)
	public void VerifyAgentModeAtStart() {
		//ATBHomePage.ATBchangeToReady();
		//ATBHomePage.get_Agentmode();
		//String agent_status = ATBHomePage.ATBagentStatus();
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "INBOUND");
		//System.out.println("passed status");		
	}
	
	@Test( priority =6)
	public void VerifyAgentModeAfterManual() {
		ATBHomePage.ATBchangeToReady();
		ATBHomePage.ATBchangeTomanual();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "MANUAL");
				
	}
	
	@Test( priority =7)
	public void VerifyAgentModeAfterInbound() {
		ATBHomePage.ATBchangeToReady();
		
		ATBHomePage.ATBchangeToInbound();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "INBOUND");
				
	}
		
	@Test( priority =8)
	public void VerifyAgentModeAfterPreview() {
		ATBHomePage.ATBchangeToReady();
		ATBHomePage.ATBchangeToPreview();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "PREVIEW");
				
	}
	
	@Test( priority =9)
	public void VerifyAgentModeAfterProgressive() {
		ATBHomePage.ATBchangeToReady();
		
		ATBHomePage.ATBchangeToProgressive();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "PROGRESSIVE");
				
	}
	
	@Test( priority =10)
	public void VerifyAgentModeAfterBlended() {
		ATBHomePage.ATBchangeToReady();
		ATBHomePage.ATBchangeToBlended();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(ATBHomePage.get_Agentmode(), "BLENDED");
				
	}
	
	@Test( priority =11)
	public void VerifyAgentATBForceRelease() {
		ATBHomePage.ATBchangeToReady();
		ATBHomePage.ATBForceRelease();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Assert.assertEquals(actual, expected);
				
	}
	
	@Test( priority =12)
	public void VerifyAgentATBLogout() {
		
		
		ATBHomePage.AgentLogout();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals(driver.getTitle(), "Agent Login");
				
	}
	
	
	
	@AfterMethod
	public void teardown(Method method, ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) 
			Testutil.takeScreenshotAtEndOfTest(driver, method.getName());
			
		if(!method.getName().contains("VerifyAgentATBLogout"))
		ATBHomePage.AgentLogout();
		
		driver.quit();
		//driver1.quit();
		Printhyphens();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
