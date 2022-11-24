package com.sist.collection;

import java.util.HashSet;
import java.util.Set;

/*
 *  Collection
 *      |
 *     Set
 *   --------- interface (오버라이딩 가능)
 *      |
 *  -------------------------------
 *  |                             |
 *  HashSet                     TreeSet
 *  ------------------------------------------
 *  특징) 순서가 없다, 데이터 중복을 허용하지않는다
 *       중복없는 데이터를 처리 (접속자 정보, 장르 읽기 .. )
 *       주요메소드)
 *         HashSet
 *            = add()
 *            = remove()
 *            = clear()
 *            = isEmpty()
 *            = retainAll() => 같은것만 가져오기
 *            = iterator() : 데이터를 모아서 한번에 관리
 *            ---------------- List, Set, Properties, Map
 *      TreeList : 검색용으로 주로 사용
 *         = headSet
 *         = tailSet
 *      
 */

class Person implements Cloneable{
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
//		System.out.println(this);
	}
//	// ==> toString() ==> 객체의 메모리 주소
	public String toString() {
		return name+":"+age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass_Set {

	//객체를 저장했을 경우에는 객체의 주소로 중복을 판별한다.
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("ABC");
		set.add("ABC");
		Person p1=new Person("홍길동",20);
		Person p2=new Person("홍길동",20);
		Person p3=p1;//같은 메모리
		Person p4=(Person)p1.clone();//새로운 메모리(p1이 가지고있는 데이터를 그대로 복사)
//		System.out.println(p1);
//		System.out.println(p2);
		set.add(p1);
		set.add(p2);
		set.add(p3);// p1==p3
		set.add(p4);
		System.out.println(set);

	}

}
