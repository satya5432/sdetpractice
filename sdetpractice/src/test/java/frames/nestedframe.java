package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class nestedframe {
   public static void main(String[] args) {
	   WebDriver driver=new FirefoxDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
     	//driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
     	WebElement mainframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
     	driver.switchTo().frame(mainframe);
     	//WebElement childframe = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
     	//driver.switchTo().frame(childframe);
     	//driver.findElement(By.id("email")).sendKeys("satya");
     	WebElement email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
     	String data = email.getText();
     	
     	WebElement childframe = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
     	driver.switchTo().frame(childframe);
     	driver.findElement(By.id("email")).sendKeys(data);
     	driver.switchTo().frame(mainframe);
     	driver.findElement(By.xpath("//p[text()='Admin@gmail.com']"));
     	WebElement pass = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]"));
     	String password = pass.getText();
     	driver.switchTo().frame(childframe);
     	driver.findElement(By.id("password")).sendKeys(password);
     	
     	
}
}
