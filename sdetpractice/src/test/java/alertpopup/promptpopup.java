package alertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class promptpopup {
      public static void main(String[] args) throws InterruptedException {
    	  WebDriver driver=new FirefoxDriver();
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
       	driver.findElement(By.id("buttonAlert1")).click();
       	Thread.sleep(4000);
       	Alert alt = driver.switchTo().alert();
       	System.out.println(alt.getText());
       	alt.sendKeys("no");
       	alt.accept();
       	WebElement ele = driver.findElement(By.xpath("//p[text()='You selected no']"));
       	String text = ele.getText();
       	if(text.contains("yes")) {
       		System.out.println("you selected yes");
       	}
       	else {
       		System.out.println("you selected no");
       	}
	} 

}
