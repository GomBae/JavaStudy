class Member{
	int mno=1;
	String name="홍길동";
	String address="서울";
	String tel="010-1111-1111";
	// 메모리를 할당할 때(초기화 할 때)
	Member(){
		
	}
	Member(String name, String address, String tel) {
		mno=++mno;
		this.name=name;
		this.address=address;
		this.tel=tel;
		
	}
	
	Member(int mno, String name, String address, String tel) {
		this(name,address,tel);
		this.mno = mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	void print() {
		System.out.println("회원번호 : "+mno);
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+tel);
	}
	
}
public class 매개변수생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member m1=new Member(1,"홍길동","서울","010-1111-1111");
		Member m2=new Member(2,"강감찬","경기","010-2222-2222");
		Member m3=new Member(3,"김길동","부산","010-3333-3333");
		Member m4=new Member("홍길동","인천","010-4444-4444");
		m4.print();
	}

}
