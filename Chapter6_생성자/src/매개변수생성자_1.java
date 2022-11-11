class Sawon{
	int sabun;
	String name;
	String dept; //부서명
	String loc;//근무지
	long pay;//연봉
	Sawon(){
		//임의로 초기화
		sabun=1;
		name="홍길동";
		dept="개발부";
		loc="서울";
		pay=5000;
	}
	Sawon(int sabun, String name){
		this();
		// this() 는 생성자에서만 호출이 가능 ==> 가장 첫줄에 사용한다.
		// this()는 매개변수가 없는 생성자 호출이 가능
		this.sabun = sabun;
		this.name = name;
		
	}
	Sawon(String dept, String loc, long pay){
		this();
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	Sawon(int sabun, String name, String dept, String loc, long pay) {
		this(dept,loc,pay);
//		this.sabun = sabun;
//		this.name = name;
//		this.dept = dept;
//		this.loc = loc;
//		this.pay = pay;
	}
	
	void print() {
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.println("근무지 : " + loc);
		System.out.println("연봉 : " + pay);
	}
}
public class 매개변수생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon();//1, 홍길동, 개발부, 서울, 5000
		Sawon sa2=new Sawon(2,"박문수");// 2, 박문수, 개발부, 서울, 5000
		Sawon sa3=new Sawon("총무부","경기",4200);// 1, 홍길동, 총무부, 경기, 4200
		Sawon sa4=new Sawon(3,"김두한","기획부","부산",5500);//3, 김두한,기획부,부산,5500
		sa1.print();									//1, 홍길동, 기획부, 부산, 5500
		sa2.print();
		sa3.print();
		sa4.print();
	}

}
