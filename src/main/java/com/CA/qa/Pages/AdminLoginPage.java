package com.CA.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(partialLinkText = "Forgot")
	WebElement Forgot_Password;
	
	@FindBy(id= "remember")
	WebElement remember_me_checkBox;
	
	
	
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
	
	public void clickForgotPassword() {
		javascriptClickforAdmin(Forgot_Password);
		//Forgot_Password.click();
	}
	public boolean EnableRememberMe() {
		try {
			//System.out.println("============"+remember_me_checkBox.isSelected());
		if(!remember_me_checkBox.isSelected())
			javascriptClickforAdmin(remember_me_checkBox);
		//remember_me_checkBox.click();
		Thread.sleep(500);
		return remember_me_checkBox.isSelected();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogInSubmit() {
		javascriptClickforAdmin(Admin_submit);
		//Admin_submit.click();
	}
	
	public String UsernameError() {
		return Admin_userName_error.getText();
	}
	public String GetUserName() {
		return Admin_username.getAttribute("value");
	}
	public String GetPassword() {
		return Admin_password.getAttribute("value");
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
		clickLogInSubmit();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.not(ExpectedConditions.titleContains(Testutil.Exp_AdminloginPageTitle)));
		return new AdminHomePage();
		
	}
	public DashBoardPage LoginIntoDashBoard( String uname, String pwd) {
		//Testutil.flash(Admin_username, driver1);
		//System.out.println("n:"+uname+":");
		Admin_username.sendKeys(uname);
		//Testutil.flash(Admin_password, driver1);
		//System.out.println("p:"+pwd+":");
		Admin_password.sendKeys(pwd);
		Testutil.flash(Admin_submit, driver1);
		clickLogInSubmit();
		new WebDriverWait(driver1, 20).until(ExpectedConditions.not(ExpectedConditions.titleContains(Testutil.Exp_AdminloginPageTitle)));
		return new DashBoardPage();
		
	}
	

}
