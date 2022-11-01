import java.util.Arrays;

//A~Z사이의 문자를 10개 저장 ==> 가장 큰 값, 가장 작은값 출력
public class 배열응용_2_문제 {

	public static void main(String[] args) {
		
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(alpha));
		char max=alpha[0];
		char min=alpha[0];
		for(char c:alpha) {
			if(max<c)
				max=c;
			if(min>c)
				min=c;
		}
		System.out.printf("가장 큰 값 : %c, 가장 작은 값 : %c",max,min);

	}

}
