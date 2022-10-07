package com.day2.session1.ex8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class JavaNewDateTimeApi {
	
	public static void main(String[] args) {
		//Sat Jan 12 00:00:00 IST 3901
		//Date date=new Date(120, 0, 12);
		//Date date=new Date(2000, 12, 0)
		
		//java 8 date and time api
		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
		
//		LocalDate date=LocalDate.of(2022, Month.APRIL, 11);
//		System.out.println(date);
//		
//		System.out.println(date.getDayOfMonth());
//		System.out.println(date.getMonthValue());
//		System.out.println(date.getDayOfYear());
//		System.out.println(date.getYear());
		
		//i want to parse a string to date "11/12/2011"
		//2022-10-07  yyyy-MM-dd
		//String dateString="2022-10-09";
//		String dateString="11/12/2011";
//		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate date=LocalDate.parse(dateString, dateTimeFormatter);
//		System.out.println(date);
		
		//diff bw 2 dates
//		LocalDate d1=LocalDate.now();
//		LocalDate d2=LocalDate.of(1975, 11, 11);
//		
//		long diff=ChronoUnit.DAYS.between(d2, d1);
//		System.out.println(diff);
		
		LocalDate d1=LocalDate.now();
		LocalDate d2=d1.plus(1, ChronoUnit.DAYS);
		System.out.println(d2);
	}

}















