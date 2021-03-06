package com.ds.common.util;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtilTest {
	public static void main(String[] args){
		System.out.println(DateUtil.parse(DateUtil.YY_MM_DD_HH_MM, "2017-01-02 15:00"));
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		System.out.println(year);
		
		System.out.println(DateUtil.getFormatedDateString(8));
		
		/*Calendar calendar = Calendar.getInstance(Locale.CHINA);
        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(date);
        System.out.println(dateString);*/
        
        
        /*java.util.Locale locale=java.util.Locale.CHINA;
        String pattern = "yyyy-MM-dd kk:mm:ss zZ";
        java.text.SimpleDateFormat df = new java.text.SimpleDateFormat(pattern,locale);
        java.util.Date date = new java.util.Date();
        String bjTime = df.format(date);
        System.out.println("北京时间:"+bjTime);*/
        
        Date date = new Date();  
        System.out.println(date);  
        date = DateUtil.changeTimeZone(date, TimeZone.getTimeZone("Asia/Shanghai"), TimeZone.getTimeZone("GMT"));  
        System.out.println(date);  
        
        
        String sdate = "2017-02-15 15:40:20";
        
               
        System.out.println(date.getTime());
	}
}
