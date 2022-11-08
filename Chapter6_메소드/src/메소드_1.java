/*
 * 클래스 구성요소
 * -----------
 * 1) 변수 (멤버변수)
 * 	  인스턴스 변수 / 클래스 변수(static)
 *    각자 저장      공통 저장
 * 2) 메소드 : 특정 작업을 수행하는 명령문의 집합
 * 			 ---- 사용자가 요청한 내용
 * 	인스턴스 메소드 : 다른 메모리에 저장 ( 각자 다르게 동작 )
 * 	클래스 메소드 : static 메소드 => 메모리에 저장된다 (공유)
 * 	추상 메소드 : 선언부 / 구현부
 * 		abstract void display(); => 이벤트 처리, 데이터베이스(설계)
 * 
 * 	메소드 호출
 * -----------
 * class ClassName
 * {
 * 	  void aaa()
 * 	  {
 * 		호출이 가능한 메소드
 * 		bbb()
 * 		ccc()
 * 		eee()
 * 	  }
 * 	  
 * 	  static void bbb()
 *    {
 *      ccc()
 *      => aaa(), eee()를 호출하려면
 *      ClassName c=new ClassName();
 *      c.aaa()
 *      c.eee()
 *    }
 *    static void ccc()
 *    {
 *      bbb()
 *      //static은 static만 호출할 수 있다. (인스턴스 호출이 어렵다)
 *    }
 *    void eee()
 *    {
 *    	//static, instance 상관없이 호출가능
 *    	aaa()
 *    	bbb()
 *    	ccc()
 *    }
 * }
 * 
 * 	인스턴스 메소드
 * 	 객체명.메소드명()
 *  클래스 메소드 (static)
 *   클래스명.메소드명()
 * 3) 생성자
 * -----------
 * 
 */

public class 메소드_1 {

	int aa=10;
	static int bb=20;
	
	
	void aaa()
	{
		this.bbb();
		this.ccc();
		this.eee();
		System.out.println(this.aa+this.bb);
	}
	static void bbb() {
		ccc();//static 에서는 this. 사용이 불가능.
		메소드_1 a=new 메소드_1();
		a.aaa();
		a.eee();
	}
	static void ccc() {
		메소드_1 a=new 메소드_1();
		bbb();
		System.out.println(a.aa+bb);
	}
	void eee() {
		aaa();
		bbb();
		ccc();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
