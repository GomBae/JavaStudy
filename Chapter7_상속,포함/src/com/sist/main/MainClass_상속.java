package com.sist.main;
/*
 * 자바는 클래스안에서 모든 작업을 만든다
 * -----------------------------
 * 클래스
 * -----
 *    변수	: 인스턴스(메모리에 따로 저장되는 변수), 공유변수(static 변수, 메모리 공간 1개)
 *    메소드	: 인스턴스변수, static변수 활용 => 메소드 (제어문, 연산자)
 *    생성자	: 메모리에 저장시에 처음으로 호출되는 메소드(무조건 1개 이상 포함)
 * 
 * 객체지향 프로그램
 * -------------
 *      데이터 보호	: 캡슐화
 *      재사용		: 상속, 포함
 *      수정/추가		: 다형성(오버라이딩, 오버로딩)
 *                                   ------
 *      ** 상속		: 실행속도가 느려진다 (사용빈도가 적다), 포함
 *         ---- 변경을 해서 사용                        --- 변경없이 사용
 *         ---- 변경(오버라이딩) -> 익명의 클래스
 *      
 *      상속
 *      ---
 *       1) 기존의 클래스를 재사용해서 새로운 클래스를 만든다
 *          ----------           ---------
 *          부모 클래스, 상위클래스    자식 클래스, 하위 클래스
 *       
 *       2) 소스 양이 적다 (상속으로 모든 내용을 저장했다고 가정하기때문)
 *       3) 코드를 공통적으로 관리하기 쉽다
 *       4) 재사용
 *       ---------------------------------------------------
 *       단점 :
 *        실행속도가 늦다, 소스를 이해하기 어렵다, 단일상속이다
 *       
 *       5) 상속의 사용법 (extends : 확장)
 *          class A extends B
 *               ---       ---
 *               하위       상위
 *               데이터형은 상속을 내리는 클래스가 크고
 *               메모리는 상속을 받는 클래스가 크다
 *       
 *       예) class A
 *          {
 *             int a,b;
 *             void display(){}
 *          }
 *          class B extends A
 *          {
 *            int c;
 *            void bbb(){}
 *          }
 *          
 *          A>B
 *          
 *          A ==> a,b,display()
 *          B ==> a,b,display(),c,bbb()
 *          
 *          ** 상속의 예외
 *             ---------
 *             생성자, 초기화 블록, static(사용은 가능, 상속은 x)
 *             상속은 인스턴스만 상속을 내려준다
 *             클래스 자신만이 가지고 있는 것은 인스턴스변수, 인스턴스메소드
 *             
 *          상속 형식
 *          class 하위클래스 extends 상위클래스
 *          {
 *            기능 => 공통적인 내용
 *          }
 *          
 *      ** 자바의 모든 클래스 (사용자 정의 클래스, 라이브러리) ==> object 상속
 *          Object를 최상위 클래스
 *          ------ 복제, 소멸자, 문자열변환, 비교
 *      ** 상속
 *         ---  있는 그대로 사용, 추가, 변경
 *      
 *     
 */
class Super{
	int a=10;
	int b=20;
	static int c=30;
	public Super() {
		System.out.println("Super() Call");
	}
	public void print() {
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
class Sub extends Super{
	//a,b,print
	public Sub() {
		a=100;
		b=200;
		c=300;
		System.out.println("Sub() Call");
	}
}
/*
 * Super : a,b,c,print()
 * 
 * Sub : a,b,c,print()
 * 		따로 메모리 생성 ==> 인스턴스는 별도로 생긴다, static은 공통으로 사용한다
 *      ------------ 메모리만 복제한다
 * 복제 => 상위 클래스가 먼저 메모리 할당 ==> 하위 클래스가 메모리 할당
 */
public class MainClass_상속 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.print();
		Super sup = new Super();
		sup.print();

	}

}
