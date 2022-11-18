package com.sist.exception;

import java.util.Arrays;
import java.util.Scanner;

public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        int[] com=new int[3];
        int[] user=new int[3];
        
        for(int i=0;i<com.length;i++) {
        	com[i]=(int)(Math.random()*9)+1;
        	for(int j=0;j<i;j++) {
        		if(com[i]==com[j]) {
        			i--;
        			break;
        		}
        	}
        }
        
//        System.out.println(Arrays.toString(com)); //값이 제대로 들어가는지 확인
        Scanner sc=new Scanner(System.in);
        while(true) {
        	try{
        		System.out.print("세자리 정수 입력 : ");
        		int input=sc.nextInt();
        		if(input<100 || input>999) {
        			//Exception e=new Exception();
        			//throw e;
        			
        			//Thread t=new Thread();
        			//t.start();
        			//new Thread().start();
        			throw new Exception("세자리 정수만 입력 가능");
        		}
        		user[0]=input/100;
        		user[1]=(input%100)/10;
        		user[2]=input%10;
        		if(user[0]==user[1] || user[0] == user[2] || user[1] == user[2]) {
        			throw new Exception("같은 수는 입력 불가");
        		}
        		if(user[0]==0 || user[1]==0 || user[2]==0) {
        			throw new Exception("0은 입력할 수 없다");
        		}
        		
        		int s=0,b=0;
        		for(int i=0;i<3;i++) {
        			for(int j=0;j<3;j++) {
        				if(com[i]==user[j]) {//같은 숫자가 있다면
        					if(i==j) {//자릿수까지 같다면
        						s++;
        					}else {//자릿수가 다르다면
        						b++;
        					}
        				}
        			}
        		}
        		System.out.printf("Input Number:%d, Result: %dS-%dB\n",input,s,b);
        		if(s==3) {
        			break;
        		}
        	}catch(Exception e) {
        		System.out.println(e.getMessage());
        	}
        }
	}

}
