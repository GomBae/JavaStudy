package com.sist.io2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//FileReader에 대한 보조 스트림 => BufferedReader는 많이 사용되는 클래스 => 한줄씩 읽을 수 있다
public class MainClass_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//서버에서 전송값 받기, 웹에 있는 HTML, 클라이언트 전송값
			BufferedReader in=
					new BufferedReader(new InputStreamReader(new FileInputStream("c:\\javaDev\\genie.txt")));
			//InputStrream(1byte) ==> Reader(2byte)로 변경
			while(true) {
				String music=in.readLine(); //한줄씩
				if(music==null)
					break;
				System.out.println(music);
			}
			in.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
