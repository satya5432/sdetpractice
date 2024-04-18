package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenLinksTest {
public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.irctc.co.in/nget/train-search");
	List<WebElement> allLink = driver.findElements(By.xpath("//a"));
	int count=allLink.size();
	System.out.println(count);
	for(WebElement eachlink:allLink) {
		String link = eachlink.getAttribute("href");
		URL url=null;
		int statuscode=0;
		try {
	 url = new URL(link);
		HttpURLConnection httpcons=(HttpURLConnection) url.openConnection();
		statuscode = httpcons.getResponseCode();
		if(statuscode>=400 && statuscode!=0) {
			System.out.println(link+">>>>>"+statuscode);
		}
		}
		catch(Exception e) {
			
		}
		}
		
		
		}
		
	
}

