package customer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.generic.utilities.excelutility;

public class applydebitcardTest {

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
			
			driver.findElement(By.xpath("//li[text()='Apply Debit Card']")).click();
			driver.findElement(By.xpath("//input[@name='holder_name']")).sendKeys(uti.readEcelData("customer", 0, 1));
			WebElement dob= driver.findElement(By.xpath("//input[@name='dob']"));
			Actions act = new Actions(driver);
		       act.moveToElement(dob).click().sendKeys("10").sendKeys("11").sendKeys("1999").perform();
			driver.findElement(By.xpath("//input[@name='pan']")).sendKeys(uti.readEcelData("customer", 5, 1));
			driver.findElement(By.xpath("//input[@name='mob']")).sendKeys(uti.readEcelData("customer", 1, 1));
			driver.findElement(By.xpath("//input[@name='acc_no']")).sendKeys(uti.readEcelData("customer", 15, 1));
			driver.findElement(By.xpath("//input[@name='dbt_crd_submit']")).click();
			Alert a = driver.switchTo().alert();
			String text = a.getText();
			System.out.println(text);
			a.accept();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[text()='Home']")).click();
			
	}

}}
