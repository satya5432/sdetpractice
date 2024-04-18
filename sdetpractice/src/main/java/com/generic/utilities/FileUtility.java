package com.generic.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileUtility {
public String readfiledata(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(IpathConstant.filepath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
	
	
}
public void writedataintofile(String key,String value) throws Throwable {
	FileInputStream fis=new FileInputStream(IpathConstant.filepath);
	Properties pobj=new Properties();
	pobj.setProperty(key,value);
	FileOutputStream fos=new FileOutputStream(IpathConstant.filepath);
	pobj.store(fos, value);
	
}
}
