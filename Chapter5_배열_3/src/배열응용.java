import java.util.Arrays;
import java.util.Scanner;

//5개 점수를 저장한 후 ==> 총합 / 평균 
// 응용 ==> 3명의 학생 국어, 영어, 수학 ==> 총점/평균/학점 ==> 등수를 출력
public class 배열응용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score=new int[5];//선언
		for(int i=0;i<score.length;i++) {
			score[i]=(int)(Math.random()*71)+30;//30~100
		}

		System.out.println(Arrays.toString(score));
		//총합,평균 구하기
		int total=0;

		for(int i:score) {
			total+=i;
		}
		//출력
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", total/(double)score.length);
	}

}
