package alertpopup;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class downloadpopup {
    public static void main(String[] args) {
    	FirefoxOptions options=new FirefoxOptions();
    	HashMap<String, Object> map=new HashMap<String, Object>();
         map.put("download.default_direcory","D:\\satya\\Demo project");
   
    	 WebDriver driver=new FirefoxDriver(options);
    	 
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
     	driver.findElement(By.id("writeArea")).sendKeys("welcome to tyyss");
     	driver.findElement(By.id("fileName")).sendKeys("myfile.txt");
     	driver.findElement(By.id("downloadButton")).click();
	}
}
