import java.util.Arrays;

public class 메소드_2 {

	int[] rand(int no)
	{
		int[] com=new int[no];//배열을 동적으로 생성
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		return com; //배열을 리턴형으로 지정하면 ==> 주소(배열명)만 넘기면 된다
	}
	
	void rand(int[] com) {//오버로딩
		
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] arr= {1,2,3,4,5};
//		int[] temp=arr;//arr과 temp의 주소가 같다.
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(temp));
//		temp[0]=100;
//		temp[1]=200;
//		temp[2]=300;
//		temp[3]=400;
//		temp[4]=500;
//		System.out.println(Arrays.toString(arr));//arr과 temp의 주소가 같아 둘중 아무거나 변경해도 같이 적용됨
		메소드_2 m=new 메소드_2();
		int[] arr=m.rand(10);//arr에 결과값을 받아준다.
		System.out.println(Arrays.toString(arr));
		int[] arr1=new int[6];//arr1 => 주소를 전송 
		m.rand(arr1);//arr1의 주소를 이용해 출력한다
		System.out.println(Arrays.toString(arr1));
		//클래스, 배열 => 값을 받을 경우 (리턴형, 매개변수)
		/*
		 * 기본형 매개변수(int,double,char,boolean..), String ==> 읽기전용
		 * 					변수값을 읽기만 할 수 있다 (변경 불가)
		 * 참조형 매개변수 사용자 정의 클래스, 배열(주소) ==> 읽기, 쓰기
		 * 					변수값 읽기,수정 가능
		 * 매개변수가 3개이상이면 클래스,배열을 이용
		 */
	}

}
