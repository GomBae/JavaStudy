package com.sist.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass_Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		for(;;) {
			int r=(int)(Math.random()*45)+1;
			set.add(r);
			if(set.size()==6)
				break;
		}
		System.out.println(set);
		List list=new ArrayList(set);//sort이용 시 list로 변환
		Collections.sort(list);
		System.out.println(list);
		
		//sort 역순
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i) + " ");
		}

	}

}
