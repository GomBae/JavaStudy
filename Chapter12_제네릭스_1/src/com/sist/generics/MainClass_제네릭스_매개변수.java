package com.sist.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainClass_제네릭스_매개변수 {

	public static void display1(ArrayList<String> list) {
		for(String f:list)
			System.out.println(f);
	}
	public static void display2(ArrayList<Integer> list) {
		for(int f:list)
			System.out.println(f);
	}
	public static void display3(ArrayList<Double> list) {
		for(double f:list)
			System.out.println(f);
	}
	public static void display4(ArrayList<?> list) {
		for(Object obj:list)
			System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("사과");
		list1.add("배");
		list1.add("버네나");
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		ArrayList<Double> list3=new ArrayList<Double>();
		list3.add(10.1);
		list3.add(20.2);
		list3.add(30.3);
		
		System.out.println("=== 와일드 카드 사용 ===");
		display4(list1);
		display4(list2);
		display4(list3);
	}

}
