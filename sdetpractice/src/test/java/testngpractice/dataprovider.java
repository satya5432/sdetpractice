package testngpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.utilities.IpathConstant;

public class dataprovider {
@DataProvider(name="readDataFromExcel")
public  Object[][] login() throws Throwable
{
  FileInputStream	fis=new FileInputStream(IpathConstant.Excelpath);
   Workbook wb = WorkbookFactory.create(fis);
   Sheet sh = wb.getSheet("testngdata");
   int rowcount = sh.getLastRowNum()+1;
   short cellcount = sh.getRow(0).getLastCellNum();
   Object [][] obj=new Object[rowcount][cellcount];
   for(int i=0;i<rowcount;i++) {
	   for(int j=0;j<cellcount;j++)
	   {
		   obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
	   }
   }
   return obj;
	}
	/*Object [][] obj=new Object [2][2];
	obj[0][0]="210001";
	obj[0][1]="admin";
	
	obj[1][0]="210001";
	obj[1][1]="password";
	 return obj;*/
	
	
	}
/*@Test(dataProvider="data")
public void getdata(String org,String loc) {
	System.out.println("organisation is "+org+"location is"+loc);
}*/

