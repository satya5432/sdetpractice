package frames;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchsamewindow5timesTest {
	 public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new FirefoxDriver();
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	for(int i=1;i<=5;i++) {
	   		driver.get("https://www.amazon.in/");
	   	   	driver.switchTo().newWindow(WindowType.WINDOW);
	   	}
}
}
