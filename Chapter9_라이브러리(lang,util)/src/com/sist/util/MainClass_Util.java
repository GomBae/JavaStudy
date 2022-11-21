package com.sist.util;

import java.util.Arrays;
import java.util.Random;

/*
 * 자주 사용되는 클래스
 * 1. Random
 * 2. Scanner
 * 3. StringTokenizer
 * 4. Date
 * 5. Calendar
 * -----------------------
 * 6. List
 * 7. Set
 * 8. Map
 * 
 */
public class MainClass_Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random클래스 생성
		Random r=new Random();
//		int i=r.nextInt(31)+1;//1~31까지 발생
//		System.out.println(i);
		int[] reserve=new int[r.nextInt(10)+11];//11~20
		for(int i=0;i<reserve.length;i++) {
			reserve[i]=r.nextInt(31)+1;
		}
		
		Arrays.sort(reserve);
		System.out.println("===== 예약이 가능한 날 =====");
		for(int i:reserve) {
			if(i>=21) {
				System.out.print(i+" ");
			}
		}

	}

}
