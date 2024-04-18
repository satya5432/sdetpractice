package myFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//number of links on webpage
public class printalllinkTest {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new FirefoxDriver();
    	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    	driver.findElement(By.xpath("//section[text()='Button']")).click();
    	Thread.sleep(2000);
    	List<WebElement> alllinl = driver.findElements(By.xpath("//a"));
    	int count=alllinl.size();
    	System.out.println(count);
	}
}
