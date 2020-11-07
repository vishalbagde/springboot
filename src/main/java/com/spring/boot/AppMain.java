package com.spring.boot;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class AppMain {
	public static void main(String[] args){
		
		String dateString = String.format("%d-%d-%d",2020,9,10);
		try
		{
			Date date=new SimpleDateFormat("yyyy-M-d").parse(dateString);
			String dayofweek=new SimpleDateFormat("EEEE",Locale.ENGLISH).format(date);
			System.out.println(dayofweek);
			dayofweek.toLowerCase();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
	}

}
