import java.util.Scanner;

public class exam14 {

	//14) 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.print("정수 1번 입력 : ");
		num1 = sc.nextInt();
		System.out.print("정수 2번 입력 : ");
		num2 = sc.nextInt();
		
		System.out.printf("%d %% %d = %d", num1, num2, num1%num2);

	}

}
