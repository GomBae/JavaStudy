import java.util.Arrays;
import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 
		 * 점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
		1번 학생 : 100점  
		2번 학생 : 90점  
		3번 학생 : 85점  

		2) 학생들의 총점을 출력하시오.

		 */
//		int[] score = {100,90,85};
//		int total=0;
//		for(int i=0;i<score.length;i++) {
//			System.out.println((i+1) + "번 학생 : " + score[i] + "점");
//			total+=score[i];
//		}
//		System.out.println("총점 : " + total+"점");
		/*
		 * 
		 * 2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. 
		 * (실적 0~100)
		 * 1) 사번별 실적을 출력하시오. 
		 * 사원(1) 50..
		 * 2) 1월 실적의 총점과 평균을 출력하시오.
		 * 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.

		 */
//		int[] employee = new int[5];
//		int total=0;
//		for(int i=0;i<employee.length;i++) {
//			employee[i] = (int)(Math.random()*100)+1;
//		}
//		
//		for(int i=0;i<employee.length;i++) {
//			System.out.printf("사원(%d) : %d\n", i+1, employee[i]);
//			total+=employee[i];
//		}
//		System.out.printf("실적 총합 : %d 실적 평균 : %.2f\n",total,total/(double)employee.length);
//		
//		int max=employee[0];
//		int min=employee[0];
//		int maxIndex=0;
//		int minIndex=0;
//		
//		for(int i=0;i<employee.length;i++) {
//			if(max<employee[i]) {
//				max=employee[i];
//				maxIndex=i;
//			}
//				
//			if(min>employee[i]) {
//				min=employee[i];
//				minIndex=i;
//			}
//		}
//		System.out.printf("실적이 제일 큰 사원의 사번 : %d 실적 : %d\n",maxIndex+1,employee[maxIndex]);
//		System.out.printf("실적이 제일 작은 사원의 사번 : %d 실적 : %d\n",minIndex+1,employee[minIndex]);
		
		//3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++) {
//			num[i] = i;
//		}
//		System.out.println(Arrays.toString(num));
		
		/*
		 * 5. 1~100사이의 정수를 10개 저장하고  
 			정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
  			정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
		 */
		
//		int[] num=new int[10];
//		for(int i=0;i<num.length;i++) {
//			num[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		int evenTotal=0;
//		int oddTotal=0;
//		for(int i:num) {
//			if(i%2==0)
//				evenTotal+=i;
//			else
//				oddTotal+=i;
//		}
//		System.out.printf("짝수의 합 : %d\n",evenTotal);
//		System.out.printf("홀수의 합 : %d\n",oddTotal);
		
		/*
		 * 6. 0~9사이의 난수를 100개 발생해서 
   			빈도를 구해서 출력하시오 
   			예)
   			0의 개수: 1
   			1의 개수: 1
   			..
   			9의 개수: 0
		 */
//		int[] arr=new int[100];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(arr));
//		빈도를 저장하는 배열(0~9)
//		int[] result=new int[10];
//		for(int i=0;i<arr.length;i++) {
//			result[arr[i]]++;//arr[i] 번의 갯수를 1개 증가시킴 (자동으로 0으로 초기화 되어있기 때문에 가능)
//		}
//		
//		//출력
//		for(int i=0;i<result.length;i++) {
//			System.out.println(i+" => " + result[i]);
//		}
		
		/*
		 * 7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    	A C D H J
    		 A C D H J
    		 J H D C A

		 */
//		char[] alpha=new char[5];
//		for(int i=0;i<alpha.length;i++) {
//			alpha[i] = (char)((Math.random()*25)+65);
//		}
//		System.out.println("정렬 전 : " + Arrays.toString(alpha));
//		
//		for(int i=0;i<alpha.length-1;i++) {
//			for(int j=i+1;j<alpha.length;j++) {
//				if(alpha[i]>alpha[j]) {
//					char temp=alpha[i];
//					alpha[i] = alpha[j];
//					alpha[j] = temp;
//				}
//			}
//		}
//		System.out.println("오름차순 : "+Arrays.toString(alpha));
//		
//		for(int i=0;i<alpha.length-1;i++) {
//			for(int j=i+1;j<alpha.length;j++) {
//				if(alpha[i]<alpha[j]) {
//					char temp=alpha[i];
//					alpha[i] = alpha[j];
//					alpha[j] = temp;
//				}
//			}
//		}
//		System.out.println("내림차순 : "+Arrays.toString(alpha));
		
		//3명의 국어,영어,수학,총점,평균,등수
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		int[] rank=new int[3];
		//int[][] 성적=new int[3][5]
		double[] avg=new double[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println((i+1) + "번째 국어 입력 : ");
			kor[i]=sc.nextInt();
			System.out.println((i+1) + "번째 영어 입력 : ");
			eng[i]=sc.nextInt();
			System.out.println((i+1) + "번째 수학 입력 : ");
			math[i]=sc.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		for(int i=0;i<3;i++) {
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.printf("%d %d %d %d %.2f %d\n",kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
	}

}
