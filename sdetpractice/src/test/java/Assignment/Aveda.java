package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aveda {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.aveda.de/");

		
		WebElement cok=driver.findElement(By.id("onetrust-reject-all-handler"));
	
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(cok));
		cok.click();
		
		WebElement element=driver.findElement(By.xpath("//div[@id=\"node-6656\"]/descendant::a[text()='GESICHT & KÖRPER' and @aria-label=\"GESICHT & KÖRPER\"]"));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		
		WebElement makeUpButton=driver.findElement(By.xpath("//a[text()='GESICHT & KÖRPER']/parent::li[contains(@class,'js-menu-item-category active')]/descendant::a[text()='makeup']"));
		
		action.moveToElement(makeUpButton).click().perform();
		
		List<WebElement> allElements=driver.findElements(By.xpath("//div[@class=\" product-grid__item js-product-grid-item js-grid-item js-access-content\"]/descendant::*[text()='In den Warenkorb']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(WebElement el:allElements) {
			js.executeScript("arguments[0].scrollIntoView()",el);
		    action.moveToElement(el).click().perform();
	}

}}
