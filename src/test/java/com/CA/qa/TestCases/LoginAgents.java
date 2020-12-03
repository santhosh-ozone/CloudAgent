package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;


public class LoginAgents extends TestBase {
	
	AgentToolBarLoginPage ATBloginpage;
	AgentToolBarHomePage  ATBHomePage;
	public LoginAgents() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		ATBLogin();
		ATBloginpage = new AgentToolBarLoginPage();
		
		}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
		Printhyphens();
		
	}
	@DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod() {
		Object[][] Obj= new Object[count-Intial+1][1];
		int j=0;
		for( int i=Intial;i<= count;i++) {
			Obj[j][0]=i;
			j++;
			
		}
		return Obj;
    }
	
	@Test (priority = 1,dataProvider = "data-provider")
	public void LoginAgentsIntoATB(Integer no) {
			String id1 = Agent_id+no;
			int ph1 = Agent_Ph_no+no;
			String ph2=String.valueOf(ph1);
			ATBHomePage = ATBloginpage.LoginintoATB(Customer, id1, ph2, Agent_Pwd);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	
	

}
