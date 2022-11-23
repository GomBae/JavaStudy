package com.sist.string;

import java.io.FileReader;
import java.util.Scanner;

public class 라이브러리_2 {

	public static String[] musicAllData() {
		String[] music=new String[100];
		//IO ==> 모든 클래스가 컴파일예외 (CheckedException) ==> 반드시 예외처리를 하고 사용한다
		//직접 처리 ==> try~catch~finally
		/*try (FileReader fr=new FileReader("");){//파일을 자동으로 닫는다
			
			
		}catch(Exception e) {}*/
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1) {
				data+=String.valueOf((char)i);
			}
//			System.out.println(data);
			String[] musicData=data.split("\n");
			int k=0;
			for(String m:musicData) {
				String[] temp=m.split("\\|");
				music[k]=temp[1];
				k++;
			}
		}catch(Exception e) {
			//오류확인
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) {
					fr.close();
				}
			}catch(Exception e) {}
		}
		return music;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] title=musicAllData();
        //startsWith ==> 접두어(시작하는 문자열 확인)
        //원형 : public boolean startsWith(String prefix) ==> LIKE
        Scanner sc=new Scanner(System.in);
        System.out.print("검색어 입력 : ");
        String fd=sc.next();
        
//        for(String s:title) {
//        	if(s.startsWith(fd))
//        		System.out.println(s);
//        	
//        }
//        for(String s:title) {
//        	if(s.endsWith(fd)) {//여러글자 사용도 가능
//        		System.out.println(s);
//        	}
//        }
        //contains ==> 포함 
        for(String s:title) {
        	if(s.contains(fd))
        		System.out.println(s);
        }
	}

}
