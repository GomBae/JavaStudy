import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] copy=new int[arr.length];
		System.out.println("arr="+arr);
		System.out.println("copy="+copy);
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		arr[0]=100;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		

	}

}
