package com.sist.exception;

import java.util.Scanner;
//catch의 멀티블록
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("첫번째 정수 입력 : ");
			String num1=sc.next();
			System.out.print("두번째 정수 입력 : ");
			String num2=sc.next();
			
			//오류 예상 ==> 정수변환 과정에서 오류
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2); //NumberFormatException
			
			//오류 예상 ==> 나누기 과정에서
			int n3=n1/n2;
			System.out.println("결과값 : "+n3);
			sc.close();
		}catch(NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
			if(e instanceof NumberFormatException)
				System.out.println("문자열이 입력되었다\n정수입력하세요");
			else if(e instanceof ArithmeticException)
				System.out.println("0으로 나눌 수 없다");
		}
		System.out.println("프로그램 종료");
		
		
	}

}
