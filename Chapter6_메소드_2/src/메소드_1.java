/*
 * 	1) 인스턴스 메소드 : 인스턴스 변수를 이용할 때
 * 	2) 정적 메소드, 공유 메소드 (static) : 인스턴스 변수를 이용하지 않는 경우 주로 사용
 * 	ex)
 * 		String s="hello java";
 * 		s.substring(); <== 인스턴스 메소드
 * 		String.valueOf(10) <= 정적 메소드, 공유 메소드
 * 
 * 	class Member
 *  {
 * 		String id,pwd; // Heap
 * 		boolean isLogin(String id,String pwd)//Stack
 * 		{
 * 			this.id // Member클래스의 id값을 이용
 * 			id // 매개변수 id값
 * 		}
 * 		
 *  }
 *  
 *  1.메소드 선언
 *  	1) 인스턴스
 *  		리턴형 메소드명(매개변수)
 *  	2) 정적(static)
 * 			static 리턴형 메소드명(매개변수)
 * 
 * 	2. 메소드 호출 방식 ===> 메소드는 메모리에 저장해서 사용해야한다.
 * 		1) 인스턴스 : new를 사용하여 메소드를 저장한다.
 * 			A a=new A();
 * 				----- a가 메모리 주소의 별칭 
 * 			ex)
 * 				class A
 * 				{
 * 					int age;
 * 					String name;
 * 				}
 * 		2) 정적(static) : 컴파일러에 의해 메모리에 자동으로 저장된다.
 * 			class A
 * 			{
 * 				static int a;
 * 				static void list(){}
 * 			}
 * 			클래스명.a, 클래스명.list()
 */
class Names{
	String name1;
	String name2;
}
public class 메소드_1 {
	
	//메소드 선언 ==> 오버로딩 : 같은 클래스에서 같은 메소드명을 이용해 새로운 기능을 첨부 
	//메소드명이 동일, 매개변수의 갯수, 데이터형이 다르면 => 다른 메소드로 인식한다.
	void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+",b="+b);
	}
	void swap(String name1, String name2) {
		String temp=name1;
		name1=name2;
		name2=temp;
		System.out.println("swap:name1="+name1+",name2="+name2);
	}
	void swap(String[] names) {
		String temp=names[0];
		names[0]=names[1];
		names[1]=temp;
		System.out.println("swap:names[0]="+names[0]+",names[1]="+names[1]);
	}
	void swap(Names name) {
		String temp=name.name1;
		name.name1=name.name2;
		name.name2=temp;
		System.out.println("swap:name1="+name.name1+",name2="+name.name2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		메소드_1 m=new 메소드_1();
		int x=10;
		int y=20;
		System.out.println("main:x="+x+",y="+y);
		m.swap(x, y);
		System.out.println("main:x="+x+",y="+y);//Call By Value (값만 전송) => 메소드 안에서만 변경
		//x,y 메모리 ==> 메소드 호출 => 원본은 그대로 복사본 안에서만 변경
		//클래스, 배열 => 원본이 변경(예외: String)
		String name1="홍길동";
		String name2="박문수";
		m.swap(name1, name2);
		System.out.println("main:name1="+name1+",name2="+name2);
		
		String[] names= {"이순신","강감찬"};
		m.swap(names);
		System.out.println("main:names[0]="+names[0]+",names[1]="+names[1]);
		
		/*
		 * 값만 변경 (메소드안에서만 변경) : 일반 데이터값(기본형), String
		 * 자체 변경 (주소) : 클래스(사용자 정의 클래스), 배열
		 */
		Names n=new Names();
		n.name1="홍길동";
		n.name2="김두한";
		m.swap(n);
		System.out.println("main:name1="+n.name1+",name2="+n.name2);
		//매개변수 => 클래스 ,배열,일반 데이터
		//리턴형 => 기본형,배열,클래스(리턴형이 없어도 된다)
		
	}

}
