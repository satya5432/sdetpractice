package handle_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectsinglevalueTest {
     public static void main(String[] args) throws InterruptedException {
    	 WebDriver driver=new FirefoxDriver();
 		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
 		Thread.sleep(2000);
 		  WebElement monthlist = driver.findElement(By.id("select2"));
 		 Select s=new Select( monthlist);
 		 Thread.sleep(2000);
 		 s.selectByVisibleText("Male");
}
}
