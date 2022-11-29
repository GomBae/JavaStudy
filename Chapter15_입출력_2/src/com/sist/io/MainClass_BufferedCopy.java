package com.sist.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass_BufferedCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("c:\\javaDev\\Library\\lombok-1.18.24.jar"));
			BufferedOutputStream bos=
					new BufferedOutputStream(new FileOutputStream("c:\\java_data\\lombok.jar"));
			byte[] buffer=new byte[1024];
			int i=0;
			while((i=bis.read(buffer,0,1024))!=-1) {
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
			System.out.println("파일복사완료");
		}catch(Exception e) {}

	}

}
