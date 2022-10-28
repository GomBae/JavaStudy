import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		//1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수입력 : ");
//		int num = sc.nextInt();
//		if(num<0)
//			System.out.println("음수입니다.");
//		else
//			System.out.println("양수입니다.");
		//12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라

//		for(int i=1; i<=30; i++) {
//			if(i%2==0) {
//				System.out.print(i + " ");
//				if(i%3==0) {
//					System.out.println();
//				}
//			}
//		}
		//13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
		int total=0;
		for(int i=1; i<=10;i++) {
			if(i%2!=0) {
				total+=i;
			}else
				total-=i;
		}
		System.out.println(total);

	}

}
