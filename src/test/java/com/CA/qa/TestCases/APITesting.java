package com.CA.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class APITesting extends TestBase {
	int c=1;
	boolean flag = false;
	@DataProvider
	 public static Object[][] APIdata() {
		Object data[][] =Testutil.Readexcel1("API AUTOMATION");
		return data;
	}

	@Test(priority=1,dataProvider = "APIdata")
	public void API_TESTING_with_Automation(String ApiServer, String API_URL,String ApiKey, String UserName, String AgentId, String cam_name, String cus_no, String ucid, String Ph_name, String DID,String uui, String format, String NMA_avai, String NMC_avail, String Exp_res, String res )  {
		String Responce = Testutil.sendGET(ApiServer, API_URL, ApiKey, UserName, AgentId, cam_name, cus_no, ucid, Ph_name,  DID, uui, format, NMA_avai, NMC_avail, Exp_res, res);
		System.out.println("response is: "+Responce);
		if(c==1) 
			Testutil.ClearDataInResultColumn("API AUTOMATION");	 
		Testutil.WriteDataToexcel("API AUTOMATION", c, Responce.substring(4));
		c++;
		if (Responce.contains("queued") || Responce.contains("uccess") ||(Responce.substring(4)).contentEquals(Exp_res))
			flag = true;
		Assert.assertTrue(flag, "Api not worked");
	}
}
