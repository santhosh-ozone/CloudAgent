package com.CA.qa.TestCases;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santosh\\chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "\\CloudAgent\\src\\main\\java\\com\\CA\\qa\\TestData\\chromedriver.exe");
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://agent2.cloudagent.in/OCCDV2/cloudagent/agent_login.jsp");
		driver.findElement(By.id("customer")).sendKeys("mdinesh_qa");
		driver.findElement(By.id("agentid")).sendKeys("santosh1");
		driver.findElement(By.id("phoneNumber")).sendKeys("9959177442");
		driver.findElement(By.id("pin")).sendKeys("Ozone@123#");
		driver.findElement(By.xpath("//*[@id=\"agentLoginForm\"]/div/div[5]/button")).click();
		
	}

}
