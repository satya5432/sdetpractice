package myFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//script to get the text of all the links
public class textoflink {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new FirefoxDriver();
    	/*driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    	driver.findElement(By.xpath("//section[text()='Button']")).click();
    	Thread.sleep(2000);
    	List<WebElement> alllinl = driver.findElements(By.xpath("//a"));
    	int count=alllinl.size();
    	for(int i=1;i<=count;i++) {
    		String text = alllinl.get(i).getText();
    		System.out.println(text);
    	}
    	driver.close();*/
    	driver.get("https://www.amazon.in/");
    	List<WebElement> alllink = driver.findElements(By.xpath("//a"));
    	int count = alllink.size();
    	System.out.println(count);
    	for(int i=1;i<=count;i++) {
    		String text = alllink.get(i).getText();
    		System.out.println(text);
    	}
	}
    
}
