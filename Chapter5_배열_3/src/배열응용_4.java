import java.util.Arrays;

/*
 * 
 * 정렬 (ASC / DESC)
 * 		올림차순 / 내림차순
 * = 선택정렬
 * 		30 10 40 50 20
 * 		-- --
 * 		10 30 40 50 20
 * 		--    --
 * 		--		 --
 * 		--			--
 * 		===============
 * 		   -- --
 * 		   --    --
 * 		   --       --
 * 		10 20 40 50 30
 * 		맨앞과 그 다음자리를 비교하여 위치를 변경함
 * 		(수를 맨 앞부터 고정)
 */
public class 배열응용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//선택정렬
		//정렬대상
		int[] arr=new int[5];
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		//정렬(오름차순)
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println("정렬 후 : ");
//		System.out.println(Arrays.toString(arr));
		
		//정렬(내림차순)
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1) + ":" + Arrays.toString(arr));
		}
		System.out.println("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}
