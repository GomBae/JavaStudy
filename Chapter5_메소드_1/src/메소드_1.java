import java.util.Scanner;

/*
 * 
 * 메소드
 * 	구성요소
 * 	처리 결과값(return)	사용자 요청값(매개변수)
 * 
 * ------------------
 * 	결과값	매개변수
 * ------------------
 * 	o         o		==> String substring(int s)
 * ------------------
 *  o         x		==> String trim()
 * ------------------
 *  x         o		==> System.out.println("rty") - void
 * ------------------	
 *  x         x		==> System.out.println();
 *  -----------------
 *  
 *  메소드는 반드시 한개의 기능만 수행할 수 있게 만든다.
 *  	입력 기능
 *  	처리 기능
 *  	출력 기능
 *  
 *  메소드
 *  	= 선언부(원형)
 *  		리턴형(결과값) 메소드명(매개변수)
 *  	= 구현부
 *  		리턴형(결과값) 메소드명(매개변수)
 *  		{
 *  			//구현부
 *  		}
 *  	
 *  	int add(int a, int b){
 *  	  ------ long, double 권장 ==>
 *  		//맨 마지막줄에
 *  		return a+b;
 *  	  }
 *  
 *  	void insert(){
 *  	------ 메소드 자체 처리 (데이터베이스 ==> INSERT, UPDATEm DELETE)
 *  		return; // void는 생략이 가능
 *  	}
 *  
 *  	1) 구성요소
 *  		1. 매개변수 ==> 사용자가 요청한 값 
 *  						= 로그인요청(id,pwd)
 *  						= 아이디 중복체크(id)
 *  						매개변수가 여러개일 때 , 로 구분한다.
 *  						---- 3개 이상 (배열, 클래스를 이용해서 전송)
 *  						정렬 -> 배열
 *  						회원가입 -> 클래스
 *  		2. 메소드명 ==> 변수(식별자)
 *  					 1) 알파벳, 한글 (알파벳 -> 대소문자 구분)
 *  					 2) 숫자 (앞에 사용 금지)
 *  					 3) 특수문자 ( _ , & )
 *  					 4) 키워드는 사용 금지
 *  					 약속 사항 ==> 소문자로 시작
 *  								 단어가 2개인 경우 getFile or get_file
 *  		3. 리턴형(결과값) ==> 사용자 요청을 처리한 결과값
 *  							메소드
 *  							=> 자체 처리 ==> void
 *  							=> 결과값을 넘겨준다 => 해당 데이터형을 설정
 *  												반드시 1개만 설정 가능(여러개는 배열 or 클래스)
 *  		4. 매개변수
 *  			-------- 1) 사용자가 입력 (명시적인 초기화,Scanner,random)
 *  			-------- 2) 반복제어 => 다른 문장을 매개변수로 넘겨준다.
 *  			-------- 3) 웹 => 검색, 입력, 클릭, 요청 
 */

//	==> 년도, 월, 일을 입력
public class 메소드_1 {

	/*
	 * int userInput(String msg) {
		
	   }
	 * ========================= 메소드_1 a=new 메소드_1();
	 * 								a.userInput
	 * static int userInput(String msg) {
		
		}
		==> 자동 메모리 할당
	 */
	static int userInput(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int value=sc.nextInt();
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("년도 입력 : ");
//		int year=sc.nextInt();
//		
//		System.out.print("월 입력 : ");
//		int month=sc.nextInt();
//		
//		System.out.print("일 입력 : ");
//		int day=sc.nextInt();
		int year=userInput("년도 입력 : ");
		int month=userInput("월 입력 : ");
		int day=userInput("일 입력 : ");
		
		System.out.printf("%d년도 %d월 %d일",year,month,day);
		
	}

}
