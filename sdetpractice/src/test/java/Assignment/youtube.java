package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.youtube.com/");
	
	WebElement search=driver.findElement(By.name("search_query"));
	
//	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].value=arguments[1]", search,"song");
	
	
	Actions action= new Actions(driver);
	action.sendKeys(search,"song").perform();
   List<WebElement>	suggestions=driver.findElements(By.xpath("//ul[@class='sbsb_b']/li"));
   
   for(WebElement i:suggestions) {
	     if(i.getText().contains("new"))
	    	 {
	    	 i.click();
	    	 break;
	    	 }
		     
   }
        
	}
}
