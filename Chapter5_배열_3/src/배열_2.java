import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}//중복 확인 후 횟수 되돌리기
			}//중복확인 로직
		}//난수발생
		
		System.out.println(Arrays.toString(lotto));
	}

}
