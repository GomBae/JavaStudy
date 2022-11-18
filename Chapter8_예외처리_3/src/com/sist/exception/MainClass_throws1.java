package com.sist.exception;
/*
 * throws 
 * ------
 *     이미 만들어진 메소드에서 예외에 대한 예측이 어렵다.
 *     ==> 
 */
public class MainClass_throws1 {

	public static void method1() throws Exception{
		method2();
	}
	
	public static void method2() throws Exception{
		throw new Exception();
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		try{
			method1();
		
		}catch(Exception e) {
			
		}
	}

}
