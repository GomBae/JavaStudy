package com.sist.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor //디폴트 생성자 만들기
//@AllArgsConstructor// 모든 매개변수를 가진 생성자 만들기
//어노테이션 ==> 구분자
public class MusicVo {
	@Getter
	@Setter
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;
	
}
