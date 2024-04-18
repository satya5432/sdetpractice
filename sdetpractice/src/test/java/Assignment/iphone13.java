package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.utilities.excelutility;

public class iphone13 {
    public static void main(String[] args) throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     
        driver.get("https://www.amazon.in/");
        driver.findElement(By.name("field-keywords")).sendKeys("iphone13 pro");
        driver.findElement(By.id("nav-search-submit-text")).click();
        WebElement ele = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (256GB) - Blue']/ancestor::div[@class='puisg-row']/descendant::span[@class='a-price']"));
       String text = ele.getText();
       System.out.println(text);
       excelutility ex = new excelutility();
       ex.writeexceldata("testngdata", 1, 1, text);
	}
}
