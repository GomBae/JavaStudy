package com.sist.regex;
// 패턴 => 형태를 만들어서 찾기
// 예 ) IP전체를 가지고 온다 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
					//		숫자 (1개~3개)
/*
 * [가-힣]
 * [A-Za-z]
 * [A-Z]
 * [a-z]
 * [0-9]
 * [abc] => a|b|c
 * [] => 범위
 * {} => 갯수
 * 
 * ^ : 시작, 제외 => ^[가-힣]{3} (한글로 시작해서 3글자) => [^가-힣]{3} (한글을 제외하고 3글자)
 * $ : 끝 => [A-Z]$ (대문자로 끝나는 문자열)
 * . : 임의의 글자 1개
 * .* : 모든 문자
 * + : 한글자 이상
 * * : 0글자 이상
 * -------------------------------------------
 * [0-9] ==> \\d  [^0-9] ==> \\D
 * \\s 공백문자 \\S공백문자 제외
 * \\w 알파벳,숫자 \\W
 *  [A-Za-z0-9]    [^A-Za-z0-9]
 * 
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MainClass_Regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"bat","baby","bonus","c","cA",
				"ca","co","c.","c0","c#",
				"car","combat","count","date","disc",
				"홍길동","맛있다OK","시작12345"
		};
		/*
		 * c[a-z]*
		 * c[a-z]
		 * c[a-zA-Z0-9]
		 * .* => 전체읽기 (한글자 포함)
		 * .+ => 두개
		 */
		Pattern p=Pattern.compile("[bcd]*");
		for(String s:data) {
			Matcher m=p.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}

	}

}
