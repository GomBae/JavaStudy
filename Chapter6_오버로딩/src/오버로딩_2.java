
public class 오버로딩_2 {
//
//	void names(String name1) {
//		System.out.println(name1);
//	}
//	void names(String name1,String name2) {
//		System.out.println(name1+" "+name2);
//	}
//	void names(String name1,String name2, String name3) {
//		System.out.println(name1+" "+name2+" "+name3);
//	}
//	void names(String name1,String name2, String name3, String name4) {
//		System.out.println(name1+" "+name2+" "+name3+" "+name4);
//	}
//	void names(String name1,String name2, String name3, String name4, String name5) {
//		System.out.println(name1+" "+name2+" "+name3+" "+name4+" "+name5);
//	}
	//가변 매개변수 => 웹 => 사용자가 보내준 데이터를 받는 경우
	void names(String...name) {
		for(String s:name) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_2 a=new 오버로딩_2();
		a.names("홍길동");
		a.names("홍길동","박문수");
		a.names("홍길동","박문수","이순신");
		a.names("홍길동","박문수","이순신","김두한");
		a.names("홍길동","박문수","이순신","김두한","강감찬");
		

	}

}
