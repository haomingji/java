package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static   String getTime(){
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=sdf.format(d);
		return time;
		
	}
	
	public static   String getDate(){
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd ");
		String time=sdf.format(d);
		return time;
		
	}
	
	@SuppressWarnings("static-access")
	public static String getsetDate(String date,int n){
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date datetime = null;
			try {
				datetime = sdf.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
    //Date date = new Date();//取时间 
    Calendar calendar  =   Calendar.getInstance();
    calendar.setTime(datetime); //需要将date数据转移到Calender对象中操作
    calendar.add(calendar.DATE, n);//把日期往后增加n天.正数往后推,负数往前移动 
    datetime=calendar.getTime();   //这个时间就是日期往后推一天的结果
   String time=sdf.format(datetime);
	return time;
	}
	public static void main(String[] args) {
		String t=DateUtil.getsetDate("2017-07-29",3);
		System.out.println(t);
		
	}

}
