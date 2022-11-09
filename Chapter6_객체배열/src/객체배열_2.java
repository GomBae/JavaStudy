import java.util.Scanner;

public class 객체배열_2 {

	public static void main(String[] args) {
		Student[] std=new Student[3];//Student형 배열만 만들어둔 상태이다. std[i]의 메모리는 생성안됨
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<std.length;i++) {
			//std[i]의 메모리를 만들어줘야 nullpointer오류가 발생하지 않는다
			std[i]=new Student();
			//NullPointerException ==> new사용 여부
			//기본 문법에러는 이클립스에서 출력
			
			System.out.print("이름 입력 : ");
			std[i].name=sc.next();
			
			System.out.print("국어 입력 : ");
			std[i].kor=sc.nextInt();
			
			System.out.print("영어 입력 : ");
			std[i].eng=sc.nextInt();
			
			System.out.print("수학 입력 : ");
			std[i].math=sc.nextInt();
		}
		//출력
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].name + " "
					+std[i].kor+" "
					+std[i].eng+ " "
					+std[i].math+" "
					+(std[i].kor+std[i].eng+std[i].math)+" "
					+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}

	}

}
