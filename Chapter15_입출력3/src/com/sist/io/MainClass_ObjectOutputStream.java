package com.sist.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

//빅데이터를 저장할 때 => 분석, 마이닝
/*
 * Serializable : 직렬화 (Object자체)
 * transient : 직렬화 제외
 * synchronized : 동기화
 */
class Student implements Serializable{
	private int hakbun;
	private String name;
	transient private String subject;
	//직렬화에서 제외
	private int kor,eng,math;
	
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student(int hakbun, String name, String subject, int kor, int eng, int math) {
		
		this.hakbun = hakbun;
		this.name = name;
		this.subject = subject;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student() {}
	
}
class School{
	private static ArrayList<Student> list=new ArrayList<>();
	
//	static {
//		list.add(new Student(1,"홍길동","수학과",80,90,78));
//		list.add(new Student(2,"김두한","수학과",85,92,70));
//		list.add(new Student(3,"박문수","수학과",86,93,60));
//		try{
//			ObjectOutputStream oos=
//					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
//			oos.writeObject(list);
//			oos.close();
//		}catch(Exception e) {e.printStackTrace();}
//	}
	//메뉴
	public int menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====== 학생관리 메뉴 ======");
		System.out.println("1. 목록보기");
		System.out.println("2. 상세보기");
		System.out.println("3. 검색");
		System.out.println("4. 학생등록");
		System.out.println("5. 종료");
		System.out.println("========================");
		System.out.print("메뉴선택 : ");
		int choice=sc.nextInt();
		return choice;
	}
	//학생 저장
	public void studentSave(Student s) {
		list.add(s);
		try {
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
		}catch(Exception e) {e.printStackTrace();}
	}
	//학생 목록
	public ArrayList<Student> studentListData(){
		try {
			ObjectInputStream ois=
					new ObjectInputStream(new FileInputStream("c:\\java_data\\student.txt"));
			list=(ArrayList)ois.readObject();
			// 컬렉션의 형변환 ==> 제네릭스까지 포함
			ois.close();
		}catch(Exception e) {e.printStackTrace();}
		return list;
	}
	//학생 상세보기
	public Student studentDetailData(int hakbun) {
		Student s=new Student();
		for(Student ss:list) {
			if(ss.getHakbun()==hakbun) {
				s=ss;
				break;
			}
		}
		return s;
	}
	//학생 찾기
	public ArrayList<Student> studentFindData(String name){
		ArrayList<Student> sList=new ArrayList<Student>();
		for(Student ss:list) {
			if(ss.getName().contains(name)) {
				sList.add(ss);
			}
		}
		return sList;
	}
	//종료 => 파일에 저장
	public void exit() {
		try {
			ObjectOutputStream oos=
					new ObjectOutputStream(new FileOutputStream("c:\\java_data\\student.txt"));
			oos.writeObject(list);
			oos.close();
			System.out.println("저장완료");
		}catch(Exception e) {e.printStackTrace();}
	}
	//ArrayList(제어) ==> 종료시 저장
	public void process() {
		while(true) {
			int m=menu();
			switch(m) {
			case 1://목록보기
			{
				ArrayList<Student> sList=studentListData();
				for(Student s:sList) {
					System.out.println(s.getHakbun()+" "
							+s.getName()+" "
							+s.getKor()+" "
							+s.getEng()+" "
							+s.getMath()+" "
							+(s.getKor()+s.getEng()+s.getMath())+" "
							+String.format("%.2f", (s.getKor()+s.getEng()+s.getMath())/3.0));
				}
			}
			break;
			case 2://상세보기
			{
				Scanner sc=new Scanner(System.in);
				String hak="";
				for(Student s:list) {
					hak+=s.getHakbun()+",";
				}
				hak=hak.substring(0,hak.lastIndexOf(","));
				System.out.print(hak+"중에 한개를 선택하세요 : ");
				int i=sc.nextInt();
				Student ss=studentDetailData(i);
				System.out.println("====== 상세보기 ======");
				System.out.println("학번 : "+ss.getHakbun());
				System.out.println("이름 : "+ss.getName());
				System.out.println("국어 : "+ss.getKor());
				System.out.println("영어 : "+ss.getEng());
				System.out.println("수학 : "+ss.getMath());
			}
			break;
			case 3://검색
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("검색어 입력 : ");
				String name=sc.next();
				ArrayList<Student> sList=studentFindData(name);
				System.out.println("====== 검색 결과 ======");
				for(Student s:sList) {
					System.out.println(s.getHakbun()+" "
							+s.getName()+" "
							+s.getKor()+" "
							+s.getEng()+" "
							+s.getMath()+" "
							+(s.getKor()+s.getEng()+s.getMath())+" "
							+String.format("%.2f", (s.getKor()+s.getEng()+s.getMath())/3.0));
				}
			}
			break;
			case 4://추가
			{
				Scanner sc=new Scanner(System.in);
				int max=0;
				//Sequence : 자동 증가번호
				for(Student s:list) {
					if(s.getHakbun()>max) {
						max=s.getHakbun();
					}
				}
				Student s=new Student();
				s.setHakbun(max+1);
				
				System.out.print("이름 입력 : ");
				s.setName(sc.next());
				System.out.print("국어점수 입력 : ");
				s.setKor(sc.nextInt());
				System.out.print("영어점수 입력 : ");
				s.setEng(sc.nextInt());
				System.out.print("수학점수 입력 : ");
				s.setMath(sc.nextInt());
				
				studentSave(s);
			}
			break;
			case 5:
			{
				exit();
				System.out.println("종료합니다.");
				System.exit(0);
			}
			
			default:
			{
				System.out.println("메뉴가 없다");
			}
			}
		}
	}
}
public class MainClass_ObjectOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s=new School();
		s.process();

	}

}
