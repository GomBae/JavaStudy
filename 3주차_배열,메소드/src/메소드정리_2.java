import java.util.Arrays;
import java.util.Scanner;

/*
 * 숫자야구
 * 1) 난수발생(중복없이)
 * 2) 사용자 입력
 * 3) 비교
 * 4) 힌트
 * 5) 종료여부 확인
 */
public class 메소드정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수발생
		int[] com=new int[3]; //난수 저장
		int[] user=new int[3];//사용자 입력값
		
		//중복없는 난수 발생(1개의 기능)
		for(int i=0;i<3;i++) {
			com[i]=(int)(Math.random()*9)+1;//1~9 사이의 난수 발생
			for(int j=0;j<i;j++) {//첫번째 난수는 제외
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		//확인
		System.out.println(Arrays.toString(com));
		
		Scanner sc = new Scanner(System.in);
		while(true) {//횟수가 지정이 안됨
			//사용자 입력을 유도
			System.out.print("세자리 정수 입력 : ");
			//입력한 정수값 받기
			int input=sc.nextInt();
			
			//오류처리 ==> 1. 세자리 정수를 입력하지 않은 경우
			if(input<100 || input>999) {
				System.out.println("잘못된 입력이다.");
				continue;
			}
			//비교하기 위해서 배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//같은 정수 입력여부 확인 => 오류
			if(user[0]==user[1] || user[1]==user[2] || user[0] == user[2]) {
				System.out.println("같은 수는 사용할 수 없다");
				continue;//처음 입력으로 다시 되돌아간다
			}
			//0을 입력여부 확인 => 오류
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없다");
				continue;
			}
			//3. 비교
			//같은 자리에 숫자가 동일할 경우 ==> S
			//동일한 숫자 ,다른 자리 ==> B
			int s=0,b=0;
			for(int i=0;i<3;i++) {//com ==> 0, user ==> 0, 1, 2
				for(int j=0;j<3;j++) {//user
					if(com[i]==user[j]) {
						if(i==j) {//같은 자릿수
							s++;
						}else {//다른 자릿수
							b++;
						}
					}
				}
			}
			//4. 힌트
			System.out.printf("Input Number: %d result : %d-%d\n",input,s,b);
			//5. 종료여부
			if(s==3) {
				System.out.println("게임종료");
				break;
			}
		}

	}

}
