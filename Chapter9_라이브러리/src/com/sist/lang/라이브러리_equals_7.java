package com.sist.lang;
class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		this.name=name;
	}

	
	// equlas ==> 오버라이딩 ==> 주소비교(X) , 객체가 가지고 있는 이름(문자열) 비교
	//Object에서 equals는 사용빈도가 거의 없고 ==> String(Object상속) => 로그인 / 아이디체크
	//Object에서는 주소값 비교 (new), String 에서는 => 실제 저장된 문자열 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student)
			/*
			 * (Student)obj.name(x)
			 * --------   - 우선순위
			 *            1
			 *    2
			 * ((Student)obj).name
			 */
			return name==((Student)obj).name; //같은 이름이면 true --> 이름을 비교
		else
			return false;
	}
	
}
public class 라이브러리_equals_7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동");
		Student s2=new Student("홍길동");
		
		if(s1.equals(s2)) {
			System.out.println("같은 학생이다");
		}else {
			System.out.println("다른 학생이다");
		}
		

	}

}
