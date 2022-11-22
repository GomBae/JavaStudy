package com.sist.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * Date, Calendar 에서 처리가 안되는 기능 => 보완
 * 
 * 오라클 -> 날짜 저장 => Date
 * MySQL => 날짜저장 => LocalDateTime
 * 
 * LocalDate
 * LocalTime
 * +
 * LocalDateTime
 */
public class MainClass_Time_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		date=LocalDate.of(2022, 12, 1);//날짜설정 ==> 생년월이르 예약일 등록....
		System.out.println(date);
		time=LocalTime.of(15, 30, 45);
		System.out.println(time);

	}

}
