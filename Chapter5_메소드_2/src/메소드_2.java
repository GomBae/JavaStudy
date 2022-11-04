
public class 메소드_2 {

	static void max(int[] arr) {
		int max=0;
		for(int i:arr) {
			if(max<i) {
				max=i;
			}
		}
	}
	
	static void min(int[] arr) {
		int min=0;
		for(int i:arr) {
			if(min>i) {
				min=i;
			}
		}
	}
	//max와 min값의 차이, 합, 곱 ... 을 구하지못함 ( 리턴값이 없어서 max나 min을 다른 함수에서 사용불가)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
