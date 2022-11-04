import java.util.Scanner;

public class exam_3 {
/*
 * 연도가 4로 나누어 떨어지면 윤년이다. ex) 2020년, 2024년, 2028년, ...

	연도가 100으로 나누어 떨어지면 평년이다. ex) 2100년, 2200년, 2300년, ...

	연도가 400으로 나누어 떨어지면 윤년이다. ex) 2000년, 2400년, 2800년, ...
 */
	static String leap(int year) {
		
		String result="";
		if (year%4 == 0) {
			if(year%400 !=0 && year%100 == 0)
				result="평년";
			
			else
				result="윤년";
		}
		else {
			result="평년";
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		String result=leap(year); 
		System.out.printf("%d년은 %s입니다.",year,result);

	}

}
