package keyboardaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardaction {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Syadav962@gmail.com",Keys.CONTROL+"AC");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.CONTROL+"V");
	driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys(Keys.CONTROL+"V",Keys.ENTER);
	
}
}
