package com.sist.exception;

import java.io.FileReader;
import java.io.IOException;

//CheckException : 컴파일러가 검증(예외처리 했는지 여부)

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader fr=null;
//		try {
//			fr=new FileReader("c:\\javaDev\\movie.txt");
//			int i=0; //한글자씩 읽기
//			while((i=fr.read())!=-1) {// =1 EOF(End Of File)
//				System.out.println((char)i);
//			}
//		}catch(IOException e) {
//			System.out.println("파일이 존재하지 않는다");
//		}finally {
//			try {
//				fr.close();
//			} catch (IOException e) {
//				System.out.println("파일 닫기 실패");
//			}
//		}
		try (FileReader fr=new FileReader("c:\\javaDev\\예외처리_1.java")){ //fr.close를 자동 반환
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println("파일이 존재하지 않는다");
		}

	}

}
