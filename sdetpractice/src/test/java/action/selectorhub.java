package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selectorhub {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://selectorshub.com/xpath-practice-page/");
	        WebElement shadowrootelement = driver.findElement(By.xpath("//div[@id='userName']"));
	        SearchContext shadow = shadowrootelement.getShadowRoot();
	        shadow.findElement(By.id("kils")).sendKeys("satya");
	        
	        Actions a=new Actions(driver);
	        
	}

}
