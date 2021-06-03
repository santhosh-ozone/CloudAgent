package com.CA.qa.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
		Testutil.ClearDataInResultColumn("Dialout");
		
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
	@DataProvider
	 public static Object[][] Dialoutdata() {
		Object data[][] =Testutil.Readexcel1("Dialout");
		return data;
	}
	
//	@Test (priority=1,dataProvider = "Agentsdata")
//	public void AddAgents(String act,String id,Object nid, Object lock, Object pwd, Object name,Object pr,Object mail,Object data,Object Skill,Object in, Object man, Object pre, Object prog,Object blend,Object res) {
//		String m1="";
//		if (act.trim().equalsIgnoreCase("ADD")) {
//		Agents_count++;
//		m1=ConfigurationsPage.AddAgent(id,nid, lock, pwd, name, pr, mail, data, Skill, in, man, pre, prog, blend);
//		System.out.println(m1);
//		
//		Testutil.WriteDataToexcel("Agents", Agents_count,m1);
//		Assert.assertTrue(m1.contains("success"),"Agent "+id +" not added");
//		}
//		else if (act.trim().equalsIgnoreCase("EDIT")) {
//		Agents_count++;
//			m1=ConfigurationsPage.EditAgent(id,nid, lock, pwd, name, pr, mail, data, Skill, in, man, pre, prog, blend);
//			System.out.println(m1);
//			
//			Testutil.WriteDataToexcel("Agents", Agents_count,m1);
//			Assert.assertTrue(m1.contains("success"),"Agent "+id +" not able to edit");
//			}
//		
//		else if(act.trim().equalsIgnoreCase("DELETE")) {
//		Agents_count++;	
//			m1=ConfigurationsPage.deleteAgent(id);
//			System.out.println(m1);
//			Testutil.WriteDataToexcel("Agents", Agents_count,m1);
//			Assert.assertTrue(m1.contains("success"),id+" Agent not able to delete");
//		}
//		else { 
//		Agents_count++;
//		Testutil.WriteDataToexcel("Agents", Agents_count,m1);
//		}
//	}

	@Test (priority=13)
	public void ShowFunctionalityOfAgents() {
		ConfigurationsPage.ClickOnAgentMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getAgentsListCounnt();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getAgentsListCounnt();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getAgentsListCounnt();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getAgentsListCounnt();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getAgentsListCounnt();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getAgentsListCounnt();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
	
	}

	@Test (priority=2,dataProvider = "PhoneNodata")
	public void AddPhoneNos(String act,Object name, Object Nname,Object pno, Object Nph, Object pr, Object sip, Object res) {
			if (act.trim().equalsIgnoreCase("ADD")) {
				Phno_count++;
				String m1=ConfigurationsPage.addPhoneNo(name, pno, pr, sip);
				System.out.println(m1);
				Testutil.WriteDataToexcel("PhoneNumber", Phno_count,m1);
				Assert.assertTrue(m1.contains("success"),"Phone No "+pno +" not added");
				String m2 =ConfigurationsPage.DetailsOfPhoneNo(name, pno, pr, sip);
				//System.out.println("-------------------------"+m2);
				Testutil.WriteDataToexcel("PhoneNumber", Phno_count,m2+": "+m1);
			}
			else if (act.trim().equalsIgnoreCase("EDIT")) {
				Phno_count++;
				String m1=ConfigurationsPage.EditPhoneNo(name, Nname, pno, Nph, pr, sip);
				System.out.println(m1);
				Testutil.WriteDataToexcel("PhoneNumber", Phno_count,m1);
				Assert.assertTrue(m1.contains("success"),"phone no "+pno+"  not able to edit");
				String name1=name.toString();
				String ph1=pno.toString();
				if(!Nname.toString().isEmpty())
					name1=Nname.toString();
				if(!Nph.toString().isEmpty())
					ph1=Nph.toString();
					
				String m2 =ConfigurationsPage.DetailsOfPhoneNo(name1, ph1, pr, sip);
				//System.out.println("-------------------------"+m2);
				Testutil.WriteDataToexcel("PhoneNumber", Phno_count,m2+": "+m1);
			}
			
			else if(act.trim().equalsIgnoreCase("DELETE")) {
				Phno_count++;
				String m1=ConfigurationsPage.deletePhoneNo(name.toString(), pno.toString());
				System.out.println(m1);
				Testutil.WriteDataToexcel("PhoneNumber", Phno_count,m1);
				Assert.assertTrue(m1.contains("success"),pno+" Phone No not able to delete");
				String m2 =ConfigurationsPage.DetailsOfPhoneNo(name, pno, pr, sip);
				if(m2.equalsIgnoreCase("No details found"))
					Testutil.WriteDataToexcel("PhoneNumber", Phno_count,"verified: "+m1);
			}
			
	}
	
	@Test (priority=3,dataProvider = "TransferNodata")
	public void AddTransferNos(String act,Object name, Object Nname,Object pno, Object Nph, Object sip, Object res) {
		TransNo_count++;
			if (act.trim().equalsIgnoreCase("ADD")) {
				String m1=ConfigurationsPage.AddTransferNumber(name, pno, sip);
				System.out.println(m1);
				Testutil.WriteDataToexcel("TransferNumbers", TransNo_count,m1);
				Assert.assertTrue(m1.contains("success"),"Transfer No "+pno +" not added");
			}
			else if (act.trim().equalsIgnoreCase("EDIT")) {
				String m1=ConfigurationsPage.EditTransferNo(name, Nname, pno, Nph, sip);
				System.out.println(m1);
				Testutil.WriteDataToexcel("TransferNumbers", TransNo_count,m1);
				Assert.assertTrue(m1.contains("success"),"Transfer no "+pno+"  not able to edit");
			}
			
			else if(act.trim().equalsIgnoreCase("DELETE")) {
				String m2=ConfigurationsPage.deleteTransferNo(name.toString().trim(), pno.toString().trim());
				System.out.println(m2);
				Testutil.WriteDataToexcel("TransferNumbers", TransNo_count,m2);
				Assert.assertTrue(m2.contains("success"),pno+" Phone No not able to delete");
			}
		
	}
	
	@Test (priority=4,dataProvider = "Dispositionsdata")
	public void AddDispositions(String act,String reason, Object reason1, Object res) {
		Disp_count++;
			if (act.trim().equalsIgnoreCase("ADD")) {
				String m1=ConfigurationsPage.AddDispositions(reason);
				System.out.println(m1);
				Testutil.WriteDataToexcel("Dispositions", Disp_count,m1);
				Assert.assertTrue(m1.contains("success"),reason +" not added");
			}
			else if (act.trim().equalsIgnoreCase("EDIT")) {
				String m1=ConfigurationsPage.EditDispositions(reason, reason1.toString());
				System.out.println(m1);
				Testutil.WriteDataToexcel("Dispositions", Disp_count,m1);
				Assert.assertTrue(m1.contains("success"),reason+"  "+m1);
			}
			
			else if(act.trim().equalsIgnoreCase("DELETE")) {
				String m2=ConfigurationsPage.deleteDisposition(reason);
				System.out.println(m2);
				Testutil.WriteDataToexcel("Dispositions", Disp_count,m2);
				Assert.assertTrue(m2.contains("success"),reason+" "+m2);
			}
		}
	@Test (priority=5)
	public void ShowFunctionalityOfDispositions() {
		ConfigurationsPage.ClickOnDispositionMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getDispositionsCount();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getDispositionsCount();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getDispositionsCount();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getDispositionsCount();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getDispositionsCount();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getDispositionsCount();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
		
	}
	
	@Test (priority=6,dataProvider = "Dialoutdata")
	public void AddDialoutNumbers(String act,String DialOutName, Object NewDialOutName, String DialOutN0, Object NewDialOutN0, Object sip,Object res) {
		DialOutNO_count++;
		if (act.toLowerCase().trim().equalsIgnoreCase("add")) {
			String m1=ConfigurationsPage.AddDialOutNumber(DialOutName, DialOutN0, sip);
			//if(m1.contains("success")) {
			//String esip;
			//if(sip.toString().equalsIgnoreCase("yes"))
			//	esip="TRUE";
			//else esip = "FALSE";
			//String [] str=	ConfigurationsPage.DialOutNumberDetails( DialOutN0);
			//		//for(String st:str)
			//		//System.out.println("==========================================="+st);
			
			//if((str[0].equals(DialOutName)) && (str[1].equals(DialOutN0)) && (str[2].equals(esip)))
			//	m1="verified: "+m1;
			//		//System.out.println("================================================"+m1);
			//}
			Testutil.WriteDataToexcel("Dialout", DialOutNO_count,m1);
			Assert.assertTrue(m1.contains("success"), "not success:");
			
			
			}
		else if (act.toLowerCase().trim().equalsIgnoreCase("edit")) {
			String m2 =ConfigurationsPage.EditDialOutNumber(DialOutName, NewDialOutName, DialOutN0, NewDialOutN0, sip);
			//String Dname;
			//String Dno;
			//if(!NewDialOutName.toString().equals(""))
			//	Dname=NewDialOutName.toString();
			//else Dname=DialOutName;
			//if(!NewDialOutN0.toString().equals(""))
			//	Dno=NewDialOutN0.toString();
			//else Dno=DialOutN0;
			//		//System.out.println(m2);
			//if(m2.contains("success")) {
			//	String esip;
			//	if(sip.toString().equalsIgnoreCase("yes"))
			//		esip="TRUE";
			//	else esip = "FALSE";
			//String [] str=	ConfigurationsPage.DialOutNumberDetails( Dno);
			//for(String st:str)
			//System.out.println("==========================================="+st);
			
			//if((str[0].equals(Dname)) && (str[1].equals(Dno))&& (str[2].equals(esip)))
			//	m2="verified: "+m2;
			//}
			//System.out.println("================================================"+m1);
			Testutil.WriteDataToexcel("Dialout", DialOutNO_count,m2);
			Assert.assertTrue(m2.contains("success"), "not Success:");
			}
		else if (act.toLowerCase().trim().equalsIgnoreCase("cancel")) {
			String m2=ConfigurationsPage.CancelDialOutNumber(DialOutName, NewDialOutName, DialOutN0, NewDialOutN0, sip);
		//String [] str=	ConfigurationsPage.DialOutNumberDetails( DialOutN0);
		//	//for(String st:str)
		//		//System.out.println("================================================"+st);
		//if((str[0].equals(DialOutName)) && (str[1].equals(DialOutN0)))
		//	m2="verified: "+m2;
		Testutil.WriteDataToexcel("Dialout", DialOutNO_count,m2);
		Assert.assertTrue(m2.contains("Success"), "not success:");
		}
		
		else if (act.toLowerCase().trim().equalsIgnoreCase("delete")) {
			String m2=ConfigurationsPage.DeleteDialOutNumber(DialOutName, DialOutN0);
			//System.out.println("==========================="+m2);
			Testutil.WriteDataToexcel("Dialout", DialOutNO_count,m2);
			Assert.assertTrue(m2.contains("success"), "not verified:");
		}
		
	}
	
	@Test (priority=7)
	public void ShowFunctionalityOfDialout() {
		ConfigurationsPage.ClickOnDialOutNumberMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getDialOutNumbersCounnt();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getDialOutNumbersCounnt();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getDialOutNumbersCounnt();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getDialOutNumbersCounnt();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getDialOutNumbersCounnt();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getDialOutNumbersCounnt();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
		
	}

	
	@Test (priority=8,dataProvider = "PauseReasondata")
	public void AddpauseReasons(String act,String reason, Object reason1, Object time, Object res) {
		pause_count++;
			if (act.trim().equalsIgnoreCase("ADD")) {
				String m1=ConfigurationsPage.AddPauseReason(reason, time);
				System.out.println(m1);
				Testutil.WriteDataToexcel("Pause Reasons", pause_count,m1);
				Assert.assertTrue(m1.contains("success"),reason +" not added");
			}
			else if (act.trim().equalsIgnoreCase("EDIT")) {
				String m1=ConfigurationsPage.EditPausereason(reason, reason1, time);
				System.out.println(m1);
				Testutil.WriteDataToexcel("Pause Reasons", pause_count,m1);
				Assert.assertTrue(m1.contains("success"),reason+"  not able to edit");
			}
			
			else if(act.trim().equalsIgnoreCase("DELETE")) {
				String m2=ConfigurationsPage.deletePauseReason(reason);
				System.out.println(m2);
				Testutil.WriteDataToexcel("Pause Reasons", pause_count,m2);
				Assert.assertTrue(m2.contains("success"),reason+" not able to delete");
			}
			else if(act.trim().equalsIgnoreCase("cancel")) {
				String m2=ConfigurationsPage.CancelPauseReason(reason, reason1, time);
				System.out.println(m2);
				Testutil.WriteDataToexcel("Pause Reasons", pause_count,m2);
				Assert.assertTrue(m2.contains("success"),reason+" not able to cancel");
			}
		}
	@Test (priority=9)
	public void ShowFunctionalityOfPauseReasons() {
		ConfigurationsPage.ClickOnPauseReasonMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getPauseReasonsCounnt();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getPauseReasonsCounnt();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getPauseReasonsCounnt();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getPauseReasonsCounnt();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getPauseReasonsCounnt();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getPauseReasonsCounnt();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
	
	}
	
	@Test (priority=10)
	public void BlockNumberBlocking_Unblocking(){
		//ConfigurationsPage.ClickOnBlockNumbersMenu();
		String m1=ConfigurationsPage.AddBlockNumber("9553578722");
		//System.out.println("================"+m1);
		String num=ConfigurationsPage.BlockNumberDetails("9553578722");
		//System.out.println("============================"+num);
		//System.out.println("============================"+num.contains("9553578722"));
		Assert.assertTrue(num.contains("9553578722"), "not blocked");
		String str1=ConfigurationsPage.UNBlockNumber("9553578722");
		System.out.println("==================="+str1);
		String num1=ConfigurationsPage.BlockNumberDetails("9553578722");
		Assert.assertTrue(num1.contains("not"), " blocked");
		}
	
	@Test (priority=11)
	public void ShowFunctionalityOfBlockNumber() {
		ConfigurationsPage.ClickOnBlockNumbersMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getBlockNumbersCounnt();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getBlockNumbersCounnt();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getBlockNumbersCounnt();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getBlockNumbersCounnt();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getBlockNumbersCounnt();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getBlockNumbersCounnt();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
	
	}
	
	@Test (priority=12)
	public void Add_edit_delete_AgentGroup(){
		String m1=ConfigurationsPage.AddAgentGroup();
		Assert.assertTrue(m1.contains("success"), m1);
		
		String m3=ConfigurationsPage.EditAgentGroup();
		Assert.assertTrue(m3.contains("success"), m3);
		
		String m2=ConfigurationsPage.DeleteAgentGroup();
		Assert.assertTrue(m2.contains("success"), m2);
		}
	
	@Test (priority=13)
	public void ShowFunctionalityOfAgentGroup() {
		ConfigurationsPage.ClickOnAgentGroupMenu();
		ConfigurationsPage.ClickOnShowAllButton();
		int count=ConfigurationsPage.getAgentGroupListCounnt();
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed");
		//System.out.println("count: "+count);
		
		ConfigurationsPage.ClickOnShow10Button();
		int count10=ConfigurationsPage.getAgentGroupListCounnt();
		if(count>10) {
			Assert.assertTrue((count10==10),"displayed morethan 10 for show10");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show10");
		}
		else {
			Assert.assertTrue((count10<=10),"displayed morethan 10 for show10");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show10");
		}
		
		ConfigurationsPage.ClickOnShow25Button();
		int count25=ConfigurationsPage.getAgentGroupListCounnt();
		if(count>25) {
			Assert.assertTrue((count25==25),"displayed morethan 25 for show25");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show25");
		} else {
			Assert.assertTrue((count25<=25),"displayed morethan 25 for show25");
		Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show25");
		}
		
		ConfigurationsPage.ClickOnShow50Button();
		int count50=ConfigurationsPage.getAgentGroupListCounnt();
		if(count>50) {
			Assert.assertTrue((count50==50),"displayed morethan 50 for show50");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show50");
		} else {
			Assert.assertTrue((count50<=50),"displayed morethan 50 for show50");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show50");
		}
		ConfigurationsPage.ClickOnShow75Button();
		int count75=ConfigurationsPage.getAgentGroupListCounnt();
		if(count>75) {
			Assert.assertTrue((count75==75),"displayed morethan 75 for show75");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show75");
		} else {
			Assert.assertTrue((count75<=75),"displayed morethan 75 for show75");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show75");
		}
		ConfigurationsPage.ClickOnShow100Button();
		int count100=ConfigurationsPage.getAgentGroupListCounnt();
		if(count>100) {
			Assert.assertTrue((count100==100),"displayed morethan 100 for show100");
			Assert.assertTrue(ConfigurationsPage.ispaginationDisplayed(),"But pagination not displayed for show100");
		} else {
			Assert.assertTrue((count100<=100),"displayed morethan 100 for show100");
			Assert.assertTrue(!ConfigurationsPage.ispaginationDisplayed(),"But pagination displayed for show100");
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
