package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifythecountry {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.icc-cricket.com/rankings#mens-team-rankings");
        List<WebElement> allcountry = driver.findElements(By.xpath("//div[@class='si-fname si-text']"));
        String country="INDIA";
        boolean flag=false;
        for(WebElement country1:allcountry) {
        	if((country1.getText()).equals(country)) {
        		flag=true;
        		break;
        	}
        	
        	
        }
        if(flag) {
        	System.out.println("country is prasent");
        }
        else {
        	System.out.println("not prasent");
        }
	}

}
