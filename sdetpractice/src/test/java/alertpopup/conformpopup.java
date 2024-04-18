package alertpopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conformpopup {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new FirefoxDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
     	driver.findElement(By.id("buttonAlert5")).click();
     	Thread.sleep(4000);
     	Alert alt = driver.switchTo().alert();
     	System.out.println(alt.getText());
     	alt.accept();
     
}
}
