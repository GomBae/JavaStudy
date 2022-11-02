import java.util.Arrays;

public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = new int[10];
		
		for(int i=0;i<num.length;i++) {
			int a = (int)(Math.random()*100)+1;
			num[i] = a;
		}
		
		int max=num[0];
		int min=num[0];
		
		int maxIndex=0;
		int minIndex=0;
		
		//최대값 최소값만 구하는 공식
//		for(int i:num) {
//			if(max<i) {
//				max = i;	
//			}
//			
//			if(min>i) {
//				min = i;
//			}
//		}
		
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) {
				max = num[i];
				maxIndex = i;
			}
			if(min>num[i]) {
				min = num[i];
				minIndex = i;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.printf("최대값 : %d, 최소값 : %d\n",max,min);
		System.out.printf("최대값의 인덱스 : %d, 최소값의 인덱스 : %d\n",maxIndex,minIndex);
	}

}
