import java.util.Arrays;

/*
 * 문자열 관련 데이터형(자바) ==> "", char ''
 * String 
 * 	=> 문자열을 저장하는 기능, 문자열을 제어하는 기능(라이브러리)
 * 
 * 1) 저장 방법
 * ----------------------------
 * 		String a="";
 * 		String s = new String("");
 * 
 * 2) String 기능 ( 메소드 )
 * ----------------------------
 * 		1. 문자 변환
 * 			1) toUpperCase : 알파벳 대문자 변환
 * 			2) toLowerCase : 알파벳 소문자 변환
 * 			3) valueOf : 모든 데이터형을 문자열로 변경
 * 					int a=10;
 * 					valueOf(a) => "10" ==> parseInt("10") ==> 10
 * 
 * 					boolean b = true;
 * 					valueOf(b) => "true" ==> parseBoolean("true") ==> true
 * 		2. 문자 제어
 * 			1) substring() : 문자열을 자를때 사용 ( 화면UI )
 * 		3. 문자 변경
 * 			1) trim() ==> 좌우 공백 제거 (입력)
 * 			2) replace() ==> 글자 변경 ==> 오라클 크롤링 ==> 이미지 
 * 				replace('&','^')
 * 			3) replaceAll() ==> 정규식 (문자형식)
 * 				replaceAll("~ip형식~")
 * 			4) splite() : 문자열을 배열로 변경
 * 				String s="red.right.hand"
 * 				String[] arr=s.split(",") => {red, right, hand}
 * 		4. 문자 비교
 * 			1) equals() : 대소문자 구분 후 비교 (로그인, 비밀번호 확인)
 * 			2) contains() : 글자 포함 (검색)
 * 			3) startsWith : 서제스트 (자동완성) xxx로 시작하는 단어
 * 			4) endsWith : xxx로 끝나는 단어
 * 		5. 문자 찾기
 * 			1) indexOf : 앞에서 부터 데이터 찾기
 * 				String s= "Hello Java"
 * 					s.indexOf("a")↑
 * 			2) lastIndexOf : 뒤에서부터 데이터 찾기
 * 					String s= "Hello Java"
 * 					s.lastIndexOf("a")  ↑
 * 		6. 기타
 * 			concat("a","b") ==> ab
 * 			"a" + "b" = ab
 * 			charAt() ==> 문자한개를 가지고 올 때
 * 			toCharArray() ==> 문자열을 문자배열(char[]) 로 변경할 때
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="Hello Java";
//		char[] c=s.toCharArray();
//		System.out.println(Arrays.toString(c));
		//1. 변수(문자열) 선언
		String msg="Hello Java";
		
		//2. 초기화
		//3. 활용(요청 처리)
		// 1) 문자의 갯수확인 (length()) ==> 
		System.out.println(msg.length());//공백도 문자로 취급 //비밀번호 자릿수
		// 2) 공백 제거
		System.out.println(msg.trim().length()); //좌우의 공백만 제거 // 입력값을 확인할때
		// 3) 변환 대문자
		System.out.println(msg.toUpperCase()); //검색
		// 4) 변환 소문자
		System.out.println(msg.toLowerCase()); //검색
		// 5) 자르기
		/*
		 * substring(int start) ==> 지정된 위치부터
		 * substring(int start,int end) ==> 원하는 지점
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5));//end는 제외
		String post="101-123";
		System.out.println(post.substring(4));
		System.out.println(post.substring(0,3));
		String fileName="문자열_1.java";
		System.out.println(fileName.substring(6));
		//확장자 이름을 찾으려면
		System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));// +1을 해줘야 . 을 건너뛸 수 있다.
		//원하는 글자의 인덱스번호 확인
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		//4. 출력

	}

}
