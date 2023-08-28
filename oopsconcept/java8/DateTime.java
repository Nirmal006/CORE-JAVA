package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Current Date :"+today);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time :"+time);
		
		LocalDateTime today1 = LocalDateTime.now();
		System.out.println("Current DateTime :"+today1);
		
		
	}

}
