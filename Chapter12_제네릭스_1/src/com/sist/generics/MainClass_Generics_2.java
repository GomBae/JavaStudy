package com.sist.generics;
class Box<T>{
	T item;

	//Box<String> ==> T가 String으로 변경
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}
public class MainClass_Generics_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box(); // T=> Object
		box.setItem("aaa");
		String s=(String)box.getItem();
		Box<String> box1=new Box<String>();
		box1.setItem("");
		s=box1.getItem();//형변환이 필요없다
		Box<Integer> box2=new Box<Integer>();
		box2.setItem(1);
		int i=box2.getItem();//Integer를 기본형으로 받으면 언박싱
		// Integer i=100;(박싱) int ii=i;(언박싱)
		/*
		 * 
		 * Wrapper
		 * 클래스형 = 기본형데이터 : 박싱
		 * 기본형 = 클래스형 : 언박싱
		 * ----------------------- 호환
		 * Integer
		 * int = Integer
		 * Integer = int
		 */
		Integer ii=100;
		int aa= ii;

	}

}
