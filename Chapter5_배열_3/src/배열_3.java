import java.util.Arrays;
import java.util.Scanner;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] munje=new char[10];
		char[] user=new char[10];
		
		for(int i=0; i<munje.length;i++) {
			int a=(int)(Math.random()*2);
			if(a==0) {
				munje[i]='O';
			}else {
				munje[i]='X';
			}	
		}
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<user.length;i++) {
			System.out.print((i+1)+"번째 O,X 입력 : ");
			char dap=sc.next().charAt(0);
			if(!(dap=='O' || dap=='X')) {
				System.out.println("잘못된 입력이다.");
				i--;
				continue;
			}
			user[i]=dap;
		}
		System.out.println(Arrays.toString(munje));
		System.out.println(Arrays.toString(user));
		//확인
		int count=0;
		for(int i=0;i<user.length;i++) {
			if(munje[i]==user[i])
				count++;
		}
		System.out.println("정답 : " + count + "개 입니다.");
	}

}
