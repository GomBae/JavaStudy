import java.util.Scanner;

public class exam {

//	두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
	static double div(int num1, int num2) {
		double result = num1/(double)num2;
		return result;
	}
	static String div2(int a,int b) {
		String result="";
		if(b==0)
			result="0으로 나눌 수 없다";
		else
			result=String.valueOf(a/(double)b);//결과값을 문자열로 변경
		return result;
	}
	//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
	static void upper(String s) {
		System.out.println(s.toUpperCase());
	}
	//문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
	static boolean match(String s) {
		boolean result=true;
		
		for(int i=0;i<s.length()/2;i++) {
			char ch1=s.charAt(i);
			char ch2=s.charAt(s.length()-1-i);
			if(ch1!=ch2) {
				result=false;
				break;
			}
		}
		return result;
	}
	//문자열을 거꾸로 출력하는 메소드를 구현하시오
	static void reversePrint(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

	//학점을 구하는 메소드를 구현하시오
	static char grade(int num) {
		char grade=' ';
		
		switch(num/10) {
		case 10:
		case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		default:
			grade='F';
		
		}
		return grade;
		
	}
	//년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
	static String leap(int year) {
		
		String result="";
		if (year%4 == 0) {
			if(year%400 !=0 && year%100 == 0)
				result="평년";	
			else
				result="윤년";
		}
		else {
			result="평년";
		}
		return result;
	}
	static boolean isYear(int year) {
		if((year%4==0 && year%100!=0)||year%400==0) {
			return true;
		}
		return false;
	}
	//두 수 입력받아 큰값 출력
	static int max(int a, int b) {
//		int max=0;
//		if(a<b)
//			max=b;
//		else
//			max=a;
		return Math.max(a, b);
	}
	//입력 받은게 홀수인지 짝수인지 판별
	static String display(int a) {
		if(a%2==0)
			return "짝수";
		return "홀수";
	}
	//메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요
	static void reverse(int num) {
		String s=String.valueOf(num);
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
//		double result = div(10, 2);
//		System.out.println(result);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 입력 : ");
//		int a=sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int b=sc.nextInt();
//		String result=div2(a,b);
//		System.out.println(result);
		
		//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
//		upper("abcd");
		
		//문자 좌우대칭 확인
//		Scanner sc = new Scanner(System.in);
//		String s="";
//		while(true) {
//			System.out.print("문자열 입력 : ");
//			s=sc.next();
//			if(s.length()%2!=0) {
//				System.out.println("잘못된 입력");
//				continue;
//			}
//			break;
//		}
//		boolean bCheck=match(s);
//		if(bCheck) {
//			System.out.println("좌우 대칭입니다.");
//		}else {
//			System.out.println("좌우 대칭이 아닙니다.");
//		}
		
		//문자 거꾸로 출력
//		reversePrint("asdfg");
		//학점출력
//		System.out.println(grade(70));
		
		//년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
//		Scanner sc = new Scanner(System.in);
//		System.out.print("년도 입력 : ");
//		int year = sc.nextInt();
//		String result=leap(year); 
//		System.out.printf("%d년은 %s입니다.",year,result);
		
		
		
	}

}
