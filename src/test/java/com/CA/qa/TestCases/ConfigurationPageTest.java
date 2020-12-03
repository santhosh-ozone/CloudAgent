package com.CA.qa.TestCases;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AdminHomePage;
import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Pages.ConfigurationsPage;
import com.CA.qa.Util.Testutil;

public class ConfigurationPageTest extends TestBase {
	
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	ConfigurationsPage ConfigurationsPage;
	
	public ConfigurationPageTest() {
		super();
	}
	
	@BeforeClass
	public void clearExcelDatainRes() {
		Testutil.ClearDataInResultColumn("Agents");
		Testutil.ClearDataInResultColumn("PhoneNumber");
		Testutil.ClearDataInResultColumn("TransferNumbers");
		Testutil.ClearDataInResultColumn("Dispositions");
		Testutil.ClearDataInResultColumn("Pause Reasons");
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
	
	@DataProvider
	 public static Object[][] Agentsdata() {
		Object data[][] =Testutil.Readexcel1("Agents");
		return data;
	}
	
	
	@DataProvider
	 public static Object[][] PhoneNodata() {
		Object data[][] =Testutil.Readexcel1("PhoneNumber");
		return data;
	}
	
	@DataProvider
	 public static Object[][] TransferNodata() {
		Object data[][] =Testutil.Readexcel1("TransferNumbers");
		return data;
	}
	
	@DataProvider
	 public static Object[][] Dispositionsdata() {
		Object data[][] =Testutil.Readexcel1("Dispositions");
		return data;
	}
	
	@DataProvider
	 public static Object[][] PauseReasondata() {
		Object data[][] =Testutil.Readexcel1("Pause Reasons");
		return data;
	}
	
	
	@Test (priority=1,dataProvider = "Agentsdata")
	public void AddAgents(String act,String id,Object nid, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend,Object res) {
		String m1="";
		if (act.trim().equalsIgnoreCase("ADD")) {
		m1=ConfigurationsPage.AddAgent(id,nid, lock, pwd, name, pr, mail, data, Skill, in, man, pre, prog, blend);
		System.out.println(m1);
		Agents_count++;
		Testutil.WriteDataToexcel("Agents", Agents_count,m1);
		Assert.assertTrue(m1.contains("success"),"Agent "+id +" not added");
		}
		else if (act.trim().equalsIgnoreCase("EDIT")) {
			m1=ConfigurationsPage.EditAgent(id,nid, lock, pwd, name, pr, mail, data, Skill, in, man, pre, prog, blend);
			System.out.println(m1);
			Agents_count++;
			Testutil.WriteDataToexcel("Agents", Agents_count,m1);
			Assert.assertTrue(m1.contains("success"),"Agent "+id +" not able to edit");
			}
		
		else if(act.trim().equalsIgnoreCase("DELETE")) {
			m1=ConfigurationsPage.deleteAgent(id);
			System.out.println(m1);
			Agents_count++;
			Testutil.WriteDataToexcel("Agents", Agents_count,m1);
			Assert.assertTrue(m1.contains("success"),id+" Agent not able to delete");
		}
//		Agents_count++;
//		Testutil.WriteDataToexcel("Agents", Agents_count,m1);
	}
	
//	@Test (priority=2,dataProvider = "PhoneNodata")
//	public void AddPhoneNos(String act,Object name, Object Nname,Object pno, Object Nph, Object pr, Object sip, Object res) {
//			if (act.trim().equalsIgnoreCase("ADD")) {
//				String m1=ConfigurationsPage.addPhoneNo(name, pno, pr, sip);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),"Phone No "+pno +" not added");
//			}
//			else if (act.trim().equalsIgnoreCase("EDIT")) {
//				String m1=ConfigurationsPage.EditPhoneNo(name, Nname, pno, Nph, pr, sip);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),"phone no "+pno+"  not able to edit");
//			}
//			
//			else if(act.trim().equalsIgnoreCase("DELETE")) {
//				String m2=ConfigurationsPage.deletePhoneNo(name.toString(), pno.toString());
//				System.out.println(m2);
//				Assert.assertTrue(m2.contains("success"),pno+" Phone No not able to delete");
//			}
//		
//	}
//	
//	@Test (priority=3,dataProvider = "TransferNodata")
//	public void AddTransferNos(String act,Object name, Object Nname,Object pno, Object Nph, Object sip, Object res) {
//			if (act.trim().equalsIgnoreCase("ADD")) {
//				String m1=ConfigurationsPage.AddTransferNumber(name, pno, sip);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),"Transfer No "+pno +" not added");
//			}
//			else if (act.trim().equalsIgnoreCase("EDIT")) {
//				String m1=ConfigurationsPage.EditTransferNo(name, Nname, pno, Nph, sip);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),"Transfer no "+pno+"  not able to edit");
//			}
//			
//			else if(act.trim().equalsIgnoreCase("DELETE")) {
//				String m2=ConfigurationsPage.deleteTransferNo(name.toString().trim(), pno.toString().trim());
//				System.out.println(m2);
//				Assert.assertTrue(m2.contains("success"),pno+" Phone No not able to delete");
//			}
//		
//	}
//	
//	@Test (priority=4,dataProvider = "Dispositionsdata")
//	public void AddDispositions(String act,String reason, Object reason1, Object res) {
//			if (act.trim().equalsIgnoreCase("ADD")) {
//				String m1=ConfigurationsPage.AddDispositions(reason);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),reason +" not added");
//			}
//			else if (act.trim().equalsIgnoreCase("EDIT")) {
//				String m1=ConfigurationsPage.EditDispositions(reason, reason1.toString());
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),reason+"  not able to edit");
//			}
//			
//			else if(act.trim().equalsIgnoreCase("DELETE")) {
//				String m2=ConfigurationsPage.deleteDisposition(reason);
//				System.out.println(m2);
//				Assert.assertTrue(m2.contains("success"),reason+" not able to delete");
//			}
//		}
//	
//	@Test (priority=5,dataProvider = "PauseReasondata")
//	public void AddpauseReasons(String act,String reason, Object reason1, Object time, Object res) {
//			if (act.trim().equalsIgnoreCase("ADD")) {
//				String m1=ConfigurationsPage.AddPauseReason(reason, time);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),reason +" not added");
//			}
//			else if (act.trim().equalsIgnoreCase("EDIT")) {
//				String m1=ConfigurationsPage.EditPausereason(reason, reason1, time);
//				System.out.println(m1);
//				Assert.assertTrue(m1.contains("success"),reason+"  not able to edit");
//			}
//			
//			else if(act.trim().equalsIgnoreCase("DELETE")) {
//				String m2=ConfigurationsPage.deletePauseReason(reason);
//				System.out.println(m2);
//				Assert.assertTrue(m2.contains("success"),reason+" not able to delete");
//			}
//		}
	
	
	
}
