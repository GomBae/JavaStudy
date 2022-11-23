package com.sist.String;

import java.util.Arrays;
//https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j35i39j0i131i433i512j0i433i512j0i512l3j0i433i512j0i512.740j0j4&sourceid=chrome&ie=UTF-8
public class MainClass_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//%EC%9E%90%EB%B0%94
			//EC9#90EBB094 ==> 인코딩 byte[]
			String name="자바";
			byte[] b=name.getBytes("UTF-8");
			System.out.println(Arrays.toString(b));
			for(byte bb:b) {
				System.out.print(String.format("%02X", bb));
			}
			System.out.println("\n=========== 디코딩 =============");
			byte[] b2=name.getBytes("CP949");
			for(byte bb:b2) {
				System.out.print(String.format("%02X", bb));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
