package com.sist.collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  Collection
 *      |
 *     Map
 *   ----------- interface
 *      |
 * ------------------
 * |                |
 * HashTable      HashMap
 * 
 * 특징)
 *   두개씩 동시에 저장 <key,value>
 *   key 중복 불가 value는 중복가능
 *   => key는 문자열로 저장 value는 상관없다
 *      사용처 : 웹에서 지원하는 모든 클래스 (Map형식)
 *   주요 메소드
 *       = put("key",value)
 *       = get("key")
 */
public class MainClass_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("password", "4567");//덮어쓴다
//		System.out.println("ID:"+map.get("id"));
//		System.out.println("password : "+map.get("password"));
//		System.out.println("이름 : "+map.get("name"));
//		System.out.println("성별 : "+map.get("sex"));
//		System.out.println("나이 : "+map.get("age"));
		Set set=map.keySet(); //Map에 저장된 키만 저장
		System.out.println(set);
		for(Object obj:set) {
			String key=(String)obj;
			System.out.println(key+" : "+map.get(key));
		}

	}

}
