package com.sist.exception;
/*
 * 		1. 자바 문법
 * 			=> 변수 / 연산자 / 제어문
 * 			=> 사용자 정의 클래스
 * 				=> 멤버변수 / 메소드 / 생성자
 * 				=> 클래스의 종류 => 인터페이스
 * 			=> 에러방지 : 예외처리
			예외처리 : 사전에 에러를 방지하는 프로그램
					 => 비정상 종료를 방지하고 정상적으로 수행하게 만들어주는 프로그램
			=> 자바에서 지원하는 예외처리
				1) 고려 => if => 예외처리
				2) 예외처리 대상
				   CheckedException : 컴파일시에 예외처리가 되어 있는지 확인 =>  반드시 예외처리를 한다
				   					  io(입출력), net(네트워크), sql(오라클 연결)
				   					  => 웹과 관련됨
				   UnCheckException : 사용자의 입력에 따라...
				3) 예외처리 방법
					-----------------------------------------------------------------
					= 예외 복구 => 에러를 받아서 처리 => catch
					  1. 형식
					  try 
					  {
					  	=> 정상수행 할 수 있는 소스 코드
					  	=> 모든 소스, 부분 소스
					  }catch(예외처리 종류)
					  {
					  	=> try에서 에러가 발생 시 처리하는 문장
					  	=> 복구는 거의 없다
					  	=> 에러의 위치 확인
					  		printStackTrace()
					  	=> 에러의 정보 확인
					  		getMessage()
					  	=> 에러 수정 목적
					  }
					  ------ catch는 여러개 사용 가능 => 전체 => Exception
					  finally
					  {
					  	=> 생략이 가능
					  	=> 사용처 : 서버 종료, 오라클 연결 해제, 파일 닫기 ...
					  	=> 에러가 발생(O), 에러 없는 경우
					  	   -------------------------
					  	   try, catch를 수행하든 안하든 상관안하고 무조건 수행하는 문장
					  	   try수행 (정상 수행), catch (에러있다)
					  }
					  
					  동작 순서
					  
					  try
					  {
					  	문장 1
					  	문장 2
					  	문장 3
					  }
					  catch(Exception e)
					  {
					  	문장 4
					  }
					  finally
					  {
					  	문장 5
					  }
					  
					  
					  try에 에러가 없는 경우 : 1 => 2 => 3 => 5 (catch절은 통과)
					  									 --- finally 수행한다
					  문장 2에 에러가 발생하는 경우 : 1 => 4 => 5 
					  							 	---	  --
					= 예외 회피 => JVM(가상머신)에 미리 알려준다 => RuntimeException은 생략이 => 이런 에러가 발생할 수 있다
					  문법)
							메소드() throws 예외처리 종류...
							메소드() throws Exception, NumberFormatException
								    예외처리 순서가 없다
								    => try~catch는 예외처리에 순서 있다(상속도에 띠라 달리짐)
								    => throws => 예외처리 순서가 없다
								    => throws 문장을 사용할 때는 try 위치 => 이미 소스가 완료된 상태에서 에러 처리
					*** 예외처리 목적 => 프로그램 종료 방지
						예) 로그인 => 입력이 안된 상태 => 종료 --- 문제 있는 프로그램
								 => 개인정보유출 => 자바 스크립트 이용(클릭, 움직이는거)
						=> 라이브러리 뒤에 많이 붙어있다 => 둘 중 하나 선택 (피해가기 / 직접처리
						 1. 피해가기 (throws)
						 2. 직접처리 (try~catch)
						 예) 
						 	void insert() throws Exception
						 	 => insert를 호출하기 위해서는 예외처리를 하고 사용한다
						 	void method()
						 	{
						 		insert() ==> 오류
						 	}
						 	
						 	=> void method() throws Exception
						 	   {
						 	   	 insert()
						 	   }
						 	   
						 	   void method()
						 	   {
						 	   		try
						 	   		{
						 	   			insert()
						 	   		}catch(Exception ex){}
						 	   }	
						 	   		
						
					----------------------------------------------------------------- 웹에서는 위에 두개만 잘 나옴
																				위에 두개 외우기, 밑에 두개는 존재하는구나 알기
					= 임의 발생 => 테스트
					= 지원하지 않는 예외 => 사용자 정의 예외
 * 		2. 라이브러리 => 암기
 * 		   java.lang
 * 			= Object, String, StringBuffer, Wrapper
 * 		   java.util
 * 			= Date, Calendar, StringTokenizer
 * 			= Collection
 * 			= ***ArrayList / HashSet / HashMap
 * 		   java.io
 * 			= 업로드/다운로드 => 파일 관련
 * 		   java.net = 흐름 (크롤링 => 프로젝트) URL
 * 			------------
 * 		   java.sql = 자바에서 오라클 연동
 * 			Connection / Statement / ResultSet
 * 
 */
public class MainClass_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.sleep(1000); // 1초에 한번씩 처리해라
		
	}

}
