package com.sist.main;
/*
 * 객체 지향 프로그램
 * 1) 데이터를 보호
 *    변수 => private
 *    메소드를 통해 접근이 가능하게 만듦 => getter/ setter
 *                                  --------------- 변수의 기능(메모리에 저장, 메모리에서 읽기)
 * 2) 데이터 기능별 분리
 *    --------------- 캡슐화
 * 3) 재사용 기법
 *    = 상속 (is-a) : 변경해서 사용 할때(메소드(기능))
 *      형식)
 *          class SubClass extends SuperClass
 *                         ------- 확장
 *          = 기존의 클래스를 확장해서 새로운 클래스 제작
 *          = 기능 추가, 변수 추가, 기능 변경, 변수값 변경
 *          = 단일 상속을 기본으로 한다.
 *          = 객체 생성하는 방법
 *            하위클래스 a=new 하위클래스() ==> 기본형식 (상위 클래스를 확장) => 상속받은 클래스를 주로 이용한다
 *              => 상위클래스 a=new 상위클래스() => 거의 사용하지않음
 *            상위클래스 a=new 하위클래스() : 인터페이스, 추상클래스, 스프링, 데이터베이스
 *                      --------------   ----------------- 객체 생성을 할 수 없다
 *                      					(미완성 클래스 => 사용자가 완성해서 사용)
 *                      					** 인터페이스 (스프링의 기반)
 *            *** 객체생성시 => 생성자명이 틀리다 (인터페이스, 패턴)
 *            Calendar c=Calendar.getInstance();
 *            Date d=new Date();
 *            List list=new ArrayList();
 *            Map map=new HashMap()
 *            --------------------------
 *            하위클래스 a=(하위클래스)상위클래스; => 라이브러리
 *            new => 가급적이면 new를 사용하지 않는다
 *                   new => 결합성이 높은 프로그램
 *                          결합성 : 다른 클래스에 얼만큼 영향을 끼치는가
 *                          ----- 응집성 (메소드 => 한가지 기능 수행)
 *            상위클래스 > 하위클래스 (데이터형)
 *            ----------------------------- 공통적인 내용이 어느 클래스가 많은가 (상위클래스)
 *            상위클래스 < 하위클래스 (메모리크기) ==> 상속받은것 + 본인의 데이터
 *            
 *    = 포함 (has-a) : 기존의 클래스를 포함해서 사용 => 변경없이 사용시에 많이 사용한다.
 *    
 *    class A, class B, class C, class D
 *    class E
 *    {
 *       A a=new A();
 *       B b=new B();
 *       C c=new C();
 *       D d=new D();
 *       //포함 클래스
 *    }
 *    --------------------- 재사용 기법
 *    *** 자바의 모든 클래스는 Object를 상속해 있다
 *             --------- 1) 소멸자, 2) 문자열 변환, 3) 메모리 복제
 *                         finalize() toString()   clone()
 *                         => 자동 첨부가 된다 => extends Object
 *                         => 기본 생성자 첨부
 *                         => return(void)
 *                         => import java.lang.* => 자동 첨부
 *                                   -------------- String, Math, System..
 *                         => 자바의 모든 클래스는 예외처리를 가지고 있다
 *                            컴파일     인터프리터
 *                            javac     java
 *                            (예외처리)  (예외처리 생략)
 *    변경해서 사용 => 오버라이딩 ( 덮어쓴다)
 *    오버라이딩의 조건
 *    1) 상속이 있어야 한다 (기존의 기능을 변경)
 *    2) 메소드명이 동일하다
 *    3) 매개변수가 동일하다(갯수나 데이터형)
 *    4) 리턴형이 동일해야한다
 *    5) 접근지정어를 축소할 수 없다, 확대는 가능
 *    private < default < protected < public
 *    
 *    예)
 *      class A
 *      {
 *        void display(){}
 *      }
 *      class B extends A
 *      {
 *         public void display(){}
 *      }
 */
class 동물{
	void eat() {
		System.out.println("먹는다");
	}
}
class 개 extends 동물{
	public void eat() {
		System.out.println("개같이 먹는다");
	}
}
class 소 extends 동물{
	public void eat() {
		System.out.println("소같이 먹는다");
	}
}
class 돼지 extends 동물{
	protected void eat() {
		System.out.println("돼지같이 먹는다");
	}
}
//상속 => 클래스를 1개로 객체 생성이 가능 => 관련된 클래스를 모아서 관리
public class MainClass_다형성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    동물 ani=new 개(); //변수는 클래스타입
	    //       ------
	    ani.eat();
	    ani=new 소();
	    //     -----
	    ani.eat();
	    ani=new 돼지();
	    //     ----- 메소드는 생성자가 가지고 있는 메소드를 호출한다
	    ani.eat();

	}

}
