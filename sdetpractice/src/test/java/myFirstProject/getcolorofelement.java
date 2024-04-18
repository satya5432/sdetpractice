package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getcolorofelement {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Blue']")).click();
		WebElement color = driver.findElement(By.xpath("//div[@id='centerCol']"));
		String text = color.getAttribute("colour");
		System.out.println(text);
				
				
}


}

