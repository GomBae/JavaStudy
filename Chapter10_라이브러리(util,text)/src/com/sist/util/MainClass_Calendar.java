package com.sist.util;

import java.util.Calendar;

/*
 * Calendar : Date를 보완해서 새로운 클래스 제작
 * ----------------------- 싱글톤패턴
 * 1) 생성
 *    Calendar cal=Calendar.getInstance(); => Date date=new Date();
 *    ----------------------------------- (new 생성자를 이용하지 않는다 -> 추상클래스 or 인터페이스)
 *    Calendar는 추상클래스로 되어있다. (필요한 경우 오버라이딩)
 * 2) 날짜 설정
 *    set()
 * 3) 날짜 읽기
 *    get()
 * 4) 각 달의 마지막 날짜
 *    getActualMaximum()
 * 5) 요일 읽기
 *    get()
 */
public class MainClass_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today=Calendar.getInstance();
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월 : "+(today.get(Calendar.MONTH)+1));//0부터 시작한다
		System.out.println("일 : "+today.get(Calendar.DATE));
		String[] strWeek={"","일","월","화","수","목","금","토"}; //week => 1번부터 시작
		System.out.println("요일 : "+strWeek[today.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("시간 : "+today.get(Calendar.HOUR));
		System.out.println("분 : "+today.get(Calendar.MINUTE));
		System.out.println("초 : "+today.get(Calendar.SECOND));
		System.out.println("마지막날 : "+today.getActualMaximum(Calendar.DATE));

	}

}
