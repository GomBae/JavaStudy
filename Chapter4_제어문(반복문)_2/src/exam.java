import java.util.Scanner;

public class exam {

	public static void main(String[] args) {
		
		//5. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
	    //출력하는 프로그램을 작성하시오

//		System.out.println("눈의 합이 6이 되는 모든 경우의 수");
//		System.out.println("==============================");
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(j+i == 6) {
//					System.out.printf("[%d, %d]\n", i,j);
//				}
//			}
//		}



		/*
		 * 13. 다음 결과를 출력하는 프로그램
 
 출력예) ********** (5행10열)  
       **********      
       **********        
       **********         
       **********

		 * 
		 */
		
//		for(int i=1; i<=5;i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.print("*");
//				
//			}
//			System.out.println();
//		}
		
		/*
		 * 14. 다음 결과를 출력하는 프로그램
 
 출력예) 1 1 1 1 1       
    2 2 2 2 2         
  3 3 3 3 3         
  4 4 4 4 4        
   5 5 5 5 5 

		 * 
		 */
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 * 16. 다음 결과를 출력하는 프로그램
 
 출력예) 1 2 3 4 5       
   	1 2 3 4 5        
   1 2 3 4 5         
   1 2 3 4 5           
 1 2 3 4 5

		 */
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
		
		/*
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * -------------
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     ----------
		 *         *
		 *        ***
		 *       *****
		 *      *******  
		 */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=i;k<=4-i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
	ghg	
	}

}
