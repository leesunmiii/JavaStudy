package com.sist.lib;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 		java.lang / java.util	/ java.text	/ java.io
 * 		java.net	/ java.sql
 * 		----------------------- 표준 자바 => javax (웹, 윈도우)
 * 		JDK 1.0									JDK 1.2
 * 		=> java.lang => 보통 package가 다르면 import를 사용해서 클래스를 가지고 온다 (java.lang은 생략가능)
 * 			--------
 * 			Object : 모든 클래스의 상위 클래스 (모든 클래스는 Object 상속을 받는다)
 * 					= 모든 데이터형을 받을 수 있는 클래스
 * 					= 모든 데이터형을 모아서 관리
 * 					= Object[] obj={"",'',10,10.5,new A()};
 * 					----------------------------------------
 * 						자바 스크립트 (배열 => object이기 때문에..._
 * 					= 기능만 가지고 있다 (메소드)
 * 					= 주요 기능
 * 						1) toString() : 자주 사용이 된다. 객체를 문자열화
 * 							=> 오버라이딩이 가장 많이 되는 메소드
 * 							=> 기본 출력 : 객체 주소
 * 							=> 객체 출력할 때 toString()이 생략이 되고있다
 * 							=> String toString() => 원형
 * 						2) clone() : 객체를 복제해서 새로운 객체 생성
 * 							=> 스프링에서 주로 사용
 * 							   -----
 * 								싱글턴 (한개의 객체만 생성해서 재사용하는 방식)
 * 									   ----- 필요시에는 여러 생성이 가능(clone())
 * 								응용 => JSP에서 (웹) => 알고리즘이 필요없다
 * 								스프링 => 디자인 패턴 / 알고리즘
 * 							=> Object clone() throws CloneSupportedException
 * 							   ------- 1. 예외처리, 2. 형변환을 한다
 * 							=> 1. 원형 (리턴형, 메소드명, 매개변수)
 * 								2. 사용처
 * 								3. 70~80% 이미 만들어져있다 (라이브러리)
 * 								   20~30% 사용자 정의 => 라이브러리+사용자 정의 (조립식)
								   => 라이브러리 중심으로 프로그램 구현 => CBD
								   => 프로그래머 VS 개발자
								   		|		  ----  없는 것을 만드는 사람 (C/C++)
								   	이미 존재하는 기능을 조립 (자바, C#)
								   => Python / C/ C++ / Java / C#
								   => Java / C / C++ / Python / C#
								   => 특성
								   	  => 미국, 유럽 => 아키텍쳐
								   	  => 인도 => 구현
								   	  => 일본 => 무선 발전
								   	  => 한국 => 유선 발전 => 웹 사이트 (자바)
						3) finalize() :  소멸자 (객체 메모리 해제시에 자동 호출)
										=> 멀티미디어 (스트링 서비스)
										=> 멜론 / 지니뮤직 / OTT
										=> 아프리카 TV
									protected void finalize()
						4) equals() :객체 비교시에 주로 사용
						   -----------String에서 오버라이딩이 된 메소드를 주로 사용
						   			boolean equals(Object obj)
 * 											------
										
									== : 주소 값을 비교한다, 실제 메모리에 저장된 값
									equals : 객체가 가지거 있는 데이터가 같은지 여부
									
									문자열은 문자열 자체가 주소
										   ----------
										   		문자열이 같은 경우에는 값은


 * 										
 * 			String : 문자열을 저장하는 데이터형 / 클래스형
 * 					 ---------- 
 * 					비교
 * 					--- 
 * 					 => equals => 같은 문자인지 확인
 * 						= 로그인, 아이디 중복 체크
 * 						= 상세보기
 * 						= 원형
 * 							boolean equals (String s)
 * 						=> 같은 문자열은 같은 주소를 가지고 있다
							new를 이요하면 다른 주소에 저장
					=> starstWith/endWith
							=> 원형
							boolean startsWith(String s)
							=> s로 시작하는 문자열
							=> 자동 완성기 => 대소문자 구분
							boolean endsWith(String s)
						 	=> s로 끝나는 문자열
						 	=> 사용빈도가 거의 없다
					=> contains : 문자열 포함
						자바 스크립트도 동일
						** boolean contains(String s)
						=> 문자열중에 s가 포함 여부
						=> 가장 많이 사용되는 메소드
					
					문자열 분리
					---------
					=> split() => 원하는 문자별로 분리
					   String[] split(",") => 크롤링
					   			---------- 정규식을 이용한다
					   	정규식은 => 표현법
					   	기호 ==> \\기호
					   	---------------
					   	= ^ => ^A => A로 시작하는 모든 문자열 // A%(오라클 표현법)
					   			startsWith 
					   	= $ => A$ => A로 끝나는 모든 문자열
					   			<img src^="http|https">
					   			<img src$="jpg|png|gif">
					   			<img src*="aaa">
					   			=> 오라클 / Javascript / CSS
					   	= + => A+ => A로 시작 => 1개 이상 문자열
					   	= * => A* => A로 시작 => 0개 이상 문자열
					   	= | => a|b => a 또는 b
					   	= [] => 문자의 범위
					   	  [A-Z] 대문자 ^[A-Z] :대문자로 시작한것
					   	  [a-z]
					   	  [0-9]
					   	  [가-힣] 한글 전체
					   	= {} => 문자의 갯수
					   	  {3}, {1,3}
					   	  211.238.142.1 ...
					      [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}  => 전세계 모든 아이피 가져오는
					      . => 임의의 한글자
					  => substring() : 문자를 자른다
					  	 string substring(int s)
					  	 => String s="Hello Java"
					  	 			  0123456789 => 문자열의 시작은 0부터
					  	    s.substring(6) => 6부터 나머지 전체 => "Java"
					  	    
					  	    String substring(int s, int e) => s~(e-1)
					  	    s.substring(1,4) => 1퉈 4번 전까지 (1부터 3까지) => "ell"
							=> 화면의 문자가 길어지면 사용 (...)
					변환
					----
					=> replace
						=> String replace(chat c1, char c2)
										     old	new
								  replace('A','B')
						   String replace (String s1, String s2)
						   		  replace("파이썬","자바")
						 replaceAll => 정규식
					문자 위치 찾기
					-----------
					= indexof => 앞에서부터 찾기
					= lastIndexOf => 뒤에서 찾기
					int indexOf(char c)
					int indexOf(String s)
					int lastIndexOf(char c)
					int lastIndexOf(String s)
					String s="Hello Java";
							=> char[]을 쉽게 제어가 가능하게 만든 클래스
							Hello Java
							0123456789
							
							s.indexOf('a') ==> 7
							s.lastIndexOf('a') ==> 9
							====================> 경로명 / 웹사이트 주소
					기타
					---
					length() : 문자의 갯수
					int length()
					trim() : 좌우 공백 제거
					String trim() : 사용자 입력이 있는 경우
					valueOf() : 모든 데이터형을 문자열 변환
					==> static String valueOf(int a)
						=> 모든 데이터형이 오버로딩
						=> String.valueOf(10) => "10"
					char charAt(int index)
					=> 한글자 잘라서 => 문자 변환
					String concat(String s) : 문자열 결합
						   ------- +
			StringBuffer :보완 (String을 보완)
				=> 문자열 결합 (최적화) => append()
 * 			Wrapper : 기본타입의 데이터를 객체로 저장
 * 					  ------- 쉽게 사용이 가능하게 만들기 위해 기능을 첨부한 클래스화
 					 정수형 => 317page
 					 	**byte  ==> Byte
 					 	short ==> Short
 					 	**int   ==> Integer
 					 	**long  ==> Integer
 					 실수형 
 					 	float   ==> Float
 					 	**double  ==> Double
 					 논리형
 					 	**boolean ==> Boolean
 					 문자형
 					 	char    ==> Character
 					 ---------------------------------
 					 웹
 					 주소 => 유일하게 서버와 연결
 					 	 => 사용자가 값을 서버로 전송
 					 	 	URL 주소? page=10
 					 	 			 -------- String page="10"
 					 	 			 				 ---------
 					 	 			 				 	int로 변경 후에 사용
 					 	 			 				 	int a=Integer.parseInt
 					 	 			 				 	NUMBER, VARCHAR2, DATE...
 					     => 박싱(오토박싱) / 언박싱
 					     Integer i=10; //박싱
 					     int j=i; // 언박싱
 					     ------------------호환
 * 
 * 			System
 * 				println() : 화면 출력 ** Web
 * 				------------------------- 
 * 				gc() : 메모리 회수 요청
 * 				exit() : 프로그램 종료
 * 				-------------------------- Application
 * 			Math
 * 				random() : 임의로 발생 => double(0.0~0.99)
 * 				ceil(double a) : 올림메소드 => double
 * 				ceil(165/10) => 16.0   /// ceil(165/10.0)
 * 				===> Math는 모든 메소드가 static으로 되어있다
 * 				Math.ceil... 메모리 할당을 안하고 불러옴 (math m=new math 이렇게 안한다고오........)
 * 			Thread : 한 개 프로그램 안에서 여러개의 프로그램을 동시에 실행
 * 			------- 게임
 */
public class MainClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//주소가 같은지 확인 ==> ==
		String s1="Hello";
		String s2="Hello";
		//주소가 같은지 확인 ==> 
		String s3=new String("Hello");
		//
		/*if(s1==s3)
		{
			System.out.println("s1과 s2는 같은 주소를 가지고 있다");
		}
		else
		{
			System.out.println("s1과 s2는 같은 주소를 가지고 있지않다");
		}
		
		// 실제 저장된 데이터(문자열) ==> equals
		if(s1.equals(s3))
		{
			System.out.println("s1과 s3는 메모리 저장 주소는 다르고 같은 문자열을 가지고있다");
		}
		else
		{
			System.out.println("s1과 s3는 메모리 저장 주소는 다르고 같은 문자열을 가지고있지않다");
		}*/
		
		// 대소문자 구분 없이 비교 ==> 검색 equlasIgnorecase
		// 대소문자 구분 비교 equals :로그인
		
//		String data="홍길동|박문수|이순신|강감찬|을지문덕";
//		String[] names=data.split("\\|");
//		for(String name:names)
//		{
//			System.out.println(name);
//		}
		
//		String data="NSC";
//		String[] ss=data.split("");// 한글자씩 자르려면 공백을 주면 된다
//		for(String s:ss)
//		{
//			System.out.println(s);
//		}
//		data.substring(1, 5);
		
		//확장자 찾기
//		String[] data= { "a.png","b.jpg","c.gif","d.java","e.java","f.zip"};
//		for( String s:data)
//		{
//			String ss=s.substring(s.lastIndexOf(".")+1);
//			System.out.println(ss);
//		}
//		
//		//확장자 찾기
//
//		for(String s:data)
//		{
//			String ss=s.substring(s.lastIndexOf(".")+1);
//			if(ss.equals("png")||ss.equals("jpg")||ss.equals("gif")) 
//			{
//				System.out.println(s);
//			}
//		}
		// 컴파일러에 알려만 준다 => 통과 요청 => CheckException
		// 에러시 복구가 어렵다, 예외회피, 선
		// 에러 발생 시 => 복구
		try 
		{
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			//String data="";
			StringBuffer data=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) // -1은 EOF (enf of file) 파일 끝까지라는 뜻
			{
				data.append((char)i);
			}
			fr.close();
			System.out.println(data);
		} catch (Exception ex) {}
	}

}
