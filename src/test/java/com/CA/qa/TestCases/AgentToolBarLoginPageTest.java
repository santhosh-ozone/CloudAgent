package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;
import com.CA.qa.Util.Testutil;

public class AgentToolBarLoginPageTest extends TestBase{
	
	public static String customer_empty_err = "Customer is required";
	public static String agentId_empty_err = "Agent Id is required";
	public static String PhoneNo_empty_err = "Phone Number is required";
	public static String pin_empty_err = "Pin is required";
	public static String Already_login_err_msg = "Agent has already logged in";
	public static String messge_after_click_Err_logout = "You can login now.";
	public static String invalid_agent_user_err ="Fail:Invaild User/Agent.";
	public static String PhNo_NotExist_err ="Phone Number doesn't exist";	
	public static String wrong_password_err = "Wrong password";
	public static String InvalidPhoneNoErr = "Phone Number is invalid";
	public boolean flag = false;
	
	AgentToolBarLoginPage ATBloginpage;
	AgentToolBarHomePage  ATBHomePage;
	
	public AgentToolBarLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		ATBLogin();
		ATBloginpage = new AgentToolBarLoginPage();
		
		}
	
	@Test (priority = 1) 
	public void VerifyATBLoginPage_TitleTest() {
		
		String Act_ATBLoginPageTitle = ATBloginpage.ValidateATBLoginPageTitle();
		System.out.println("Title is: "+Act_ATBLoginPageTitle);
		Assert.assertEquals(Act_ATBLoginPageTitle, Testutil.Exp_ATBloginPageTitle);
				
	}
	
	@Test (priority = 2)
	public void verifyATBLoginpage_logoTest() {
		flag = ATBloginpage.ValidateATBlLoginPagelogo();
		//System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test (priority = 3)
	public void verifyATBLoginpage_EmptycustomerErrMsg() {
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateATBcustomerErrMsg().contains(customer_empty_err))
		flag = true;
		System.out.println("customer_empty_err mesage is: "+ATBloginpage.ValidateATBcustomerErrMsg());
		Assert.assertTrue(flag, "For Blank customer field error message not contains: "+customer_empty_err);
		}
	
	@Test (priority = 4)
	public void verifyATBLoginpage_EmptyAgentIdErrMsg() {
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateATBAgentIdErrMsg().contains(agentId_empty_err))
		flag = true;
		System.out.println("agentId_empty_err message: "+ATBloginpage.ValidateATBAgentIdErrMsg());
		Assert.assertTrue(flag, "For Blank agentID field error message not contains: "+agentId_empty_err);
		
	}
	
	@Test (priority = 5)
	public void verifyATBLoginpage_EmptyPhoneNoErrMsg() {
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateATBphoneNoErrMsg().contains(PhoneNo_empty_err))
		flag = true;
		System.out.println("PhoneNo_empty_err message is: "+ATBloginpage.ValidateATBphoneNoErrMsg());
		Assert.assertTrue(flag, "For Blank PhoneNo field error message not contains: "+PhoneNo_empty_err);
		
	}
	
	@Test (priority = 6)
	public void verifyATBLoginpage_EmptyPinErrMsg() {
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateATBpinErrMsg().contains(pin_empty_err))
		flag = true;
		System.out.println("pin_empty_err message: "+ATBloginpage.ValidateATBpinErrMsg());
		Assert.assertTrue(flag, "For Blank pin field error message not contains: "+pin_empty_err);
		
	}
	
	@Test (priority = 7)
	public void verifyATBLoginpage_invalidAgentErrMsg() {
		ATBloginpage.EnterAgentID("san");
		ATBloginpage.EnterCustomerID(Testutil.Readexcel("AgentLogin",1 ).get(0));
		ATBloginpage.EnterPhoneNo(Testutil.Readexcel("AgentLogin",3 ).get(0));
		ATBloginpage.EnterPin(Testutil.Readexcel("AgentLogin",4 ).get(0));
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateErrMsg().contains(invalid_agent_user_err)) 
		flag = true;
		System.out.println("invalid_agent_err message is: "+ATBloginpage.ValidateErrMsg());
		Assert.assertTrue(flag, "invalid agent/user error message not contains: "+invalid_agent_user_err);
		
		
	}
	
	@Test (priority = 8)
	public void verifyATBLoginpage_invalidUserErrMsg() {
		ATBloginpage.EnterAgentID(Testutil.Readexcel("AgentLogin",2 ).get(0));
		ATBloginpage.EnterCustomerID("san");
		ATBloginpage.EnterPhoneNo(Testutil.Readexcel("AgentLogin",3 ).get(0));
		ATBloginpage.EnterPin(Testutil.Readexcel("AgentLogin",4 ).get(0));
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateErrMsg().contains(invalid_agent_user_err)) 
		flag = true;
		System.out.println("invalid_user_err message is: "+ATBloginpage.ValidateErrMsg());
		Assert.assertTrue(flag, "invalid agent/user error message not contains: "+invalid_agent_user_err);
		
		
	}
	
	@Test (priority = 9)
	public void verifyATBLoginpage_PhoneNumberDoesnotexistErrMsg() {
		ATBloginpage.EnterAgentID(Testutil.Readexcel("AgentLogin",2 ).get(0));
		ATBloginpage.EnterCustomerID(Testutil.Readexcel("AgentLogin",1 ).get(0));
		ATBloginpage.EnterPhoneNo("000");
		ATBloginpage.EnterPin(Testutil.Readexcel("AgentLogin",4 ).get(0));
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateErrMsg().contains(PhNo_NotExist_err)) 
		flag = true;
		System.out.println("PhNo_NotExist_err message is: "+ATBloginpage.ValidateErrMsg());
		Assert.assertTrue(flag, "invalid agent/user error message not contains: "+invalid_agent_user_err);
		
		
	}
	
	@Test (priority = 10)
	public void verifyATBLoginpage_PhoneNumberInvalidErrMsg() {
		ATBloginpage.EnterAgentID(Testutil.Readexcel("AgentLogin",2 ).get(0));
		ATBloginpage.EnterCustomerID(Testutil.Readexcel("AgentLogin",1 ).get(0));
		ATBloginpage.EnterPhoneNo("x");
		ATBloginpage.EnterPin(Testutil.Readexcel("AgentLogin",4 ).get(0));
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateATBphoneNoErrMsg().contains(InvalidPhoneNoErr)) 
		flag = true;
		System.out.println("InvalidPhoneNoErr message is: "+ATBloginpage.ValidateATBphoneNoErrMsg());
		Assert.assertTrue(flag, "invalid agent/user error message not contains: "+invalid_agent_user_err);
		
		
	}
	
	@Test (priority = 11)
	public void verifyATBLoginpage_wrong_password_errMsg() {
		ATBloginpage.EnterAgentID(Testutil.Readexcel("AgentLogin",2 ).get(0));
		ATBloginpage.EnterCustomerID(Testutil.Readexcel("AgentLogin",1 ).get(0));
		ATBloginpage.EnterPhoneNo(Testutil.Readexcel("AgentLogin",3 ).get(0));
		ATBloginpage.EnterPin("***");
		ATBloginpage.ClickOnATBLogin_Btn();
		if(ATBloginpage.ValidateErrMsg().contains(wrong_password_err)) 
		flag = true;
		System.out.println("wrong_password_err message is: "+ATBloginpage.ValidateErrMsg());
		Assert.assertTrue(flag, "invalid agent/user error message not contains: "+invalid_agent_user_err);
		
		
	}
	
	
	@Test (priority = 12)
	public void ATBloginTest() {
		//ATBloginpage.LoginintoATB(cus, id, ph, pwd)
		ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
		//System.out.println("login passed");
	}
	
	@AfterMethod
	public void teardown(Method method, ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) 
			Testutil.takeScreenshotAtEndOfTest(driver, method.getName());
		
		
		driver.quit();
		Printhyphens();
		
	}
	
	
	
	
	
	
}
