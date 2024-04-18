package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
    		
    	 WebDriver driver=new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	driver.get("https://www.amazon.in/");
        	/*WebElement target = driver.findElement(By.id("circle"));
        	Actions a=new Actions(driver);
        	a.clickAndHold(target).pause(4000).perform();
        	a.release();*/
        	
        	
	}
}
