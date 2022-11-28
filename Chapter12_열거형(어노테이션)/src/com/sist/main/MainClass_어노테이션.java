package com.sist.main;

import java.util.Scanner;

/*
 * 어노테이션 => 구분(인덱스 ==> if대신 사용) @어노테이션명 => 이미 지정된 라이브러리, 사용자 정의
 * @ => 클래스 구분 (TYPE)
 *   => 스프링 : @Controller, @RestController, @Repository, @Service, @Component
 *             --------------- 메모리할당
 * public class A
 * {
 *    @ => 멤버변수 구분 (FIELD)
 *    private B b;
 *    
 *    @ => 생성자 구분(CONSTRUCTOR)
 *    public A(){}
 *    
 *    @ => 메소드구분 (METHOD)
 *    public void display(@ => 매개변수 구분 (PARAMETER) B b){}
 *    
 * }
 */
class Board{
	public void write() {//write.do
		System.out.println("글쓰기 처리");
	}
	public void list() {//update.do
		System.out.println("게시물 목록");
	}
	public void update() {
		System.out.println("게시물 수정");
	}
	public void delete() {
		System.out.println("게시물 삭제");
	}
	public void find() {
		System.out.println("게시물 찾기");
	}
	public void detail() {
		System.out.println("게시물 자세히보기");
	}
}
public class MainClass_어노테이션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("기능 요청 : ");
		String cmd=sc.next();
		
		Board board=new Board();
		if(cmd.equals("write.do"))
			board.write();
		else if(cmd.equals("list.do"))
			board.list();
		else if(cmd.equals("update.do"))
			board.update();
		else if(cmd.equals("delete.do"))
			board.delete();
		else if(cmd.equals("find.do"))
			board.find();
		else if(cmd.equals("detail.do"))
			board.detail();

	}

}
