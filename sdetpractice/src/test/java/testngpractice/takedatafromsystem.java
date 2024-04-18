package testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class takedatafromsystem {
	
	@Test
   public void takedata() throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();

//	       String BROWSER = System.getProperty("browser");
//	       String URL = System.getProperty("url");
//	       String PASSWORD = System.getProperty("password");
//	       String USERNAME = System.getProperty("username");
//	     
//	       System.out.println(BROWSER);
//	       System.out.println(URL);
//	       System.out.println(PASSWORD);
//	       System.out.println(USERNAME);
//	    
//	       if(BROWSER.equalsIgnoreCase("chrome"))
//	       {
//	    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
//	       WebDriver driver=new ChromeDriver();
//
//			driver.get(URL);
//			
//			driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
//			driver.findElement(By.name("staff_id")).sendKeys(USERNAME);
//			driver.findElement(By.name("password")).sendKeys(PASSWORD);
//			driver.findElement(By.name("staff_login-btn")).click();
	       }
	      
}

