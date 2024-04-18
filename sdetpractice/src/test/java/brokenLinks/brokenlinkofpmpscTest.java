package brokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class brokenlinkofpmpscTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
       WebDriver driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get("https://mppsc.mp.gov.in/");
       List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
       System.out.println(alllinks.size());
       for(WebElement eachlink:alllinks) {
    	   String link = eachlink.getAttribute("href");
    	   try {
    	   URL url=new URL(link);
    	   HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
    	 int  statuscode=httpcon.getResponseCode();
    	 if(statuscode>=400) {
    		 System.out.println(link+">>>>"+statuscode+"brokenlink");
    	 }
    	   }
    	   catch(Exception e) {
    		   
    	   }
       }
	}

}
