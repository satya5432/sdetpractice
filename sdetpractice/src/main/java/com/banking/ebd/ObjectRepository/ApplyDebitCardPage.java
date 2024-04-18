package com.banking.ebd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyDebitCardPage {
      public ApplyDebitCardPage(WebDriver driver) {
    	 PageFactory.initElements( driver,this);
    	  
      }
    
	@FindBy(xpath="//input[@name='holder_name']") private WebElement acountholdernamebox;
	  @FindBy(xpath="//input[@name='dob']") private WebElement dobtxtbox;
	  @FindBy(xpath="//input[@name='pan']") private WebElement pantexbox;
	  @FindBy(xpath="//input[@name='mob']") private WebElement mobiletxtbox;
	  @FindBy(xpath="//input[@name='acc_no']") private WebElement accountnumtexbox;
	  @FindBy(xpath="//input[@name='dbt_crd_submit']") private WebElement submitbtn;
	  @FindBy(xpath="//a[text()='Home']") private WebElement Homebtn;
	  public WebElement getAcountholdernamebox() {
			return acountholdernamebox;
		}
		public WebElement getDobtxtbox() {
			return dobtxtbox;
		}
		public WebElement getPantexbox() {
			return pantexbox;
		}
		public WebElement getMobiletxtbox() {
			return mobiletxtbox;
		}
		public WebElement getAccountnumtexbox() {
			return accountnumtexbox;
		}
		public WebElement getSubmitbtn() {
			return submitbtn;
		}
		public WebElement getHomebtn() {
			return Homebtn;
		}
}
