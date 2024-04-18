package myFirstProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select_optionwithoutmethods {
// selecting option from dropdown without using methods
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(2000);
		  WebElement monthlist = driver.findElement(By.id("select2"));
		 Select s=new Select( monthlist);
		 Thread.sleep(2000);
		 List<WebElement> alloption = s.getOptions();
		 for(WebElement option:alloption) {
			 if(option.getText().equals("Female")) {
				 option.click();
				 break;
			 }
		 }
	}
}
