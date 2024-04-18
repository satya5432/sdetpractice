package keyboardaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotclass {
    public static void main(String[] args) throws AWTException, InterruptedException {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
    	driver.findElement(By.xpath("//input[@id='email']")).click();
    	String text = "Syadav962@gmail.com";
    	Robot r=new Robot();
    	/*for(char c:text.toCharArray()) {
    		int finaltext = KeyEvent.getExtendedKeyCodeForChar(c);
    		r.keyPress(finaltext);
    		r.keyRelease(finaltext);
    	}*/
    	//r.keyPress(KeyEvent.VK_CAPS_LOCK);
    	//r.keyPress(KeyEvent.VK_A);
    	//r.keyRelease(KeyEvent.VK_A);    	
    	
    	
	}
}
