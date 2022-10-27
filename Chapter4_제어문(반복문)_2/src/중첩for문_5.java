
public class 중첩for문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
