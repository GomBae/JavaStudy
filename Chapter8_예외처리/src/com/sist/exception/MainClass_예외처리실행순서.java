package com.sist.exception;

public class MainClass_예외처리실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(10/0);
			System.out.println(5); //에러 밑의 문장은 실행불가
			
		}catch(RuntimeException e) {
			System.out.println(6);
		}finally {
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
	}

}
