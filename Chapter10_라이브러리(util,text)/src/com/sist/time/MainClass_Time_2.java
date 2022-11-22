package com.sist.time;

import java.time.LocalDate;
import java.util.Scanner;

//비교 => compareTo() => 같으면 0, 이전이면 음수 , 이후면 양수
//isAfter, isBefore isEqual
public class MainClass_Time_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("년 월 일 입력 (2022 11 22): ");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(year, month, day);
//		int result=date2.compareTo(date1);
//		
//		if(result==0) {
//			System.out.println("마감일입니다");
//		}else if(result<0)
//			System.out.println("이벤트 기간입니다");
//		else if(result>0)
//			System.out.println("기간이 지났습니다");
		if(date2.isAfter(date1))
			System.out.println("기간이 지났다");
		else if(date2.isBefore(date1))
			System.out.println(date1+"까지 이벤트 기간입니다.");
		else if(date2.isEqual(date1))
			System.out.println("마감일 입니다.");

	}

}
