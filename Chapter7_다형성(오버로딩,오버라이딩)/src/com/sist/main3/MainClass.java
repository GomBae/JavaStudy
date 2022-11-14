package com.sist.main3;
/*
 *  A a=new B();
 *  A a=new C();
 *  B b=new D();
 *  B b=new E();
 *  C c = new F();
 */
class A{
	
}
class B extends A{
	public void display() {
		System.out.println("A:display Call");
	}
}
class C extends A{
	
}
class D extends B{
	public void display() {
		System.out.println("D:display Call");
	}
	public void ddd() {
		System.out.println("D:ddd");
	}
}
class E extends B{
	public void display() {
		System.out.println("E:display Call");
	}
}
class F extends C{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new D();
//		B b1=new E();
//		B b2=new B();
////		B b3=(B)new A();
//		A a= new B(); //하위클래스의 생성자로 객체 생성 후
//		B b3=(B)a; // 하위 클래스로 형변환 시켜준다
		
		B b1=new D();//오버라이딩 된 메소드만 접근이 가능
		//display()
		b1.display();//D가 가지고 있는 메소드 호출
		D d=new D();
		d.display();
		D d1=(D)b1;
		d1.display();
		new D().display();
		

	}

}
