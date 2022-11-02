/*
 * 1. 자바 실행 과정
 * 		.java ==========> class명과 동일
 * 		----------------- 원시소스 (프로그래머만 아는 언어) : 컴퓨터는 알 수 없는 소스
 * 		|
 * 		|	컴퓨터가 인식하는 언어로 변경 (컴파일) ==> javac
 * 		.class =======> 바이트 코드 ( 기계어)
 * 		|
 * 		| 한줄씩 번역 (인터프리터) ==> java
 * 		번역된 내용을 화면에 출력
 * 	---------------------------------- javac + java => Ctrl + f11
 * 
 * 2. 자바 사용
 * 		-------- 1) 호환성 (운영체제에 상관없이 작동) => 운영체제에 독립적
 * 		-------- 2) 무료
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");

	}

}
