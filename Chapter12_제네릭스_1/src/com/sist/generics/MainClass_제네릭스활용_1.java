package com.sist.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

/*
 * 컬렉션에 데이터를 저장 => 같은 데이터형을 저장해야 제어가 편함 (제네릭스) => 한개의 데이터형만 저장
 *                     ----------- 배열형식으로 저장(데이터형 통일)
 *    Collection : 인터페이스 (1. 독립적으로 사용 가능, 2. 표준화, 3.필요시 오버라이딩)
 */
public class MainClass_제네릭스활용_1 {

	public static void main(String[] args) {
		System.out.println("========== ArrayList 제네릭스 사용 ===========");
		ArrayList<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		for(String f:list) {
			System.out.println(f);
		}
		
		System.out.println("=== set ===");
		HashSet<Integer> set=new HashSet<Integer>();
		//int만 저장할 수 있게 변경
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(300);
		set.add(300);
		
		for(int i:set) {
			System.out.println(i);
		}
		
		System.out.println("=== vector ===");
		Vector<Double> vec=new Vector<Double>();
		vec.add(99.8);
		vec.add(10.3);
		
		
	}
}
