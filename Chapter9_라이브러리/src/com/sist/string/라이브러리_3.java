package com.sist.string;

public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals : 같은경우에 true / 다른 경우에 false
		// 원형 : public boolean equals(String s)
		// ==> 일반 문자열은 같은 문자면 주소가 동일
		String s1="Hello";
		String s2="Hello";
		if(s1==s2)//메모리 주소값이 동일한가? 
			System.out.println("s1==s2");
		else
			System.out.println("s1!=s2");
		
		String s3=new String("Hello");//새로운 메모리에 저장
	    if(s1==s3)
	    	System.out.println("s1==s3");
	    else
	    	System.out.println("s1!=s3");
	}

}
