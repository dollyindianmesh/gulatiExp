package com.gulati.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatting {
	 
	public static Date getDateObjFromString(String mStrDate) {
   	  SimpleDateFormat origFormat = new SimpleDateFormat("yyyy-MM-dd");
   	  Date origDate = new Date();
   	  try {
   	   origDate = origFormat.parse(mStrDate);
   	   
   	   //SimpleDateFormat newFormat = new SimpleDateFormat("dd MMM yy");
   	  // return newFormat.format(origDate);
   	return origDate;
   	  } catch (java.text.ParseException e) {

   	   e.printStackTrace();
   	  }
   	  return null;
   	 }

	public static Date getTimeObjFromString(String mStrDate) {
		SimpleDateFormat origFormat = new SimpleDateFormat("HH:mm:ss");
		Date origDate = new Date();
		try {
			origDate = origFormat.parse(mStrDate);

			//SimpleDateFormat newFormat = new SimpleDateFormat("dd MMM yy");
			// return newFormat.format(origDate);
			return origDate;
		} catch (java.text.ParseException e) {

			e.printStackTrace();
		}
		return null;
	}
	
	public static String getFormatedDateTimeFromString(String mStrDate) {
	   	  SimpleDateFormat origFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   	  Date origDate = new Date();
	   	  try {
	   	   origDate = origFormat.parse(mStrDate);
	   	   return origDate.toString();
	   	   
	   	  } catch (java.text.ParseException e) {

	   	   e.printStackTrace();
	   	  }
	   	  return null;
	   	 }
	
	public static String getCurrentDate() {
		Calendar cal = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(cal.getTime()); // 2015-10-26

		return currentDate;
	}

	public static String getCurrentTime() {
		Calendar cal = GregorianCalendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String currentTime = sdf.format(cal.getTime()); // 2015-10-26

		return currentTime;
	}

	public static String AddNDaysInCurrentDate(int n) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.add(Calendar.DATE, n);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String newDate = sdf.format(cal.getTime()); // 2015-10-26
// if n = 3 curdate: 06-09-16 +3 is equals 10-09-16
		return newDate;
	}

	public static String AddNHourInCurrentTime(int nHour) {
		Calendar cal = GregorianCalendar.getInstance();
		cal.add(Calendar.HOUR, nHour);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String addedTime = sdf.format(cal.getTime()); // 2015-10-26
// if n = 3 curdate: 06-09-16 +3 is equals 10-09-16
		return addedTime;
	}

}
