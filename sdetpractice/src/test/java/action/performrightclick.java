package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class performrightclick {
     public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	driver.findElement(By.xpath("//a[text()='Right Click']")).click();
	WebElement target = driver.findElement(By.id("btn30"));
	Actions a=new Actions(driver);
	a.contextClick(target).perform();
	WebElement btn = driver.findElement(By.xpath("//div[text()='Yes']"));
	a.click(btn).perform();
	if(btn.isSelected()==true) {
		System.out.println("selected");
	}
}
}
