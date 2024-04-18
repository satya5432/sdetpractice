package testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.generic.utilities.Baseclass;

public class AnnotationTest  {
  @Test
  public void ExecuteScript() {
	  System.out.println("---testscript -1----");
  }
  @BeforeMethod
  public void bm() {
	 System.out.println("--LOGIN--");
  }
  @BeforeSuite
  public void bs() {
	  System.out.println("--connect to DB--");
  }
  @AfterSuite
  public void As() {
	  System.out.println("--Close to DB--");
  }
  @AfterMethod
  public void Am() {
	 System.out.println("--LOGout--");
  
}
  @Test
  public void Runtest() {
	  System.out.println("---testscript -2----");
  }
  @BeforeClass
  public void bc() {
	  System.out.println("--lunch browser");
  }
  @AfterClass
  public void ac() {
	  System.out.println("--close browser");
  }
  }
