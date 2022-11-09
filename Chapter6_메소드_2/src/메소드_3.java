
public class 메소드_3 {

	void first() {
		System.out.println("first() 진입");
		second();
		System.out.println("first()종료");
	}
	void second() {
		System.out.println("second() 진입");
		last();
		System.out.println("second() 종료");
	}
	void last() {
		System.out.println("last() 진입");
		System.out.println("last() 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 진입");
		메소드_3 m=new 메소드_3();
		System.out.println("메모리 제작 m= "+m);
		System.out.println(m+" 메모리 주소에 메소드가 전체 저장");
		m.first();
		System.out.println("main 종료");

	}

}
