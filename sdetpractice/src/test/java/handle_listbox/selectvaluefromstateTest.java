package handle_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectvaluefromstateTest {
  //select the values from the state drop-down by using the selectByvalue method
	 public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	 		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	 		WebElement ele = driver.findElement(By.xpath("//label[contains(.,'Country')]/following-sibling::div/select"));
	 		Select s = new Select(ele);
	 		s.selectByVisibleText("India");
	 		WebElement ele1 = driver.findElement(By.xpath("//label[contains(.,'State')]/following-sibling::div/select"));
	 		Select s1=new Select(ele1);
	 		s1.selectByValue("Odisha");
	 		s1.selectByValue("Manipur");
	 		s1.selectByValue("Rajasthan");
	 		
	 		
	}
}
