/*
 *  java.lang => import생략
 *  ---------
 *  Object : clone / toString / equals / getClass / finalize
 *  String : substring / length / trim / split / replace / indexOf / lastIndexOf
 *           valueOf / startsWith / contains / equals
 *  ---------------
 *  StringBuffer
 *  Wrapper
 *  System
 *  Math
 *  -------------------- 웹
 *  Date
 *  Calendar
 *  Collection
 *  IO(File)
 *  --------------------
 *  java.sql
 *  
 */
public class 라이브러리_정리1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello Java";
		char[] c=s.toCharArray();
		//문자열을 캐릭터 배열로 변경할 때 사용
		for(char ch:c) {
			System.out.println(ch);
		}
		
		String ss=String.valueOf(c);
		System.out.println(ss);
	}

}
