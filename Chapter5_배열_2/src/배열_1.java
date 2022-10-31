import java.util.Scanner;

/*
 * 
 * 데이터를 모아서 관리 ==> 같은 데이터형(배열), 더른 데이터형(클래스) => 데이터형 클래스 ~VO
 * 명령어를 모아서 관리 ==> 메소드 => 클래스 ~DAO, ~Service, ~Manager
 * 
 * 
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2진수 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : 0~32767사이 : ");
		int input = sc.nextInt();
		//0,1 ==> 16
		int[] binary=new int[16]; //0으로 초기화
		//처음 =>0, 마지막 =>15
		int index=15;
		while(true) {
			binary[index]=input%2;
			input=input/2;//	1/2=0
			if(input==0)
				break;
			
			index--;
		}
		
		//출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0) {
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
