package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bigbasket {

	public static void main(String[] args) throws Throwable {
		 WebDriver driver=new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.bigbasket.com/");
	        driver.findElement(By.xpath("//input[@type='text']/ancestor::div[@class='grid place-content-start grid-flow-col gap-x-6']/descendant::input")).sendKeys("apple",Keys.ENTER);
	       Thread.sleep(4000) ;
	      // driver.findElement(By.xpath("(//span[contains(text(),' - Royal Gala, Regular')])[2]")).click();
	        
	        
	}

}
