import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		int[] arr = {100,200,300,400,500};
		int[] copy=new int[arr.length*2];
		
		System.arraycopy(arr, 0, copy, 0, arr.length);
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
		
		System.out.println(arr);
		System.out.println(copy);

	}

}
