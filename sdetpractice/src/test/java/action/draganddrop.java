package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new EdgeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/dragDrop");
    	driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
    	WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
    	WebElement dest1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
    	WebElement src2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
    	WebElement dest2 = driver.findElement(By.xpath("/div[text()='Laptop Accessories']"));
    	Actions a=new Actions(driver);
    	a.dragAndDrop(src1, dest1).perform();
    	Thread.sleep(4000);
    	a.dragAndDrop(src2, dest2).perform();
    
	}
}
