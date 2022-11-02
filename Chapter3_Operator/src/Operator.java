/*
 * 
 * 	피연산자, 연산자
 * 	------- 연산대상
 * 	피연산자 1개 (단항연산자) -10
 * 	피연산자 2개 (이항연산자) 10 + 10
 * 	피연산자 3개 (삼항연산자) ()?값:값
 * 
 * 	단항연산자
 * 	= 증감연산자 (++,--) : 한개를 증가, 감소
 * 	= 반전연산자 (~)	: 양수 => 음수로 변환
 * 	= 부정연산자 (!) : 반드시 boolean만 사용가능
 * 	= 형변환연산자 : (type) => (int), (double)....
 *  = 음수/양수	: -,+
 *  
 *  이항연산자
 *  = 산술연산자 : ( +, -, *, /, %)
 *  = 비트연산자 : ( &, |, ^ ) => 2진법 변경 후 처리
 *  	& => ^, | => +
 *  = 쉬프트연산자 : 비트 이동 연산자 => <<(왼쪽이동), >>(오른쪽 이동)
 *  = 비교연산자 : ==, !=, <, >, <=, >=
 *  = 논리연산자 : &&(직렬연산자), ||(병렬 연산자)
 *  = 대입연산자 : =, +=, -=, *=, /=, %= ... op=
 *  			------------- 복합 대입 연산자
 *  = 기타 : 문자열 비교, 객체 비교
 *  		equals()   instanceof
 *  
 *  삼항연산자
 *  	조건?값1:값2
 */
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1" + "2");
		System.out.println(true + "");
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");

	}

}
