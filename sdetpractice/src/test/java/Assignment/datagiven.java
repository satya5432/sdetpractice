package Assignment;

import org.testng.annotations.DataProvider;

public class datagiven {
  @DataProvider(name="datasource")
  public Object[][] datasource() {
	  Object [][] obj=new Object [2][2];
		obj[0][0]="210001";
		obj[0][1]="admin";
		
		obj[1][0]="210001";
		obj[1][1]="password";
		 return obj;
  }
}
