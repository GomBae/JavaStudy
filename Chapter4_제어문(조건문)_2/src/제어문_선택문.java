import java.util.Scanner;

/*
 * 
 * 90~100 A
 * 80~89 B
 * 70~79 C
 * ---------------- 다중조건문이 편함
 * 
 */
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수입력(80 80 80) : ");
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		int total = kor+eng+math;
		double avg=total/3.0;
		
		char score='A';
		switch((int)(avg/10)) {
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
		}
		
		
	}

}
