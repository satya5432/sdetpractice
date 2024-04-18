package datadrivertesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadriventestingforvtigerTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver;
		FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\commandata.property");
		Properties p = new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		System.out.println(BROWSER);
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		
			driver.get(URL);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a[text()='Staff Login']")).click();
			driver.findElement(By.name("staff_id")).sendKeys(USERNAME);
			driver.findElement(By.name("password")).sendKeys(PASSWORD);
			driver.findElement(By.name("staff_login-btn")).click();
		}

	

}}

