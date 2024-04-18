package myFirstProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handling_windowTest {
//handle window
	   public static void main(String[] args) {
		   WebDriver driver=new FirefoxDriver();
		   driver.get("https://demo.automationtesting.in/Windows.html");
		   driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']")).click();
		   driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		   System.out.println(driver.getTitle());
		   Set<String> s = driver.getWindowHandles();
		   for(String i:s) {
			   String t = driver.switchTo().window(i).getTitle();
			   System.out.println(t);
		   }
	}
}
