package myFirstProject;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//
public class selectsingle_value {
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
		 WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
		 Select s1=new Select(ele);
		 s1.selectByValue("India");
		 
		 WebElement ele1 = driver.findElement(By.xpath("//select[@id='select5']"));
	Select s2=new Select(ele1);
	     List<WebElement> op = s2.getOptions();
	   int  count=op.size();
	   
	   for(int i=0;i<=count;i++) {
		   String text = op.get(i).getText();
		   System.out.println(text);
	   }
		
	}
		
		
	}

