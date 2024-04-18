package alertpopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.generic.utilities.webdriverUtility;

public class irctcpopup {
  public static void main(String[] args) {
	  FirefoxOptions option=new FirefoxOptions();
		option.addArguments("--disable-notification");
		 WebDriver driver=new FirefoxDriver(option);
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	driver.get("https://www.irctc.co.in/nget/train-search");
	    	//driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("varanasi");
	    	//driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("mumbai");
	    	driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
	    	Set<String> allwindow = driver.getWindowHandles();
	    	/*for(String str:allwindow) {
	    		driver.switchTo().window(str);
	    		String title = driver.getTitle();
	    		System.out.println(title);
	    		if(title.contains("Online Bus")) {
	    			break;
	    		}
	    	}*/
	    	webdriverUtility web = new webdriverUtility();
	    	web.switchToWindow(driver, "Online Bus");
	    	driver.findElement(By.xpath("//input[@placeholder='Depart From']")).sendKeys("mumbai");
}
}
