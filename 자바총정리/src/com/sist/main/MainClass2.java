package com.sist.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*라이브러리
 * java.lang (자바프로그램의 기본) => import
 *    1) Object => 최상위 클래스 (모든 클래스는 Object로부터 상속을 받는다)
 *              => 서로 다른 클래스를 묶어서 관리
 *              => 모든 라이브러리에서 객체를 리턴하는 메소드는 Object형을 가지고있다
 *                 ----------- 사용자가 어떤 클래스명을 사용할지 몰라서
 *                 
 *                 Object a=new A(); ==> 변수는 Object가 가지고 있는 변수만 제어 가능
 *                 A aa=(A)a;
 *                   Object가 가지고 있는 메소드만 호출이 가능 (메소드 -> 오버라이딩된 메소드를 호출한다)
 *               => toString() : 객체를 문자열로 변환 => 생략을 할 수 있다
 *               
 *               => finalize() : 소멸자 (가비지컬렉션 => 자동호출) => 재정의 (메모리 해제 여부 확인)
 *               => clone() : 복사 (같은 메모리 크기로 새로운 메모리 제작)
 *               => equals() : 객체 비교
 *                             비교 : == 주소값
 *                                 equals() ==> 실제 저장된 값 비교
 *               => 참조
 *                  class A
 *                  A a =new A();
 *                  A b=a; ===============> a,b는 같음 (매개변수로 값을 받는경우)
 *                                         Call By Reference (같은 주소를 제어)
 *                  
 *                  A a=new A();
 *                  A b=a.clone(); ============> 새로운 메모리가 생성됨 (주소값 다름)
 *    2) String
 *    3) StringBuffer
 *    4) Math
 *    5) Wrapper(데이터형을 클래스화) => Integer, Double, .....
 *    6) System
 * java.util
 *    1) StringTokenizer : 단어별 문자를 자를때 사용
 *       = 생성자 => new StringTokenizer(String data,구분자)
 *              => new StringTokenizer(String data) ==> 공백
 *              => 배열형식으로 => 데이터갯수가 넘으면 오류 발생
 *       = 구분된 데이터읽기 : nextToken() => String nextToken()
 *       = 구분된 데이너만큼 루프 처리 : haSMoreTokens() => 갯수가 다르거나 잘 모르는경우
 *       
 *       while(hasMoreToken()) ==> boolean hasMoreTokens()
 *       
 *       = countTokens() => 자른 갯수 => int countTokens()
 *    
 *    2) Date, Calendar => Date 기능은 없음 (날짜의 데이터형)
 *                      => Date에 없는 기능을 추가한 새로운 클래스 : Calendar
 *                      => Calendar는 추상클래스
 *                      Calendar cal=Calendar.getInstance();
 *                      ---------------------------------------
 *                      날짜 설정 : set(Calendar.YEAR,2022)
 *                                set(Calendar.MONTH,10) ==> MONTH는 0번부터 인식해서 해당달 -1을 적어줘야함
 *                                set(Calendar.DATE,30)
 *                      날짜 읽기 : get(Calendar.YEAR)
 *                      ....
 *                                get(Calendar.DAY_OF_WEEK) => 요일 
 *    
 *    3) ArrayList, HashSet, HashMap = Vector
 *       배열단점 : 같은 데이터형만 모아서 저장, 고정적이다
 *                --------------------- ---------
 *                다른 데이터형을 저장할 수 있다(Object) , 가변형
 *                
 *           Collection
 *               |
 *      ------------------------------
 *      |             |             |
 *     List        Set             Map
 *     
 *     List : 순서를 가지고 있다, 데이터 중복 허용
 *          => 구현된 클래스 : ArrayList, Vector, LinkedList
 *                          --------------------------------
 *                          add(), remove(), set(), get(), size(), clear()
 *     
 *     Set : 순서가 없다, 데이터 중복을 허용하지 않는다
 *           ArrayList에 저장된 데이터중에 중복된 데이터 제거
 *           HashSet / TreeSet
 *           --------
 *           add(), remove(), get(), clear(), size()
 *           
 *     Map : 키와 값을 동시에 저장
 *           키는 중복불가
 *           값은 중복가능
 *           => HashMap / HashTable
 *              -------   ---------
 *              비동기       동기   
 *              
 *              put() => 저장
 *              get() => 읽기
 *              -------------  데이터값 변경 ==> put("중복 키","값")
 *    4) java.lang.regex
 *       Pattern / Matcher ==> 정규식
 *       정규식의 기호
 *       ----------
 *         [] => 범위
 *         {} => 갯수
 *         + => 1이상 => 맛있+  ==> 맛있다,맛있는,맛있고 ...
 *         * => 0이상 => 맛있* ==> 맛있ㄹㅇㄴ낭허ㅏ너하
 *         . => 임의의 글자 한글자
 *         $ => 끝나는 문자
 *         ^ => 시작문자, 부정 => [^](부정) ^[](시작)
 *         | => 선택
 * java.text
 *    1) SimpleDateFormat
 *    2) MessageFormat
 * java.io
 *    1) File : 파일 / 디렉토리 정보
 *       File file=new File("경로명") ==> 디렉토리정보
 *       File file=new File("경로명/파일명") ==> 파일정보
 *       => 주요메소드
 *          = getName() : 파일명, 디렉토리명
 *          = getPath() : 경로명 전체 읽기
 *          = getParent() : 경로명만 읽기
 *          = length() : 파일 크기
 *          = listFile() : 전체 파일명 읽기
 *          = createNewFile() : 파일만들기
 *          = mkdir() : 폴더만들기
 *          = delete() : 파일삭제
 *    2) FileInputStream / BufferedInputStream => 업로드
 *          = read(), close() => 읽기 / 닫기
 *    3) FileOutputStream / BufferedOutputStream => 다운로드
 *          = write(), close()
 *    --------------------------------------- 읽을때 1byte => 바이트 스트림
 *    4) FileReader / BufferedReader : readLine() 한줄씩 읽어옴
 *          = read(), close()
 *    5) FileWriter / BufferedWriter
 *          = write(String), close()
 *    --------------------------------------- 읽을때 2byte => 문자 스트림
 *                                          한글이 포함된 경우 주로 사용
 * java.net
 *    1) URL : 웹사이트 주소를 설정할때 사용
 *    2) URLEncoder : 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url=new URL("https://www.daum.net/");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			if(conn!=null) {
				BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
				while(true) {
					String s=in.readLine();
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
