import java.util.Arrays;

public class 배열응용_8 {

	public static void main(String[] args) {
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		//빈도를 저장하는 배열(0~9)
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]]++;//arr[i] 번의 갯수를 1개 증가시킴 (자동으로 0으로 초기화 되어있기 때문에 가능)
		}
		
		//출력
		for(int i=0;i<result.length;i++) {
			System.out.println(i+" => " + result[i]);
		}

	}

}
