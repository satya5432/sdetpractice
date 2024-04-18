package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//click on submit button
public class clickonsubmitbuttonTest {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Submit Click']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("satisfaction")).click();
		 Thread.sleep(2000);
			driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
			 Thread.sleep(2000);
			driver.close();
}
}
