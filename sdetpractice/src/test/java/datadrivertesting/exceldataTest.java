package datadrivertesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldataTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
       Sheet sh = wb.getSheet("test");
       int rowcount = sh.getLastRowNum();
       int cellcount = sh.getRow(0).getLastCellNum();
       System.out.println(rowcount);
       System.out.println(cellcount);
       for(int i=0;i<rowcount;i++) {
    	   for(int j=0;j<cellcount;j++) {
    		   String value = sh.getRow(i).getCell(j).getStringCellValue();
    		   System.out.print(value+" ");
    	   }
    	   System.out.println(" ");
       }
      wb.close();
       
	}

}
