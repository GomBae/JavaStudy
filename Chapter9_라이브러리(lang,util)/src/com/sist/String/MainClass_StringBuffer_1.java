package com.sist.String;

import java.io.File;
import java.io.FileReader;

public class MainClass_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IO ==> CheckedException => 반드시 예외처리한다
		FileReader fr=null;
		try {
			long start=System.currentTimeMillis();
			fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0; //한글자를 읽어온다(문자(x), 문자번호)
			String movie="";
			while((i=fr.read())!=-1) {//v파일 끝까지 읽기
				movie+=String.valueOf((char)i);
			}
			long end=System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end-start));
			//읽은 데이터 출력
			System.out.println(movie);
		}catch(Exception e) {}
		finally {
			try {
				fr.close();//파일닫기
			}catch(Exception e) {}
		}

	}

}
