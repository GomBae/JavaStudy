import java.util.Arrays;

public class exam2 {

	//올림차순
	static int[] asc_sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//내림차순
	static int[] desc_sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	
	//혼합
	static int[] sort(int[] arr,String type) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(type.equals("ASC")) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}else {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
		}
		return arr;
	}
	
	//라이브러리 이용
	static int[] lib_sort(int[] arr) {
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i + " ");
		}
		return arr;
		
		//내림차순 정렬
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] + " ");
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[5];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(num));
		
		System.out.println("올림 차순 : ");
//		int[] num1=asc_sort(num);
		int[] num1=sort(num,"ASC");
		System.out.println(Arrays.toString(num1));
		
		System.out.println("내림 차순 : ");
//		int[] num2=desc_sort(num);
		int[] num2=sort(num,"DESC");
		System.out.println(Arrays.toString(num1));

	}

}
