package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewTab {
	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        // Open a new tab
	     
	        driver.get("https://www.google.com/"); // Open a blank page in the current tab
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       js.executeScript("window.open()");
	       driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
         driver.get("https://www.facebook.com/");
	        }
}
