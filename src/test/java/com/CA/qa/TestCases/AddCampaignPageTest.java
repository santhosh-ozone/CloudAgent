package com.CA.qa.TestCases;

//import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AddCampaignPage;
import com.CA.qa.Pages.AdminHomePage;

import com.CA.qa.Pages.AdminLoginPage;
import com.CA.qa.Util.Testutil;

public class AddCampaignPageTest extends TestBase{
	
	AdminLoginPage Adminloginpage;
	AdminHomePage AdminHomepage;
	AddCampaignPage AddCampaignPage;
	
	static boolean flag = false;
	//static int row_no =1;
	public AddCampaignPageTest() {
		super();
	}
@BeforeClass
public void clearExcelDatainRes() {
	Testutil.ClearDataInResultColumn("Campaign");
}

	@BeforeMethod
	public void setup(Method method) {
		System.out.println("Test name: " + method.getName());
		AdminLogin();
		Adminloginpage = new AdminLoginPage();
		AdminHomepage = Adminloginpage.LoginAsAdmin(Testutil.Readexcel("AdminLogin",1).get(0),Testutil.Readexcel("AdminLogin",2).get(0));
		//AddOutBoundCampaignPage = AdminHomepage.clickOnOutboundAddCampaignButton("");
		}
	
	@DataProvider
	 public static Object[][] CampaignCreationdata() {
		Object data[][] =Testutil.Readexcel1("Campaign");
		return data;
	}
	
//	@Test (priority=1)
//	public void clearExcelDatainRes() {
//		Testutil.ClearDataInResultColumn("Campaign");
//	}
	
//	@Test (priority=2,dataProvider = "CampaignCreationdata")
//	public void AddCampaign(String Bound,String cname,Object ctype,Object dmethod, String did,Object Ivrflow,Object appURL,Object calls,Object pr,Object dr, Object s_time, Object e_time, Object d_int, Object prio, Object URl2P, Object URLat, Object pluginName, Object popURL,Object Script,Object tries, String offilene,String all_man, String dnd, String std, String d_cus_1st,String hold_agent, String rec_1st, String acw, Object DNC,String DT, Object CRT,String WT, String disp, String skills, Object users,Object m_name, Object path , Object hm, Object tm,Object res) {
//		
//		//Object DNC,String DT, Object CRT
//		//String Bound,String cname,String ctype,String dmethod, String did,Object appURL,Object calls,Object pr,
//		//Object dr, String s_time, String e_time, String d_int, String prio, Object URl2P, Object URLat,
//		//Object popURL,Object Script,String tries, String offilene,String all_man, String dnd, String std, 
//		//String d_cus_1st,String hold_agent, String rec_1st, String acw, String DT, String WT, String disp, 
//		//String skills,String users, String m_name, String path , Object hm, Object tm
//		
//		row_no++;	
//		flag=false;
//		AddCampaignPage =AdminHomepage.clickOnAddCampaignButton(Bound);
//		System.out.println("Campaign details for adding: Name: "+cname+"   Type:"+Bound);
//		
//		if(Bound.trim().equalsIgnoreCase("inbound")) {
//			AddCampaignPage.enterCampaignName(cname);
//			AddCampaignPage.EnterDID(did);
//			AddCampaignPage.SelectIvrFlow(Ivrflow);
//			AddCampaignPage.SelectDispositionType(DT);
//			
//			AddCampaignPage.EnableDND(dnd);
//			AddCampaignPage.EnableOfflineMode(offilene);
//			AddCampaignPage.EnableAllowedForManualDialing(all_man);
//			AddCampaignPage.EnableACWforUnAnsweredCalls(acw);
//			
//			AddCampaignPage.EnterURLtoPush(URl2P);
//			AddCampaignPage.SelectHitScreenPopURlAt(URLat, pluginName);
//			AddCampaignPage.EnterScreenPopURL(popURL);
//			AddCampaignPage.EnterScript(Script);
//			
//			AddCampaignPage.EnterWrapupTime(WT);
//			AddCampaignPage.SelectDisposition(disp);
//			
//			if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080"))
//				AddCampaignPage.EnterSkillsforStaging88(skills);
//			else AddCampaignPage.SelectSkills(skills);
//			
//			AddCampaignPage.SelectUsers(users);
//			
//			AddCampaignPage.SelectHoldMusic(hm);
//			AddCampaignPage.SelectTransferMusic(tm);
//			
//			
//		} else {
//			
//		AddCampaignPage.SelectDispositionType(DT);
//		AddCampaignPage.enterCampaignName(cname);
//		AddCampaignPage.SelectCampaignType(ctype);
//		AddCampaignPage.SelectDialMethod(dmethod);
//		AddCampaignPage.EnterDID(did);
//		
//		AddCampaignPage.EnterStartTime(s_time);
//		AddCampaignPage.EnterEndTime(e_time);
//		
//		AddCampaignPage.EnableOfflineMode(offilene);
//		AddCampaignPage.EnableAllowedForManualDialing(all_man);
//		AddCampaignPage.EnableDND(dnd);
//		AddCampaignPage.EnableSTD(std);
//		AddCampaignPage.EnableDialCustomerFirst(d_cus_1st);
//		AddCampaignPage.EnterWrapupTime(WT);
//		AddCampaignPage.EnableDialbyholdingAgent(hold_agent);
//		AddCampaignPage.EnableRecentFirst(rec_1st);
//		AddCampaignPage.EnableACWforUnAnsweredCalls(acw);
//		AddCampaignPage.EnableDNC(DNC);
//		
//		AddCampaignPage.EnterAppURL(appURL);
//		AddCampaignPage.EnterMaxConcurrentCalls(calls);
//		AddCampaignPage.EnterPacingRatio(pr);
//		AddCampaignPage.EnterMaxDropRatio(dr);
//		AddCampaignPage.EnterDialInterval(d_int);
//		AddCampaignPage.EnterPriority(prio);
//		
//		AddCampaignPage.EnterURLtoPush(URl2P);
//		AddCampaignPage.SelectHitScreenPopURlAt(URLat, pluginName);
//		AddCampaignPage.EnterScreenPopURL(popURL);
//		AddCampaignPage.EnterScript(Script);
//		AddCampaignPage.EnterNoOfTries(tries);
//		
//		AddCampaignPage.enterCustomerRingTime(CRT);
//		AddCampaignPage.SelectDisposition(disp);
//		
//		if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080"))
//			AddCampaignPage.EnterSkillsforStaging88(skills);
//		else AddCampaignPage.SelectSkills(skills);
//		
//		AddCampaignPage.SelectUsers(users);
//		AddCampaignPage.SelectMapping(m_name);
//		AddCampaignPage.FiletoUpload(path);
//		
//		AddCampaignPage.SelectHoldMusic(hm);
//		AddCampaignPage.SelectTransferMusic(tm);
//		}
//		
//		AddCampaignPage.ClickOnSaveCampaign();
//		//System.out.println("first flag value: "+flag);
////		try {
////			Thread.sleep(1000);
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
//		
//		for(int i=1;i<10;i++) {
//			if(driver1.getTitle().contains("Campaign Detail")) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					//e.printStackTrace();
//				}
//				}
//				else if(driver1.getTitle().contains("Campaigns")) {
//					if(AdminHomepage.Getmessagediv().contains("success")) {
//						flag = true;
//						break;
//					}
//				}
//			}
//		String Err_msg;
//		if(driver1.getTitle().contains("Campaign Detail")) {
//			Err_msg=AddCampaignPage.ConsolidatedErrorMessage();
//			System.out.println("Campaign not created and Error Msg is: "+Err_msg);
//		}
//		else {
//		 Err_msg= AdminHomepage.Getmessagediv();
//		System.out.println("campaign created and Msg is: "+Err_msg);
//		}
//		//System.out.println(AdminHomepage.Getmessagediv());
//	
//		//System.out.println("row is: "+row_no);
//		Testutil.WriteDataToexcel("Campaign", row_no,Err_msg);
//		
//		
//		//System.out.println(cname+" final flag value:"+flag);
//		Assert.assertTrue(flag,"Campaign not created");
//	}
	
//	@Test (priority=3,dataProvider = "CampaignCreationdata")
//	public void RunCampaign(String Bound,String cname,Object ctype,Object dmethod, String did,Object Ivrflow,Object appURL,Object calls,Object pr,Object dr, Object s_time, Object e_time, Object d_int, Object prio, Object URl2P, Object URLat, Object pluginName, Object popURL,Object Script,Object tries, String offilene,String all_man, String dnd, String std, String d_cus_1st,String hold_agent, String rec_1st, String acw, Object DNC,String DT, Object CRT,String WT, String disp, String skills, Object users,Object m_name, Object path , Object hm, Object tm,Object res) {
//		String msg=AdminHomepage.RunCampaign(Bound, cname,did);
//		if(msg.contains("success")) 
//				flag = true;
//				
//		System.out.println(msg);
//		Assert.assertTrue(flag,"Campaign not running");
//	}
//
//	@Test (priority=4,dataProvider = "CampaignCreationdata")
//	public void DeleteCampaign(String Bound,String cname,Object ctype,Object dmethod, String did,Object Ivrflow,Object appURL,Object calls,Object pr,Object dr, Object s_time, Object e_time, Object d_int, Object prio, Object URl2P, Object URLat, Object pluginName, Object popURL,Object Script,Object tries, String offilene,String all_man, String dnd, String std, String d_cus_1st,String hold_agent, String rec_1st, String acw, Object DNC,String DT, Object CRT,String WT, String disp, String skills, Object users,Object m_name, Object path , Object hm, Object tm,Object res) {
//		String msg=AdminHomepage.DeleteCampaign(Bound, cname,did);
//		if(msg.contains("success")) 
//						flag = true;
//			
//		System.out.println(msg);
//		Assert.assertTrue(flag,"Campaign not deleted");
//	}

	
	@AfterMethod
	public void nteardown() {
		System.out.println(driver1.getCurrentUrl());
		AdminHomepage.admin_logout();
		
		driver1.close();
		Printhyphens();
	}
	
	
	
	@Test (priority=2,dataProvider = "CampaignCreationdata")
	public void AddCampaign( String action, String Bound,String cname,Object NewCampName, Object ctype,Object dmethod, String did,Object Ivrflow,Object appURL,Object calls,Object pr,Object dr, Object s_time, Object e_time, Object d_int, Object prio, Object URl2P, Object URLat, Object pluginName, Object popURL,Object Script,Object tries, String offilene,String all_man, String dnd, String std, String d_cus_1st,String hold_agent, String rec_1st, String acw, Object DNC,String DT, Object CRT,String WT, String disp, String skills, Object users,Object m_name, Object path , Object hm, Object tm,Object exp, Object res) {
		
//		int sno, String action, String Bound,String cname,Object NewCampName, Object ctype,Object dmethod, String did,
//		Object Ivrflow,Object appURL,Object calls,Object pr,Object dr, Object s_time, Object e_time, Object d_int, 
//		Object prio, Object URl2P, Object URLat, Object pluginName, Object popURL,Object Script,Object tries, String offilene,
//		String all_man, String dnd, String std, String d_cus_1st,String hold_agent, String rec_1st, String acw, Object DNC,
//		String DT, Object CRT,String WT, String disp, String skills, Object users,Object m_name, Object path , Object hm, 
//		Object tm,Object exp, Object res) 
//			
		
		//row_no =(int) sno;	
		row_no++;
		flag=false;
		
		
		if(action.contains("Add_Campaign") || (action.contains("Edit"))||((action.contains("Add")||action.contains("add"))&& (action.contains("Camp")||action.contains("camp")))) {

		if(action.contains("Add_Campaign") || ((action.contains("Add")||action.contains("add"))&& (action.contains("Camp")||action.contains("camp")))) {
		AddCampaignPage =AdminHomepage.clickOnAddCampaignButton(Bound);
		System.out.println("Campaign details for adding: Name: "+cname+"   Type:"+Bound);}
		
		else AddCampaignPage = AdminHomepage.ClickOnSelectedCampaign(Bound, cname, did);
		
		
		if(Bound.trim().equalsIgnoreCase("inbound")) {
			if(action.contains("Edit") && !NewCampName.equals("") ) {
				AddCampaignPage.enterCampaignName(NewCampName.toString()); }
				
			else AddCampaignPage.enterCampaignName(cname);
			
			// if(!did.equals("")) {
			
			AddCampaignPage.EnterDID(did);
			AddCampaignPage.SelectIvrFlow(Ivrflow);
			AddCampaignPage.SelectDispositionType(DT);
			
			AddCampaignPage.EnableDND(dnd);
			AddCampaignPage.EnableOfflineMode(offilene);
			AddCampaignPage.EnableAllowedForManualDialing(all_man);
			AddCampaignPage.EnableACWforUnAnsweredCalls(acw);
			
			AddCampaignPage.EnterURLtoPush(URl2P);
			AddCampaignPage.SelectHitScreenPopURlAt(URLat, pluginName);
			AddCampaignPage.EnterScreenPopURL(popURL);
			AddCampaignPage.EnterScript(Script);
			
			AddCampaignPage.EnterWrapupTime(WT);
			AddCampaignPage.SelectDisposition(disp);
			
			if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080"))
				AddCampaignPage.EnterSkillsforStaging88(skills);
			else AddCampaignPage.SelectSkills(skills);
			
			AddCampaignPage.SelectUsers(users);
			
			AddCampaignPage.SelectHoldMusic(hm);
			AddCampaignPage.SelectTransferMusic(tm);
			
			
		} else {
			
			if(action.contains("Edit") && !NewCampName.equals("")) 
				AddCampaignPage.enterCampaignName(NewCampName.toString());
				
			else AddCampaignPage.enterCampaignName(cname);
			
			
		AddCampaignPage.SelectDispositionType(DT);
		AddCampaignPage.SelectCampaignType(ctype);
		AddCampaignPage.SelectDialMethod(dmethod);
		AddCampaignPage.EnterDID(did);
		
		AddCampaignPage.EnterStartTime(s_time);
		AddCampaignPage.EnterEndTime(e_time);
		
		AddCampaignPage.EnableOfflineMode(offilene);
		AddCampaignPage.EnableAllowedForManualDialing(all_man);
		AddCampaignPage.EnableDND(dnd);
		AddCampaignPage.EnableSTD(std);
		AddCampaignPage.EnableDialCustomerFirst(d_cus_1st);
		
		AddCampaignPage.EnableDialbyholdingAgent(hold_agent);
		AddCampaignPage.EnableRecentFirst(rec_1st);
		AddCampaignPage.EnableACWforUnAnsweredCalls(acw);
		AddCampaignPage.EnableDNC(DNC);
		AddCampaignPage.EnterWrapupTime(WT);
		
		AddCampaignPage.EnterAppURL(appURL);
		AddCampaignPage.EnterMaxConcurrentCalls(calls);
		AddCampaignPage.EnterPacingRatio(pr);
		AddCampaignPage.EnterMaxDropRatio(dr);
		AddCampaignPage.EnterDialInterval(d_int);
		
		
		if(driver1.getCurrentUrl().contains("http://10.1.2.88:8080"))
			AddCampaignPage.EnterSkillsforStaging88(skills);
		else AddCampaignPage.SelectSkills(skills);
		
		AddCampaignPage.enterCustomerRingTime(CRT);
		AddCampaignPage.SelectDisposition(disp);
		
		AddCampaignPage.EnterPriority(prio);
		AddCampaignPage.EnterURLtoPush(URl2P);
		AddCampaignPage.SelectHitScreenPopURlAt(URLat, pluginName);
		AddCampaignPage.EnterScreenPopURL(popURL);
		AddCampaignPage.EnterScript(Script);
		AddCampaignPage.EnterNoOfTries(tries);
		
		AddCampaignPage.SelectUsers(users);
		AddCampaignPage.FiletoUpload(path);
			
		AddCampaignPage.SelectMapping(m_name);
		
		AddCampaignPage.SelectHoldMusic(hm);
		AddCampaignPage.SelectTransferMusic(tm);
		
		}
		
		AddCampaignPage.ClickOnSaveCampaign();
		//System.out.println("first flag value: "+flag);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		for(int i=1;i<10;i++) {
			if(driver1.getTitle().contains("Campaign Detail")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					//e.printStackTrace();
				}
				}
				else if(driver1.getTitle().contains("Campaigns")) {
					if(AdminHomepage.Getmessagediv().contains("success")) {
						flag = true;
						break;
					}
				}
			}
		String Err_msg;
		if(driver1.getTitle().contains("Campaign Detail")) {
			Err_msg=AddCampaignPage.ConsolidatedErrorMessage();
			System.out.println("Campaign not created and Error Msg is: "+Err_msg);
		}
		else {
		 Err_msg= AdminHomepage.Getmessagediv();
		System.out.println("campaign Msg is: "+Err_msg);
		}
		//System.out.println(AdminHomepage.Getmessagediv());
	
		//System.out.println("row is: "+row_no);
		Testutil.WriteDataToexcel("Campaign", row_no,Err_msg);
		
		
		//System.out.println(cname+" final flag value:"+flag);
		Assert.assertTrue(flag,"Campaign not created");
	}
		
		else if (action.contains("Delete_Campaign")){
			String msg=AdminHomepage.DeleteCampaign(Bound, cname,did);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("success")) 
							flag = true;
				
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not deleted");
		}
		
		else if (action.contains("Run")){
			String msg=AdminHomepage.RunCampaign(Bound, cname,did);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("success")) 
					flag = true;
					
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not running");
		}
		
		else if (action.contains("Stop")){
			String msg=AdminHomepage.StopCampaign(Bound, cname, did);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("success")) 
					flag = true;
					
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not running");
		}
		
		else if (action.contains("Reset")){
			if (Bound.contains("Out")||Bound.contains("out")||Bound.contains("OUT")) {
			int result_row = AdminHomepage.IdentifyCampaignRow(Bound, cname, did);
			String msg=AdminHomepage.resetCampaign(Bound, result_row);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("reset")) 
					flag = true;
					
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not running");
		} else {
			Testutil.WriteDataToexcel("Campaign", row_no,"Reset works only on Outbound");
			System.out.println("Reset works only on Outbound");
			
			}
		}
		
		else if (action.contains("Force_Complete")){
			if (Bound.contains("Out")||Bound.contains("out")||Bound.contains("OUT")) {
			int result_row = AdminHomepage.IdentifyCampaignRow(Bound, cname, did);
			String msg=AdminHomepage.ForceCompleteCampaign(Bound, result_row);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("complete")) 
					flag = true;
					
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not running");
		}else {
			Testutil.WriteDataToexcel("Campaign", row_no,"Force_Complete works only on Outbound");
			System.out.println("Force_Complete works only on Outbound");
			
			}
			
		}
		
		else if (action.contains("Add_data")){
			if (Bound.contains("Out")||Bound.contains("out")||Bound.contains("OUT")) {
				
				boolean msg1= AdminHomepage.ClickOnAddDataOfSelectedCampaign(Bound, cname, did);
				if(msg1) {
					String msg =AdminHomepage.ClickOnFileUploadOfAddData(cname, path);
					Testutil.WriteDataToexcel("Campaign", row_no,msg);
					if(msg.contains("success")) 
							flag = true;
							
					System.out.println(msg);
					Assert.assertTrue(flag,"not able to add data to campaign");
				}else {
					Testutil.WriteDataToexcel("Campaign", row_no,"campaign not available");
					System.out.println("campaign not available");
					
				}
			}
			else {
					Testutil.WriteDataToexcel("Campaign", row_no,"Add Data works only on Outbound");
					System.out.println("Add Data works only on Outbound");
					
					}
				
				}
		else if (action.contains("Delete_data")){
			if (Bound.contains("Out")||Bound.contains("out")||Bound.contains("OUT")) {
			int result_row = AdminHomepage.IdentifyCampaignRow(Bound, cname, did);
			String msg=AdminHomepage.DeleteDataOfCampaign(Bound, result_row);
			Testutil.WriteDataToexcel("Campaign", row_no,msg);
			if(msg.contains("delete")) 
					flag = true;
					
			System.out.println(msg);
			Assert.assertTrue(flag,"Campaign not running");
		} else {
			Testutil.WriteDataToexcel("Campaign", row_no,"Delete_data works only on Outbound");
			System.out.println("Delete_data works only on Outbound");
			
			}
		}
		
		
		
		
			
		}
		
		
}
	

