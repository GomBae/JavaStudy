import java.util.Scanner;

/*
 * aBCDE
 * ABcDE
 * ABCdE
 * ABCDe
 */
public class 중첩for문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for(int i=1;i<=5;i++) {
//			char ch = 'A';
//			for(int j=1;j<=5;j++) {
//				
//				if(i==j) {
//					System.out.print((char)(ch+32));
//				}else {
//					System.out.print(ch);
//				}
//				ch++;
//			}
//			System.out.println();
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		int count=0;
		if(num>=2 && num <= 12) {
			for(int i=1;i<=6;i++) {
				for(int j=1;j<=6;j++) {
					if(j+i == num) {
						count++;
					}
				}
			}
		}else {
			System.out.println("잘못적엇ㅅ소");
		}
		System.out.println("경우의 수 : " + count + "개");
		sc.close();
		
	}

}
