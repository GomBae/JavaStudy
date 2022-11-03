import java.util.Scanner;

public class 메소드_3 {

	static int add(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a=sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b=sc.nextInt();
		System.out.print("연산자 입력 (+,-,*,/) : ");
		String op=sc.next();
		
		int result=0;
		switch(op) {
		case "+":
			result=add(a,b);
			break;
		case "-":
			result=sub(a,b);
			break;
		case "*":
			result=mul(a,b);
			break;
		case "/":
			result=div(a,b);
			break;
		default:
			System.out.println("잘못된 입력");
		}
		System.out.printf("%d %s %d = %d",a,op,b,result);
		
	}

}
