package com.sist.connect1;
//다른 클래스에서 접근시에는 import

/*
 * 다른 패키지에 존재하는 클래스를 사용할때 ==> import
 * => 라이브러리 / 사용자 정의 클래스
 * 
 * import 패키지명.클래스명 ==> 클래스 한개만 가지고 올때
 * import 패키지명.* ==> 패키지에 있는 모든 클래스 가지고 올때 
 * import static 패키지명.클래스명.메소드명 => 메소드 한개
 * import static 패키지명.클래스명.* => 메소드 전체 사용시
 */
import static java.lang.Math.random;
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;// 메소드를 import하면 Math. 처럼 클래스명을 불러올 필요가 없다.

	}

}
