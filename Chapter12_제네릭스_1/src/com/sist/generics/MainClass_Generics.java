package com.sist.generics;

import java.util.ArrayList;

/*
 *  Generics
 *  -------------
 *  1. (ArrayList, Vector, Map, Set) 데이터를 가지고 올 때 반드시 형변환 해야한다
 *     => 다른 데이터형을 첨부할 때 오류가 발생 => 방지
 *  2. 데이터형이 고정 (지정된 데이터면 사용이 가능하게 만든다 => 타입의 안정성)
 *  3. 데이터형을 명시하기 때문에 가독성이 좋다
 *  4. 형변환을 할 필요가 없다 (지정된 데이터형으로 모든 메소드, 매개변수, 리턴형이 변경) => 간결한 코드가 가능
 *  5. 사용법
 *     ArrayList<type>
 *              ------ 클래스형 (기본형은 사용불가)
 *    와일드카드
 *    ArrayList<?> list=new ArrayList<String>();
 *    
 *  6. 사용법2
 *     T => 임시변수(클래스형)
 *     E => Element (요소 => 클래스)
 *     K => Key
 *     V => Value
 *     
 *     class Box<T>
 *     {
 *        T box; => T값을 지정하지 않는 경우 (Box box=new Box(); ) => T는 default
 *        void setBox(T box)
 *        {
 *           this.box=box;
 *        }
 *        T getBox()
 *        {
 *           return box;
 *        }
 *     }
 *     
 *     Box<String> box=new Box<String>(); ==> T는 String으로 변환
 *     Box box=new Box(); => T는 Object타입
 *     
 *     class Box<String>
 *     {
 *        String box;
 *        void setBox(String box)
 *        {
 *           this.box=box;
 *        }
 *        T getBox()
 *        {
 *           return box;
 *        }
 *     }
 */
class Music{
	
}
public class MainClass_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭스 타입은 지정과 동시에 전체 메소드의 리턴형, 매개변수 => 한번에 통일
		//사용자 정의 클래스도 가능
		ArrayList<Music> list=new ArrayList<Music>();//Object ==> 리턴형, 매개변수가 지정된 데이터형으로 변경
		//데이터형을 통일화 => 사용이 쉽게
//		list.add("박문수");
//		list.add("홍길동");
////		list.add(10);
//		
//		for(int i=0;i<list.size();i++) {
//			String str=list.get(i);
//			System.out.println(str);
//		}

	}

}
