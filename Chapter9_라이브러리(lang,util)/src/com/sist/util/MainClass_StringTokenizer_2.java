package com.sist.util;
import java.util.*;
public class MainClass_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"100|hong|남자|대기실",
				"200|자바방|5|공개",
				"210|자바방|hong",
				"300|hong|shim|Hi~",
				"400|hong"
		};
		for(String msg:data) {
			StringTokenizer st=new StringTokenizer(msg,"|");
			int protocol=Integer.parseInt(st.nextToken());
			switch(protocol) {
			  case 100:
			  {
				  String id=st.nextToken();
				  String sex=st.nextToken();
				  String loc=st.nextToken();
				  System.out.println(id+"님(은) "+loc+"에 입장");
			  }
			  break;
			  case 200:
			  {
				  String rName=st.nextToken();
				  String rInwon=st.nextToken();
				  String rState=st.nextToken();
				  System.out.println("방이름 : "+rName+",인원:"+rInwon+", "+rState+"입니다");
			  }
			  break;
			  case 300:
			  {
				  String myId=st.nextToken();
				  String youId=st.nextToken();
				  String m=st.nextToken();
				  System.out.println(myId+"님이 "+youId+"님께 쪽지를 전송 :"+m);
			  }
			  break;
			  case 400:
			  {
				  String id=st.nextToken();
				  System.out.println(id+"가 퇴장");
			  }
			}
			
		}

	}

}
