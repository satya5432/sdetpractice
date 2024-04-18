package com.banking.ebd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utilities.webdriverUtility;

public class StaffHomePage {
	public StaffHomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	webdriverUtility webuti=new webdriverUtility();
	@FindBy(xpath="//input[@name='apprvac']") private WebElement approvePendingbtn;
	@FindBy(xpath="//input[@name='viewdet']") private WebElement viewActivecustomerbtn;
	@FindBy(xpath="//input[@name='view_cust_by_ac']") private WebElement viewcusWithAccountbtn;
	@FindBy(xpath="//input[@name='del_cust']") private WebElement deletecustomerbtn;
	@FindBy(xpath="//input[@name='credit_cust_ac']") private WebElement creditcustomerbtn;
	@FindBy(xpath="//input[@name='logout_btn']") private WebElement logoutbtn;
	@FindBy(xpath="//a[text()='Home']") private WebElement homebtn;
	@FindBy(xpath="//input[@name='application_no']") private WebElement appnotextbox;
	@FindBy(xpath="//input[@name='search_application']") private WebElement searchbtn;
	@FindBy(xpath="//input[@name='approve_cust']") private WebElement approveaccountbtn;
	public WebElement getApprovePendingbtn() {
		return approvePendingbtn;
	}
	public WebElement getViewActivecustomerbtn() {
		return viewActivecustomerbtn;
	}
	public WebElement getViewcusWithAccountbtn() {
		return viewcusWithAccountbtn;
	}
	public WebElement getDeletecustomerbtn() {
		return deletecustomerbtn;
	}
	public WebElement getCreditcustomerbtn() {
		return creditcustomerbtn;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public WebElement getHomebtn() {
		return homebtn;
	}
	public void clickApprovePendingbtn() {
		 approvePendingbtn.click();
	}
	
	public void clickViewActivecustomerbtn() {
		 viewActivecustomerbtn.click();
	}
	public void clickViewcusWithAccountbtn() {
		viewcusWithAccountbtn.click();
	}
	public void clickDeletecustomerbtn() {
		deletecustomerbtn.click();
	}
	public void clickCreditcustomerbtn() {
		creditcustomerbtn.click();
	}
	public void clickLogoutbtn() {
		logoutbtn.click();
	}
	public void clickHomebtn() {
	homebtn.click();
	}
	public void senddatainappnotextbox(String Appnum) {
		
		appnotextbox.sendKeys(Appnum);
	}
	public void clicksearchbtn() {
		searchbtn.click();
	}
	public void clickapprovecustomerbtn() {
		approveaccountbtn.click();
	}
}
