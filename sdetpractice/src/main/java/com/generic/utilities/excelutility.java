package com.generic.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelutility {
  /**
   * @author Satya
   * @param Sheetname
   * @param rowno
   * @param cellno
   * @return
   * @throws Throwable
   */

    public String readEcelData(String sheetname,int rowno,int cellno) throws Throwable {
    	FileInputStream fis=new FileInputStream(IpathConstant.Excelpath);
    	Workbook wb = WorkbookFactory.create(fis);
    	String value = wb.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
    	wb.close();
    	return value;
    		
    	}	
    	/** this methos is used to write data in ecel sheet
    	 * @author satya
    	 * @param Sheetname
    	 * @param rowno
    	 * @param cellno
    	 * @param data
    	 * @throws Throwable
    	 */
   public void writeexceldata(String Sheetname,int rowno,int cellno,String data) throws Throwable {
	   
	   FileInputStream fis=new FileInputStream(IpathConstant.Excelpath);
   	Workbook wb = WorkbookFactory.create(fis);
   	 wb.getSheet(Sheetname).getRow(rowno).getCell(cellno).setCellValue(data);
   	 FileOutputStream fos=new FileOutputStream(IpathConstant.Excelpath);
   	 wb.write(fos);
   	 wb.close();
   	 
   }
   public int gettotalrowcount(String Sheetname) throws Throwable {
	  
	   FileInputStream fis=new FileInputStream(IpathConstant.Excelpath);
	   	Workbook wb = WorkbookFactory.create(fis);
	  Sheet sh=wb.getSheet(Sheetname);
	 int rowcount = sh.getLastRowNum();
	 return rowcount;
	   	
   }
   public HashMap<String,String> readmultipledata(String Sheetname,int cellno) throws Throwable{
	   
	   FileInputStream fis=new FileInputStream(IpathConstant.Excelpath);
	   	Workbook wb = WorkbookFactory.create(fis);
	   	Sheet sh=wb.getSheet(Sheetname);
	   	int rowcount=sh.getLastRowNum();
	   	HashMap<String,String> map=new HashMap<String,String>();
	   	for(int i=0;i<rowcount;i++) {
	   		String key = sh.getRow(i).getCell(cellno).getStringCellValue();
	   		String value = sh.getRow(i).getCell(cellno+1).getStringCellValue();
	   		map.put(key, value);
	   	}
	   	return map;
	   
	   
	   
	   
	   
   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   
}
