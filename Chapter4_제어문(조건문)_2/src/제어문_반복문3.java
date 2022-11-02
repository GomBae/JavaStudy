import java.util.Scanner;

public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		
		for(;;) {//무한루프
			System.out.print("1~100까지 정수를 입력 : ");
			int user=sc.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				//처음부터 다시 실행한다.
				continue;
			}
		}
	}

}
