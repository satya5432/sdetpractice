package customer_pom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.banking.ebd.ObjectRepository.HomePage;
import com.banking.ebd.ObjectRepository.OnlineAccountOpeningFormPage;
import com.banking.ebd.ObjectRepository.StaffHomePage;
import com.banking.ebd.ObjectRepository.StaffLoginPage;
import com.generic.utilities.Baseclass;
@Listeners(com.generic.utilities.ListenerIMPclass.class)
public class openaccountpomTest extends Baseclass  {
	
	@Test
	public void openaccounttest() throws Throwable {
  
		HomePage hp = new HomePage(driver);
		hp.getOpenaccountbtn();
		OnlineAccountOpeningFormPage oaofp = new OnlineAccountOpeningFormPage(driver);
		oaofp.getCustomernametxtbox().sendKeys(exutil.readEcelData("customer", 0, 1));
		WebElement element = oaofp.getGenderdropdown();
		webuti.dropDownHandling(element, "Male");
		oaofp.getMobilenotxtbox().sendKeys(exutil.readEcelData("customer", 1, 1));
		oaofp.getEmailtxttox().sendKeys(exutil.readEcelData("customer", 2, 1));
		oaofp.getLandlinetxttox().sendKeys(exutil.readEcelData("customer", 0, 1));
		WebElement ele = oaofp.getDobtxttox();
		webuti.mouseHoverondob(driver, ele, "04", "11", "1999");
		
		oaofp.getPantxttox().sendKeys(exutil.readEcelData("customer", 5, 1));
		oaofp.getCitizenshiptxttox().sendKeys(exutil.readEcelData("customer", 6, 1));
		oaofp.getHomeaddresstxttox().sendKeys(exutil.readEcelData("customer", 7, 1));
		oaofp.getOfficeaddresstxttox().sendKeys(exutil.readEcelData("customer", 8, 1));
		oaofp.getCountrytxttox().sendKeys(exutil.readEcelData("customer", 9, 1));
		WebElement ele2 = oaofp.getStatedropdown();
		webuti.dropDownHandling(ele2, exutil.readEcelData("customer", 1, 5));
		WebElement ele3 = oaofp.getCitydropdown();
		webuti.dropDownHandling(ele3, exutil.readEcelData("customer", 1, 6));
		oaofp.getPintxttox().sendKeys(exutil.readEcelData("customer", 10, 1));
		oaofp.getLocalareatxttox().sendKeys(exutil.readEcelData("customer", 11, 1));
		oaofp.getNomineenametxttox().sendKeys(exutil.readEcelData("customer", 12, 1));
		oaofp.getNomineeacnotxttox().sendKeys(exutil.readEcelData("customer", 13, 1));
		WebElement ele4 = oaofp.getAccounttypedropdown();
		webuti.dropDownHandling(ele4, exutil.readEcelData("customer", 14, 1));
		oaofp.getSubmitbtn().click();
		
		
		oaofp.getConformsubmitbtn().click();
		String applicationNum=webuti.getappnofromtextAlert(driver);
		webuti.acceptAlert(driver);
		Thread.sleep(5000);
	
		
		HomePage hp1 = new HomePage(driver);
		hp1.getStaffloginlink().click();
		StaffLoginPage stp = new StaffLoginPage(driver);
          String USERNAME = futil.readfiledata("username");
          String PASSWORD = futil.readfiledata("password");
          stp.Stafflogin(USERNAME, PASSWORD);
		StaffHomePage staffloginpage = new StaffHomePage(driver);
		staffloginpage.clickApprovePendingbtn();
		staffloginpage.senddatainappnotextbox(applicationNum);
		staffloginpage.clicksearchbtn();
		Thread.sleep(4000);
		staffloginpage.clickapprovecustomerbtn();
		System.out.println(webuti.gettexttAlert(driver));
		webuti.acceptAlert(driver);
		
		
	}
}
