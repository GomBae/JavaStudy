package com.sist.lang;
//클래스 복제시에 인터페이스 
class Sawon implements Cloneable{
	private String name;
	private String dept;
	private String loc;
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
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	// 라이브러리는 예외처리가 필요한 부분을 예측해서 설정
	
	
}
/*
 *    Object (상위)
 *      |
 *    Sawon (하위)
 */

public class 라이브러리_clone_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("서울");
		
		//Sawon copy=sa;
		Sawon copy=(Sawon)sa.clone(); //라이브러리 메소드 호출시에 대부분 Object라서 형변환 시켜줘야함
		Sawon sa1=new Sawon();//초기값
		
		System.out.println("sa : "+sa);
		System.out.println("copy : "+copy);
		System.out.println("sa1 : "+sa1);
		
		System.out.println("sa.name="+sa.getName());
		System.out.println("sa.dept="+sa.getDept());
		System.out.println("sa.loc="+sa.getLoc());
		System.out.println("sa1.name="+sa1.getName());
		System.out.println("sa1.dept="+sa1.getDept());
		System.out.println("sa1.loc="+sa1.getLoc());
		System.out.println("copy.name="+copy.getName());
		System.out.println("copy.dept="+copy.getDept());
		System.out.println("copy.loc="+copy.getLoc());
	}

}
