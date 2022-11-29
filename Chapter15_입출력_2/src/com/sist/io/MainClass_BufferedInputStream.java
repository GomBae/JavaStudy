package com.sist.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * Input / Reader ==> 읽기
 * Output / Writer ==> 쓰기
 * ------
 *    | 파일전송 / 파일복사 ==> 영문,숫자,특수문자 => 정상수행
 *                         --------------- 1byte, 2byte
 */
public class MainClass_BufferedInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedInputStream bis=
					new BufferedInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			int i=0;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
			}
			bis.close();
		}catch(Exception e) {
			
		}
	}

}
