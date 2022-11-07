import java.util.Arrays;

/*
 * 	문자열을 저장하는 데이터형
 * 	''(char) ""(String) => char[]을 쉽게 다루기 위한 클래스
 * 		int => Integer
 * 		double => Double
 * 		boolean => Boolean
 * 		데이터형마다 클래스로 제작 ( wrapper )
 * 		char[] => String
 * 	String => 참조변수 ( 실제 저장된 데이터의 주소값을 가지고있다.)
 * --------
 * 	1) 일반 데이터형처럼 사용
 * 		String s=""
 * 	2) 클래스처럼 사용
 * 		String s=new String("") //새로운 메모리를 만들어서 사용. new가 들어가면 다른 메모리 생성
 * 	3) 클래스 ==> 기능(메소드)
 * 		=> 변환
 * 			toUpperCase : 대문자로 변환
 * 			toLowerCase : 소문자로 변환
 * 			replace 	: 지정된 문자(문자열)변경
 * 			replaceAll	: 정규식을 이용하여 변경 
 * 						  정규식 : 문자열의 패턴
 * 						  맛있고, 맛있는, 맛있다 ...
 * 						  ----------------------- 맛있+
 * 						  홍.동 (홍과 동 사이에 글자)
 * 		=> 제어
 * 			trim		: 좌우공백 제거
 * 			substring 	: 문자열 자르기 (...)
 * 			concat		: 문자열 결합 ( + 연산자와 동일 )
 * 		=> 검색(boolean)
 * 			startsWith 	: 접두어 (시작하는 문자열) ==> 쿠키에 사용
 * 			endsWith	: 접미어 (끝나는 문자열) 
 * 			contains	: 포함하는 문자열
 * 			equals		: 같은 문자열 비교(대소문자 구분)
 * 		=> 기타
 * 			valueOf 	: 모든 데이터형을 문자열로 변경
 * 			toString	: 문자열로 변환
 * 			length		: 문자열 갯수
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		System.out.println("name : "+name);
		System.out.println("문자의 갯수 : " + name.length());
		char[] arr=name.toCharArray(); //char로 변경
		String temp=String.valueOf(arr); //char[]을 String으로 변경
		System.out.println(temp);
		System.out.println(Arrays.toString(arr));
		if(name.contains("홍")) {//포함시 true
			System.out.println("포함하고있다");
		}else {
			System.out.println("포함하지 않는다");
		}
		System.out.println("========================");
		if(name.startsWith("홍")) {//포함시 true
			System.out.println("시작하는 문자열이다.");
		}else {
			System.out.println("시작하지않는 문자열이다.");
		}
		System.out.println("========================");
		if(name.endsWith("홍")) {//포함시 true
			System.out.println("끝나는 문자열이다.");
		}else {
			System.out.println("끝나지않는 문자열이다.");
		}
	}

}
