package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssertTest {
   public void hardassert() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.myntra.com/");
	   String exptitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
	  String actualtitle = driver.getTitle();
	  Assert.assertNotEquals(exptitle, actualtitle);
	  System.out.println(actualtitle);
   }
   public void hardassertall() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("https://www.myntra.com/");
	   String exptitle="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
	  String actualtitle = driver.getTitle();
	 // Assert.assertNotEquals(actualtitle, exptitle, "title is matched");
	  Assert.assertSame(exptitle, actualtitle);

	  System.out.println(actualtitle);
   }//readddd
}
