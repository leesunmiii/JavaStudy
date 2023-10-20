package com.sist.exception;
/*
 * 		8장 => 예외처리 
 * 			  ------- 에러 => 목적 : 사전에 에러를 방지하는 목적
 * 						  => 정의 : 비정상 종료를 방지하고 정상상태 유지를 한다
 * 						  => 예외처리 => 에러 발생 시 에러를 건너뛴다
 * 		에러발생
 * 		------
 * 			= 사용자 (잘못된 입력) => 유효성 검색 => 웹에서는 javascript
 * 							   => if 
 * 			= 개발자 (실수) => 배열 인덱스, 정수 변환, 형변환 ...
 * 			------------------
 * 			1) 사전에 차단 (조건문 if) => 예외처리
 * 			2) 예외처리
 * 			  --------
 * 				= 에러(Error) : 소스상에서 수정이 불가능한 에러
 * 							   메모리가 저장공간 부족하다..
 * 								
 * 				= 예외(Exception) : 소스사에서 수정이 가능한 에러
 * 					예) 파일경로명, IP, 0으로 나눈다, 배열의 인덱스가 틀리다
 * 												int[] arr=mew int[2];
 * 												arr[2]=10;
 * 			==> 예외처리 방법
 * 				----------
 * 				= 예외복구 => try~catch 
 * 				= 예외회피 => throws
 * 				= 임의발생 => throw
 * 				= 지원하지 않는 예외 : 사용자 정의 예외처리
 * 			==> 예외의 종류 (상속도) 
 * 					  Object : 모든 클래스의 상위 클래스
 * 					     |
 * 					Throwable : 예외의 최상위 클래스
 * 						 |
 * 			--------------------------------
 * 			|								|
 * 		  Error							Exception
 * 		  -----
 * 		처리가 불가						(소스 변경 시) 처리 가능 
 * 		메모리 부족							=> 0으로 나누는 경우
 * 		윈도우 충돌							=> 배열 인덱스범위 벗어나는 경우
 * 		톰캣이 작동이 안됨						=> 형벼환, 파일명...
 * 		오라클 연결 불가
 *  
 * 								Exception : 예외처리의 최상위 클래스 // 모든 에러를 다 잡을 수 ㅇ있는 것
 * 								---------
 * 									|
 * 		---------------------------------------------------------------------
 * 		|																	|	
 * 	checkException (클래스 이름이 아님, 밑에 애들이 클래스 이름)					UnCheckException
 * 	=> 컴파일시에 예외처리를 했는지 확인											=> 확인이 없기 때문에 필요시에만
 *  => 지원하는 라이브러리 중에 반드시 예외처리를 해야한다
 *  => java.io : 파일명이 틀린경우
 *  			FileNotFoundException
 *  			IOException
 *  => java.net : URL주소나 IP가 틀린 경우
 *  			MalformedURLException
 *  => java.sql : 오라클 URL주소가 틀린경우 -SQLException
 *  			jdbc:oracle:thin:@localhost:1521:XE
 *  									   ------
 *  										연결포트 (오라클 한번 더 깔면 1522, 한번 더 1523...)
 *  		=> 충돌 => 쓰레드 InterruptedException
 *  		=> classNotFoundException
 *  
 *  	UnCheckException
 *  	----------------
 *  	RuntimeException => 예외를 확인할 수 없다 // 밑에 실행시 에러를 다 잡을 수 있는 것
 *  	----------------
 *  		실행시 에러
 *  		예) 1~100 사이의 정수 입력...
 *  		NumberFormatException : 문자열로 받아서 정수로 변경 시
 *  								=> 웹에서 가장 많이 발생
 *  								=> http://localhost/main/main.jsp>page=10
 *  								=> 웹에서는 데이터 전송 => URL을 이용해서 전송
 *  					  			 자바는 메소드의 매개변수를 이용해서 전송
 *  		ArrayIndexOfOutBoundsException : 배열의 인덱스 범위를 벗어나는 경우
 *  		NullPointerException : null인 클래스를 사용한 경우
 *  		ArithmeticException : 0으로 나누는 경우
 *  		ClassCastException : 형변환에 문제가 발생했을 때
 *  
 *  		==> 에러 예상 :
 *  			문자열로 정수를 받아서 배열에 저장한 다음에 나누기를 한다
 *  			----------------- ---------        -----
				NumberFormatException				ArithmeticException
									ArrayIndexOfOutBoundsException
			==> 사전에 에러 방지 => 예측
			
			
 *  			
 *  			
 *  	
 */
import javax.swing.*;
class A
{
	public void aaa()
	{
		System.out.println("A:aaa()");
	}
}
class B extends A
{
	public void aaa()
	{
		System.out.println("B:aaa()");
	}
}
//  -----------------NullPointerException
public class MainClass_01 extends JFrame {
	JButton b1,b2;
	public MainClass_01()
	{
		b1=new JButton("로그인");
		b1=new JButton("취소");
		add("North",b2);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ------------ ClassCastException		
//		A a=new A();
//		//B b=a;
//		B b=(B)a;
		//생성자가 잘못되었음
		// 오류 수정하려면
		/*
		 * A a=new B();
		 * B b=(B)a; 라고 해야함
		 */
		
//		A a=new B();
//		//B b=a;
//		B b=(B)a;
		//System.out.println(Integer.parseInt("10"));
		
// ----------------ArrayIndexOfOutBoundsException 에러뜨는 경우
//		int[] arr=new int[2];
//		arr[2]=100;
//		System.out.println(arr[2]);
	 new MainClass_01();
		
// 		
	}

}
