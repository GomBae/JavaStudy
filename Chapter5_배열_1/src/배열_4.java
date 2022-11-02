import java.util.Arrays;

/*
 * boolean[] seat = new boolean[100] ==> false가 자동으로 초기화
 * 					-------------new를 사용하면 자동으로 초기화
 * 
 */
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] alpha = new char[26];
		
		char c='A';
		for(int i=0; i<alpha.length;i++) {
			alpha[i] = c;
			c++;
		}
		
		for(char ch:alpha) {
			System.out.print(ch + " ");
		}
		
		System.out.println();
		
		int[] arr=new int[30];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*3);
		}
		System.out.println(Arrays.toString(arr));
		
		int a=0,b=0,d=0;
		for(int i:arr) {
			if(i==0) a++;
			else if(i==1) b++;
			else if(i==2) d++;
		}
		
		System.out.println("0=>"+a);
		System.out.println("1=>"+b);
		System.out.println("2=>"+d);

	}

}
