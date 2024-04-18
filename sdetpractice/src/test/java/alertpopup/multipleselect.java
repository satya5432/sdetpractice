package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multipleselect {
     public static void main(String[] args) {
    	 
    	 WebDriver driver=new FirefoxDriver();
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      	driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
      	WebElement ele = driver.findElement(By.id("fileInput"));
      	ele.sendKeys("C:\\Users\\User\\Documents\\Resume.pdf");
      	ele.sendKeys("C:\\Users\\User\\Documents\\satya updated resume.pdf");
	
}
}
