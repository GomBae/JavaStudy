import java.util.Arrays;

/*
 * 문자열 배열
 * ------------
 * String[] 배열명
 * String 배열명[]
 * --------------
 * String[] 배열명= new String[10]; => String의 초기값 null
 * 					=> 주소가 없는 상태
 * String[] 배열명 ={"가나다","라마바","사아자"} 
 * "가나다".length() ==> 문자열은 주소를 갖기때문에 변수를 사용하지않고 
 * 						문자열만 이용해서 사용도 가능
 */
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","이순신","강감찬","박문수","김두한"};
		//출력
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+ " ");
		}
		System.out.println();
		for(String name:names) {
			System.out.print(name + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(names));

	}

}
