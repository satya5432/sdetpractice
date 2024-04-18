package alertpopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplemodel {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new FirefoxDriver();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
	 	driver.findElement(By.id("multiModalButton")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(By.id("multiClosemodal")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='close'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("multiclose2")).click();
		
}
}
