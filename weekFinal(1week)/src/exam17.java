import java.util.Scanner;

/*
 * 정수 변수 선언
키보드로부터 정수 하나 입력 받음 
양수가 아니면 "양수가 아니다." 출력

 */
public class exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.print("정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println(num1 < 0 ? "양수가 아니다" : "양수다");

	}

}
