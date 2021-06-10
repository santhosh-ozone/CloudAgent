package com.CA.qa.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Util.Testutil;
import com.CA.qa.Util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static WebDriver driver1;
	
//	public static WebDriver driver;
//	public WebDriver driver1;
	public WebDriver driver2;
	public static int count=40;
	public static int row_no= 0;
	public static int Agents_count=0;
	public static int Phno_count=0;
	public static int TransNo_count=0;
	public static int Disp_count=0;
	public static int Pause_count=0;
	public static int DialOutNO_count=0;
	public static int pause_count=0;
	
	public static int Intial=1;
	public static String Customer= "ca_testing";
	public static String Agent_id= "Ozo";
	public static String Agent_Pwd= "Ozone#123";
	public static String Name_for_Agent_PhNo= "Ozone";
	public static int Agent_Ph_no=95000;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistener;
	public static EventFiringWebDriver e_driver1;
	public static WebEventListener eventlistener1;
	//public static JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	public TestBase() {
		prop = new Properties();
		
		try {
			
			//FileInputStream fis = new FileInputStream("/home/santosh/eclipse-workspace/CloudAgent/src/main/java/com/CA/qa/config/config.properties");
					//System.getProperty("user.dir")+ "src/main/java/com/CA/qa/config/config.properties");
			InputStream fis = TestBase.class.getClassLoader().getResourceAsStream("com/CA/qa/config/config.properties");
			
			prop.load(fis);
			 
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	 }
	
	public static void ATBLogin() {
		String browserName= prop.getProperty("Browser");
		if (browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santosh\\chrome driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "\\CloudAgent\\src\\main\\java\\com\\CA\\qa\\TestData\\chromedriver.exe");
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			//WebDriver driver = new ChromeDriver(options);
			
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("start-maximized"); // open Browser in maximized mode
//			options.addArguments("disable-infobars"); // disabling infobars
//			options.addArguments("--disable-extensions"); // disabling extensions
//			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//			options.addArguments("--no-sandbox"); // Bypass OS security model
			//driver = new ChromeDriver(options);
			driver=getChromeDriver();
			
			

		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventlistener = new WebEventListener();
		e_driver.register(eventlistener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		ArrayList<String> URL=Testutil.Readexcel("AgentLogin",0);
		//driver.get(prop.getProperty("AgentToolBar_url"));
		driver.get(URL.get(0));
	}
	private static WebDriver getChromeDriver() {
//      System.setProperty("webdriver.chrome.driver", DRIVER_DIR + "chromedriver.exe");
      WebDriverManager.chromedriver().setup();
      return new ChromeDriver();
  }
	private static WebDriver getEdgeDriver() {
      WebDriverManager.edgedriver().setup();
      return new EdgeDriver();
  }			
	
	public void AdminLogin() {
		AdminLogin("chrome");
		//return driver1;
	}
	
	public WebDriver AdminLogin1() {
		driver2 = getChromeDriver();;
		ArrayList<String> URL=Testutil.Readexcel("AdminLogin",0);
		driver2.get(URL.get(0));
		return driver2;
	}
	
	public void AdminLogin(String browserName) {
		
		//String browserName= prop.getProperty("Browser");
		if (browserName.equalsIgnoreCase("chrome")){
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santosh\\chrome driver\\chromedriver.exe");
			//driver1 = new ChromeDriver();
			driver1=getChromeDriver();
		      }
		else if (browserName.equalsIgnoreCase("Edge")){
			//driver1 = new ChromeDriver();
			driver1=getEdgeDriver();
		      }
		e_driver1 = new EventFiringWebDriver(driver1);
		eventlistener1 = new WebEventListener();
		e_driver1.register(eventlistener1);
		driver1 = e_driver1;
		
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT_TIME_admin, TimeUnit.SECONDS);
		driver1.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		
		ArrayList<String> URL=Testutil.Readexcel("AdminLogin",0);
		//System.out.println(URL.get(0));
		driver1.get(URL.get(0));
		
		//driver1.get(prop.getProperty("Admin_url"));
		
		//return driver1;
	}
public void DashBoardLogin() {
		
		String browserName= prop.getProperty("Browser");
		if (browserName.equals("chrome")){
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\santosh\\chrome driver\\chromedriver.exe");
			//driver1 = new ChromeDriver();
			driver1=getChromeDriver();
		      }
		e_driver1 = new EventFiringWebDriver(driver1);
		eventlistener1 = new WebEventListener();
		e_driver1.register(eventlistener1);
		driver1 = e_driver1;
		
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT_TIME_admin, TimeUnit.SECONDS);
		driver1.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		
		ArrayList<String> URL=Testutil.Readexcel("DashBoardLogin",0);
		//System.out.println(URL.get(0));
		driver1.get(URL.get(0));
		
		//driver1.get(prop.getProperty("Admin_url"));
		
		
	}
	public void javascriptClickforAdmin(WebElement element) {
		try {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.elementToBeClickable(element));
		JavascriptExecutor js= (JavascriptExecutor)driver1;
		js.executeScript("arguments[0].click();", element);
		}catch(Exception e ) {
			element.click();
		}
		
	}
	
	public void Printhyphens() {
		System.out.println("--------------------------------------------------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
