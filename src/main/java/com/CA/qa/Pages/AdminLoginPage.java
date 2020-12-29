package com.CA.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CA.qa.Base.TestBase;
import com.CA.qa.Util.Testutil;

public class AdminLoginPage extends TestBase{

	@FindBy(xpath = "//*[contains(@class,'logo')]")
	WebElement Admin_CAlogo;
	
	@FindBy(id= "j_username")
	WebElement Admin_username;
	
	@FindBy(xpath = "//*[@id='wwgrp_username']/ul/li")
	WebElement Admin_userName_error;
	
	@FindBy(id= "j_password")
	WebElement Admin_password;
	
	@FindBy(xpath = "//*[@id='wwgrp_password']/ul/li")
	WebElement Admin_password_error;
	
	@FindBy(id= "error_message")
	WebElement invalid_error;
	
	@FindBy(xpath = "//*[contains(@type,'submit')]")
	WebElement Admin_submit;
	
	public AdminLoginPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public String ValidateAdminLoginPageTitle() {
		return driver1.getTitle();
	}
	
	public boolean ValidateAdminlLoginPagelogo() {
		
		return Admin_CAlogo.isDisplayed();
	}
	
//	public String ValidateAdminlLoginPagelogoText() {
//		
//		return Admin_CAlogo.getText();
//		
//	}
	
	public void sendUserName(String UN) {
		Admin_username.sendKeys(UN);
	}
	
	public void sendPassword(String pwd) {
		Admin_password.sendKeys(pwd);
	}
	
	public void clickLogInSubmit() {
		Admin_submit.click();
	}
	
	public String UsernameError() {
		return Admin_userName_error.getText();
	}
	
	public String passwordError() {
		return Admin_password_error.getText();
	}
	
	public String InvalidError() {
		 return invalid_error.getText();
	}
	public AdminHomePage LoginAsAdmin( String uname, String pwd) {
		//Testutil.flash(Admin_username, driver1);
		//System.out.println("n:"+uname+":");
		Admin_username.sendKeys(uname);
		//Testutil.flash(Admin_password, driver1);
		//System.out.println("p:"+pwd+":");
		Admin_password.sendKeys(pwd);
		Testutil.flash(Admin_submit, driver1);
		Admin_submit.click();
		return new AdminHomePage();
		
	}
	

}
