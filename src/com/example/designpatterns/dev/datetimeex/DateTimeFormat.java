package com.dev.datetimeex;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeFormat {

	public static void main(String[] args) {

		String currentInstant = Instant.now().atOffset(ZoneOffset.UTC).toString();
		String currentInstant1 = Instant.now().minusMillis(10).toString();
		
		System.out.println(currentInstant);
		System.out.println(currentInstant1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		//String dateTime = formatter.format(currentInstant);
		//System.out.println(dateTime);

	}

}
