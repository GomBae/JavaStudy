
public class 반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");//1 2 3 4 5
			if(i==5)
				break;
			//System.out.print(i + " ");//1 2 3 4
		}
		
		System.out.println();
		int i=1;
		while(i<=100) {
			System.out.print(i + " ");
			if(i==5)
				break;
			i++;
		}
	}

}
