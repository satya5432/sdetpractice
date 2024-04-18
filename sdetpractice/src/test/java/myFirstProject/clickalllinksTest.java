package myFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickalllinksTest {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui/link/payment?sublist=0&scenario=1");
	driver.findElement(By.xpath("//section[text()='Link']")).click();
	   List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	   for(WebElement s:alllinks) {
		   System.out.println(s.getText());
	   }
}
}
