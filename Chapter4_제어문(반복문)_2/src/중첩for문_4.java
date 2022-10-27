
public class 중첩for문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print('★');
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print('★');
			}
			System.out.println();
		}
		System.out.println();
		
		char ch='A';
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}

			System.out.println();
		}
		System.out.println();
		
//		for(int i=1;i<=4;i++) {
//			char ch = 'A';
//			for(int j=1;j<=i;j++) {
//				System.out.print(ch);
//				ch++;
//			}
//			
//			System.out.println();
//		}
	}

}
