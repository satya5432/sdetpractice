package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {
   public static void main(String[] args) {
	   WebDriver driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
    	WebElement ele = driver.findElement(By.id("fileInput"));
    	ele.sendKeys("C:\\Users\\User\\Documents\\Resume.pdf");
}
}
