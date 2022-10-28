import java.util.Scanner;

/*
 * 
 * 	출력 : System.out.println() ...
 * 	입력 : System.in (키보드 입력값), Scanner, BufferedReader
 */

//java.lang 생략 가능
public class Printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		System.out.printf("%-5s%-5s%-5s%-7s%-5s\n","국어","영어","수학","총점","평균");
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f",kor,eng,math,total,avg);
		
	}

}
