package com.CA.qa.TestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
//import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "https://api1.cloudagent.in/CAServices/AgentManualDial.php?api_key=KK11820a702e043973e935fe8e2ef9f457&username=mdinesh_qa&agentID=santosh1&campaignName=NewInbound2&customerNumber=9553578721&UCID=true&uui=Test Automation&format=Json";

	private static final String POST_URL = "http://172.16.15.210/CAServices/CDR/fetchCdrByUCID.php?userName=&apiKey=&ucid=&reportType=";

	private static final String POST_PARAMS = "https://api1.cloudagent.in/";

	public static void main(String[] args) {

		String Res=sendGET();
		System.out.println("Responce is: "+Res);
		//sendPOST();
		//System.out.println("POST DONE");
	}

	public static String sendGET()  {
		
		String[] arr =POST_URL.split("[?&]");
		arr[0]=arr[0]+"?";
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		String apikey ="KKfdb819a5c849d829cd000819d4a4463b";
		String username="ca_testing";
		String agentID ="santosh1";
		String campaignName= "NewInbound2";
		String customerNumber="9553578721";
		String ucid="9179158329809155";
		String uui ="Test";
		String Format="Json";
		String url="";
		String reportType ="currentday";
		
		if(!(POST_URL.substring(0, 10)).contains("http"))
				url=POST_PARAMS;
		url=url+arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i].contains("api_key") || arr[i].contains("apiKey") )
				url =url+arr[i]+apikey+"&";
			else if(arr[i].contains("username") || arr[i].contains("userName") ) 
				url =url+arr[i]+username+"&";
			else if(arr[i].contains("agentID")) 
				url =url+arr[i]+agentID+"&";
			else if(arr[i].contains("campaignName")) 
				url =url+arr[i]+campaignName+"&";
			else if(arr[i].contains("customerNumber")) 
				url =url+arr[i]+customerNumber+"&";
			else if(arr[i].contains("UCID") || arr[i].contains("ucid")) 
				url =url+arr[i]+ucid+"&";
			else if(arr[i].contains("uui")) 
				url =url+arr[i]+uui+"&";
			else if(arr[i].contains("format")) 
				url =url+arr[i]+Format+"&";
			else if(arr[i].contains("reportType")) 
				url =url+arr[i]+reportType+"&";
			
		}
		
		//System.out.println("url is : "+url);
		//System.out.println("url length is: "+url.length());
		url =url.substring(0,url.length()-1);
		System.out.println("url is : "+url);
		//System.out.println("url length is: "+url.length());
		
//		try {
//		//URL obj = new URL(url.trim());
//			URL obj = new URL(GET_URL);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//		con.setRequestMethod("GET");
//		con.setRequestProperty("User-Agent", USER_AGENT);
//		int responseCode = con.getResponseCode();
//		
//		StringBuffer response = new StringBuffer();
//		
//		//System.out.println("GET Response Code :: " + responseCode);
//		if (responseCode == HttpURLConnection.HTTP_OK) { // success
//			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//			String inputLine;
//			
//
//			while ((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//			}
//			in.close();
//
//			// print result
//			//System.out.println(response.toString());
//			//return   response.toString();
//		}
//		return responseCode+" "+response.toString();
//		} catch (IOException e) {
//			return "Get did not worked ";
//		} 
			return "Get did not worked ";

	}

//	private static void sendPOST() throws IOException {
//		URL obj = new URL(POST_URL);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//		con.setRequestMethod("POST");
//		//con.setRequestProperty("User-Agent", USER_AGENT);
//
//		// For POST only - START
//		con.setDoOutput(true);
//		OutputStream os = con.getOutputStream();
//		//os.write(POST_PARAMS.getBytes());
//		os.flush();
//		os.close();
//		// For POST only - END
//
//		int responseCode = con.getResponseCode();
//		System.out.println("POST Response Code :: " + responseCode);
//
//		if (responseCode == HttpURLConnection.HTTP_OK) { //success
//			BufferedReader in = new BufferedReader(new InputStreamReader(
//					con.getInputStream()));
//			String inputLine;
//			StringBuffer response = new StringBuffer();
//
//			while ((inputLine = in.readLine()) != null) {
//				response.append(inputLine);
//			}
//			in.close();
//
//			// print result
//			System.out.println(response.toString());
//		} else {
//			System.out.println("POST request not worked");
//		}
//	}

}