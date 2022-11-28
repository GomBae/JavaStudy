package com.sist.main;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
// Retention ==> 저장기간
/*
 *  SOURCE, CLASS => 컴파일후에 자동으로 사라진다
 *  RUNTIME => 프로그램 종료시까지 유지
 */
@Target(METHOD)
/*
 *  Target => 구분자
 *         => TYPE : class 구분자(찾기)
 *         => METHOD : 메소드 구분자(메소드 찾기)
 *         => CONSTRUCTOR : 생성자 찾기
 *         => PARAMETER : 매개변수 찾기
 *         => FIELD : 멤버변수 찾기
 */
public @interface RequestMapping {

	public String value();//RequestMapping(write.do)

}
