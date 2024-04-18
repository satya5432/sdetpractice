package alertpopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aurhenticationpopup {
public static void main(String[] args) {
	 WebDriver driver=new FirefoxDriver();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
 	String username="admin";
 	String pass="admin";
 	String url="https://"+username+":"+pass+"@"+"basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
 	driver.get(url);
}
}
