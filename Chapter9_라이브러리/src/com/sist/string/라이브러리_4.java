package com.sist.string;

import java.util.Arrays;

//concat, replace, replaceAll, substring, split
//indexOF, lastIndexOf, valueOf
public class 라이브러리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// concat => 문자열 결합 (+)
		// 원형 : public String concat(String s)
//		String s1="Hello";
//		String s2="Java";
//		String s12=s1.concat(s2);
//		
		//replace
//		String s="Hello Java";
//		String s1=s.replace('a','b');//hello jbvb
//		

		//replaceAll ==> 정규식
		//원형 : public String replaceAll(String p, String s)
		String s="안녕하세요 Hello 1234";
		System.out.println(s.replaceAll("[^가-힣]", ""));
		//^ ==> 제외하고 라는 뜻
		System.out.println(s.replaceAll("[^A-Za-z]", ""));
		
		String ss="Hello Java";
		String ss1=ss.substring(6);
		System.out.println(ss1);
		String ss2=ss.substring(0,5);
		System.out.println(ss2);//마지막은 제외
		//원형 
		//public String substring(int s) : s부터 나머지 전체를 읽어온다
		//public String substring(int s, int e) : s부터 e-1번까지 읽어온다
		
		String sss="red,green,black,white,pink";
		String[] color=sss.split(",");
		System.out.println(Arrays.toString(color));
		// 원형 : String[] split(String regex) ==> 정규식
		// 정규식 기호 : . | ^ ? + * ==> \\. \\| \\^ \\? .......
		String temp2="asdasfgs.rhhdfhfjdfgd.png";
		String k=temp2.substring(temp2.lastIndexOf(".")+1);
		System.out.println(k);
	
		//valueOf() :문자열 변환
		int a=10;
		int b=20;
		String p1=String.valueOf(a);
		String p2=String.valueOf(b);
		System.out.println(p1+p2);
	}

}
