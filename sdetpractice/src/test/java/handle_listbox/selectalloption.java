package handle_listbox;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.swing.plaf.basic.BasicTreeUI.TreeToggleAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectalloption {
	public static void main(String[] args) {
		
	
	  WebDriver driver=new FirefoxDriver();
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0&scenario=3");
		WebElement ele = driver.findElement(By.id("select2"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		
		ArrayList st=new ArrayList();
		for(WebElement str:options) {
			st.add(str.getText());
			
		}
		 Collections.sort(st, Collections.reverseOrder());
		System.out.println(st);
		
}
}
