package customer_pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.banking.ebd.ObjectRepository.ApplyDebitCardPage;
import com.banking.ebd.ObjectRepository.HomePage;
import com.generic.utilities.Baseclass;
import com.generic.utilities.DatabaseUtility;
import com.generic.utilities.FileUtility;
import com.generic.utilities.Javautility;
import com.generic.utilities.excelutility;
import com.generic.utilities.webdriverUtility;

public class applydebitcardPOMTest extends Baseclass {
   @Test
   public void ApplyDebitCard() throws Throwable {
	
		HomePage hp = new HomePage(driver);
		hp.getApplydebitcardbtn().click();
		 ApplyDebitCardPage adcp = new ApplyDebitCardPage( driver);
		 adcp.getAcountholdernamebox().sendKeys(exutil.readEcelData("customer", 0, 1));
		 WebElement ele = adcp.getDobtxtbox();
		 webuti.mouseHoverondob(driver, ele, "04", "11", "1999");
		 adcp.getPantexbox().sendKeys(exutil.readEcelData("customer", 5, 1));
		 adcp.getMobiletxtbox().sendKeys(exutil.readEcelData("customer", 1, 1));
		 adcp.getAccountnumtexbox().sendKeys(exutil.readEcelData("customer", 15, 1));
		 adcp.getSubmitbtn().click();
		 webuti.gettexttAlert(driver);
		webuti.acceptAlert(driver);
		Thread.sleep(4000);
		adcp.getHomebtn().click();
			
	}		

}
