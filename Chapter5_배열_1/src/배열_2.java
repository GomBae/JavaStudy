import java.util.Scanner;

//배열 : 같은 데이터형을 모아서 관리
// 기능ㅂ별로 모아서 처리
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] score=new char[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번째 국어점수 입력 : ");
			kor[i]=sc.nextInt();
			
			System.out.print((i+1)+"번째 영어점수 입력 : ");
			eng[i]=sc.nextInt();
			
			System.out.print((i+1)+"번째 수학점수 입력 : ");
			math[i]=sc.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			}
		
		//학점
		for(int i=0; i<3;i++) {
			
		}
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d %d %d %d %.2f\n",kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
		
		}
	}

