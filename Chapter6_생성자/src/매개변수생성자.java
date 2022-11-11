import java.util.Scanner;

class Student{
	String name;
	int kor,eng,math;
//	Student(String name,int kor,int eng,int math){
//		this.name=name;
//		this.kor=kor;
//		this.eng=eng;
//		this.math=math;
//	}
	
	void print() {
		//this를 사용하는 곳 ==> 생성자, 인스턴스 메소드 (static에서는 사용불가)
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f\n",(kor+eng+math)/3.0);
	}
	/*
	 * Student(String n,int k,int e,int m){
	 * 	name=n;
	 * 	kor=k;
	 * 	eng=e;
	 *  math=m;
	 * }
	 * 
	 */

	//this() (자신의 생성자) this (자신의 객체)
	
	Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}
public class 매개변수생성자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name=sc.next();
		System.out.print("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 입력 : ");
		int math = sc.nextInt();
		
		//객체 생성
//		Student s=new Student(); default 생성자가 없어 사용불가
		Student hong = new Student(name, kor, eng, math);
		//인스턴스명.메소드명() ==> 메소드 호출 과정
		hong.print();
	}

}
