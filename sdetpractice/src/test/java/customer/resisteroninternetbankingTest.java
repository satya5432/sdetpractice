package customer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.generic.utilities.excelutility;

public class resisteroninternetbankingTest {
	 public static void main(String[] args) throws Throwable {
	    	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commandata.property");
	    	Properties p=new Properties();
	    	p.load(fis);
	    	
	    	String BROWSER =p .getProperty("browser");
		       String URL = p.getProperty("url");
		       String PASSWORD =p.getProperty("password");
		       String USERNAME = p.getProperty("username");
		     
		    
		       if(BROWSER.equalsIgnoreCase("chrome"))
		       {
		    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		       WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get(URL);
				excelutility uti=new excelutility();
				WebElement ele = driver.findElement(By.xpath("//div[@class='ebanking']"));
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[text()='Register']")).click();
			driver.findElement(By.xpath("//input[@name='holder_name']")).sendKeys(uti.readEcelData("customer", 0, 1));
			driver.findElement(By.xpath("//input[@name='accnum']")).sendKeys(uti.readEcelData("customer", 15, 1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='dbtcard']")).sendKeys(uti.readEcelData("customer", 16, 1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='dbtpin']")).sendKeys(uti.readEcelData("customer", 17, 1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys(uti.readEcelData("customer", 2, 1));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='pan_no']")).sendKeys("APK324H");
			Thread.sleep(3000);
			WebElement dob= driver.findElement(By.xpath("//input[@name='dob']"));
			Actions act = new Actions(driver);
		       act.moveToElement(dob).click().sendKeys("10").sendKeys("11").sendKeys("1999").perform();
			driver.findElement(By.xpath("//input[@name='last_trans']")).sendKeys("00");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(uti.readEcelData("customer", 18, 1));
			driver.findElement(By.xpath("//input[@name='cnfrm_password']")).sendKeys(uti.readEcelData("customer", 19, 1));
			driver.findElement(By.xpath("//input[@name='submit']")).click();
			Thread.sleep(5000);
			 Alert a1=driver.switchTo().alert();
			 String text = a1.getText();
			 a1.accept();
			 System.out.println(text);
			
			
			
			
			
			
}}}
