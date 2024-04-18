package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to Click On Link Text 
public class clickonalinkTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	driver.findElement(By.xpath("//section[text()='Link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Payments']")).click();
	driver.close();
}
}
