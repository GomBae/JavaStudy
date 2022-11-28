package com.sist.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1. 스트림 : 데이터 이동 통로
 *           Queue (FIFO)
 *           => 송수신 : 1byte / 2byte (~Reader, ~writer) => 한글
 *                     ------  ------- 
 *                     |
 *                     ~InputStream ==> read()
 *                     ~OutputStream ==> write() => close()
 *           => txt (Reader/Writer)
 *           => XML(DocumentBilder), HTML(Jjoup)
 *           => JSON(Simple=Json)
 *           => Ajax, VueJS (JSON), React(XML,JSON)
 *           --------------------------------------------------------
 *           1) File
 *           2) FileInputStream / FileOutputStream
 *           3) FileReader / FileWriter
 *           4) BufferedReader => 웹 데이터를 읽어 올때
 *           5) ObjectInputStream / ObjectOutputStream (객체 단위로 저장)
 *              => 역직렬화, 직렬화
 *              
 *          라이브러리
 *          --------
 *             |
 *            = 바이트기반 스트림(1byte씩 송수신) => 다운로드/업로드
 *            = 문자기반 스트림(2byte씩 송수신) => 한글 파일을 읽어올 때 
 *                                           *** 한글은 1글자당 2바이트 (UTF-8)
 *                                           *** 이클립스 : EUC-KR => 운영체제
 *            = 보조 스트림 => 읽는속도, 쓰는속도를 빨리 하기위해 미리 메모리에 올려놓고 시작
 *            Buffered => InputStream / OutputStream
 *                        Reader / Writer
 *            = 객체기반 스트림 : 파일저장 => 객체단위 저장 (ArrayList)
 *            ObjectInputStream . ObjectOutputStream
 *            -------------------------------------------
 *         
 *         파일
 *            = File (파일, 디렉토리) -> 정보
 *            = 파일 읽기 : FileInputStream / FileReader
 *            = 파일 쓰기 : FileOutputStream / FileWriter
 *            -------------------------------------------
 *         네트워크
 *            = 전송 : OutputStream =====> 1byte
 *            = 수신 : BufferedReader ====> 2byte로 변환
 *            ------------------------------------------- socket
 *            
 *            매소드 : read(), write(), close()
 *            ----> 컴파일 예외처리 --> 반드시 예외처리한다.
 *            read() : 한글자 읽기
 *            read(byte[],int,int) => 데이터를 모아서 읽기
 *            
 *            write() : 한글자 저장
 *            write(byte[],int,int)
 *            
 */
public class MainClass_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//파일관련
			//1. 파일목록 읽기 : File[] listFiles()
			
			//2. 파일만들기 / 디렉토리 만들기 createNewFile(), mkdir()
			//3. 파일속성
			//4. = 파일명 / 경로명 / 파일+경로명 / 수정날짜, 디렉토리, 파일여부 확인 / 숨김,쓰기,읽기
			//     getName() getParent() getPath lastModified, isFile, isDirectory
			//     canWrite, canRead isHidden
//			File dir=new File("c:\\javaDev"); //디렉토리
//			File[] files=dir.listFiles();
//			for(File f:files) {
//				if(f.isDirectory())//폴더인경우
//					System.out.println("<DIR>"+f.getName());
//				else//파일인경우
//					System.out.println(f.getName());
//			}
			//폴더 만들기 : mkdir()
			File file=new File("c:\\download\\sawon.txt");
//			if(!dir.exists())//폴더가 없다면 => exists() : 존재여부 확인
//			{
//				dir.mkdir();
//			}
			//파일만들기 : createNewFile
//			if(!file.exists()) {
//				file.createNewFile();
//			}
			//파일에 대한 정보 확인
			System.out.println("파일명 : "+file.getName());
			System.out.println("경로명 : "+file.getParent());
			System.out.println("경로+파일 : "+file.getPath());
			System.out.println("파일크기 : "+file.length());
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년도 MM월 dd일 hh시 mm분 ss초");
			System.out.println("파일수정일 : "+sdf.format(new Date(file.lastModified())));
			System.out.println("숨김파일 : " +file.isHidden());
			System.out.println("읽기전용 : " +file.canRead());
			System.out.println("쓰기전용 : " +file.canWrite());
		}catch(Exception e) {}

	}

}
