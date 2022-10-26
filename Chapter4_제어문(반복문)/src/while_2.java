/*
 * 난수 6개 추출 후 총합
 */
public class while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0,i=1;
		while(i<=6) {
			int num=(int)(Math.random()*100)+1;
			sum+=num;
			i++;
			System.out.printf("num : %d sum : %d\n",num,sum);
		}
		
		
	}

}
