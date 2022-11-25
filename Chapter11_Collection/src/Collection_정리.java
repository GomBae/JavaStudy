import java.util.ArrayList;
import java.util.Vector;

/*
 * 컬렉션
 * ----- 데이터를 모아서 메모리에 저장(자료구조 : 메모리에 저장된 데이터를 쉽게 관리)
 *       컬렉션 프레임워크 : 표준화 (동일하게 사용)
 *                        |
 *                     인터페이스(대표적인 표준화)
 *                     
 *                     Collection
 *                        |
 *                ------------------------
 *                |          |           |
 *              list        Set         Map
 *                |          |           |
 *                        HashSet      HashMap
 *          --------------------
 *          |         |        |
 *        ArrayList  Vector   LinkedList
 *        
 *        -----------------------------------------------
 *         List : 순서가 있다, 데이터 중복 허용
 *                ArrayList, Vector, LinkedList, Stack, Queue
 *        -----------------------------------------------
 *         Set : 순서가 없다, 데이터 중복을 허용하지않음
 *               HashSet, TreeSet
 *        -----------------------------------------------
 *         Map : key와 value 쌍으로 저장
 *               key는 중복 불가, value는 중복 가능
 *               put("id","admin")
 *               Session, Cookie
 *        -----------------------------------------------
 *        
 *        Collection(자료구조 ==> CRUD)
 *          => add() : 자료추가
 *          => get() : 자료읽기
 *          => set() : 자료수정
 *          => remove() : 자료삭제
 *          
 *        ArrayList
 *        ---------- 인덱스번호를 자동으로 조절=> 순차적으로 생성 : 데이터 수집용
 *                                      => Object로 만들어져서 항상 형변환을 시켜야함 
 *                                      <제네릭스>를 사용
 *        
 */
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		System.out.println(list);
		Vector vec=new Vector();
		vec.add(1);
		vec.add(2);
		System.out.println(vec);
		//표준화(인터페이스)를 통해 동일한 메소드를 사용하게 만든다.

	}

}
