package com.sist.generics;

import java.util.ArrayList;

public class MainClass_Generics_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		ArrayList<Double> list3=new ArrayList<Double>(); //데이터형 변경 => Wrapper
		ArrayList<?> list4=new ArrayList<Integer>();//매개변수 => 모든 데이터형이 저장 가능
		list4=new ArrayList<Double>();
		//프로그램에 맞게 조절이 가능 (데이터형)
	}

}
