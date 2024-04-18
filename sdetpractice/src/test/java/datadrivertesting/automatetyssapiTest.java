package datadrivertesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;



public class automatetyssapiTest {

	public static void main(String[] args) throws InterruptedException, SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver.exe");
		Random ran=new Random();
		int random=ran.nextInt(400);
		String expData="easybank";
        WebDriver driver=new ChromeDriver();
        driver.get("http://rmgtestingserver:8084/");
        driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
        driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Projects']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Create Project']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("easybank");
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//input[@name='teamSize']")).sendKeys("5");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("satya1");
        Thread.sleep(4000);
        WebElement list = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
        Thread.sleep(4000);
        Select s=new Select(list);
        s.selectByIndex(1);
        Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Driver d = new Driver();
       DriverManager.registerDriver(d);
       Connection con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
      Statement state = con.createStatement();
      String query="select * from project where lower(project_name)='"+expData+"';";
      ResultSet result = state.executeQuery(query);
      while(result.next()) {
    	  String actual = result.getString(4);
    	  if(actual.equals(expData)) {
    		  System.out.println("data is present");
    	  }
    	  else {
    		  System.out.println("data is not present");
    	  }
      }
	}

}
