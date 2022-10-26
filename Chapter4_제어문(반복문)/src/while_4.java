import java.util.Scanner;

public class while_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum=0,i=1;
		
		while(i<=10) {
			System.out.print(i+"번째 정수 입력 : ");
			int num = sc.nextInt();
			sum+= num;
			i++;
			
		}
		System.out.println("합계 : " + sum);
		

	}

}
