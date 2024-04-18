package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
// script to enter data into Text field?
public class SaampleprojectTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("satya");
	driver.findElement(By.id("email")).sendKeys("satya");
	driver.findElement(By.id("password")).sendKeys("satya");
	driver.findElement(By.xpath("//button[text()='Register']")).click();
	

	 
}
}
