package com.sist.exception;
class A{
	
}
class B extends A{
	
}
public class MainClass_실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str=" 10";
//			System.out.println(Integer.parseInt(str));//문자열을 정수형으로 변경 //에러
//			System.out.println(10/0); //에러 발생시 catch절로 이동해서 종료됨(밑에 catch절 실행안함)
//			System.out.println(str.trim());
//			B b=(B)new A(); //에러
			A a=new A();
			B b=(B)a;
		}catch(ArrayIndexOutOfBoundsException ex) {
			//배열 범위를 초과할 때 처리하는 예외처리 ==> 한개만 수행
			System.out.println("배열의 범위를 초과");
		}catch(ArithmeticException ex) {
			//0으로 나눌 경우 처리
			System.out.println("0으로 처리불가");
		}catch(NumberFormatException ex) {
			//문자열을 정수로 변경했을때
			System.out.println("정수로 변환이 안됐다.");
		}catch(NullPointerException ex) {
			//객체, 클래스의 주소값이 없는 경우
			System.out.println("객체에 주소가 없다.");
		}catch(ClassCastException ex) {
			//형변환을 잘못했을 경우
			System.out.println("클래스 형변환이 잘못되었다.");
		}catch(RuntimeException ex) {
			//RuntimeException 이 UnCheckException의 제일 상위에 있기때문에 
			//제일위에 하나만 쓰거나 맨 마지막에 사용
			//에러를 예상하지 못하는 경우 (기타)
		}
	}

}
