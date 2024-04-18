package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class testmictest {
   public static void main(String[] args) {
	   FirefoxOptions options=new FirefoxOptions();
	   options.addArguments("--use-fake-ui-for-media-stream");
	   WebDriver driver=new FirefoxDriver(options);
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	driver.get("https://mictests.com/");
   	driver.findElement(By.id("mic-launcher")).click();
}
}
