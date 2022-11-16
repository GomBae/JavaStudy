package com.sist.connect2;
/*
 * 접근범위 설정
 * private : 은닉화 (자신의 클래스에서만 접근이 가능)
 * **default : 같은 패키지에서만 접근 가능
 * protected : 같은 패키지에서 접근이 가능, 다른 패키지의 상속과정이 있는 경우 접근이 가능
 * public : 모든 곳에서 사용이 가능 (공개)
 * 
 * 사용법
 *  멤버번수 : 데이터를 감춘다(은닉화) 필요시마다 직접 연결이 아니고 메소드를 통해서 연결
 *           ---------------------------------------------------------- 캡슐화
 *           데이터 보호 목적으로 만든다
 *           변수 ==> private (은닉화)
 *           
 *  메소드 : 어떤 클래스든 상관없이 접근이 가능하게 만든다
 *          메소드 => public
 *          ==> 다른 클래스와 통신 역할 (메세지)
 *  클래스 : 어떤 클래스든 상관없이 접근이 가능하게 만든다
 *         클래스 => public
 *         
 *  접근지정어의 접근 범위
 *  -----------------------------------------------------------------
 *            자신의 클래스   같은 패키지까지   같은 패키지까지   모든 클래스
 *            안에서만 접근   접근이 가능      접근이 가능     
 *                        (다른 클래스)    (다른 패키지에
 *                                      상속이 있는 경우)
 *  -----------------------------------------------------------------
 *  private     o(변수)
 *  -----------------------------------------------------------------
 *  default     o             o
 *  -----------------------------------------------------------------
 *  protected   o             o               o
 *  -----------------------------------------------------------------
 *  public      o             o               o            o
 *  -----------------------------------------------------------------
 *  => 메소드, 생성자, 클래스, 인터페이스, 열거형 : public 
 *  
 *  객체 지향 프로그램
 *  --------------
 *  1. 캡슐화 : 소스코딩
 *             => 멤버변수는 private => 은닉화
 *             => 다른 클래스에서 사용시에는 메소드를 이용
 *             ---------------------------------- 캡슐화
 *             1) 데이터를 보호
 *             
 *  2. 상속/포함
 *  3. 다형성 (수정, 추가)
 *      => 오버로딩, 오버라이딩
 * 
 *  
 */
class Saram{
	/*
	 * 변수
	 * [접근지정어] 데이터형 변수명;
	 * 
	 * 메소드
	 * [접근지정어] 리턴형 메소드명(매개변수)
	 * {
	 *   구현..
	 * }
	 * 
	 * 클래스
	 * [접근지정어] class ClassName
	 * {
	 * }
	 * 
	 * public static int a;
	 * static public int a;
	 * //두개는 순서 상관없다.
	 * 접근지정어는 멤버에서만 사용이 가능 (지역변수는 사용할 수 없다)
	 * ---------
	 * 접근 지정어 가능
	 * ----------
	 * void disp(){
	 * 
	 *   ------------
	 *   private int a; ==> 오류 (지역변수는 접근지정어 사용불가)
	 *   ------------
	 *   지역변수에서 사용 가능 키워드 : final
	 *   상수/변수 구분
	 * }
	 * 
	 * 클래스 : public, default, final, abstract
	 * 메소드 : 모든 접근 지정어, final, abstract, static
	 * 멤버변수 : 모든 접근 지정어, final, static 
	 * 지역변수 : final
	 * 생성자 : public, default 
	 * 
	 */
	private String name;// 접근 불가 (은닉화)
	protected String sex;//접근 가능
	int age;//접근 가능
	public String address;//접근 가능
	//변수는 역할(읽기(변수값 가져오기)/쓰기(변수값 지정))
	
	public String getName() {//메소드를 통해서 변수의 기능 설정 (읽기)
		return name;
	}
	public void setName(String name) {//변수의 값 저장 기능 (쓰기)
		this.name=name;
				
	}
}
public class 접근지정어 {
	public static void main(String[] args) {
		Saram s=new Saram();
		s.setName("홍길동");//==> 암호화/복호화
		System.out.println(s.getName());
	}

}
