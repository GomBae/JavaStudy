class Movie{
	String title;
	String open;
	String genre;
	String nation;
	String grade;
	String poster;
	String time;
	double score;
	int people;
	int rank;
	String introduce;
	
}

class Food{
	String[] image=new String[5];
	String title;
	double score;
	String address;
	String tel;
	String type;
	String price;
	String parking;
	String time;
	String[] menu=new String[5];
}

class Recipe{
	String titleImage;
	String userProfileImage;
	String userName;
	String userIntro;
	String title;
	int count;
	String eatPeople;
	String time;
	String difficult;
	String stuff;
	String source;
	String[] step;
	
}

/*
 * 객체지향 프로그램
 * 1. 클래스
 * 		= 데이터만 모아서 관리
 * 		 -----
 * 			모든 사용자가 공유하는 변수 (공유변수, 공통변수) => 변수 앞에 static
 * 			객체마다 따로 사용하는 변수 (인스턴스변수)	=> 객체마다 변수를 따라 가지고있다.
 * 		= 메소드만 모아서 관리
 * 		= 데이터+메소드 모아서 관리(혼합형)
 * 2. 객체 : 클래스에 설계 데이터+메소드가 동시에 저장된 메모리 공간이름
 * 					   ----------
 * 			객체 => 현실세계의 사물을 특성화시킨 것
 * 								----- 추상화, 공통적으로 가지고 있는 속성 단순화
 * 			객체 => 여러개의 데이터를 저장할 수 있는 메모리 공간
 * 3. 클래스의 구성 요소
 * 		= 변수 ==> 데이터 타입이 달라도 된다
 * 		= 메소드
 * 		= 생성자
 * 4. 객체 선언 / 생성
 * 
 * 	  선언
 * 	  클래스명 객체명;
 * 	  생성
 * 	  객체명=new 생성자()
 * 		   --- 클래스에 맞는 크기의 메모리를 만든 다음에 해당 메모리 주소를 객체에 넘겨준다.(리턴형 int)
 * 		   new
 *  		=> 메소드 => int malloc(sizeOf(클래스명)) : 사용빈도가 많다 => 연산자로 승격
 *  		class A
 *  		{
 *  			int a; //4byte
 *  			String name;//4byte
 *  			String sex; //4byte
 *  			double score; //8byte
 *  		}
 *  		==> 20byte
 *  
 *  		new를 이용하면 새로운 메모리 공간을 만든다
 *  		---------------------------------
 *  		클래스는 한개만 설계 ==> 객체는 여러개 저장이 가능하다.
 *  
 */
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
