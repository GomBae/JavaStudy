package com.sist.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date : 시스템의 현재 날짜/시간을 읽어온다 ==> 오라클 데이터형과 연결 (DATE)
 * Date클래스의 단점 : 기능이 빈약하다 => 보완 (Calendar) => Date는 날짜 저장용으로 사용이 많다
 */
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
		
		/*
		 *  Format => 변환
		 *  ---------------
		 *  년도 : yyyy(대소문자 구분)
		 *  월 : MM, M ==> MM(01, 02, 03 ... 09)  M(1,2,3,4 ... ) 
		 *  일 : dd, d
		 *  ----------------- 실제 날짜를 계산 (dd, MM 사용금지)
		 *  시간 : hh, h
		 *  분 : mm, m
		 *  초 : ss ,s
		 *  
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		while(true) {
			Date date=new Date();//SimpleDateFormat
			String today=sdf.format(date);
			System.out.println(today);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
		

	}

}
