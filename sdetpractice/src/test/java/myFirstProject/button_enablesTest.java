package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to check button is enabled
public class button_enablesTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	boolean result = driver.findElement(By.xpath("//a[text()='Submit Click']")).isEnabled();
	if(result==true) {
		System.out.println("submit button is enabled");
	}
	else {
		System.out.println("submit button is not enabled");
	}
}
}
