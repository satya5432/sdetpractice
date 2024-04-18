package myFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkplaceholdertest {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	WebElement ele = driver.findElement(By.id("name"));
	String text = ele.getAttribute("placeholder");
	if(text.equalsIgnoreCase("Enter your name")) {
		System.out.println("placeholder is prasent");
	}
	else {
		System.out.println("placeholder is not prasent");
	}
	driver.close();
}
}
