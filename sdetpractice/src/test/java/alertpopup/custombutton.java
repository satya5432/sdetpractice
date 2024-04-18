package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class custombutton {
    public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
     	WebElement ele = driver.findElement(By.xpath("//div[text()='Upload File']"));
     	ele.sendKeys("C:\\Users\\User\\Documents\\Resume.pdf");
	}
}
