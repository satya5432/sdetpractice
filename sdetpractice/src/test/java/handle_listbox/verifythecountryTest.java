package handle_listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class verifythecountryTest {
       public static void main(String[] args) {
    	   WebDriver driver=new FirefoxDriver();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
    	   WebElement ele = driver.findElement(By.id("select3"));
    	   Select s=new Select(ele);
    	   List<WebElement> options = s.getOptions();
    	   boolean flag=false;
    	   for(WebElement ops:options) {
    		   String text = ops.getText();
    		   if(text.equalsIgnoreCase("Canada")) {
    			  flag=true;
    			  break;
    		   }}
    		   if(flag) {
    			   System.out.println("country is prasent");
    		   }
    		   else {
    			   System.out.println("country is not prasent");
    		   }
    	   }
    	   
}


