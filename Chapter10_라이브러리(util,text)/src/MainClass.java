/*
 * = 가독성 : 분리 (기능별) => 구조화된 프로그램 (단락을 나눠서 처리) => 메소드
 *           유지보수(수정, 추가)
 * = 최적화 : 속도(실행)
 *           브라우저 => 쓰레드 2개 (이미지, 텍스트) => StringBuffer => 오라클
 * = 결합성(의존성) : 클래스 수정시 => 다른 클래스에 영향 (결합성이 낮은 프로그램을 짜야함)
 *                 new => 결합성이 높은 프로그램 (사용하지 않는걸 권장)
 *                 A   B ==> display => disp()
 *                 => B b=new B();
 *                    b.display();
 *                 
 *                 => A클래스는 B클래스에 의존
 * = 응집성 : 메소드는 한개의 기능만 수행하게 만든다 ( 재사용성, 오류처리)
 * = 재사용성 : 상속, 포함
 * 
 * 객체얻기
 * 1) getClass()
 *   Human h2=new Human().getClass().getDeclaredConstructor().newInstance();
 * 2) class
 *   Human h3=Human.class.getDeclaredConstructor().newInstance();
 * 3) Class.forName()
 *   Human h4=(Human)Class.forName(“Human”).getDeclaredConstructor().newInstance();

 * 4) new
 * 
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
