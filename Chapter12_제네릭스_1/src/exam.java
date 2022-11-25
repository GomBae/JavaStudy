import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 8.  arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} 
		 * 배열에 중복된 데이터를 제거하고 아래의 그림과 같이 출력하는 프로그램을 작성하시오. 
		 * (데이터출력시 순서는 상관없음)
		 */
//		Integer[] arr= {10,20,30,40,50,60,70,40,30,20};
//		Set<Integer> list=new TreeSet<Integer>(Arrays.asList(arr));
//		System.out.println(list);
		
		//version.2
//		int[] arr= {10,20,30,40,50,60,70,40,30,20};
//		Set<Integer> set=new TreeSet<Integer>();
//		for(int a:arr) {
//			set.add(a);
//		}
//		System.out.println(set);
		
		//version.3
//		int[] arr= {10,20,30,40,50,60,70,40,30,20};
//		Set<Integer> set=new TreeSet<Integer>();
//		for(int a:arr) {
//			set.add(a);
//		}
//		System.out.println(set);
//		List<Integer> list=new ArrayList<Integer>(set);
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		ArrayList kyo=new ArrayList();
		ArrayList cha=new ArrayList();
		ArrayList hap=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		cha.addAll(list1);
		cha.removeAll(list2);
		hap.addAll(list1);
		hap.addAll(list2);
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);

	}

}
