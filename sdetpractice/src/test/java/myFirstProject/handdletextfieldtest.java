package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handdletextfieldtest {
//script to Enter data into text field which is having same attributes as other text field ?
	  public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new FirefoxDriver();
			driver.get("https://demoapps.qspiders.com/ui?scenario=1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input")).sendKeys("satya");
			driver.findElement(By.xpath("//label[contains(text(),'Email Id')]/following-sibling::input[@placeholder='Enter Your Email']")).sendKeys("yadav");
	}
}
