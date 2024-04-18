package action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
       public static void main(String[] args) {
    	   WebDriver driver=new FirefoxDriver();
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	driver.get("https://demoapps.qspiders.com/ui/mouseHover");
       	WebElement target = driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
       	Actions a=new Actions(driver);
       	a.moveToElement(target).perform();
       	List<WebElement> texts = driver.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']"));
       	for(WebElement webelement:texts) {
       		String string = webelement.getText();
       		System.out.println(string);
       	}
	}
}
