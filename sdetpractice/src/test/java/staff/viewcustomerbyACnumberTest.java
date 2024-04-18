package staff;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.utilities.excelutility;

public class viewcustomerbyACnumberTest {
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
	       driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get(URL);
			excelutility uti=new excelutility();
			driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
			driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
			driver.findElement(By.xpath("//input[@name='view_cust_by_ac']")).click();
			driver.findElement(By.xpath("//input[@name='account_no']")).sendKeys(uti.readEcelData("customer", 15, 1));
			driver.findElement(By.xpath("//input[@name='submit_view']")).click();
			WebElement ele = driver.findElement(By.xpath("//div[@class='cust_details']"));
			String text = ele.getText();
			System.out.println(text);
			driver.findElement(By.xpath("//input[@name='logout_btn']")).click();
	}
}}
