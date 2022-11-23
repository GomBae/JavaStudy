package com.sist.collection;

import java.util.ArrayList;

/*
 * ArrayList
 * ---------
 *Interface List extends Collection
 *class ArrayList implements List
 *     ----------- 구현된 클래스가 만들어져 있다
 *             Collection : add(), get(), set(), size(), remove()
 *                |
 *              List
 *                |
 *   ------------------------------
 *   |            |               |
 *  ArrayList   Vector          LinkedList
 *  ------------------------------------
 *  공통점 
 *    1) 순서가 존재한다(인덱스 번호) => 자동으로 생성 (항상 순차적으로 유지)
 *                   --------- 0번부터
 *    2) 중복된 데이터 허용
 *    3) List(인터페이스)를 구현하기 때문에 모든 메소드가 동일
 *  차이점
 *    1) 저장방법 (ArrayList / Vector) ==> 비동기화 / 동기화 => Vector를 보완한 클래스 ArrayList
 *    2) 저장할때 인덱스번호 조절 (ArrayList) => 빈번하게 수정, 추가가 많은 경우에는 LinkedList
 *    ====> 사용자는 데이터베이스에 많은 데이터를 저장 => 브라우저에서 출력
 *    
 *    Movie ==> 영화 한개에 대한 모든 정보
 *          ==> 메모리를 다르게 저장(new)
 *          ==> 여러개를 만들때 ( 배열, List )
 */
public class MainClass_ArrayList_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add('A');
		list2.add('B');
		list2.add('C');
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		//중복된 데이터만 남겨놓고 나머지는 제거 : retainAll()
		list1.retainAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		//중복된것만 가져오기
		list1.containsAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		//add, size, get, remove, set, retainAll, containsAll, subList, addAll
		/*
		 * add() => 데이터를 추가
		 * size() => 저장된 갯수
		 * get() => 저장된 데이터 읽기
		 * remove() => tkrwp
		 * set() => 수정
		 * containsAll() => 두개의 ArrayList에서 중복된 데이터 모으기
		 * retainAll() => 두개의 ArrayList에서 중복된 데이터만 남기기
		 * addAll() => 전체 데이트를 복사할 경우
		 * subList() => 부분적으로 데이터를 복사할 때 사용
		 * clear() => 전체삭제
		 */

	}

}
