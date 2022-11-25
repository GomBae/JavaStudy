package com.sist.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

/*
 * Iterator / ListIterator
 * -----------------------> 단방향(데이터를 읽을때 처음~끝), 양방향 (처음-끝, 끝-처음)
 * = 컬렉션에 저장되어있는 데이터에 접근
 * = 표준화 (ArrayList, Vector, LinkedList, HashSet, HashMap)
 * Iterator의 주요 메소드
 * -------------------- hasNext(), next(), remove()
 *                      ------------ 데이터가 있는 경우 true,false => while루프 사용시 사용
 * ListIterator의 주요 메소드
 * -------------------- hasNext(), mext(), remove(), hasPrevious()
 *                   1 2 3 4 5                         1 2 3 4 5
 *                   ->                                       <-
 */
public class MainClass_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("바나나");
		list.add("귤");
		System.out.println("========= 일반 ==========");
		for(String f:list) {
			System.out.println(f+" ");
		}
		System.out.println("======== Iterator ==========");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" "); // next()=> 실제 해당에서 데이터를 읽어온다
		}
		System.out.println("\n===== Vector =====");
		Vector<String> vec=new Vector<String>();
		vec.add("홍길동");
		vec.add("sim");
		vec.add("park");
		vec.add("lee");
		vec.add("kang");
		Iterator<String> it2=vec.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
