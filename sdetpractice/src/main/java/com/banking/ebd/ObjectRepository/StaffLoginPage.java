package com.banking.ebd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffLoginPage {
	public StaffLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="staff_id")private WebElement staffidtextfld;
	@FindBy(xpath="//input[@name='password']")private WebElement passwordtextfld;
	@FindBy(xpath="//input[@name='staff_login-btn']")private WebElement loginbtn;
	public WebElement getStaffidtextfld() {
		return staffidtextfld;
	}
	public WebElement getPasswordtextfld() {
		return passwordtextfld;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	//business library
	public void Stafflogin(String username,String password) {
		staffidtextfld.sendKeys(username);
		passwordtextfld.sendKeys(password);
		loginbtn.click();
	}
	
}
