package com.sist.main;

import java.util.Scanner;

import com.sist.manager.MusicManager;
import com.sist.vo.MusicVo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicManager m=new MusicManager();
		MusicVo[] music=m.musicListData();
		for(MusicVo vo:music) {
			System.out.println(vo.getTitle());
		}
		Scanner scan=new Scanner(System.in);
		System.out.print("노래 선택 (0~99) : ");//클릭
		int index=scan.nextInt();
		String key=m.musicDetailData(index);
		
		try {
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe "
					+ "http://youtube.com/embed/"+key);
		}catch(Exception e) {}
		

	}

}
