package com.sist.main;

import java.util.Scanner;

enum 전화국번{
	서울특별시("02"),
	경기도("031"),
	인천광역시("032"),
	강원도("033"),
	충청남도("041"),
	대전광역시("042"),
	충청북도("043"),
	세종("044"),
	부산광역시("051"),
	울산광역시("052"),
	대구광역시("053"),
	경상북도("054");
	
	private String code;
	전화국번(String code) {
		this.code=code;
	}
	public String getCode() {
		return code;
	}

	
}
public class MainClass_열거형_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("입력 :");
		String loc=sc.next();
		
		for(전화국번 n:전화국번.values()) {
			if(n.name().contains(loc)) {
				System.out.println(loc+" 국번 : "+n.getCode());
			}
		}

	}

}
