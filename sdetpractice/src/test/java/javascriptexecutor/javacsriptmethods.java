package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class javacsriptmethods {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in/");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//launch the browser
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
		js.executeScript("arguments[0].scrillIntoView(true);", ele);
	
			//scrolldown till bottom of the page
		//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			//scroll top of the page
			Thread.sleep(3000);
			
			//js.executeScript("window.scrollTo(0,0)");
			//js.executeAsyncScript("window.scrollTo(0,0)");
	}
}