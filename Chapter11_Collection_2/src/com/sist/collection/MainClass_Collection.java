package com.sist.collection;

import java.util.ArrayList;
import java.util.Vector;

/*
 *   1) List
 *      = 순서를 가지고 있다(인덱스)
 *      = 중복 데이터를 허용
 *      = 데이터베이스에서 주로 사용
 *      = 구현된 클래스
 *        ArrayList
 *        Vector
 *        LinkedList
 *        Stack
 *        Queue
 *        
 *   2) Set
 *      = 순서가 없다
 *      = 데이터 중복을 허용하지않는다
 *      = Map의 데이터 읽기, 데이터의 중복을 제거할 때 주로 사용
 *      = TreeSet / HashSet
 *      
 *   3) Map
 *      = key, value로 만들어짐 (두개를 동시에 저장)
 *      = key는 중복 x , value는 중복 허용
 *      = Map<k,v>
 *      = HashTable : HashMap의 단점을 보완
 *      
 *   Object(형변환 없이 사용 => 제네릭스)
 *   -------
 *          클래스<String>
 *          = Annotation
 *   
 *   ArrayList 
 *     추가 : add(Object o)
 *     수정 : set(int index, Object o)
 *     삭제 : remove(int index)
 *     읽기 : get(int index)
 *     갯수 : size()
 *     전체삭제 : clear()
 *     확인 : isEmpty()
 *     
 *   HashSet : 중복데이터 제거
 *     add(), remove(), clear, isEmpty
 *   HashMap : 
 *     추가 : push(key,value)
 *     읽기 : get(key)
 *   ---------------------------------------
 *   removeAll() , addAll() , retainAll
 *   -----------   --------   ------------
 *    차집합          합집합        교집합
 */
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector list=new Vector();
		//Vector만 가지고있는 메소드
		/*
		 * 자료구조 (데이터관리)
		 * CRUD
		 * 추가 : add() ====> addElement()
		 * 수정 : set() =====> setElementAt()
		 * 삭제 : remove() =====> remove(), removeAll(), clear()
		 * 읽기 : get() =========> elementAt()
		 * 갯수 : size()
		 */
		//추가
		list.addElement("Honggil"); //index => 0
		list.addElement("Sangil"); //index => 1
		list.addElement("Gangil"); //index => 2
		list.addElement("호랑이"); //index => 3
		list.addElement("사자"); //index => 4
		list.addElement("개구리"); //index => 5
		// 출력
		System.out.println("========= 일반 for ==========");
		for(int i=0;i<list.size();i++) {
			String name=(String)list.elementAt(i);
			System.out.println(name);
		}
		//출력
		System.out.println("=========== 람다 ============");
		list.forEach((name)->System.out.println(name));
		//출력
		System.out.println("========== forEach ===============");
		for(Object o:list) {
			System.out.println(o);
		}
		
		//ArratList로 변경
		// 변경 1
		// 생성자에 Vector를 넣어줌
		ArrayList list2=new ArrayList(list);
		System.out.println("Vector를 ArrayList로 변환");
		System.out.println(list2);
		// 변경 2
		// 새로운 리스트에 addAll메소드를 통해 Vector의 값을 저장해줌
		ArrayList list3=new ArrayList();
		list3.addAll(list);
		System.out.println("Vector를 ArrayList로 변환 2");
		System.out.println(list3);
		
		//Vector에서 데이터 수정
		System.out.println("Vector에서 데이터 수정");
		list.setElementAt("가나다라", 2);
		System.out.println(list);
		
		System.out.println("===== Vector에서 데이터 삭제 =====");
		list.removeElementAt(1);
		System.out.println(list);
		System.out.println("===== Vector에서 데이터 전체 삭제 ====");
		list.removeAllElements();//clear()
		System.out.println(list);

	}

}
