import java.util.Scanner;

public class exam_12 {

	//12) 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("정수 1번 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2번 입력 : ");
		num2 = sc.nextInt();
		
		System.out.printf("%d와 %d의 뺄셈 결과 : %d\n", num1, num2, num1-num2);
		System.out.printf("%d와 %d의 곱셈 결과 : %d\n", num1, num2, num1*num2);
		
	}

}
