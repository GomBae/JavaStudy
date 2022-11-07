import javax.swing.JFrame;

/*
 * 기존의 프로그램을 쉽게 제작(활용)
 * 코드의 재사용성이 높다(기존의 코드를 변경, 추가)
 * 코드관리가 용이하다 (메소드 => 구조화된 프로그램으로 변경)
 * 이미 사용중인 프로그램을 변경 => 신뢰성이 높은 프로그램
 * ----------------------------------------------
 * 1. 클래스의 구성
 * 		= 공통적인 데이터, 기능을 설정
 * 		-------------------- 사물을 단순화 시켜서 시뮬레이션
 * 		-------------------- 한개의 클래스로 동작하는 것이 아닌 여러개의 클래스와 연관 관계를 가지고 있다
 * 							 행위자 <==> 처리
 * 		1) 설계에 필요한 데이터 설계 ( 데이터 : 변수)
 * 		2) 메소드 (기능)
 * 		3) 변수 => 변수의 초기화, 저장 : 생성자
 * 									---- 반드시 클래스명과 동일
 * 		4) 메모리에 저장시에는
 * 			클래스명 변수명 = new 클래스명() ==> 메모리에 저장할 초기값
 * 			-----	|	  --- 새로운 메모리 설정 ( 제작 ) 
 * 					객체 ( 인스턴스 ) (클래스로 생성된 변수를 객체(인스턴스)라고 부른다)
 * 			기본형 => 변수
 * 			배열 => 배열형
 * 			클래스 => 객체(클래스 변수)
 * 			사용자 정의 데이터형
 * 2. 데이터 관련 : 데이터보호 (캡슐화) 
 * 3. 메소드 관련 : 기능 변경, 추가 (오버라이딩, 오버로딩) => 다형성
 * 4. 클래스 관련 : 있는 그대로 사용, 변경 후 사용
 * 				 ------------   ---------
 * 				 포함 (has-a)    상속(is-a) : 사용자 정의
 * 				------------ 라이브러리
 * -----------------------유지보수
 */
public class 객체지향프로그램_1 extends JFrame{
	public 객체지향프로그램_1() {
		setSize(640,480);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new 객체지향프로그램_1();
	}

}
