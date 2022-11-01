import java.util.Arrays;
import java.util.Scanner;

/*
 * 765 => 167 ==> 1s-1b ==> 3s ==> 종료
 * 
 */
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 난수 ==>정수3개 ==> 중복없는 난수 ==> int ==> 3
		 * 2. 사용자 입력
		 * 3. 비교
		 * 4. 힌트
		 * 		S : ●
		 * 		B : ○○
		 * 5. 종료여부 확인
		 * 
		 */
		int[] com=new int[3]; //게임에 필요한 난수 저장
		int[] user=new int[3]; //사용자 입력값 저장
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(com));

		int count=0;
		while(true) {
			
			System.out.print("세자리 정수를 입력 : ");
			int input=sc.nextInt();
			//오류처리
			if(input<100 || input>999) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			//배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 오류처리
			// 1.같은 수를 입력(x), 0입력(x)
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("같은 수는 입력할 수 없다.");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없다.");
				continue;
			}
			
			int s=0,b=0;//s=>같은 자리에 , b=>다른 자리에
			//비교
			for(int i=0;i<user.length;i++) {//com
				for(int j=0;j<user.length;j++) {//user
					if(com[i]==user[j]) {
						if(i==j)
							s++;
						else
							b++;
					}//if
				}//user_for
			}//com_for
			//힌트
//			System.out.printf("Input Number : %d, Result : %dS-%dB\n",input,s,b);
			count++;
			System.out.println("=======힌트=======");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B:");
			for(int i=0;i<b;i++) {
				System.out.print("○");
			}
			System.out.println();
			//종료여부 확인
			if(s==3) {
				System.out.println("게임종료");
				System.out.println("시도 횟수 : " + count);
				break;
			}
		}
		

	}

}
