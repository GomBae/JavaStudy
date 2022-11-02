import java.util.Scanner;

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner의 단점 ==> 문자입력이 없다 ==> 문자열 (한글자만 charAt(0))
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 문자 입력 : ");
		char alpha = sc.next().charAt(0);
		if(alpha >='A' && alpha<='Z') {
			System.out.println(alpha + "는(은) 대문자입니다.");
		}
		if(alpha>='a' && alpha <='z') {
			System.out.println(alpha+"는(은) 소문자입니다.");
		}
	}

}
