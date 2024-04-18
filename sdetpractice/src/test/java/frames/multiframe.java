package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiframe {
    public static void main(String[] args) {
    	 WebDriver driver=new FirefoxDriver();
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
       WebElement ele = driver.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']"));
     String email = ele.getText();
     WebElement ele1 = driver.findElement(By.xpath("//p[text()='Password : Admin@1234']"));
     String pass = ele1.getText();
     WebElement ele2 = driver.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']"));
     String mail = ele2.getText();
     WebElement frame1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
     driver.switchTo().frame(frame1);
     driver.findElement(By.id("email")).sendKeys(email,Keys.CONTROL+"AC");
     driver.findElement(By.id("password")).sendKeys(pass);

     driver.switchTo().defaultContent();
     WebElement frame2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
     driver.switchTo().frame(frame2);
     driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"V");
     
    
	}
}
