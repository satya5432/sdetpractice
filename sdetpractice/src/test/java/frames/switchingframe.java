package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchingframe {
    public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
      	WebElement ele = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
      	driver.switchTo().frame(ele);
      	driver.findElement(By.id("username")).sendKeys("satya");
      
	}
}
