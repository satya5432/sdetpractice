package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class performdoubleclickTest {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
    	driver.findElement(By.xpath("//a[text()='Double Click']")).click();
    	WebElement btn = driver.findElement(By.xpath("//button[@id='btn20']"));
    	Actions a=new Actions(driver);
    	a.doubleClick(btn).perform();
	}
}
