package datadrivertesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class setdataintofileTest {
     public static void main(String[] args) throws IOException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
    	FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\commandata.property");
    	Properties obj = new Properties();
    	obj.setProperty("browser", "chrome");
    	obj.setProperty("url", "http://rmgtestingserver/domain/Online_Banking_System/");
    	obj.setProperty("password", "password");
    	obj.setProperty("username", "210001");
    	FileOutputStream fos=new FileOutputStream(".\\src\\main\\resources\\commandata.property");
    	obj.store(fos, "data");
	}
}
