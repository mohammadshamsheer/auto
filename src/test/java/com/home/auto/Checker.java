package com.home.auto;

import java.util.HashMap;

public class Checker {

	public static void main(String[] args) {
		
		
		String date = "15-07-2023";
		String[] dates = date.split("-");
		
		String day = dates[0];
		String month = dates[1];
		String year = dates[2];
		
		if(month.startsWith("0"))
			month = month.replace("0","");
		
		int monthi = Integer.parseInt(month);
		System.out.println(monthi);
		
		
		HashMap<Integer,String> months = new HashMap<Integer,String>();
		months.put(1,"January");
		months.put(7,"July");
		months.put(8,"August");
		months.put(9,"September");
		
		System.out.println(months.get(monthi));
		
		//System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//System.out.println(cal.getDisplayName(cal.MONTH, Calendar.LONG, Locale.getDefault()));
		//System.out.println(cal.get(Calendar.MONTH)+1);
	}

}
