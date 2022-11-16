package com.sist.model;

import java.util.Scanner;

public class MainClass {

	public static int menu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("=================== Menu ====================");
		System.out.println("1. HOME");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화");
		System.out.println("4. 공지사항");
		System.out.println("5. 게시판");
		System.out.println("6. 종료");
		System.out.println("=============================================");
		System.out.print("메뉴 선택 : ");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Move mm=null;
		while(true) {
			int m=menu();
			switch(m) {
			case 1://HOME이동
				mm=new Home();
				mm.move();
				break;
			case 2://회원가입
				mm=new Join();
				mm.move();
				break;
			case 3://영화
				mm=new Movie();
				mm.move();
				break;
			case 4: //공지사항
				mm=new Notice();
				mm.move();
				break;
			case 5://게시판
				mm=new Board();
				mm.move();
				break;
			case 6:
				System.out.println("사이트를 종료합니다.");
				System.exit(0);
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
		
	}

}
