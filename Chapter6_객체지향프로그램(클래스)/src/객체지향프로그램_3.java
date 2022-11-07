/*
 * 클래스와 객체( 메모리에 저장된 상태)
 * ----- 설계 (데이터 + 메소드)
 * 
 * 		new (메모리 저장) => 인스턴스화
 * 클래스 ================> 객체 (인스턴스)
 * 클래스명 객체명 = new 생성자()
 * ------
 * 메모리 크기 (프로그램에 필요한 데이터를 모아서 관리)
 * 
 * 클래스는 객체를 정의, 생성함
 * 실제 동작 : 객체
 * 객체 : 여러개 관련된 데이터를 모아서 저장(데이터형이 다르다) 
 */
class FoodHouse{
	//자동 초기화
	int fno; //0
	String title; // null
	double score; // 0.0
	String address;
	String tel;
	String type;
	String price;
	String time;
	String[] menu; //null
	
}
public class 객체지향프로그램_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메모리 생성
		FoodHouse food1=new FoodHouse();
		//메모리에 저장을 하기 위해서는 값을 대입 ==> 클래스는 자동으로 초기화
		food1.fno=1;
		food1.title="농민백암왕순대";
		food1.score=4.6;
		
		FoodHouse food2=new FoodHouse();
		food2.fno=2;
		food2.title="전통맛집";
		food2.score=4.4;
		FoodHouse food3=new FoodHouse();
		
		//2. 메모리에 값을 추가
		//3. 메모리에 추가된 값을 읽어온다
		System.out.println(food1.fno);
		System.out.println(food1.time);
		System.out.println(food1.score);
		System.out.println("===================");
		System.out.println(food2.fno);
		System.out.println(food2.time);
		System.out.println(food2.score);

	}

}
