import java.util.Scanner;

/*
 * 	자바에서 지원하는 조건문
 * 	------------------
 * 		1) 단일 조건문
 * 			1. 형식
 * 				if(조건문)
 * 					조건이 true일때 실행문장
 * 		-------------------------
 * 		문자열 (equals, compare) => 0(==), 음수(>), 양수(<) 문자열 정렬
 * 				-------------- equals() ==, !equals()
 * 		2) 선택 조건문
 * 			if()
 * 			else
 * 		3) 다중 조건문
 * 			if()
 * 			else if()
 * 			else
 * 		4) 선택문
 * 			switch(정수/문자/문자열) ==> 다중조건문과 비슷
 * 			{
 * 				case 값:
 * 					처리문장
 * 				case 값:
 * 					.
 * 					.
 * 					.
 * 				default: ====> 해당 번호가 없는경우 실행(생략가능)
 * 			}
 */
public class 조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/) : ");
		switch(sc.next()) 
		{// 문자열 ==> 정수, 문자 '', 문자열 ::
			case "+":
				System.out.printf("%d+%d=%d\n", num1,num2,num1+num2);
				break;
			case "-":
				System.out.printf("%d-%d=%d\n", num1,num2,num1-num2);
				break;
			case "*":
				System.out.printf("%d*%d=%d\n", num1,num2,num1*num2);
				break;
			case "/":
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.printf("%d/%d=%.2f\n", num1,num2,num1+(double)num2);
					break;
			default:
				System.out.println("입력을 똑바로");
				
		}
	}

}
