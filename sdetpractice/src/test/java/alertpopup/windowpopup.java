package alertpopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowpopup {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new FirefoxDriver();
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	driver.get("https://demoapps.qspiders.com/ui/browser");
   	Thread.sleep(3000);
   	driver.findElement(By.id("browserLink1")).click();
   	Set<String> widd = driver.getWindowHandles();
   	for(String str:widd) {
   		driver.switchTo().window(str);
   		String currurl = driver.getCurrentUrl();
   		System.out.println(currurl);
   		if(currurl.contains("SignUpPage")) {
   			break;
   			
   		}
   		
   	}
   	driver.findElement(By.id("email")).sendKeys("satya");
}
}
