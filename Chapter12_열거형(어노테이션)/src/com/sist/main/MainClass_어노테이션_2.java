package com.sist.main;

import java.lang.reflect.Method;
import java.util.Scanner;

class Board2{
	
	@RequestMapping("write.do")
	public void write() {//write.do
		System.out.println("글쓰기 처리");
	}
	@RequestMapping("list.do")
	public void list() {//list.do
		System.out.println("게시물 목록");
	}
	@RequestMapping("update.do")
	public void update() {
		System.out.println("게시물 수정");
	}
	@RequestMapping("delete.do")
	public void delete() {
		System.out.println("게시물 삭제");
	}
	@RequestMapping("find.do")
	public void find() {
		System.out.println("게시물 찾기");
	}
	@RequestMapping("detail.do")
	public void detail() {
		System.out.println("게시물 자세히보기");
	}
}
public class MainClass_어노테이션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("기능 요청 : ");
		String cmd=sc.next();
		try {
			Class clsName=Class.forName("com.sist.main.Board2");
			//클래스 정보 읽기
			//메모리 할당
			Object obj=clsName.getDeclaredConstructor().newInstance();
			//클래스안에 선언된 모든 메소드 읽기
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods) {
				RequestMapping rm=m.getAnnotation(RequestMapping.class);
				//Method위에 있는 메소드 찾기
				if(rm.value().equals(cmd)) {
					m.invoke(obj, null);//메소드 호출
					//detail() ==> null 매개변수 없는 경우 호출
					break;
				}
			}
		}catch(Exception e) {}

	}

}
