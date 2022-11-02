import java.util.Arrays;

public class 배열_4 {

	//System.arraycopy() : 배열의 크기가 다른 경우(원하는 위치에 데이터 배치)
	//arr.clone() : 있는 그대로 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr= {'A','B','C','D','E'};
		char[] copy=new char[arr.length];
		//값을 복사 ==> 출력 arr/copy
		
		//System.arraycopy(arr, 0, copy, 0, arr.length);
		copy=arr.clone();//Call By Value ==> 기본형
						//int copy[]=arr; (Call By Reference(주소에 의한 참조)
		
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
		


		
	}

}
