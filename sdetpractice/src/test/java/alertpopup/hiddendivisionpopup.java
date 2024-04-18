package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddendivisionpopup {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new FirefoxDriver();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	 	Thread.sleep(3000);
	 	driver.findElement(By.id("hiddendiv")).click();
}
}
