package com.sist.wrapper;

import java.util.Scanner;

public class MainClass_Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 두개 입력 : ");
		String num1=sc.next();
		String num2=sc.next();
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));

	}

}
