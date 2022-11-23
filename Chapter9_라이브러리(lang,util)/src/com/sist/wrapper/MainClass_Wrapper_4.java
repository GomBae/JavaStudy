package com.sist.wrapper;

public class MainClass_Wrapper_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d=10.5; //박싱 (클래스에 기본형 데이터값 대입) => 클래스에는 메모리 주소값이 대입
		double d1=d; //언박싱 //기본형에는 클래스값 대입
		//Double double을 혼합해서 사용 가능
		System.out.println("d="+d);
		System.out.println("d1="+d1);
		String s="100.67";
		double d2 = Double.parseDouble(s);
		System.out.println(d2);
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);
		System.out.println("b="+b);

	}

}
