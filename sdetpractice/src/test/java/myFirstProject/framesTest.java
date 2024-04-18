package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framesTest {
      public static void main(String[] args) throws InterruptedException {
    	  WebDriver driver=new FirefoxDriver();
    	  driver.get("https://demo.automationtesting.in/Frames.html");
    	  driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
    	  WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
    	  driver.switchTo().frame(outerframe);
    	  WebElement innerframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
    	  driver.switchTo().frame(innerframe);
    	  Thread.sleep(2000);
    	  driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("satya");
	}
      
}
