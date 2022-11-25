package com.sist.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 *       Collection
 *           |
 *          Set
 *           |
 *   --------------------
 *   |                  |
 *  HashSet           TreeSet
 *  
 *  Set
 *    = 순서가 없다
 *    = 데이터 중복을 허용하지않는다
 *    = 중복데이터 제거
 *    
 *  기능
 *    = 추가 : add()
 *    = 삭제 : remove()
 *    = 전체삭제 : clear()
 *    = 복사 : addAll()
 *    = 존재여부 : isEmpty()
 *    = 갯수 : size()
 *    두개의 set이 있는 경우에 같은 데이터만 모아준다 : retainAll()
 *    
 */
public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"길동이","감찬이","문덕이","호동이","흥민이","지성이","길동이","문덕이","가나다","호랑이"};
		Set set=new HashSet();
//		for(String name:names) {
//			set.add(name);//중복을 제거 => 중복된 데이터가 있는 경우에는 추가 할 수 없다
//		}
//		System.out.println(set);
		List list=Arrays.asList(names);//배열을 List로 변환
		set.addAll(list);//List에 있는 데이터전체 복사(중복제거 하면서 복사)
		System.out.println(set);//set출력 (중복이 제거된 데이터)
		
		System.out.println("========== 삭제 =========");
		set.remove("가나다");
		System.out.println(set);
		System.out.println("======= 전체 삭제 =======");
		set.clear();
		if(set.isEmpty())
			System.out.println(set);
			System.out.println("set => clear");
	}

}
