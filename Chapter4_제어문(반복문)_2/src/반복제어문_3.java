import java.util.Scanner;
/*
 * 	com 	user    com-user
 *  0(가위)  0(가위)  0(same)
 *  		1(바위)  -1(user)
 *  		2(보)	-2(com)
 * 	com 	user	
 *  1(바위)  0(가위)	1(com)
 *  		1(바위)	0(same)
 *  		2(보)	-1(user)
 * 	com 	user
 *  2(보)    0(가위)	2(user)
 *  		1(바위)	1(com)
 *  		2(보)	0(same)
 *  -------------------------------
 *  user => -1, 2 win
 *  com => -2, 1 win
 * 
 */
public class 반복제어문_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int win=0,lose=0,same=0,count=0;;
		
		while(true) {
			System.out.print("가위(0), 바위(1), 보(2)를 입력 : \n");
			int user = sc.nextInt();
			System.out.println("================================================");
			int com = (int)(Math.random()*3);

			if(user>=0 && user<=2) {
				if(com==0)
					System.out.println("컴퓨터 : 가위");
				else if(com==1)
					System.out.println("컴퓨터 : 바위");
				else if(com==2)
					System.out.println("컴퓨터 : 보");
				
				if(user==0)
					System.out.println("사용자 : 가위");
				else if(user==1)
					System.out.println("사용자 : 바위");
				else if(user==2)
					System.out.println("사용자 : 보");
				
				switch(com-user) {
				case -1: case 2:
					System.out.println("사용자 win");
					System.out.println("================================================");
					win++;
					break;
				case -2: case 1:
					System.out.println("컴퓨터 win");
					System.out.println("================================================");
					lose++;
					break;
				case 0:
					System.out.println("비겼다");
					System.out.println("================================================");
					same++;
				}
				
				count++;
				
			}else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			System.out.print("종료를 원하면 q/Q 입력 (계속하려면 q/Q를 제외한 아무 키나 입력) : ");
			char ch= sc.next().charAt(0);
			System.out.println("================================================");
			if(ch=='q' || ch=='Q') {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("게임을 계속합니다.");
			}
		}//while
		
		System.out.println("게임 결과는");
		System.out.printf("%d전 %d승 %d패 %d무", count, win, lose, same);

	}

}
