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

public class brokenlinkforindianpost {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
	 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	 int count=allLinks.size();
	 System.out.println("total link:"+count);
	/* for(WebElement eachlink:allLinks) {
		 String link = eachlink.getAttribute("href");
		try {
		   URL url = new URL(link);
		   
		   HttpURLConnection httpcols=( HttpURLConnection) url.openConnection();
		   int statuscode = httpcols.getResponseCode();
		   if(statuscode>=400) {
			   System.out.println(link+">>>>>>"+statuscode);
		   }}
		   catch(Exception e) {
			   
		   }
		   
	 }*/
	 for(int i=0;i<=count;i++) {
		 WebElement element = allLinks.get(i);
		String link = element.getAttribute("href");
		try {
		URL url = new URL(link);
		HttpURLConnection httpcons=(HttpURLConnection) url.openConnection();
		int statuscode = httpcons.getResponseCode();
		if(statuscode>=400 && statuscode !=0) {
			System.out.println(url+">>>>>>>"+statuscode);
		}
		else {
			System.out.println(url+">>"+statuscode+"valid link");
		}
		}
		catch(Exception e) {
			
		}
		
	 }
	 
	
	}


}

