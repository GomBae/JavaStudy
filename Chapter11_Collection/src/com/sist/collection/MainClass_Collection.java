package com.sist.collection;

import java.util.ArrayList;

/*
 * 1. String : 웹 => 문자열 제어
 * 2. Integer / Double 
 * 3. Date / Calendar
 * ----------------------------- 오라클의 데이터형 (문자열, 날짜형, 숫자형)
 * 4. 데이터를 모아서 관리 : 배열
 *    배열 => 단점 (고정적) => 크기를 확장하기 어렵다 (메모리 누수 => 최적화의 문제)
 *                 |
 *               가변형 (수시로 변경 가능) ==> 크기를 정하지 않는다 ==> 컬렉션
 * 5. 컬렉션 : 데이터는 어떤형이든 등록 가능 => 형변환 => 데이터형을 한개로 통일 (제네릭스)
 *    ----- 열거형, Properties 
 *    ----- if문대신 사용할 수 있는 프로그램 (어노테이션)
 *    
 *    컬렉션 프레임워크
 *         -------- (표준화) => 스프링 프레임워크(형식통일) 
 *    = 종류
 *                         Collection : 인터페이스
 *                             |
 *           --------------------------------------------------
 *           |                     |                          |
 *          List                  Set                        Map => 인터페이스 ==> 메소드가 거의 동일
 *           |                     |                          |
 *           |                --------------            ------------------
 *           |                |            |            |                |
 *           |             HashSet      TreeSet      HashTable         HashMap
 *    -------------------------
 *    |         |           |  => 인터페이스를 구현한 클래스 (주로 사용)
 * ArrayList  Vector      Queue
 *                          |
 *                      LinkedList
 *                      
 *   List
 *     1) 순서를 가지고 있다(인덱스) ==> 배열형식
 *     2) 저장된 데이터가 중복이 가능
 *     3) 비동기화 ==> 데이터베이스 프로그램에서 주로 사용
 *     4) CRUD ==> 데이터 처리(추가, 수정, 삭제, 검색)
 *        => INSERT UPDATE DELETE SELECT
 *     5) 주요 메소드
 *        = add() => 데이터 추가
 *        = remove() => 데이터 삭제
 *        = set() => 데이터 수정
 *        = get() => 데이터 읽기
 *        = size() => 저장된 갯수
 *        = clear() => 전체를 삭제
 *        = isEmpty() => 존재여부 확인
 *  
 *  -----------------------------------------------------------------------
 *   Set
 *     1) 순서가 없다 (인덱스 번호가 없다) => 출력 (forEach)
 *     2) 데이터 중복을 허용하지 않는다
 *     3) List에서 중복이 없는 데이터를 추출
 *     4) HashSet
 *     5) 주요 메소드
 *        = add() => 데이터 추가
 *        = remove() => 데이터 삭제
 *        = set() => 데이터 수정
 *        = get() => 데이터 읽기
 *        = size() => 저장된 갯수
 *        = clear() => 전체를 삭제
 *        = isEmpty() => 존재여부 확인
 *  -----------------------------------------------------------------------
 *   Map (웹에서 지원하는 모든 클래스는 Map형식을 가지고 있다)
 *     1) key 와 value 쌍으로 저장
 *     2) 키는 중복이 불가, 값은 중복이 가능
 *     3) 클래스관리, 요청값 관리, 전송값 관리
 *     4) 주로 사용 => HashMap(동일하게 => properties)
 *  -----------------------------------------------------------------------
 *  1. ArrayList => (데이터 중복을 허용 => 데이터베이스와 연동)
 *     저장 ==> Object
 *     add() ==> 오버로딩
 *     add(데이터)
 *     add(인덱스번호,데이터) ==> 권장사항x (속도저하)
 *     => 인덱스번호가 순차적으로 생성, 삭제될때도 인덱스번호가 자동 수정됨
 *     => 데이터를 가지고 올때 형변환 필요 ==> 같은 데이터형을 저장
 */
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>(); //크기를 지정하지않는다 ==> 가변형
		//저장
		list.add("길동"); //인덱스 0
		list.add("심청"); //인덱스 1
		list.add("순신"); //인덱스 3
		list.add("감찬"); //인덱스 4
		list.add(2,"지문덕"); //인덱스 2 
		
		System.out.println(list.size());
		//size() ==> 저장된 갯수 ==> 배열의 length
		for(int i=0;i<list.size();i++) {
//			String name=(String)list.get(i);//데이터를 가지고올 때 형변환 필요
			String name=list.get(i).toString();
			//         ------------ Object
			System.out.println(i+"=>"+name);
		}
		System.out.println("========== 컬렉션 수정 set() ==============");
		// 2번 수정 ==> set(2,"수정데이터")
		list.set(2, "박문수");
		for(int i=0;i<list.size();i++) {
//			String name=(String)list.get(i);//데이터를 가지고올 때 형변환 필요
			String name=list.get(i).toString();
			//         ------------ Object
			System.out.println(i+"=>"+name);
		}
		System.out.println("========== 삭제 remove() ============");
		// remove(int index)
		list.remove(3);
		for(int i=0;i<list.size();i++) {
//			String name=(String)list.get(i);//데이터를 가지고올 때 형변환 필요
			String name=list.get(i).toString();
			//         ------------ Object
			System.out.println(i+"=>"+name);
		}
		
		System.out.println("========== 전체 삭제 clear() ==========");
		list.clear();
		System.out.println(list.size());
		if(list.isEmpty()) {
			System.out.println("데이터가 없음");
		}
		/*
		 * 1. add(Object o) ==> Object(데이터형은 모든것을 사용할 수 있다) ==> 클래스형을 저장
		 * 2. set(int index,Object o)
		 * 3. remove(int index)
		 * 4. int size()
		 * 5. boolean isEmpty()
		 * 6. get(int index,Object o)
		 * 
		 * ==> [] 배열을 => List로 바꿀때 => asList()
		 */
		
		

	}

}
