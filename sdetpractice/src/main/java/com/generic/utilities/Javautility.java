package com.generic.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Javautility {
public int getrandomNo() {
	Random rd=new Random();
	int random=rd.nextInt(500);
	return random;
}
  public String getsystemdate() {
	  Date dt=new Date();
	  String date=dt.toString();
	  return date;
  }
   public String getsystemdateinFormat() {
	   SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
		   Date dt=new Date();
		   String sysdateformat=dateformat.format(dt);
		   return sysdateformat;
	   
   }
}
