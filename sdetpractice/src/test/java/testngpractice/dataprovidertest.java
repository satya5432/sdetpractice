package testngpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.banking.ebd.ObjectRepository.HomePage;
import com.banking.ebd.ObjectRepository.StaffLoginPage;

public class dataprovidertest {
   @Test(dataProviderClass=dataprovider.class, dataProvider="readDataFromExcel")
   public void stafflogin(String username,String password) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	   driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
	   HomePage ph=new HomePage(driver);
	   ph.getStaffloginlink();
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	   StaffLoginPage st=new StaffLoginPage(driver);
	   st.Stafflogin(username, password);
	   
   }
   @Test(dataProviderClass=dataprovider.class, dataProvider="readDataFromExcel")
   public void takedata(String username,String password) {
	   System.out.println(username+">>>>>"+password);
   }
   }