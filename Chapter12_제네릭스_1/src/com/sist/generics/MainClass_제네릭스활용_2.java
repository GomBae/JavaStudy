package com.sist.generics;

import java.util.ArrayList;

class Sawon{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String loc, int pay) {
		
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	public Sawon() {}
	
	
}
public class MainClass_제네릭스활용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","서울",300));
		list.add(new Sawon(2,"문수","기획부","부산",300));
		list.add(new Sawon(3,"동길","재핵부","대전",300));
		list.add(new Sawon(4,"수문갑","가능부","대구",300));
		list.add(new Sawon(5,"이홍배","주공부","강원",300));
		
		System.out.println("=========== 사원목록 ==============");
		for(Sawon sa:list) {
			System.out.println(sa.getSabun()+" "
					+sa.getName()+" "
					+sa.getDept()+" "
					+sa.getLoc()+" "
					+sa.getPay()+" ");
		}

	}

}
