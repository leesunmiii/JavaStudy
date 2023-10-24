package com.sist.lib;
import java.text.SimpleDateFormat;
/*
 		라이브러리 (9장~12장) : 클래스명 (사용도)
 							=> 기능(메소드)
 							   --------- 리턴형 / 매개변수
 							   --------- 신뢰성이 뛰어난다  => 에러가 없다
 							   --------- 표준화
 							   --------- 자바는 80%가 라이브러리
 							   --------- 20%는 조립
 							   --------- 사용위치를 알아야한다
 		java.lang	*** Object, String, StringBuffer, Wrapper, Math, System
 		java.util	*** Random
 						------ 예약일, 예약시간
 						Date / Calendar / StringTokenizer / List / Set / Map / Scanner
 		java.text	*** SimpleDateFormat : 날짜 변경
 						DecimalFormat : 숫자 변경
 						MessageFormat
 						ChoiceFormat
 		java.io
 		java.net
 		java.sql
 		----------------------
 		javax.xml
 		javax.http.servlet
 		----------------------
 		org.springframework
 		org.mybatis
 		org.jpa...
 		----------------------
 		com.업체명..
 		
 		
 * 
 */
import java.util.*;
public class MainClass_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(sdf.format(date));
		
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String tel="010-1111-1111";
		
		//오라클 전송
		String sql="INSERT INTO member VALUES(' "+name+"','"+sex+"',"+age+",'"+addr+"','"+tel+"')";
		System.out.println(sql);
		//"INSERT INTO member VALUES(?,?,?,?,?)
	}

}
