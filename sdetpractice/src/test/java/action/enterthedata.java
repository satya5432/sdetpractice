package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class enterthedata {
     public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
     	WebElement ele = driver.findElement(By.id("name"));
     	Actions a=new Actions(driver);
     	a.sendKeys(ele, "satya").perform();
	}
}
