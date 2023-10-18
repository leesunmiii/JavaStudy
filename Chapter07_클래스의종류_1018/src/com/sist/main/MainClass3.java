package com.sist.main;
/*
 * 		추상클래스 => 확장(보완) => 인터페이스
 * 		인터페이스
 * 		-------
 * 			1. 추상클래스의 일종 => 인터페이스도 클래스
 * 			   구분) 클래스 / 인터페이스
 * 				    ----    -------
 * 				  단일상속	다중상속
 * 			2. 인터페이스는 구현된 메소드가 없이 추상메소드만 가지고 있다
 * 						 ----------
 * 						인터페이스에 메소드 추가가 되면 문제 발생
 * 						JDK 1.8 => 구현 메소드를 사용하게 만든다
 * 								   ---------
 * 									default / static      //얘네들이 추상클래스를 대체하게 됨(?)
 * 					=> 소프트공학 : 인터페이스 고정을 해야된다
 * 			3. 형식 => 247page
 * 			   public interface interface명
 * 				{
 * 					---------------------------------------
 * 					변수
 * 					  => 상수형변수만 사용
 * 					  int a; ==> 오류
 * 					  int a=10; ==> 값을 무조건 줘야함
 * 					-----------
 * 					자동으로 추가됨 => public static final int a=10; 
 * 								    ------------------- 생략 가능 (컴파일러가 자동으로 추가해줌)
 * 					int a=10; 입력하면 앞에 public static final 자동으로 붙어서 실행된다는 말
 * 					---------------------------------------
 * 					구현이 안된 메소드
 * 						void display(); ==> 구현 내용이 많은 경우
 * 						=> 프로그램에 맞게 구현해서 사용
 * 						=> 이렇게 컴파일되지않고 생략이 된 내용이 있음	
 * 						   public abstract void display();
 * 						   --------------- 생략가능(컴파일러가 자동으로 추가해줌)
 * 							*** 인터페이스는 모든 메소드가 public
 * 							void display(); 입력하면 앞에 public abstract........ 자동으로 붙어서 실행된다는 말
 * 					---------------------------------------
 * 					구현이 된 메소드
 * 						default void aaa(){
 * 
 * 						}
 * =					=> (public) default void aaa(){
 * 							------- 생략가능
 * 						static void bbb(){
 * 
 * 						}
 * 						=> (public) static void bbb(){
 * 							------- 생략가능
 * 
 * 						=> public void aaa();
 * 						=> public default void bbb(){}
 * 					---------------------------------------
 * 					생성자가 존재하지 않는다 (추상클래스에는 생성자 존재)
 * 					---------------------------------------
 * 					}
 * 					인터페이스는 모든 접근지정어가 public (변수,메소드)
 * 					변수 => 반드시 명시적인 초기화를 한다
 * 					int a; => int a=10;
 * 
 * 					상속 249page
 * 					---
 * 					implements => 구현해서 사용
 * 					----------------------------------------
 * 					1. interface =====> interface
 * 						interface A
 * 						interface B extends A 
 * 									-------
 * 						implements가 아니고 extends를 써야함
 * 					-----------------------------------------
 * 					2. interface =====> class
 * 						interface A
 * 						class B implements A
 * 								----------
 * 					extends가 아니고 implement를 써야함 
 * 				---------------------------------------------			
 * 					class 	  ======> interface (오류)
 * 					class A
 * 					interface B (?) A ==>오류
 * 				----------------------------------------------- X
 * 
 * 					interface A
 * 					interface B extends A => A,B
 * 					interface C extends B => A,B,C
 *				------------------------------------------------
 *					interface D extends A,B
 *										---- 여러개를 동시에 받을 수 있다
 *											 여러개를 ,로 구분한다
 *					interface A
 *					interface B
 *					class C implements A,B ==> 다중 상속
 *
 *					interface A
 *					interface B
 *					class C
 *					class D extends C implements A,B (가능)
 *							-------    ---------	
 *							클래스 상속	인터페이스 상속
 *					=> 윈도우가 이런식 ..(?)
 *					=> 인터페이스에 설정된 모든 것 (메소드,변수)은 public만 사용이 가능하다
 *						만약, public을 설정하지않으면 컴파일러에 의해 자동으로 추가된다
 *					=> 인터페이스 사용
 *						=> 윈도우에서 이벤트처리 (마우스클릭...)
 *						=> 사용자 정의 => 클래스 관리 (스프링 : 클래스 찾기(DL 디펜전시 룩업))
 *						   ---------------------
 *							 인터페이스 대신 어노테이션으로 바뀌는 추세
 *								어노테이션 (@Override 같은거)
 *						=> 설계
 *							인터페이스 쓰는 목적
 *							1. 개발속도가 빠르다 => 개발기간이 단축
 *								예) 
 *									예약
 *									로그인
 *									맛집 선택
 *									예약일 선택
 *									예약시간 선택
 *									인원 확인
 *									예약금 전송
 *									=> 좌석선택
 *								==> 그냥 예약하시오 보다는 위에 조건이 있는 경우가 더 빠름
 *				
 *							2. 인터페이스 => 표준화(:누구나 다 동일하게 써야하는것)(대표적인게 라이브러리)
 *							3. 서로 다른 클래스 연결해주는 역할 (스프링이 해주는 역할)
 *
 *		-----------------------------------------------------------------------------------
 *		실무
 *			개발기간 : 8개월
 *			1. 설계(요구사항분석) => 3개월 => 인터페이스 => 아키텍쳐 (경력이 있어야함,7년차이상, 팀장급, PM들)
 *				
 *			2. 데이터베이스 설계 : 1개월 => DBA (자격이 있는 사람)
 *				
 *			3. 화면 UI : 1개월 : 퍼블리셔 (디자이너들)
 *				
 *			4. 구현 : 2개월 : 웹프로그래머 (우리가 집중적으로 가는 곳)
 *				
 *			5. 테스트 배포 : 1개월 : 테스터
 *							    
 *								
 *			*** 인터페이스는 자신이 메모리 할당을 할 수 없다
 *				=> 구현된 클래스를 이용해서 메모리 할당을 한다
 *
 *			interface A
 *			class B implements A
 *		
 *			=> A a=new B();			
 *				
 */


//		<<<<< 오류 생기는 예시들 >>>>>

//		------- 축소되면 안됨 --------
//
//		interface A
//		{
//			int a=10;
//			void disp();
//		}
//		class B implements A
//		{
//			void disp() {} 				// 축소되기 때문. 위에는 public 인데 여기는 default여서.. 때문에 앞에 public을 붙여줘여ㅑ함
//		}

// 		-------- public 이어야함 -------
//
//		interface A
//		{
//			protected void disp(); 		// public이어야함
//			private int a=10; 			// public이어야함
//		}


//		--------- 메소드 추가가 되면 문제 발생 --------
//		interface A
//		{
//			protected void disp();
//			//void bbb(); 				// 메소드가 추가되면 문제 발생
//		}
//		class B implements A
//		{
//
//			@Override
//			public void aaa() {
//			// TODO Auto-generated method stub
//		
//			}
//	
//		}
//		class C implements A
//		{
//
//			@Override
//			public void aaa() {
//			// TODO Auto-generated method stub
//		
//			}
//	
//		}


import javax.swing.*;
import java.awt.event.*;
public class MainClass3 extends JFrame implements ActionListener,MouseListener,KeyListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
