package com.sist.collection;

import java.util.ArrayList;

/*
 * Stack : LIFO => 메모리 Last In First Out
 * 
 * int a=10{
 *   //3
 *    int b=20{
 *      //2
 *       int c=30{
 *         //1
 *       }
 *    }
 * }
 * 
 * Queue : FIFO => First In First Out
 * 
 * Stack : 저장 / 출력
 *         push  pop
 *         
 * Queue : 저장 / 출력
 *         opper  poll
 *         => !empty()
 */
public class MainClass_Stack_Queue {
	private int s_index;
	private int e_index;
	private int[] arr=new int[10];
	public MainClass_Stack_Queue(){
		s_index=0;
		e_index=arr.length-1;//9
	}
	public void push(int a) {
	    arr[s_index]=a;
	    s_index++;
	}
	public void pop() {
		for(int i=e_index;i>=0;i--) {
				System.out.println(arr[i]);
		}
	}
	
    public static void main(String[] args) {
	
    	MainClass_Stack_Queue sq=new MainClass_Stack_Queue();
    	sq.push(1);
    	sq.pop();
    	System.out.println("=====");
    	sq.push(2);
    	sq.pop();
    	sq.push(3);
    	sq.pop();
    }
}
