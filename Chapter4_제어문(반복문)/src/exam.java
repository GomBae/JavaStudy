import java.text.DecimalFormat;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)

		//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

//		char ch = '\t';
//		if(ch == ' ' && ch != '\t') {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		//3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
		
		//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
//		char ch;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력");
//		ch = sc.next().charAt(0);
//		if((int)ch >= '0' && (int)ch <='9') {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		
		//6. 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
		   //끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
//		DecimalFormat formatter = new DecimalFormat("###,###");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1번 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("2번 입력 : ");
//		int num2 = sc.nextInt();
//		int sum=1,
//		if(num2<num1) {
//			System.out.println("Error");
//			System.exit(0);
//		}else {
//			for(;num1<=num2;num1++) {
//				sum*=num1;
//		
//			}
//		}
//		System.out.println("총합 : "+formatter.format(sum));
		
		
		//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
//		int sum=0;
//		for(int i=0; i<=12;i++) {
//			if(i%2==0 || i%3==0)
//				sum+=i;
//
//		}
//		System.out.println("총합 " + sum);
		
		//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

//		Scanner sc = new Scanner(System.in);
//		
//		int count=0;
//		
//		for(int i=1; i<=10;i++) {
//			System.out.print(i+"번째 입력 : ");
//			int num = sc.nextInt();
//			if(num%2==0) {
//				count++;
//			}
//		}
//		System.out.println("갯수 : "+count);

		/*
		 * 13. 다음 결과를 출력하는 프로그램
 
 출력예) ********** (5행10열)  
       **********      
       **********        
       **********         
       **********

		 * 
		 */
		
//		for(int i=1; i<=5;i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
		/*
		 * 14. 다음 결과를 출력하는 프로그램
 
 출력예) 1 1 1 1 1       
    2 2 2 2 2         
  3 3 3 3 3         
  4 4 4 4 4        
   5 5 5 5 5 

		 * 
		 */
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 * 16. 다음 결과를 출력하는 프로그램
 
 출력예) 1 2 3 4 5       
    1 2 3 4 5        
   1 2 3 4 5         
   1 2 3 4 5           
 1 2 3 4 5

		 */
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
		
	}

}
