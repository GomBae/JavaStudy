package com.sist.exception;
/*
 *  오작동 / 비정상 종료 ==> 에러
 *  ------------------------
 *  
 *  에러
 *  ------
 *    1) 수정이 불가한 에러
 *    2) 수정이 가능한 에러 : 예외처리
 *       --------
 *       에러 => 사용자의 입력 실수 (유효성 검사)
 *              프로그래머 실수
 *              배열, cast, null <<== 실수가 많이남
 *              
 *       ==> 복구 / 회피 throws 
 *           try~catch
 *  --------------------------------------------
 *   컴파일에러 : 컴파일시에 에러(문법 에러) - javac에서 에러
 *   런타임에러 : 실행시에 에러 - java에서 에러
 *   논리적에러 : 실행은 되지만 프로그램 목적과 다르게 동작
 *   -------------------------------------------
 *   견고한 프로그램 : 에러가 발생시 종료하지 않고 정상 수행이 가능하게 만드는것
 *   1) 에러를 사전에 방지하는 프로그램
 *      --------------
 *       if문을 사전에 고려하고
 *                     => if문으로 처리가 어렵다면 => 예외처리
 *   2) 예외처리 : 가벼운 에러, 수정이 가능한 에러
 *               ------------------------
 *               Exception
 *   
 *   3) 예외처리의 종류
 *       = 예외 복구 : 예외가 발생하면 복구해서 다시 수행이 가능하게
 *         try{
 *           에러가 발생할 수 있는 문장
 *         }catch(){
 *           에러가 발생시 복구
 *         }
 *       = 예외 회피 : 에러부분을 제외하고 다음문장으로 수행
 *         method() throws 예외처리종류..
 *       = 예외 임의 발생 : 테스트시에 예외를 발생시켜 견고한 프로그램인지 확인
 *         throw 예외처리;
 *       = 사용자 정의 예외처리 : 자바에서 지원하지 않는 경우에 직접 제작
 *         class A extends Exception
 *    4) 예외처리의 정의, 목적
 *       정의 : 프로그램 실행시 발생할 수 있는 에러에 대비한 코드를 작성 (사전방지)
 *       목적 : 프로그램의 비정상 종료를 방지하고 정상 상태를 유지하는것
 *    5) 자바에서 지원하는 예외처리의 계층구조
 *                     Object 
 *                        |
 *                    Throwable : 에러 처리하는 최상위 클래스
 *                        |
 *       -----------------------------------------------
 *       |                                             |
 *       Error(수정이 불가)                        Exception(수정이 가능)
 *                                                     |
 *                                       ----------------------------------
 *                                       |                                |
 *                                  IOException                      RuntimeException
 *                                  SQLException                          |
 *                               MalformedURLExceptio         ArrayIndexOutOfBoundsException
 *                               ClassNotFounExceptin             NumberFormatException
 *                               InterruptedExceptin              NullPointException
 *                                                                ClassCastException
 *                                                                ArithmeticException
 *                            -------------------------         ----------------------
 *                                 CheckException                 UnCheckException
 *                                       |                                |
 *                              컴파일시에 예외처리여부 확인              예외처리여부를 확인하지 않는다
 *                                                                   필요시에 예외처리
 *                                                                   
 *  6) 예외처리 형식
 *     ----------
 *     1. 직접처리(예외 복구) => 프로그래머가 직접 처리를 한다
 *     2. 간접처리(예외 회피 = 예외 떠넘기기) => 자바시스템에 맡긴다
 *     3. 예외 임의 발생(사용자가 예외처리)
 *     4. 사용자 정의 예외처리
 *     
 *     1. 직접처리 (예외복구) : 웹, 데이터베이스는 CheckException (무조건 예외처리를 해야한다)
 */
public class MainClass_예외처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
		}catch(Exception e) {
			
		}
	}

}
