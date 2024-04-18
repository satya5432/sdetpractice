package com.generic.utilities;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.banking.ebd.ObjectRepository.HomePage;
import com.banking.ebd.ObjectRepository.StaffHomePage;
import com.banking.ebd.ObjectRepository.StaffLoginPage;

public class Baseclass {
	public WebDriver driver;
	public static WebDriver sdriver;
	public DatabaseUtility dutil=new DatabaseUtility();
	public FileUtility futil = new FileUtility();
	public excelutility exutil = new excelutility();
	public Javautility jutil = new Javautility();
	public webdriverUtility webuti = new webdriverUtility();
	//HomePage hp = new HomePage(driver);
	
  /*  @BeforeSuite
    public void connectToDB() throws Throwable {
    	dutil.connectToDB();
    	//Reporter.log("--DB connected---",true);
    }*/
   
    
    @BeforeClass
    public void LuunchBrowser() throws Throwable {
    	String BROWSER = futil.readfiledata("browser");
    	if(BROWSER.equalsIgnoreCase("CHROME")) {
    		
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	else if(BROWSER.equalsIgnoreCase("firefox")) {
    		driver=new FirefoxDriver();
    	}
    	else if(BROWSER.equalsIgnoreCase("edge")) {
    		driver=new EdgeDriver();
    	}
    	else{
    		System.out.println("invalid browser");
    	}
    	 sdriver = driver;
    	webuti.maximizeWindow(driver);
    	webuti.waitForPageLoad(driver, 20);
    }
    @BeforeMethod
    public void loginToApp() throws Throwable {
    	
    	String URL = futil.readfiledata("url");
    	//String USERNAME = futil.readfiledata("username");
    	//String PASSWORD = futil.readfiledata("password");
    	driver.get(URL);
    	//HomePage hp = new HomePage(driver);
    	//hp.getStaffloginlink();
    	//StaffLoginPage stf = new StaffLoginPage(driver);
    	//stf.Stafflogin(USERNAME, PASSWORD);
    	Reporter.log("--logged in to app",true);
    }
    @AfterMethod
    public void logouttoapp() {
    	
    	Reporter.log("--loggedout in to app",true);
    }
    @AfterClass
   public void closebrowser() {
    	driver.quit();
    	Reporter.log("--close the browser--",true);
    }
   /* @AfterSuite
    public void closeDB() throws Throwable {
    	dutil.closeDB();
    }*/
   
    
}
