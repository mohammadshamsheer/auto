package com.home.webutil;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CalenderUtil {
	
	public static String getSystemDateTimeFormatted(String format) {
		LocalDate date = LocalDate.now();
		SimpleDateFormat formatter = new SimpleDateFormat(format);		
		return formatter.format(date);		
	}
	

}
