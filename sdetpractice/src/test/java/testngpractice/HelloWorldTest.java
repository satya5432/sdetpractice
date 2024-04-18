package testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public void tc_1() throws InterruptedException
	{
		//WebDriver driver=new FirefoxDriver();
		String BROWSER = System.getProperty("browser");
	       String URL = System.getProperty("url");
	       String PASSWORD = System.getProperty("password");
	       String USERNAME = System.getProperty("username");
	     
	       System.out.println(BROWSER);
	       System.out.println(URL);
	       System.out.println(PASSWORD);
	       System.out.println(USERNAME);
	    
	       if(BROWSER.equalsIgnoreCase("firefox"))
	       {
	       WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(URL);
			
			driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
			Thread.sleep(4000);
			//Actions act=new Actions(driver);
			
			WebElement ele = driver.findElement(By.xpath("//input[@class='customer_id']"));
		//	Actions act=new Actions(driver);
			//act.click().perform();
			//act.sendKeys(ele, "210001").perform();
			ele.sendKeys("210001");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@class='password']")).sendKeys("password");
			driver.findElement(By.xpath("//input[@class='login-btn']")).click();
	       }
	}

}
