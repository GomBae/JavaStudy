package com.sist.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Model{
	public void execute();
}
class BoardModel implements Model{
	public void execute() {
		System.out.println("게시판");
	}
}
class NoticeModel implements Model{

	public void execute() {
		System.out.println("공지");
	}
}
class ReserveModel implements Model{
	public void execute() {
		System.out.println("예약");
	}
}
/*
 * clear()
 * get()
 * ketSet() => 키 전체를 모아서 리턴
 * put() => 데이터 저장 put(Object key, Object value)
 * isEmpty()
 * size()
 * values()
 * 
 */
class Container{
	private Map map=new HashMap();
	public Container() {
		map.put("board", new BoardModel());
		map.put("notice", new NoticeModel());
		map.put("reserve", new ReserveModel());
	}
	public Model getBean(String key) {
		return (Model)map.get(key);
	}
}
public class MainClass_Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		Scanner sc=new Scanner(System.in);
		System.out.print("메뉴선택 : ");
		String menu=sc.next();
		
		Model m=c.getBean(menu);
		m.execute();

	}

}
