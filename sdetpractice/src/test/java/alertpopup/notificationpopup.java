package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notificationpopup {
   public static void main(String[] args) {
	FirefoxOptions option=new FirefoxOptions();
	option.addArguments("--disable-notification");
	 WebDriver driver=new FirefoxDriver(option);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/browserNot");
    	driver.findElement(By.id("browNotButton")).click();
    	
}
}
