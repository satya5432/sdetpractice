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

public class brokenlinkforuppsc {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://uppsc.up.nic.in/");
	List<WebElement> allLink = driver.findElements(By.xpath("//a"));
	  int count=allLink.size();
	  System.out.println("total no of links are:"+count);
	  for(WebElement eachlink:allLink) {
		  String links = eachlink.getAttribute("href");
		  try {
		  URL url = new URL(links);
		  HttpURLConnection httpcons=(HttpURLConnection) url.openConnection();
		  int statuscode = httpcons.getResponseCode();
		  if(statuscode>=400) {
			  System.out.println(links+">>>>>>"+statuscode);
		  }
		  }
		  catch(Exception e) {
			  
		  }
	  }

}
}
