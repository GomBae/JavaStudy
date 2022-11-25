package com.sist.collection;

import java.util.ArrayList;
import java.util.Collections;

// 정수 저장
public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(7);
		list.add(4);
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(1); //==> 인덱스번호는 add하는 순서로 지정된다
		
		for(Object i:list) {//데이터형 일치 (혹은 더 커야한다)
			System.out.println(i);
		}
		System.out.println("============ 정렬 ==============");
		Collections.sort(list);
		for(Object i:list) {//데이터형 일치 (혹은 더 커야한다)
			System.out.println(i);
		}
		System.out.println("========= copy ===============");
		ArrayList list2=new ArrayList(list.subList(1, 5));// 5-1 까지 가져온다
		//배열 카피 ==> arraycopy(), clone()
		for(Object i:list2) {//데이터형 일치 (혹은 더 커야한다)
			System.out.println(i);
		}
		//원하는 부분만 copy => subList ==> 페이지 나누기

	}

}
