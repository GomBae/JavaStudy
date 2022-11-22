package com.sist.main;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1. 데이터 저장
 *    *** 한개 저장 : 변수
 *        = 변수 종류
 *          1) 지역변수 (메소드안에서만 사용하는 변수, 매개변수) => 자동으로 사라짐
 *          2) 멤버변수 (인스턴스 변수)
 *          3) 공유변수 (클래스변수 : static) => static 메모리공간이 1개만 생긴다
 *    같은 저장 : 배열 => 1차 배열
 *    *** 다른 여러개 : 클래스
 *          => 클래스
 *             1) 구성 요소
 *                --------------------------------------
 *                 변수 : 클래스안에서 프로그램 종료시까지 사용되는 변수
 *                 예) 예매
 *                    영화명(String)
 *                    극장명(String)
 *                    예매일(Date)
 *                    시간(String)
 *                    인원(int)
 *                    금액(int)
 *                    ----------------- id, 예매번호
 *                --------------------------------------
 *                 기능 (메소드)
 *                       예) 영화 선택
 *                          극장 선택
 *                          날짜 선택
 *                          시간 선택
 *                          인원 선택
 *                          예매요청
 *                ------------------------
 *                 변수에 초기화 : 생성자 (id => id읽기, 예매번호 => 자동처리) => 컴포넌트
 *                --------------------------------------
 *                컴포넌트(클래스 => 한개의 전체기능을 가지고 있다) ==> 조립형 프로그램
 *                ==> 객체지향의 특성을 첨부
 *                    캡슐화 : 데이터 보호 => 데이터 은닉화
 *                           ---------   -----------
 *                           private      getter/setter
 *                    상속/포함 : 재사용(소스 중복 제거)
 *                    다형성 : 재사용 필요시에 언제든지 수정, 기능추가 (오버라이딩, 오버로딩)
 *                    
 *                ==> 클래스의 종류
 *                    = 추상 클래스
 *                    ***= 인터페이스 : 독립적으로 사용이 가능, 서로 다른 클래스를 연결해서 사용
 *                         결합성이 낮은 프로그램이 가능
 *                         ---- 클래스의 영향
 *                         응집성
 *                         ---- 메소드관련 (한가지 기능) ==> 재사용 가능
 *                    = 내부 클래스 (쓰레드, 윈도우에서 주로 사용)
 *                        ===> 익명의 클래스 (상속 없이 오버라이딩)
 *                    
 *                    *** 추상 클래스 / 인터페이스는 메모리 할당이 불가능하다
 *                        => 반드시 상속을 받아서 구현된 클래스를 이용한다
 *                        => 인터페이스는 추상 클래스의 일종 => 추상 클래스의 단점을 보완
 *                        => 사용 방법
 *                           상속 : 추상 클래스는 단일 상속(extends)
 *                                 인터페이스는 다중 상속이 가능(implements)
 *                                 ex) 
 *                                     abstract class A
 *                                     class B extends A
 *                                     ------------------
 *                                     B b=new B(); //확장된 클래스 사용
 *                                     A a=new B();
 *                                     A a=new A(); //오류
 *                                     
 *                                     interface A
 *                                     interface B
 *                                     interface C extends A,B
 *                                     ------------------
 *                                     interface A
 *                                     interface B
 *                                     class C implements A,B
 *                                     ------------------
 *                                     ==> 여러개의 관련된 클래스를 한개의 인터페이스로 관리
 *                                     *** 프로그램 : 여러개를 그냥 사용하면 => 수정이 어려울 수 있다
 *                                                  ----- 한개의 이름으로 제어
 *                                                  데이터 => 배열명
 *                                                  클래스 여러개 => 인터페이스
 *                 => 메모리 할당
 *                 class Human
 *                 {
 *                    public void display(){}
 *                 }
 *                 
 *                 1) Human h=new Human(); //직접적으로 연결 => 결합성이 높은 프로그램
 *                 2) Human h2=new Human().getClass().getDeclearedConstructor().newInstance()
 *                 3) Human h3=Human.class.getDeclearedConstructor().newInstance()
 *                 4) Human h4=(Human)Class.forName("Human")
 *                    => 변수/메소드 제어 (리플렉션)
 *                 => 접근지정어
 *                    private : 자신의 클래스에서만 사용이 가능
 *                    default : 같은 패키지에 있는 클래스에서만 사용
 *                    protected : 같은 패키지에 있는 클래스에서만 사용, 다른 패키지 상속이 있는 경우
 *                    public : 모든 클래스에서 접근 가능
 *                 => 클래스 => 클래스와 클래스의 연관 관계 ( 객체지향 ) => public
 *                    메소드 => 클래스와 클래스의 통신기능 => public
 *                    변수 => 데이터 보호 => private
 *                    생성자 => 클래스의 기능을 얻어올때 사용( 다른 클래스에 메모리 할당) => public
 *                    
 *    *** 원하는 저장 : 컬렉션 (11장~12장)
 *    ----------------- 메모리 저장
 *    파일 (15장)
 *    
 * 2. 데이터 활용
 * 3. 데이터 출력
 *    java.txt
 *      = SimpleDateFormat : 날짜 변환
 *      = ChoiceFormat : 
 *      = MessageFormat :
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));

	}

}
