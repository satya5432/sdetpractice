package datadrivertesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writedatain_excelTest {

	public static void main(String[] args) throws Throwable   {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata.xlsx");
	       Workbook wb = WorkbookFactory.create(fis);
	      Sheet sht = wb.getSheet("test");
	     sht.getRow(3).getCell(1).setCellValue("varanasi");
	    // sht.createRow(5).createCell(1).removeCellComment();
	     FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\testdata.xlsx");
	     wb.write(fos);
	     wb.close();
	     
	}

}
