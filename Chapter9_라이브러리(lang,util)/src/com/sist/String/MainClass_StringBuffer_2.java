package com.sist.String;

import java.io.FileReader;
/*
 *   StringBuffer sb=new StringBuffer(); //문자열을 저장하는 메모리 임시공간(Buffer)
 *   ----------------------------------
 *   sb.append("Hello ");
 *                    0x100
 *   --sb-----       ----------
 *   0x100     ->     Hello
 *   ---------       ----------
 *   
 *   sb.append("Java");
 *               0x100
 *   ---sb----   ---------
 *   0x100        Hello
 *   ---------   ---------
 *   
 */
public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));//문자열 경합 ==> 최적화
			}
			System.out.println(sb.toString());
			//문자열 결합 => append(), String으로 변경 => toString()
		}catch(Exception e) {
			
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}

}
