package handle_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmultivalueTest {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
 		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
 		WebElement ele = driver.findElement(By.xpath("//label[contains(.,'Country')]/following-sibling::div/select"));
 		Select s = new Select(ele);
 		s.selectByValue("Canada");
 		s.selectByValue("Poland");
 		s.selectByVisibleText("China");
 		Thread.sleep(2000);
 		s.deselectByVisibleText("Canada");
 		
}   
    
   
}
