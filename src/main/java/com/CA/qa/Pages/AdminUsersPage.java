package com.CA.qa.Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CA.qa.Base.TestBase;

public class AdminUsersPage  extends TestBase {
	
	@FindBy(id= "AdminMenu")
	WebElement AdminMenu;
	
	@FindBy(xpath= "//*[contains(@class,'main-heading')]")
	WebElement Userheader;

	@FindBy(xpath= "//*[contains(@data-original-title,'Add User')]")
	WebElement AddUser;
	
	@FindBy(xpath= "//*[contains(@data-original-title,'Help')]")
	WebElement UserHelp;
	
	@FindBy(id= "pageSize")
	WebElement Show_pageSize;
	
	@FindBy(xpath= "//*[contains(@id,'search')]")
	WebElement Usersearch;
	
	@FindBy(xpath= "//*[contains(@onclick,'submit')]")
	WebElement Usersearch_submit;
	
	@FindBy(id= "users")
	WebElement Table_Users;

	@FindBy(xpath= "//*[@id='users']/tbody/tr[1]/td[1]")
	WebElement row1_Usertable;

	@FindBy(id= "saveUser_button_save")
	WebElement saveUser_button_save;

	@FindBy(id= "saveUser_button_cancel")
	WebElement saveUser_button_cancel;

	@FindBy(xpath= "//*[contains(@class,'col-sm-12')]/*[contains(@class,'text-center')]")
	WebElement User_save_division;
	
	@FindBy(id= "saveUser_user_username")
	WebElement saveUser_user_username;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_username']/ul/li")
	WebElement saveUser_user_username_err;
	
	@FindBy(id= "saveUser_user_password")
	WebElement saveUser_user_password;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_password']/ul/li")
	WebElement saveUser_user_password_err;
	
	@FindBy(id= "saveUser_user_confirmPassword")
	WebElement saveUser_user_confirmPassword;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_confirmPassword']/ul/li")
	WebElement saveUser_user_confirmPassword_err;
	
	@FindBy(id= "saveUser_user_passwordHint")
	WebElement saveUser_user_passwordHint;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_passwordHint']/ul/li")
	WebElement saveUser_user_PasswordHint_err;
	
	@FindBy(id= "saveUser_user_firstName")
	WebElement saveUser_user_firstName;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_firstName']/ul/li")
	WebElement saveUser_user_firstName_err;
	
	@FindBy(id= "saveUser_user_lastName")
	WebElement saveUser_user_lastName;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_lastName']/ul/li")
	WebElement saveUser_user_lastName_err;
	
	@FindBy(id= "saveUser_user_email")
	WebElement saveUser_user_email;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_email']/ul/li")
	WebElement saveUser_user_email_err;
	
	@FindBy(id= "saveUser_user_extension")
	WebElement saveUser_user_extension;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_extension']/ul/li")
	WebElement saveUser_user_extension_err;
	
	@FindBy(id= "saveUser_user_phoneNumber")
	WebElement saveUser_user_phoneNumber;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_phoneNumber']/ul/li")
	WebElement saveUser_user_phoneNumber_err;
	
	@FindBy(id= "saveUser_user_address_city")
	WebElement saveUser_user_address_city;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_address_city']/ul/li")
	WebElement saveUser_user_address_city_err;
	
	@FindBy(id= "saveUser_user_address_province")
	WebElement saveUser_user_address_province;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_address_province']/ul/li")
	WebElement saveUser_user_address_province_err;
	
	@FindBy(id= "saveUser_user_address_postalCode")
	WebElement saveUser_user_address_postalCode;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_address_postalCode']/ul/li")
	WebElement saveUser_user_address_postalCode_err;
	
	@FindBy(id= "user.address.country")
	WebElement Select_user_address_country;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_address_country']/ul/li")
	WebElement Select_user_address_country_err;
	
	@FindBy(id= "saveUser_user_allowedIp")
	WebElement saveUser_user_allowedIp;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_user_allowedIp']/ul/li")
	WebElement saveUser_user_allowedIp_err;
	
	@FindBy(xpath= "//*[@id='saveUser']/div[1]/ul/li[2]//span")
	WebElement Select_user_module_tab;
	
	@FindBy(xpath= "//*[@id='wwctrl_saveUser_assignedModules']/ul/li")
	WebElement saveUser_assignedModules_err;
	
	public AdminUsersPage() {
		PageFactory.initElements(driver1, this);
				
	  }
	
	public void EnterUserNameForUser(String Uname) {
		saveUser_user_username.clear();
		saveUser_user_username.sendKeys(Uname);
	}
	
	public void ClickOnUserMenu() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(AdminMenu));
		AdminMenu.click();
	}
	
	public String GetUserHeader() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(Userheader));
		return Userheader.getText();
	}
	
	public String GetUserPageTitle() {
		return driver1.getTitle();
	}
	
	public void ClickOnAddUserButton() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(AddUser));
		AddUser.click();
	}
	
	public void ClickOnSaveOfUser() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(saveUser_button_save));
		saveUser_button_save.click();	
	}
	
	
	public String GetUserNameErr() {
		try{
			if(saveUser_user_username_err.isDisplayed())
				return saveUser_user_username_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterPasswordForUser(String str) {
		saveUser_user_password.clear();
		saveUser_user_password.sendKeys(str);
	}
	public String GetPasswordErr() {
		try{
			if(saveUser_user_password_err.isDisplayed())
				return saveUser_user_password_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterConfirmPasswordForUser(String str) {
		saveUser_user_confirmPassword.clear();
		saveUser_user_confirmPassword.sendKeys(str);
	}
	public String GetConfirmPasswordErr() {
		try{
			if(saveUser_user_confirmPassword_err.isDisplayed())
				return saveUser_user_confirmPassword_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterPasswordHintForUser(String str) {
		saveUser_user_passwordHint.clear();
		saveUser_user_passwordHint.sendKeys(str);
	}
	public String GetPasswordHintErr() {
		try{
			if(saveUser_user_PasswordHint_err.isDisplayed())
				return saveUser_user_PasswordHint_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterFirstNameForUser(String str) {
		saveUser_user_firstName.clear();
		saveUser_user_firstName.sendKeys(str);
	}
	public String GetFirstNameUserErr() {
		try{
			if(saveUser_user_firstName_err.isDisplayed())
				return saveUser_user_firstName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterLastNameForUser(String str) {
		saveUser_user_lastName.clear();
		saveUser_user_lastName.sendKeys(str);
	}
	public String GetLastNameUserErr() {
		try{
			if(saveUser_user_lastName_err.isDisplayed())
				return saveUser_user_lastName_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterEmailForUser(String str) {
		saveUser_user_email.clear();
		saveUser_user_email.sendKeys(str);
	}
	public String GetEmailForUserErr() {
		try{
			if(saveUser_user_email_err.isDisplayed())
				return saveUser_user_email_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterExtensionForUser(String str) {
		saveUser_user_extension.clear();
		saveUser_user_extension.sendKeys(str);
	}
	public String GetExtensionForUserErr() {
		try{
			if(saveUser_user_extension_err.isDisplayed())
				return saveUser_user_extension_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterPhNoForUser(String str) {
		saveUser_user_phoneNumber.clear();
		saveUser_user_phoneNumber.sendKeys(str);
	}
	public String GetPhNoForUserErr() {
		try{
			if(saveUser_user_phoneNumber_err.isDisplayed())
				return saveUser_user_phoneNumber_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterUserAddressCity(String str) {
		saveUser_user_address_city.clear();
		saveUser_user_address_city.sendKeys(str);
	}
	public String GetUserAddressCityErr() {
		try{
			if(saveUser_user_address_city_err.isDisplayed())
				return saveUser_user_address_city_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterUserAddressState(String str) {
		saveUser_user_address_province.clear();
		saveUser_user_address_province.sendKeys(str);
	}
	public String GetUserAddressStateErr() {
		try{
			if(saveUser_user_address_province_err.isDisplayed())
				return saveUser_user_address_province_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	public void EnterUserAddressPostalCode(String str) {
		saveUser_user_address_postalCode.clear();
		saveUser_user_address_postalCode.sendKeys(str);
	}
	public String GetUserAddressPostalcodeErr() {
		try{
			if(saveUser_user_address_postalCode_err.isDisplayed())
				return saveUser_user_address_postalCode_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterUserAddressCountry(String str) {
		Select_user_address_country.clear();
		Select_user_address_country.sendKeys(str);
	}
	public String GetUserAddressCountryErr() {
		try{
			if(Select_user_address_country_err.isDisplayed())
				return Select_user_address_country_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public String GetUserAssignedModulesErr() {
		new WebDriverWait(driver1, 20).until(ExpectedConditions.visibilityOf(Select_user_module_tab));
		Select_user_module_tab.click();	
	
		try{
			if(saveUser_assignedModules_err.isDisplayed())
				return saveUser_assignedModules_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
	public void EnterUserAllowedIP(String str) {
		saveUser_user_allowedIp.clear();
		saveUser_user_allowedIp.sendKeys(str);
	}
	public String GetUserAllowedIPErr() {
		try{
			if(saveUser_user_allowedIp_err.isDisplayed())
				return saveUser_user_allowedIp_err.getText();
		}catch(NoSuchElementException e) {}
		
		return "";
	}
	
}
