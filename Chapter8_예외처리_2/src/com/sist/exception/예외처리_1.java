package com.sist.exception;

import java.util.Scanner;

/*
 *  컴파일(이진파일변경), 인터프리터(한줄씩 읽어서 출력)
 *  ---------------  -----------------------
 *      javac                java
 *        |                    |
 *     프로그래머           사용자의 오류
 *  ---------------  -----------------------
 *   CheckException     UnCheckException
 * 컴파일러가 예외처리 확인  예외처리를 확인하지 않는다(생략가능)
 * 
 *  CheckException
 *    = IOException : 파일명, 경로명 오류
 *    = ClassNotFoundException : 클래스가 없는 경우 (리플렉션 => new없이 메모리 할당)
 *    = SQLException : 데이터베이스 연결 
 *    = InterruptedException : 쓰레드 충돌
 *    = MalFormedURLException : IP,URL주소가 틀린경우 => 크롤링
 *    
 *  UnCheckException
 *    = ArrayIndexOutOfBounds : 배열 범위 초과시 , Collection
 *    = NumberFormatException : 정수변환 ==> 웹/윈도우는 정수를 전송할 수 없다(문자열만 가능)
 *    = NullPointException : 객체 생성없이 선언 후 사용시
 *                        모든 클래스는 기본값 null => 메소드나 변수 사용이 안됨
 *    = ClassCastException : 클래스 형변환 ==> 제네릭스(자동 형변환)
 *    
 *  ----------------------------------------------------------------------------
 *  
 *  1. 예외처리방법
 *      1) 예외복구(직접처리) try~catch~finally
 *      2) 예외회피(간접처리) throws
 *      3) 예외던지기(임의로 발생) throw 
 *         ----------------- 사용자 정의 예외처리
 *  2. 사용법
 *     try : 정상 수행이 가능한 코드 (예외가 발생할 수 있는 코드)
 *     catch : 오류가 발생시에 어떻게 처리할지에 대한 코드 (복구=>에러확인)
 *             => 프로그래머의 실수(복구) => 소스 수정
 *             => 사용자 실수 => 다시 입력을 요청
 *             => 예상되는 에러만큼 catch 사용할 수 있다
 *     finally : 무조건 수행(try/catch 수행 상관없이)
 *               => 생략가능
 *               => 파일닫기, 서버연결 해제, 데이터베이스 닫기
 *               
 * -------------------------------------------------------------
 *  
 *               
 */
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//UncheckException ==> 예외처리 생략가능 => 정수변환, 배열, 나누기, null
		try {
			System.out.print("정수 두개 입력(10 10) : ");
			int[] arr=new int[2];
			arr[0]=sc.nextInt();
			arr[2]=sc.nextInt();
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("정상종료");
		sc.close();
	}

}
