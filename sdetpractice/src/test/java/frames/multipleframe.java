package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleframe {
     public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
      	WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
      	driver.switchTo().frame(frame1);
      	driver.findElement(By.id("email")).sendKeys("satya");
      	driver.findElement(By.id("password")).sendKeys("satya");
      	driver.switchTo().defaultContent();
      	WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
      	driver.switchTo().frame(frame2);
      	driver.findElement(By.id("username")).sendKeys("satya");
      	
	}
}
