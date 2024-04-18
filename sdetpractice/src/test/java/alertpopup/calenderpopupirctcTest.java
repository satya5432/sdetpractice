package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpopupirctcTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  
	   driver.get("https://www.irctc.co.in/nget/train-search");
	   int date=27;
	   String monthandyear="April";
	   driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).click();
	   for(;;) {
	   try {
	   driver.findElement(By.xpath("//span[text()='"+monthandyear+"']/ancestor::div[@class='ui-datepicker-group ui-widget-content ng-tns-c58-10 ng-star-inserted']//a[text()='"+date+"']")).click();
	    break;
	   }
	   catch(Exception e) {
		   driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']")).click();
	   }
}
}
}
