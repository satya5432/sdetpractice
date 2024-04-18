package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolltoTest {
     public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://www.amazon.in/");
     	WebElement ele = driver.findElement(By.xpath("//span[text()='EMI starting at ₹100/day | Electric scooters & motorbike']"));
     	 Point location = ele.getLocation();
      int x = location.getX();
      int y=location.getY();
      Actions a=new Actions(driver);
      a.scrollByAmount(x, y).perform();
      //or
      a.scrollToElement(ele).perform();
	}
}
