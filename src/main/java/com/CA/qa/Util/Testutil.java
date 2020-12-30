package com.CA.qa.Util;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Pages.AgentToolBarHomePage;
import com.CA.qa.Pages.AgentToolBarLoginPage;

public class Testutil extends TestBase{
	
	public static long PAGE_LOAD_TIME = 100;
	
	public static long IMPLICIT_WAIT_TIME = 15;
	
	public static long IMPLICIT_WAIT_TIME_admin = 10;
	
	public static String Exp_ATBloginPageTitle = "Agent Login";
	
	public static String Exp_ATBhomePageTitle = "OCCD Agent ToolBar";
	
	public static String Exp_AdminloginPageTitle = "Login";
	
	public static String Exp_AdminhomePageTitle = "Main Menu";
	
	public static String Exp_Admin_logoText = "Cloud Agent";
	
	static AgentToolBarLoginPage ATBloginpage ;
	static AgentToolBarHomePage  ATBHomePage;
	
	public Testutil() {
		super();
	}
	public static void takeScreenshotAtEndOfTest(WebDriver dr, String testcaseName) {
		File scrfile= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		//System.out.println("hello santosh u r in the take screen shot method");
		//System.out.println("current directory is "+currentDir);
		
		try {
			//FileUtils.copyFile(scrfile, new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy H-m-s");
	        Date date = new Date();
			FileUtils.copyFile(scrfile, new File(currentDir+"/screenshots/"+testcaseName+"_"+dateFormat.format(date)+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  3; i++) {
            changeColor("rgb(0,200,0)", element, js);
            changeColor(bgcolor, element, js);
        }
    }
 
    public static void changeColor(String color, WebElement element,  JavascriptExecutor js) {
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(200);
        }  catch (InterruptedException e) {
        }
     }
	
    public static ArrayList<String> Readexcel(String sheetname,int columnno){

    	 String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";
		 //System.out.println(filepath);
		
	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);

	     Iterator<Row>  Rowit = sheet.rowIterator();
	     
	     
	     Rowit.next();
	      
	     ArrayList<String> list = new ArrayList<String>();
	   
	     while(Rowit.hasNext()) {

	     list.add(Rowit.next().getCell(columnno).getStringCellValue());

	              }
	     //wb.close;

	     return list;

	  	}
    

    public static Object [][] Readexcel1(String sheetname){

   	 String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";
		//System.out.println(filepath);
		
	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
	     Cell cell1=null;
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);
	     Object [][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	     //System.out.println(sheet.getLastRowNum()+"total rows");
	     //System.out.println(sheet.getRow(0).getLastCellNum()+"total columns");
	     for(int i=0; i<sheet.getLastRowNum();i++)
	    	 for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
	    		 {
	    		 cell1=sheet.getRow(i+1).getCell(j,org.apache.poi.ss.usermodel.Row.CREATE_NULL_AS_BLANK );
	    		 //System.out.println(cell1.getDateCellValue());
	    		 switch (cell1.getCellType()) {

	             case Cell.CELL_TYPE_STRING:
	            	 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	            	 //System.out.println("String value is:"+data[i][j]);
	                 break;

	             case Cell.CELL_TYPE_NUMERIC:
	            	 data[i][j]=sheet.getRow(i+1).getCell(j).getNumericCellValue();
	            	 //System.out.println("numeric value value is:"+data[i][j]);
//	                 if (DateUtil.isCellDateFormatted(cell1)) {
//	                	  System.out.println(cell1.getDateCellValue());
//	                 } else {
//	                     System.out.println(cell1.getNumericCellValue());
//	                 }
	                 break;
	    		 case Cell.CELL_TYPE_BLANK:
	    			 data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
	    			 //System.out.println("blank value is:"+data[i][j]+" "+i+" row "+j+" column");
	    		        break;                                     
	    		 }
	    		 }
	     return data;

	  	}
    
    
    public static void ClearDataInResultColumn(String sheetname){
    	String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";

	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
	     //Cell cell1=null;
	     int res_col=0;
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);
	     for(int i=0;i<sheet.getRow(0).getLastCellNum();i++)
	    	 if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Results") || sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Result")) {
	    			 res_col =i; 
	    			 break;
	    	 }
	     //System.out.println("res_col is : "+res_col);
	     //System.out.println("total rows: "+sheet.getLastRowNum());
	     for(int i=1;i<=sheet.getLastRowNum();i++) {
	    	 sheet.getRow(i).createCell(res_col);
	    	 sheet.getRow(i).getCell(res_col).setCellValue("");
	    	 //System.out.println("for row: "+i+" data cleared");
	     }
	     
	     try {
			fis.close();
			 FileOutputStream outputStream = new FileOutputStream(filepath);
		     wb.write(outputStream);
		     outputStream.close();
		} catch (IOException e) {
			//e.printStackTrace();
		}
	     
	    
	 	
	     //return res_col;
    	
	     }
    public static void WriteDataToexcel(String sheetname,int row_no,String data){
    	String filepath = System.getProperty("user.dir")+"/src/main/java/com/CA/qa/TestData/CloudAgent.xlsx";

	     FileInputStream fis = null;
	     XSSFWorkbook wb = null;
	     int res_col=100;
	     //Cell cell1=null;
	    
		try {
			fis = new FileInputStream(filepath);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Next time Please close the excel properly before running the Test");
		}
	    
	     XSSFSheet  sheet =  wb.getSheet(sheetname);
	     for(int i=0;i<sheet.getRow(0).getLastCellNum();i++)
	    	 if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Results") || sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase("Result")) {
	    			 res_col =i; 
	    			 break;
	    	 }
	     //cell1=sheet.getRow(row_no).createCell(res_col);
	     try {
	     sheet.getRow(row_no).getCell(res_col).setCellValue(data.trim());
	     } catch (NullPointerException e) {}
	     
//	     CellStyle style = wb.createCellStyle();
//		    //style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//		    //style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//		    Font font = wb.createFont();
//	            font.setColor(IndexedColors.RED.getIndex());
//	            style.setFont(font);
//	            style.setWrapText(true);
//	          cell1.setCellStyle(style);  
	     try {
				fis.close();
				 FileOutputStream outputStream = new FileOutputStream(filepath);
			     wb.write(outputStream);
			     outputStream.close();
			} catch (IOException e) {
				//e.printStackTrace();
			}
	     
    }
    
public static String sendGET(String ApiServer, String API_URL,Object ApiKey, Object UserName, Object AgentId, Object cam_name, Object cus_no, Object ucid, Object ph_name, Object DID, Object uui, Object format, Object NMA_avai, Object NMC_avail, String Exp_res, String res )  {
		
//CAServices/AgentManualDial.php?api_key=&username=&agentID=&campaignName=&customerNumber=&UCID=&uui=&format=
	

		String USER_AGENT = "Mozilla/5.0";
		
		String[] arr =API_URL.split("[?&]");
		arr[0]=arr[0]+"?";
		//for(int i=0;i<arr.length;i++)
			//	System.out.println(arr[i]);
		
			
		//String[] arr =arr1[1].split("&");
		//for(int i=0;i<arr.length;i++)
		//	System.out.println(arr[i]);
//		String apikey ="KKfdb819a5c849d829cd000819d4a4463b";
//		String username="ca_testing";
//		String agentID ="santosh1";
//		String campaignName= "NewInbound2";
//		String customerNumber="9553578721";
//		String ucid1="9179158329809155";
//		String uui1 ="Test";
//		String Format="Json";
//		String reportType ="currentday";
		//String Sno, String ApiServer, String API_URL,Object ApiKey, Object UserName, Object AgentId, 
		//Object cam_name, Object cus_name, Object ucid,Object ph_name, Object DID, Object uui, Object format, Object NMA_avai, 
		//Object NMC_avail, String Exp_res, String res 
		
		
		String url="";
		if(!(API_URL.substring(0, 10)).contains("http"))
				url=ApiServer;
		url =url+arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i].contains("api_key") || arr[i].contains("apiKey") )
				url =url+arr[i]+ApiKey+"&";
			else if(arr[i].contains("username") || arr[i].contains("userName") ) 
				url =url+arr[i]+UserName+"&";
			else if(arr[i].contains("agentID")) 
				url =url+arr[i]+AgentId+"&";
			else if(arr[i].contains("campaignName")) 
				url =url+arr[i]+cam_name+"&";
			else if(arr[i].contains("customerNumber") || arr[i].contains("custNumber")) 
				url =url+arr[i]+cus_no+"&";
			else if(arr[i].contains("UCID") || arr[i].contains("ucid")) 
				url =url+arr[i]+ucid+"&";
			else if(arr[i].contains("phoneName")) 
				url =url+arr[i]+ph_name+"&";
			else if(arr[i].contains("did")) 
				url =url+arr[i]+DID+"&";
			else if(arr[i].contains("uui")) 
				url =url+arr[i]+uui+"&";
			else if(arr[i].contains("format")) 
				url =url+arr[i]+format+"&";
			//else if(arr[i].contains("reportType")) 
			//	url =url+arr[i]+reportType+"&";
			
		}
		
		
		//System.out.println("url is : "+url);
		//System.out.println("url length is: "+url.length());
		url =url.substring(0,url.length()-1);
		System.out.println("url is :"+url.trim());
		//System.out.println("url length is: "+url.length());
		
		if(NMA_avai.toString().equalsIgnoreCase("yes")) {
			ATBLogin();
			ATBloginpage = new AgentToolBarLoginPage();
			ATBHomePage = ATBloginpage.LoginintoATB(Testutil.Readexcel("AgentLogin",1 ).get(0), Testutil.Readexcel("AgentLogin",2 ).get(0), Testutil.Readexcel("AgentLogin",3 ).get(0), Testutil.Readexcel("AgentLogin",4 ).get(0));
			ATBHomePage.ATBchangeToReady();
			ATBHomePage.ATBchangeTomanual();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					}
		}
		
		try {
		URL obj = new URL(url.trim());
			//URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		
		StringBuffer response = new StringBuffer();
		
		//System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
			//return   response.toString();
		}
		if(NMA_avai.toString().equalsIgnoreCase("yes")) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {			
			}
			if(ATBHomePage.ATBagentStatus().contains("Dialing"))
					try {
						Thread.sleep(15000);
					} catch (InterruptedException e) {			
					}	
			System.out.println("agent status is:"+ATBHomePage.ATBagentStatus());
			ATBHomePage.AgentLogout();
			ATBHomePage.closebrowser();
		}
		return responseCode+" "+response.toString();
		} catch (IOException e) {
			//return "Get did not worked ";
		} 
			return "Get did not worked ";

	}

    
}

