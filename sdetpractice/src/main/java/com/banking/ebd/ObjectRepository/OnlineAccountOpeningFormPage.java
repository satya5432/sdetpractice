package com.banking.ebd.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.utilities.Javautility;
import com.generic.utilities.excelutility;
import com.generic.utilities.webdriverUtility;


public class OnlineAccountOpeningFormPage {
	webdriverUtility webuti = new webdriverUtility();
	excelutility exutil = new excelutility();
	Javautility	javauti=new Javautility();
	
	
	public OnlineAccountOpeningFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	} 
	
	@FindBy(xpath="//input[@name='name']")private WebElement customernametxtbox;
	@FindBy(xpath="//select[@name='gender']")private WebElement genderdropdown;
	@FindBy(xpath="//input[@name='mobile']")private WebElement mobilenotxtbox;
	@FindBy(xpath="//input[@name='email']")private WebElement emailtxttox;
	@FindBy(xpath="//input[@name='landline']")private WebElement landlinetxttox;
	@FindBy(xpath="//input[@name='dob']")private WebElement dobtxttox;
	@FindBy(xpath="//input[@name='pan_no']")private WebElement pantxttox;
	@FindBy(xpath="//input[@name='citizenship']")private WebElement citizenshiptxttox;
	@FindBy(xpath="//input[@name='homeaddrs']")private WebElement homeaddresstxttox;
	@FindBy(xpath="//input[@name='officeaddrs']")private WebElement officeaddresstxttox;
	@FindBy(xpath="//input[@name='country']")private WebElement countrytxttox;
	@FindBy(xpath="//select[@name='state']")private WebElement statedropdown;
	@FindBy(xpath="//select[@name='city']")private WebElement citydropdown;
	@FindBy(xpath="//input[@name='pin']")private WebElement pintxttox;
	@FindBy(xpath="//input[@name='arealoc']")private WebElement localareatxttox;
	@FindBy(xpath="//input[@name='nominee_name']")private WebElement nomineenametxttox;
	@FindBy(xpath="//input[@name='nominee_ac_no']")private WebElement nomineeacnotxttox;
	@FindBy(xpath="//select[@name='acctype']")private WebElement accounttypedropdown;
	@FindBy(xpath="//input[@name='submit']")private WebElement submitbtn;
	@FindBy(xpath="//input[@name='cnfrm-submit']")private WebElement conformsubmitbtn;
	
	public WebElement getConformsubmitbtn() {
		return conformsubmitbtn;
	}
	public WebElement getGenderdropdown() {
		return genderdropdown;
	}
	public WebElement getDobtxttox() {
		return dobtxttox;
	}
	public WebElement getStatedropdown() {
		return statedropdown;
	}
	public WebElement getCitydropdown() {
		return citydropdown;
	}
	public void Selectgenderdata(WebElement element,String text) {
		webdriverUtility webuti = new webdriverUtility();
		webuti.dropDownHandling(genderdropdown, null);
	}
	public void Selectstatedata() {
		webdriverUtility webuti = new webdriverUtility();
		webuti.dropDownHandling(statedropdown, "");
	}
	public void Selectcitydata() {
		webdriverUtility webuti = new webdriverUtility();
		webuti.dropDownHandling(citydropdown, "");
	}
	public webdriverUtility getWebuti() {
		return webuti;
	}
	public excelutility getExutil() {
		return exutil;
	}
	public Javautility getJavauti() {
		return javauti;
	}
	public WebElement getCustomernametxtbox() {
		return customernametxtbox;
	}
	public WebElement getMobilenotxtbox() {
		return mobilenotxtbox;
	}
	public WebElement getEmailtxttox() {
		return emailtxttox;
	}
	public WebElement getLandlinetxttox() {
		return landlinetxttox;
	}
	public WebElement getPantxttox() {
		return pantxttox;
	}
	public WebElement getCitizenshiptxttox() {
		return citizenshiptxttox;
	}
	public WebElement getHomeaddresstxttox() {
		return homeaddresstxttox;
	}
	public WebElement getOfficeaddresstxttox() {
		return officeaddresstxttox;
	}
	public WebElement getCountrytxttox() {
		return countrytxttox;
	}
	public WebElement getPintxttox() {
		return pintxttox;
	}
	public WebElement getLocalareatxttox() {
		return localareatxttox;
	}
	public WebElement getNomineenametxttox() {
		return nomineenametxttox;
	}
	public WebElement getNomineeacnotxttox() {
		return nomineeacnotxttox;
	}
	public WebElement getAccounttypedropdown() {
		return accounttypedropdown;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	public void setGenderdropdown(WebElement genderdropdown) {
		this.genderdropdown = genderdropdown;
	}
	public void setDobtxttox(WebElement dobtxttox) {
		this.dobtxttox = dobtxttox;
	}
	
	/*public void inputdatainaccountform(WebDriver driver) throws Throwable {
		customernametxtbox.sendKeys(exutil.readEcelData("customer", 0, 1));
		webuti.dropDownHandling(genderdropdown, "Male");
		mobilenotxtbox.sendKeys(exutil.readEcelData("customer", 1, 1));
		emailtxttox.sendKeys(exutil.readEcelData("customer", 2, 1));
		landlinetxttox.sendKeys(exutil.readEcelData("customer", 3, 1));
		
		pantxttox.sendKeys(exutil.readEcelData("customer", 5, 1));
		citizenshiptxttox.sendKeys(exutil.readEcelData("customer", 6, 1));
		 homeaddresstxttox.sendKeys(exutil.readEcelData("customer", 7, 1));
		 officeaddresstxttox.sendKeys(exutil.readEcelData("customer", 8, 1));
		 countrytxttox.sendKeys(exutil.readEcelData("customer", 9, 1));
		 webuti.dropDownHandling(statedropdown, exutil.readEcelData("customer", 1, 5));
		 webuti.dropDownHandling(citydropdown, exutil.readEcelData("customer", 1, 6));
		 pintxttox.sendKeys(exutil.readEcelData("customer", 10, 1));
		 pintxttox.sendKeys(exutil.readEcelData("customer", 10, 1));
		 localareatxttox.sendKeys(exutil.readEcelData("customer", 0, 1));
		 nomineenametxttox.sendKeys(exutil.readEcelData("customer", 0, 1));
		 nomineeacnotxttox.sendKeys(exutil.readEcelData("customer", 0, 1));
		 webuti.dropDownHandling(accounttypedropdown, exutil.readEcelData("customer", 14, 1));
		 submitbtn.click();
		 
		
	
		
	}*/
	
}
