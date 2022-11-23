package com.sist.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//객체 단위 저장
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
public class MainClass_ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(new Sawon(1,"홍길동","개발부","서울",3000));
		list.add(new Sawon(2,"심청이","기획부","경기",3500));
		list.add(new Sawon(3,"개똥이","자재부","대구",3200));
		list.add(new Sawon(4,"말똥이","개발부","부산",4000));
		list.add(new Sawon(5,"이순신","총무부","대전",4500));
		
		//사원 목록 출력
		System.out.println("======= 사원 목록 =======");
		for(int i=0;i<list.size();i++) {
			Sawon sa=(Sawon)list.get(i);
//			System.out.println("사번 : "+sa.getSabun());
//			System.out.println("이름 : "+sa.getName());
//			System.out.println("부서 : "+sa.getDept());
//			System.out.println("근무지 : "+sa.getLoc());
//			System.out.println("연봉 : "+sa.getPay());
//			System.out.println("===========================");
			System.out.println(sa.getSabun()+" "+sa.getName()+" "+sa.getLoc()+" "+sa.getDept());
		}
		System.out.println("==================================");
		ArrayList temp=new ArrayList();
		temp.addAll(list);//전체 데이터 저장 ==> 중복 데이터 제거 => 제거된 데이터를 받는 경우
		//addAll() ==> Vector/list/
		Scanner sc=new Scanner(System.in);
//		System.out.println("이름 입력 : ");
//		String name=sc.next();
//		System.out.println("==== 정보 출력 ====");
//		for(int i=0;i<list.size();i++) {
//			Sawon sa=(Sawon)list.get(i);
//			if(sa.getName().equals(name)) {
//				System.out.println("사번 : "+sa.getSabun());
//				System.out.println("이름 : "+sa.getName());
//				System.out.println("부서 : "+sa.getDept());
//				System.out.println("근무지 : "+sa.getLoc());
//				System.out.println("연봉 : "+sa.getPay());
//				break;
//			}
//		}
//		System.out.println("========= 데이터 추가 =======");
//		Sawon sa=new Sawon();
//		System.out.print("이름 입력 : ");
//		sa.setName(sc.next());
//		System.out.print("부서 입력 : ");
//		sa.setDept(sc.next());
//		System.out.println("근무지 입력 : ");
//		sa.setLoc(sc.next());
//		System.out.println("연봉 입력 : ");
//		sa.setPay(sc.nextInt());
//		
//		int max=0;
//		for(int i=0;i<list.size();i++) {
//			Sawon s=(Sawon)list.get(i);
//			if(max<s.getSabun())
//				max=s.getSabun();
//		}
//		sa.setSabun(max+1);
//		list.add(sa);
//		
//		System.out.println("========= 추가된 인원 확인 ==========");
//		for(int i=0;i<list.size();i++) {
//			Sawon sa1=(Sawon)list.get(i);
//
//			System.out.println(sa1.getSabun()+" "+sa1.getName()+" "+sa1.getLoc()+" "+sa1.getDept());
//		}
		
		System.out.println("==================================");
		System.out.println("====== 부서별로 찾기 =====)");
	    ArrayList deptList=new ArrayList();
	    for(int i=0;i<list.size();i++) {
	    	Sawon s=(Sawon)list.get(i);
	    	deptList.add(s.getDept());
	    }
	    System.out.println(deptList);
		
	    //데이터중에 중복을 제거 Set(중복을 허용하지 않는다)
	    HashSet set=new HashSet();
	    for(int i=0;i<deptList.size();i++) {
	    	set.add(deptList.get(i));
	    }
//	    System.out.println(set);
	    int i=1;
	    for(Object obj:set) {
	    	System.out.println(i+"."+obj);
	    	i++;
	    }
	    
	    //데이터 찾기
	    System.out.print("부서명 입력 : ");
	    String dept=sc.next();
	    for(i=0;i<list.size();i++){
	    	Sawon s=(Sawon)list.get(i);
	    	if(s.getDept().equals(dept)) {
	    		System.out.println(s.getName()+" "+s.getDept());
	    	}
	    }

	}

}
