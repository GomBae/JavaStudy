package com.sist.string;
/*
 *  String 클래스
 *  1) 문자열을 저장하는 데이터형 / 클래스형
 *  2) Object로부터 상속을 받은 클래스
 *  3) String 클래스는 final 클래스 ==> 변경이 불가능한 클래스(있는 그대로 사용)
 *                  ------------ 확장을 할 수 없는 클래스 (종단클래스)
 *  4) 사용법
 *     String 변수명=""; ""자체가 주소에 해당된다 ==> char[] 변수명{'','',''}
 *     "Hello" "Hello"
 *     --------------- 같은 주소를 가지고 있다 (같은 문자열은 같은 주소를 가지고 있다)
 *     새로운 공간에 저장 => new String("")
 *     예) 
 *        String s1="Hello";
 *        String s2="Hello";
 *        --------------------- s1==s2
 *        String s3=new String("Hello");
 *        ----------------------------- 다른 주소에 저장
 *  5) 주요메소드
 *     1. public char charAt(int index) : 문자열에서 원하는 위치(인덱스번호)의 문자 한개 추출
 *        *** 자바에서 사용하는 모든 문자열은 index번호가 0부터 시작
 *        
 *     2. length() : 문자 갯수를 가지고온다
 *        public int length()
 *        ==> 사용처 : 화면 UI (글자수를 동일하게 만드는 경우에 사용)
 *        
 *     3. toUpperCase()
 *        public String toUpperCase() : 대문자 변환 => 컬럼명 / 테이블명 (배열)
 *                                                  ----- 멤버변수
 *                                                  ----- 클래스 (ROW)
 *     
 *     4. toLowerCase()
 *        public String toLowerCase() : 소문자 변환
 *     
 *     ------------------------------------------------------------------------------
 *     검색
 *     
 *     1. startsWith : 시작문자열이 같은 경우
 *        public boolean startsWith(String prefix) =>접두어
 *        
 *     2. endsWith : 끝나는 문자열이 같은 경우
 *        public boolean endsWith(String suffix) =>접미어
 *        
 *     3. contains : 문자열안에 포함된 문자열
 *        public boolean contains(String str) : 실제 검색
 *        
 *     4. equals : 문자열이 같은경우
 *        public boolean equals(String s)
 *        
 *     5. equalsIgnoreCase : 문자열이 같은경우(대소문자 구분 안함)
 *        public boolean equalsIgnoreCase(String s)
 *     ------------------------------------------------------------------------------
 *     변경 (문자열 변경, 추가, 제거)
 *     
 *     1. concat : + 문자열 결합 (MySQL에서 concat)
 *        public String concat(String  s)
 *        
 *     2. trim() : 좌우의 공백을 제거
 *        public String trim();
 *     
 *     3. replace() : 문자,문자열 변경
 *        public String replace(char c1, char c2)
 *        public String replace(String s1, String s2)
 *                              ---------- ----------
 *                                 old        new
 *     
 *     4. replaceAll() : 정규식(문자열의 패턴)을 이용해서 문자열 변경
 *                       [가-힣] 한글전체 [A-Za-z] 알파벳전체 [0-9]
 *        public String replaceAll(String pattern, String s)
 *        
 *     5. substring() : 문자 자르기
 *        public String substring(int startIndex)
 *        public String substrung(int startIndex, int endIndex)
 *        
 *     ----------------------------------------------------------------------
 *     문자의 위치
 *     
 *     1. indexOf : 앞에서부터 찾기
 *        public int indexOf(char c)
 *        public int indexOf(String s) : 문자나 문자열이 전달된 인덱스 이후 처음으로 등장하는 인덱스 반환
 *        
 *     2. lastIndexOf : 뒤에서부터 찾기
 *        public int lastIndexOf(char c)
 *        public int lastIndexOf(String s)
 *        
 *     -----------------------------------------------------------------------
 *     
 *     모든 데이터형을 문자열로 변환
 *     valueOf() : 유일하게 static
 *     public String value(int a)
 *     public String value(double a)
 *     public String value(char[] a)
 *     ......
 *     
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
