package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitlywait {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new FirefoxDriver();
	 //implicitly wait
	  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	  	WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
	  	//explicitly wait
	  	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	  	wait.until(ExpectedConditions.titleContains(null));
	  	//custom wait
	  	int count=1;
	  	while(count<20) {
	  		try {
	  			ele.click();
	  			break;
	  			
	  			
	  		}
	  		catch(Exception e) {
	  			Thread.sleep(1000);
	  			count++;
	  		}
	  	}
}
}
