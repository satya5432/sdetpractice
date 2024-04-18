package datadrivertesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class verifyclientTest {
     public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata2.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rcount = sh.getLastRowNum();
		int ccount=sh.getRow(0).getLastCellNum();
		System.out.println(rcount);
		for(int i=0;i<rcount;i++) {
			for(int j=0;j<ccount;j++) {
			
				 String value = sh.getRow(i).getCell(j).getStringCellValue();
				if(value.equals("client")) {
					break;
					}
				
				}
				}
			
		}
	}
    

