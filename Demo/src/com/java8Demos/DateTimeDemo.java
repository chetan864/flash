package com.java8Demos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate ld = LocalDate.of(1987, Month.OCTOBER, 8);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now(ZoneId.of("Asia/Hebron"));
		
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.of(1980, 1, 10, 22, 30);
		System.out.println(ldt);
		
		for (String s: ZoneId.getAvailableZoneIds()) {
			//System.out.println(s);
		}
		
		Instant i = Instant.now();
		System.out.println(i);
		
	}

}
