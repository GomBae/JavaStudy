package com.sist.collection;

import java.util.LinkedList;

/*
 *                읽기    추가 / 수정      사용처
 *   ArrayList   빠르다     느리다      출력, 데이터수집
 *   LinkedList  느리다     빠르다    수정/삭제가 많은경우
 *   
 */
public class MainClass_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println("========= 수정 =============");
		list.set(1, 20);
		System.out.println(list);
		System.out.println("======== delete ========");
		list.remove(3);
		System.out.println(list);
		System.out.println("====== removeAll =====");
		list.clear();
		if(list.isEmpty())
			System.out.println("is Empty");
		

	}

}
