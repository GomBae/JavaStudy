package com.sist.collection2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * Properties
 * ----------
 *   파일을 묶어서 데이터를 가지고 온다
 *   => 중요한 데이터가 있는 경우
 *   => 유효성 검사
 */
public class MainClass_Properties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Properties prop=new Properties();
			//파일 읽기
			prop.load(new FileInputStream("C:\\Users\\user\\git\\repository_jin\\Chapter11_Collection_3\\src\\com\\sist\\collection2\\info.properties"));
			String name=prop.getProperty("name");
			String address=prop.getProperty("address");
			String tel=prop.getProperty("tel");
			System.out.println(name+ " "+address+" "+tel);
			
			Properties props=System.getProperties();
			System.out.println(props.getProperty("java.version"));
			System.out.println(props.getProperty("user.language"));
			//시스템에 저장된 정보
			props.list(System.out);
			Properties props2=new Properties();
			props2.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
			props2.setProperty("url", "jdbc:oracle:thin:@localhost:1521.XE");
			props2.setProperty("username", "hr");
			props2.setProperty("password", "happy");
			try {
				props2.store(new FileOutputStream("db.properties"), "데이터베이스 정보");
				props2.storeToXML(new FileOutputStream("db.xml"),"database info");
			}catch(Exception e) {}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
