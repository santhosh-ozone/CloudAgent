package com.CA.qa.TestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
//import javax.net.ssl.HttpsURLConnection;
import java.net.URL;

public class HttpURLConnectionExample1 {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL  = "https://api1.cloudagent.in/CAServices/AgentManualDial.php?api_key=KK11820a702e043973e935fe8e2ef9f457&username=mdinesh_qa&agentID=santosh1&campaignName=NewInbound2&customerNumber=9553578721&UCID=true&uui=Test Automation&format=Json";

	private static final String POST_URL = "https://api1.cloudagent.in/CAServices/AgentManualDial.php?api_key=KK11820a702e043973e935fe8e2ef9f457&username=mdinesh_qa&agentID=santosh1&campaignName=NewInbound2&customerNumber=9553578721&UCID=true&uui=test&format=Json";

	private static final String POST_PARAMS = "https://api1.cloudagent.in/";

	public static void main(String[] args)  {
		
		sendGET();
		
		//sendPOST();
		//System.out.println("POST DONE");
	}

	public static void sendGET()  {
		
		URL obj=null;
		try {
			obj = new URL(GET_URL);
		} catch (MalformedURLException e) {
			System.out.println("URl issue MalformedURLException");
		}
		HttpURLConnection con=null;
		try {
			con = (HttpURLConnection) obj.openConnection();
		} catch (IOException e) {
			System.out.println("connection issue IOException");
		}
		try {
			con.setRequestMethod("GET");
		} catch (ProtocolException e) {
			System.out.println("get error ProtocolException");
		}
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode=0;
		try {
			responseCode = con.getResponseCode();
		} catch (IOException e) {
			System.out.println("con response error");
		}
		
		StringBuffer response = new StringBuffer();
		
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in=null;
			try {
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} catch (IOException e) {
				System.out.println("buffer reader IO error");
			}
			String inputLine="";
			

			try {
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
			} catch (IOException e) {
				System.out.println("input line error");
			}
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("close error");
			}

			// print result
			System.out.println(response.toString());
			//return   response.toString();
		}
		
		

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