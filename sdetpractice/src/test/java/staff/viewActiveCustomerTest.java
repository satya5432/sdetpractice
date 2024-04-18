package staff;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewActiveCustomerTest {

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
			
			driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
			driver.findElement(By.xpath("//input[@name='staff_id']")).sendKeys(USERNAME);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
			driver.findElement(By.xpath("//input[@name='staff_login-btn']")).click();
			driver.findElement(By.xpath("//input[@name='viewdet']")).click();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_F);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_F);
	}

}}
