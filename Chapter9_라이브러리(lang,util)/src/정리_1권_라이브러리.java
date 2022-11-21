/*
 * java.lang
 *   = Object : 최상위 클래스(모든 클래스에 상속을 내리는 클래스) => 최상위 데이터형
 *     => Object[] obj={"홍길동",30,187.5,'A',new Saram()...}
 *     => 1) 소멸자 (메모리 해제) => finalize() => GC가 호출
 *            원형) protected void finalize()
 *        2) 복제 => 있는 값 그대로 새로운 메모리를 생성 => clone() 
 *            원형) protected Object clone()
 *                 메소드명, 기능, 리턴형, 매개변수
 *                 
 *        3) 객체 비교 => equals() => 주소값으로 비교 (기본형 ==, 참조형 equals())
 *            원형) public boolean equals(Object obj)
 *                 오버라이딩(변경) ==> String에서 실제 저장된 문자열 비교
 *        4) 문자열 변환 => toString() => 생략가능 (객체명만 출력)
 *           A a=new A(); ==> System.out.println(a) => a.toString()
 *            원형) public String toString() : 객체의 주소값 출력, 객체의 멤버변수의 값 출력 (오버라이딩)
 *        5) 모든 클래스에는 extends Object가 생략
 *   = String : 문자열 저장
 *     1) 문자열 저장 방식
 *        String s=""; => 문자열의 주소를 얻는 방식
 *        String s=new String(""); => 새로운 메모리에 문자열을 저장
 *        => 참조변수 => 기본형 취급을 한다
 *          주소를 참조    실제 데이터
 *     2) equals : 문자열 비교
 *        public boolean equals(String s) => 대소문자 구분
 *     3) contains : 문자가 포함 => 검색기
 *     4) startsWith
 *     5) endsWith
 *     6) replace()
 *     7) replaceAll()
 *     8) split : 구분을 통해서 문자열을 구분해 배열에 저장
 *        원형) public String[] split(String regex) => 구분자는 정규식으로 사용
 *     9) length
 *     10) indexOf : 원하는 위치의 문자나 문자열을 찾기 (앞에서부터 찾기)
 *         원형) public int indexOf(char c)
 *         원형) public int indexOf(String c)
 *         => 자바 문자열은 시작번호가 0부터 시작
 *     11) lastIndexOf : 원하는 위치의 문자나 문자열 위치찾기 (뒤에서부터)
 *     12) substring : 문자를 자를경우에 사용
 *         원형)
 *             public String substring(int s)
 *             public String substring(int s,int e) => e는 제외된다
 *     13) valueOf : 모든 데이터형을 문자열로 변환
 *         원형) public static String valueOf(int a) => double, float, boolean
 *         String클래스에 유일하게 static
 *         String.valueOf()
 *   = StringBuffer : 문자열 결합시 많이 사용되는 클래스
 *      문자열 결합 : append()
 *        원형) public StringBuffer append(String s) => double, int
 *      문자열 변환 : toString()
 *        원형) public String toString()
 *             (String)
 *   = Wrapper
 *      기본형 데이터형을 쉽게 사용할 수 있게 클래스형으로 제작 (모든 데이터형이 클래스화 되어있음)
 *      = 제네릭스, 오브젝트로 변경
 *      Boxing / UnBoxing
 *      ------ 클래스에 일반 데아터값을 대입
 *      Integer i=10;
 *      ------ 기본형에 클래스형을 대입
 *      int ii=i;
 *   = System : gc()
 *   = Math : random(): 난수발생, ceil() : 올림, round():반올림
 * java.util
 *   = StringTokenizer
 * java.util.regex
 */
class A{
	int a;
	
}
class B{
	public void change(A aa) {
		aa.a=100;
		System.out.println("aa="+aa);
	}
	public void change2(String s) {
		s="Hello Java";
	}
}
public class 정리_1권_라이브러리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println("a="+a);
		System.out.println(a.a);
		B b=new B();
		b.change(a);
		System.out.println(a.a);

		String ss="";
		
	}

}
