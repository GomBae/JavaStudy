/*
 * 한개의 자바파일 내에서 class여러개 사용 가능
 * 
 * 주의점 
 * 
 * 1. 자바는 항상 => 클래스명과 파일명이 동일해야함
 * 클래스가 여러개 있는 경우
 * -------------------
 * class A
 * class B
 * ---------------> A.java,B.java
 * class A
 * public class B
 * ---------------> B.java
 * 
 * 2. 한 파일 내부에서 public class는 한번만 사용 가능
 * 3. 가급적이면 한 파일에 class 한개씩만
 * 4. Student => 다른 파일에서는 Student를 사용할 수 없다 (같은 폴더 상에서 사용x)
 */
class Student{
	String name;
	int kor,eng,math;
}
public class 객체배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		Student lee=new Student();
		Student park=new Student();
		hong.name="홍길동";
		hong.kor=90;
		hong.eng=80;
		hong.math=70;
		
		lee.name="이순신";
		lee.kor=80;
		lee.eng=90;
		lee.math=100;
		
		park.name="박문수";
		park.kor=88;
		park.eng=77;
		park.math=66;
		
		//출력/제어
		Student[] std= {hong,lee,park};
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].name + " "
					+std[i].kor+" "
					+std[i].eng+ " "
					+std[i].math+" "
					+(std[i].kor+std[i].eng+std[i].math)+" "
					+(std[i].kor+std[i].eng+std[i].math)/3.0);
		}

	}

}
