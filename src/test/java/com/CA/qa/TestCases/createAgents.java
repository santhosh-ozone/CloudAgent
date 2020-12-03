package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.ConfigurationsPage;
import com.CA.qa.Util.Testutil;

public class createAgents extends TestBase{
	
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	ConfigurationsPage ConfigurationsPage;
	//AgentToolBarLoginPage ATBloginpage;
	//AgentToolBarHomePage  ATBHomePage;
		
	public createAgents() {
		super();
	}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		ConfigurationsPage = new ConfigurationsPage();
		}

	@AfterMethod
	public void nteardown() {
		System.out.println(driver1.getCurrentUrl());
		Printhyphens();
		AdminHomepage.admin_logout();
		driver1.close();
	}
	@Test (priority=1)	
	public void AddAgents() {
			for( int i=1;i<= count;i++) {
			String id1 = Agent_id+i;
			String m1=ConfigurationsPage.AddAgent(id1,"", "", Agent_Pwd, id1, 1, "","", "all", "yes", "yes", "yes", "yes", "yes");
			System.out.println(m1);
			Assert.assertTrue(m1.contains("Passed"),"Agent "+id1 +" not added");
		}
		}
	
	
	@Test (priority=2)
	public void AddPhoneNos() {
				for( int i=1;i<= count;i++) {
					String name1= Name_for_Agent_PhNo+i;
					int pno1=Agent_Ph_no+i;
				String m1=ConfigurationsPage.addPhoneNo(name1, pno1, 1, "no");
				System.out.println(m1);
				Assert.assertTrue(m1.contains("Passed"),"Phone No "+pno1 +" not added");
			}
	}

}
