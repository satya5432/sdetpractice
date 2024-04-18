package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to Click On A Button 
public class click_onabuttonTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btn")).click();
	driver.close();
	
}
}
