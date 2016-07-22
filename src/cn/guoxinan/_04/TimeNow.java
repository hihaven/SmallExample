package cn.guoxinan._04;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeNow {
	public static Date date;
	public static TimeNow timenow;
	static{
		date=new Date()//(TimeZone.getDefault(),Locale.CHINA)
				;
		timenow=new TimeNow();
		
	}
	public static TimeNow get(){
		return timenow;
	}
}
