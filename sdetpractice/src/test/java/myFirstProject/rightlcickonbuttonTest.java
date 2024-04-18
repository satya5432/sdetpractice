package myFirstProject;
// script to right click on button

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class rightlcickonbuttonTest {
     public static void main(String[] args) throws InterruptedException {
	  
WebDriver driver=new FirefoxDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
Thread.sleep(2000);
driver.findElement(By.xpath("//section[text()='Button']")).click();
WebElement target =driver.findElement(By.id("btn"));
Thread.sleep(2000);
Actions a=new Actions(driver);
    a.contextClick(target).perform();


     }
  }
