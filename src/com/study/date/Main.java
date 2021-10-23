package com.study.date;

import java.time.Instant;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		String rollback = "2020-11-10T05:05:25Z";
		Date date = new Date( Instant.parse( rollback ).toEpochMilli() );
		
		System.out.println(Instant.parse( rollback ).toEpochMilli());
		System.out.println(date);
	}

}
