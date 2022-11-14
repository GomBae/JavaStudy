package com.sist.main2;
/*
 * super : 상위 클래스의 객체 
 *   => 생성자, 인스턴스 메소드에서 사용이 가능 ( static 메소드에서는 사용할 수 없다)
 * this : 자신의 객체
 * super() : 상위 클래스의 생성자
 * this() : 자신의 생성자를 호출시에 사용
 * -----------------------------------
 * 생성자에서만 사용이 가능
 * => 첫줄에 사용한다
 * 
 * class A{
 *   int a,b,c; ==> super
 *   public A(int a, int b){}
 *   public A(int a, int b, int c){}
 * }
 * 
 * class B{
 *   int a,b,c; ==> this
 *   public B()
 *   {
 *     super(); ==> public A(){}
 *     super(10,20) ==> public A(int a, int b){}
 *     super(10,20,30) ==> public A(int a, int b, int c){}
 *     super()를 사용하지 않는 경우에는 자동으로 super()
 *   }
 *   public B(int a){
 *     this(); //오류 this와 super는 둘 다 첫줄에 사용되기때문에 하나만 사용할 수 있다 
 *     super(100,200); // A=> a=100, b=200, c=0
 *   }
 *   자신외에 상위 클래스의 변수, 메소드 제어가 가능하다
 * }
 */
class A{
	int a,b,c;
	public A() {
		this.a=10; //지역변수 => 멤버변수
		//충돌이 없는 상태면 this. 생략이 가능하다 ==> 지역변수나 매개변수가 우선 순위다
		b=20;
		c=30;
	}
	public A(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public A(int a,int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
class B extends A{
	int a,b,c;
	public B() {
		a=100;
		b=200;
		c=300;
	}
	public B(int a,int b, int c) {
		super(a,b);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void print() {
		System.out.println("this.a="+this.a); // B class가 가지고 있는 a,b,c
		System.out.println("this.b="+this.b);
		System.out.println("this.c="+this.c);
		
		System.out.println("super.a="+super.a); //A class가 가지고 있는 a,b,c
		System.out.println("super.b="+super.b);
		System.out.println("super.c="+super.c);
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		B b=new B(); //A a=new A()가 먼저 실행
//		b.print();
		//A, B, Object
		Object obj=new Object();
		A a=new A(); //A, Object
		B b= new B(); //B, Object
		if(a instanceof Object)
			System.out.println(true);
		if(b instanceof Object)
			System.out.println(true);
		if(b instanceof A)
			System.out.println(true);
		if(b instanceof B)
			System.out.println(true);
	}

}
