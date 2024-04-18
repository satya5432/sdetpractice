package com.generic.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class openaccountTest {
    public static void main(String[] args) throws Throwable {
    	FileUtility futil = new FileUtility();
		excelutility exutil = new excelutility();
		webdriverUtility webuti = new webdriverUtility();
		Javautility javautil = new Javautility();
		DatabaseUtility dbutil = new DatabaseUtility();
		WebDriver driver=null;
		int NUM = javautil.getrandomNo();
		String BROWSER = futil.readfiledata("browser");
		String URL = futil.readfiledata("url");
		String USERNAME = futil.readfiledata("username");
		String PASSWORD = futil.readfiledata("password");
    	
	    
	    
	       if(BROWSER.equalsIgnoreCase("chrome"))
	       {
	    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        driver=new ChromeDriver();
	       }
	       webuti.waitForPageLoad(driver, 10);
			driver.get(URL);
		
		
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys( exutil.readEcelData("customer", 0, 1)+NUM);
		WebElement ele = driver.findElement(By.xpath("//select[@name='gender']"));
		Select s=new Select(ele);
		s.selectByVisibleText("Male");
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys( exutil.readEcelData("customer", 1, 1));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(  exutil.readEcelData("customer", 2, 1));
		driver.findElement(By.xpath("//input[@name='landline']")).sendKeys(  exutil.readEcelData("customer", 3, 1));
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		
		Actions act = new Actions(driver);
       act.moveToElement(dob).click().sendKeys("10").sendKeys("11").sendKeys("1999").perform();
		
		driver.findElement(By.xpath("//input[@name='pan_no']")).sendKeys(  exutil.readEcelData("customer", 5, 1));
		driver.findElement(By.xpath("//input[@name='citizenship']")).sendKeys( exutil.readEcelData("customer", 6, 1));
		driver.findElement(By.xpath("//input[@name='homeaddrs']")).sendKeys(  exutil.readEcelData("customer", 7, 1));
		driver.findElement(By.xpath("//input[@name='officeaddrs']")).sendKeys( exutil.readEcelData("customer", 8, 1));
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys( exutil.readEcelData("customer", 9, 1));
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@name='state']"));
		
		
		webuti.dropDownHandling(ele1, exutil.readEcelData("customer", 1, 5));
		
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='city']"));
		webuti.dropDownHandling(ele2, exutil.readEcelData("customer", 1, 6));
		
		driver.findElement(By.xpath("//input[@name='pin']")).sendKeys( exutil.readEcelData("customer", 10, 1));
		driver.findElement(By.xpath("//input[@name='arealoc']")).sendKeys( exutil.readEcelData("customer", 11, 1));
	driver.findElement(By.xpath("//input[@name='nominee_name']")).sendKeys( exutil.readEcelData("customer", 12, 1));
	driver.findElement(By.xpath("//input[@name='nominee_ac_no']")).sendKeys( exutil.readEcelData("customer", 13, 1));
	WebElement ele3 = driver.findElement(By.xpath("//select[@name='acctype']"));
	Select s3=new Select(ele3);
	s3.selectByVisibleText( exutil.readEcelData("customer", 14, 1));
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='cnfrm-submit']")).click();
	Thread.sleep(5000);
	
	Alert a = driver.switchTo().alert();
	String text = a.getText();
	Thread.sleep(4000);
	a.accept();
	Thread.sleep(4000);
	String appno="";
	
	for (int i = 0; i<text.length(); i++) {
		if (Character.isDigit(text.charAt(i))) {
			appno =appno+text.charAt(i);
		}}
	System.out.println(appno);
	
	
	//System.out.println(text);
	//a.accept();
	driver.get(URL);
	driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
	driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
	driver.findElement(By.xpath("//input[@name='apprvac']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='application_no']")).sendKeys(appno);
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@name='search_application']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='approve_cust']")).click();
Thread.sleep(2000);
	Alert a1 = driver.switchTo().alert();
	String text1 = a1.getText();
	System.out.println(text1);
	Thread.sleep(2000);
	a1.accept();
	}
}
