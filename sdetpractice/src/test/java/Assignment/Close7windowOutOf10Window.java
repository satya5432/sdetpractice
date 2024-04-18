package Assignment;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close7windowOutOf10Window {
	 public static void main(String[] args) {
			

	       
for(int i=1;i<=10;i++) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	
	

	       // driver.get("https://example.com");
	        Set<String> handles = driver.getWindowHandles();
	        System.out.println(handles);


	        if (handles.size() >= 7) {
	            // Get the 7th window handle
	            String windowHandle = (String) handles.toArray()[6];

	            // Switch to the 7th window
	            driver.switchTo().window(windowHandle);
	            driver.close();
	        } else {
	            System.out.println("There are not enough windows to close the 7th window.");
	        }

	        driver.quit();
}
	    }
}
