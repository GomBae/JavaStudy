import java.util.Scanner;

/*
 * 
 */
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화목록 요청");
		System.out.println("4. 영화상세보기");
		System.out.println("5. 예매요청");
		System.out.println("6. 종료");
		System.out.println("===================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 선택(1~6) : ");
		int menu=sc.nextInt();
		if(menu==1)
			System.out.println("로그인 요청");
		if(menu==2)
			System.out.println("회원가입 요청");
		if(menu==3)
			System.out.println("영화목록 요청");
		if(menu==4)
			System.out.println("영화 상세보기 요청");
		if(menu==5)
			System.out.println("예매 요청");
		if(menu==1)
			System.exit(0); //프로그램 종료

	}

}
