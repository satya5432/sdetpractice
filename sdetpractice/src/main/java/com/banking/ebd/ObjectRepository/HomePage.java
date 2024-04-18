package com.banking.ebd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//li[text()='Open Account']")private WebElement openaccountbtn;
@FindBy(xpath="//li[text()='Apply Debit Card']")private WebElement applydebitcardbtn;
@FindBy(xpath="//div[@class='ebanking']")private WebElement internetbtn;
@FindBy(xpath="//li[text()='Fund Transfer']")private WebElement fundtransferntbn;
@FindBy(xpath="//a[text()='Staff Login']")private WebElement staffloginlink;
@FindBy(xpath="//a[text()='Home']")private WebElement homebtn;
public WebElement getOpenaccountbtn() {
	openaccountbtn.click();
	return openaccountbtn;
}
public WebElement getApplydebitcardbtn() {
	applydebitcardbtn.click();
	return applydebitcardbtn;
}
public WebElement getInternetbtn() {
	internetbtn.click();
	return internetbtn;
}
public WebElement getFundtransferntbn() {
	fundtransferntbn.click();
	return fundtransferntbn;
}
public WebElement getStaffloginlink() {
	staffloginlink.click();
	return staffloginlink;
}
public WebElement getHomebtn() {
	homebtn.click();
	return homebtn;
}


}
