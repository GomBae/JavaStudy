import java.io.IOException;
import java.util.Scanner;

public class 제어문_반복문5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("1. 메모장 2. 그림판 3. 브라우저 4. 종료");
			int no=sc.nextInt();
			if(no<1 || no>4) {
				System.out.println("메뉴 선택이 잘못되었습니다");
				continue;
			}
			
			switch(no) {
			case 1:
				Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
				break;
			case 2:
				Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe");
				break;
			case 3:
				Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe "
						+ "www.naver.com");
				break;
			case 4:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

}
