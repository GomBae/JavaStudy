/*
 * Collection => java.util.*
 * -----------------------
 *    List
 *      ArrayList
 *        = 배열기반 (인덱스번호를 가지고 있다) => 순차적으로 생성
 *        = 추가 / 삭제 속도가 느려짐
 *        = 순차적으로 추가할때는 가장빠르다
 *        = 데이터에 접근하는 접근성이 뛰어나다
 *        = 순서를 가지고 있다 / 값 중복 허용
 *          주요기능
 *            add(), get(), size(), isEmpty(), clear()
 *      Vector
 *        = 동기화
 *
 *      LinkedList
 *        = 연결기반 (메모리 크기가 크다 => 다음에 있는 데이터 주소, 본인 데이터주소 2개 가지고있음)
 *        = 데이터 추가, 삭제시에 속도가 빠르다
 *        = 데이터에 대한 접근성이 낮다
 *        
 *        ===================== List list=new ArrayList()
 *        						list=new LinkedList()
 *        						list=new Vector()
 *        
 *    Set
 *      HashSet
 *        = 중복이 없는 데이터 저장, 순서가 존재하지 않는다.
 *          add(), get(), remove(), isEmpty(), clear()
 *          => 리스트에서 중복된 데이터를 제거
 *    
 *    Map
 *      HashMap
 *        = (key,value) 동시에 저장
 *        = key는 저장된 값을 읽을 때 사용
 *        = key는 중복되면 덮어쓰기
 *        put() : 추가 
 *        get() : 읽기 
 *        isEmpty() : 확인 
 *        clear() 
 *    
 *    Properties
 *        = 파일로 만들어진다
 *        load() : 파일 읽기
 *        getProperties() : 파일에서 데이터 읽기
 *        setProperties() : 파일에 저장할 내용 설정
 */
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
