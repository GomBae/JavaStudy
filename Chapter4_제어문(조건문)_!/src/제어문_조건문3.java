import java.util.Scanner;

public class 제어문_조건문3 {
	
	//2개정수, 1개 연산자를 받아서 사칙연산 처리 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		char op = sc.next().charAt(0);
		

		if(op=='+')
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		if(op=='-')
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		if(op=='*')
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		if(op=='/') {
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
			}
		}


	}

}
