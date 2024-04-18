package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.generic.utilities.webdriverUtility;

public class multiplewindow {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
    	driver.findElement(By.id("browserButton2")).click();
    	webdriverUtility web=new webdriverUtility();
    	web.switchToWindow(driver, "SignUpPage");
    	driver.findElement(By.xpath("(//input[@class='w-full px-3 py-2 border rounded'])[1]")).sendKeys("satya");
    	Thread.sleep(4000);
    	web.switchToWindow(driver, "Login");
    	driver.findElement(By.xpath("(//input[@class='w-full p-3 border rounded'])[1]")).sendKeys("satya yadav");
    	Thread.sleep(4000);
    	web.switchToWindow(driver, "SignUp");
    	
}
}
