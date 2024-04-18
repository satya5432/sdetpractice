package handle_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectallvalidoptionTest {
//Select all the valid options from all drop down and click on continue button.
	  public static void main(String[] args) {
		  WebDriver driver=new FirefoxDriver();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0&scenario=3");
	 		WebElement ele = driver.findElement(By.id("select1"));
	 		Select s=new Select(ele);
	 		s.selectByValue("+91");
	 		driver.findElement(By.id("phone")).sendKeys("9616381580");
	 		WebElement ele1 = driver.findElement(By.id("select2"));
	 		Select s1=new Select(ele1);
	 		s1.selectByValue("male");
	 		WebElement ele2 = driver.findElement(By.xpath("//select[@id='select3']"));
	 		Select s2=new Select(ele2);
	 		s2.selectByValue("India");
	 		WebElement ele3 = driver.findElement(By.id("select5"));
	 		Select s3=new Select(ele3);
	 		s3.selectByValue("Odisha");
	 		WebElement ele4 = driver.findElement(By.xpath("//select[@id='select7']"));
	 		Select s4=new Select(ele4);
	 		s4.selectByIndex(2);
	 		driver.findElement(By.id("continuebtn")).click();
	 		
	 		
	}
}
