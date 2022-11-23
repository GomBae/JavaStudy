package com.sist.String;

import java.util.StringJoiner;

/*
 * StringBuffer : append() : 문자열 결합
 *                toString()
 * Math : random,ceil,round
 * Wrapper : parse...
 *           => 박싱, 언박싱
 * StringTokenizer : nextToken, counterToken, hasMoreTokents
 * Pattern / Matcher
 * -------   ------- find, group, compile
 */
public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors ="red,green,blue,black,white,yellow,magenta";
		String[] color=colors.split(",");
		for(String c:color) {
			System.out.println(c);
		}
		System.out.println("=== 출력형식(join) ===");
		String ss=String.join("-", color);
		System.out.println(ss);
		ss=colors.replace(",", "-");
		System.out.println(ss);
		//이미지 (여러개를 동시에 묶어서 저장) => 구분자를 사용해서 저장 => 데이터를 나눠서 출력
		//오라클 => ^
		StringJoiner sj=new StringJoiner("/","{","}");//{데이터/데이터/데이터}
		for(String s:color) {
			sj.add(s);
		}
		System.out.println(sj.toString());
		

	}

}
