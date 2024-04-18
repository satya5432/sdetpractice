package alertpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpopupformmtTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   driver.get("https://www.onlineupsrtc.co.in/#/home");
	   Thread.sleep(10);
	   driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop mat-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).click();
	   
}
}
