package com.sist.main;
/*
 * 열거형 (데이터를 모아서 관리)
 * => 상수를 사용하기 쉽게 만든느 프로그램 (데이터를 모아서 => 1개의 이름으로 제어)
 * 사용법
 * enum 열거형명 {상수명, 상수명 ...}
 * 
 */

import java.util.Scanner;

enum 과일명{
	사과("apple"),
	아보카도("avocado"),
	바나나("banana"),
	블랙베리("blackberry"),
	블루베리("blueberry"),
	포도("grape"),
	오렌지("orange");
	private String en;
	과일명(String en){
		this.en=en;
	}
	public String getEn() {
		return en;
	}
}
public class MainClass_열거형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("과일명 입력:");
		String f=sc.next();
		for(과일명 n:과일명.values()) {
			if(n.name().equals(f)) {
				System.out.println(f+"의 영어명은 "+n.getEn());
				break;
			}
		}

	}

}
