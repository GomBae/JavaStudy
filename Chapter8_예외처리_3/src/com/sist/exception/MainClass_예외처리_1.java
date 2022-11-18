package com.sist.exception;
/*
 * 1. try~catch
 * 2. throws
 *    ------- 
 *    예외선언 (예외회피) ==> 시스템에 예외를 알려줌
 *    형식
 *       public void display() throws NumberFormatException,RuntimeException,Exception
 *                                    -------------------------------------------------
 *                                     throws는 순서 상관없음
 *       => 라이브러리는 예상된 예외를 throws로 이용해서 등록
 *                              ------------------- 처리하면서 사용해야함
 *       => 
 *          1) try~catch : 직접 처리하는 방법
 *          2) throws : 선언만 처리
 *          
 *          public void display() throws Exception ==> display() 호출시 Exception 처리 후 사용
 *          {
 *          }
 *          
 *          public void aaa()
 *          {
 *             display(); //에러 코드
 *          }
 *          
 *          1)
 *             public void aaa()
 *             {
 *                 try
 *                 {
 *                   display();
 *                 }catch(Exception e){}
 *             }
 *             
 *          2) public void aaa() throws Exception
 *          {
 *            display();
 *          }
 *      ---------------------------------------------
 *          
 *          public void aaa() throws NumberFormatException,ArratIndexOutOfBoundsException
 *          {  
 *          }
 *          
 *          main()
 *          {
 *            aaa(); //정상 수행
 *          }
 */
public class MainClass_예외처리_1 {
	//CheckException ==> 컴파일러에서 예외처리를 한다 ==> 예외 생략 불가
    public static void aaa() throws Exception{
    	
    }
    //UnCheckException ==> 컴파일러에서 예외처리를 하지않는다 ==> 예외 생략 가능
    public static void bbb() throws NumberFormatException,NullPointerException{
    	
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		aaa(); //checkException이 포함되어 에러발생
		bbb(); //UnCheckException이라 예외 생략가능
//		try {
//			aaa();
//		}catch(Exception e) {}
		aaa();
	}

}
