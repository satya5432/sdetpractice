package frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class differentsitefromdiffwindowTest {
	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new FirefoxDriver();
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	driver.get("https://www.amazon.in/");
	   	driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
	   	
	   	
}
}
