package com.sist.generics;

import java.util.ArrayList;

class A{
	
}
class B extends A{
	
}
class C extends A{
	
}
class D extends C{
	
}
class E{
	
}
/*
 * 일반 데이터형은 통일시에 => 배열
 * 일반 클래스 통일시에 주로 인터페이스(여러개 묶어서 관리)
 */
public class MainClass_제네릭스_제한 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<? extends A> list=new ArrayList<A>();//A로 상속받은 자식클래스까지 사용이 가능
		ArrayList<? extends A> list1=new ArrayList<B>();
		ArrayList<? extends A> list2=new ArrayList<C>();
		ArrayList<? extends A> list3=new ArrayList<D>();
//		ArrayList<? extends A> list4=new ArrayList<E>();

	}

}
