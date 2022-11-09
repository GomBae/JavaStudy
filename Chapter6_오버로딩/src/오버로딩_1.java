/*
 * 1. 변수
 * 	  인스턴스 변수
 * 	  [접근지정어][옵션] 데이터형 변수명
 * 	  ---------
 * 	  private, protected, public, default
 * 								  ------- 
 * 								  단점 : 폴더가 다른경우엔 접근 불가
 * 				옵션 => static, final
 * 	 ex)
 * 		int a;//따로 저장 => 객체 생성 후 사용이 가능(인스턴스명.변수명)
 * 		static int b;//공유 => 자동 저장 => 클래스명으로 접근이 가능(클래스명.변수명)
 * 		final int c=상수값// 상수
 * 
 * 	  클래스 변수 : static 
 * 2. 메소드 : 동작, 행위 => 작업을 할 수 있는 명령어의 집합
 * 
 * 클래스 (컴포넌트) : 한개의 기능
 * 					ex) 글쓰기, 수정, 삭제, 목록출력 .... <== 메소드
 * 											메소드를 묶어 하나의 게시판 기능을 만든게 컴포넌트(클래스)
 * 				메소드 => 리턴형 / 매개변수 (여러개 설정) => Call By Value (메소드에서만 변경) 
 * 													Call By Reference (배열, 클래스 자체 변경)
 * 	인스턴스 메소드 => 인스턴스 메소드 호출, 인스턴스 변수, static변수, static메소드 => 사용가능
 * 	static 메소드 => static만 호출 가능, (static 변수, static 메소드)
 * 					인스턴스변수, 인스턴스 메소드 호출시에는
 * 					new를 통해 객체 생성 후 접근 가능
 * ---------------CBD 
 * 오버로딩
 * 	=> 하나의 메소드명으로 여러개의 기능을 만들 수 있다 (새로운 추가)
 * 	=> 메소드명을 줄일 수 있다
 * 		----------------- 기능이 통일
 * 		println(int a)		=> printInt()
 * 		println(boolean b)	=> printBoolean()
 * 		println(char[] c)	=> printChar 
 * 		println(doubld d)		.
 * 		println(String s)		.
 * 	=> 버튼 ==> onClick(String id,String pwd)...
 * 	
 * 오버로딩 조건
 * 	=> 같은 클래스내에서 같은 메소드명을 가지고 있어야함
 * 	=> 매개변수의 갯수가 다르거나, 매개변수의 데이터형이 달라야함
 * 	=> 리턴형은 관계없다
 * 
 *   void display(int a,char c, double d)
 *   void display(float a,int c, int d)
 *   void display(double a,double c, double d)
 *   void display(int a,int c,int d)
 *   
 *   display(10.0, 'A', 10.5F)
 *   		 double char float  -> 매개변수의 데이터형보다 낮은 크기의 데이터형이면 사용가능
 */
public class 오버로딩_1 {

	final int c=100;
	
	void display(char c,int i,long l) {
		System.out.println("display(char c, int i, long l) Call...");
	}
	int display(int c,int i,double l) {
		System.out.println("display(int c, int i, double l) Call...");
		return 0;
	}
	double display(double c,double i,double l) {
		System.out.println("display(double c, double i, double l) Call...");
		return 0.0;
	}
	long display(float c,double i,long l) {
		System.out.println("display(float c, double i, long l) Call...");
		return 0L;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_1 a=new 오버로딩_1();//static이 붙지않으면 new를 통해 인스턴스 생성
		a.display(10.0, 10, 10);

	}

}
